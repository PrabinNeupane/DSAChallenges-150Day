package org.example.dsachallenges150days.challenges.arrays.day2;

class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];
        int i=0,j=0,k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                mergedArray[k] =nums1[i];
                i++;
            }else{
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i <nums1.length){
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }

        while(j< nums2.length){
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        if (mergedArray.length % 2 == 0) {
            return (mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1]) / 2.0;
        }
        return mergedArray[mergedArray.length / 2];

    }

    public static void main(String[] args) {

        int[] array1 = {2,1,3,4};
        int[] array2 ={2,7,9};
        System.out.println(findMedianSortedArrays(array1, array2));
    }
}