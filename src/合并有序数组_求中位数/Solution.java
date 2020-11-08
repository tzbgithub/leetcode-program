package 合并有序数组_求中位数;

import java.util.ArrayList;
/*
 * ��leetcode�ĵ���ģ��
 * ����������СΪ m �� n ���������� nums1 �� nums2,�����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��
 * nums1 = [1, 3]
nums2 = [2]

	����λ���� 2.0
 */
import java.util.Scanner;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> mergeArr = new ArrayList<Integer>();
        int app;
        int index1 = 0, index2 = 0;
        while (index1 != nums1.length && index2 != nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                app = nums1[index1];
                index1++;
            } else {
                app = nums2[index2];
                index2++;
            }
            mergeArr.add(app);
        }
        if (index1 == nums1.length)
            for (int j = index2; j < nums2.length; j++) {
                mergeArr.add(nums2[j]);
            }
        if (index2 == nums2.length)
            for (int i = index1; i < nums1.length; i++) {
                mergeArr.add(nums1[i]);
            }

        for (int i : mergeArr) {
            System.out.println(i);
        }
        if ((nums1.length + nums2.length) % 2 == 0)
            return (double) (mergeArr.get(mergeArr.size() / 2) + mergeArr.get(mergeArr.size() / 2 - 1)) / 2;
        else
            return (double) mergeArr.get(mergeArr.size() / 2);
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        Scanner in = new Scanner(System.in);
        int[] num1 = {1, 3}, num2 = {2, 4};

        System.out.println(solu.findMedianSortedArrays(num1, num2));
    }
}
