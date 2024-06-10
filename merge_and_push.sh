#!/bin/bash

# Self-execute permission
if [ ! -x "$0" ]; then
    chmod +x "$0"
fi

# Check if the commit message is provided
if [ $# -lt 2 ]; then
    echo "Usage: $0 <branch_name> <commit_msg>"
    exit 1
fi

# Assign the arguments to variables
branch_name=$1
commit_msg=$2

# Ensure we're in a git repository
if [ -z "$(git rev-parse --is-inside-work-tree 2>/dev/null)" ]; then
    echo "Please run this script inside a Git repository."
    exit 1
fi

# Capture the current branch name
current_branch=$(git rev-parse --abbrev-ref HEAD)

# Add changes to the staging area
git add .

# Commit the changes
echo "Committing changes..."
git commit -m "$commit_msg"

# Push the commit to the remote repository
echo "Pushing changes to the remote repository..."
git push origin $branch_name

# Checkout to the main branch
echo "Switching to the main branch..."
git checkout main

# Merge the provided branch into main
echo "Merging $branch_name into main..."
git merge $branch_name

# Push the updated main branch to the remote repository
echo "Pushing the main branch to the remote repository..."
git push origin main

# Optional: Delete the local branch after merging
# echo "Deleting $branch_name..."
# git branch -d $branch_name

# Switch back to the original branch
echo "Returning to the previous branch $current_branch..."
git checkout $current_branch

echo "Merge and push completed successfully, and returned to $current_branch."
