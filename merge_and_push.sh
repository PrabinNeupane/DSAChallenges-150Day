#!/bin/bash

# Check if the branch name is provided
if [ $# -lt 1 ]; then
    echo "Usage: $0 <branch_name>"
    exit 1
fi

# Assign the first argument to a variable
branch_name=$1
commit_msg=$2

# Ensure we're in a git repository
if [ -z "$(git rev-parse --is-inside-work-tree)" ]; then
    echo "Please run this script inside a Git repository."
    exit 1
fi

# Add changes to the staging area
git add .

# Commit the changes
echo "Committing changes..."
git commit -m $"commit_msg"

# Push the commit to the remote repository
echo "Pushing changes to the remote repository..."
git push origin $branch_name

# Checkout to the main branch
echo "Switching to the main branch..."
git checkout main

# Merge the provided branch into main
echo "Merging $branch_name into main..."
git merge $branch_name

# Optional: Delete the local branch after merging
# echo "Deleting $branch_name..."
# git branch -d $branch_name

echo "Merge completed successfully."
