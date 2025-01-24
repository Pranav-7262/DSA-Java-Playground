package Hashing;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
     int [] arr = {4,9,5};
     int [] arr1 = {9,4,6};
        System.out.println(Arrays.toString(intersection(arr,arr1)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> set1 = new ArrayList<Integer>();
        for (int num:nums1){
            set1.add(num);
        }
        ArrayList<Integer> set2 = new ArrayList<Integer>();
        for (int num:nums2){
            if (set1.contains(num)){
                set2.add(num);
            }
        }
        int [] result = new int[set2.size()];
        int i =0 ;
        for (int num:set2){
            result[i++] = num;
        }
        return result;
    }
}
