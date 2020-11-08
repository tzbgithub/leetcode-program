package 之字形_找路径;

import java.util.LinkedList;
import java.util.List;
/*
 * 
 ����14=1110b��

�Ƚ�14���ƣ���Ϊ111b��Ȼ��Գ���һλ������λȡ����Ϊ100b�������ĸ��ڵ�4��

ͬ��100b�����Ʊ�Ϊ10b���Գ���һλ������λȡ����Ϊ11b�������ĸ��ڵ�3

һֱ��1������
 * 
 */
import java.util.Scanner;

class Solution {
    public List<Integer> pathInZigZagTree(int label) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        while (label != 1) {
            list.addFirst(label);
            System.out.println(label);

            label = label >> 1;
            label = reverseUntil(label);

        }
        list.addFirst(1);
        return list;
    }

    public int reverseUntil(int label) {
        int weiLen = erJinZhiLen(label);
        label = label ^ (1 << (weiLen - 1)) - 1;
        return label;
    }

    public int erJinZhiLen(int label) {
        int count = 0;
        while (label != 0) {
            label = label / 2;
            count++;
        }
        return count;
    }


//test

    public static void main(String[] args) {
        Solution solu = new Solution();

        System.out.println(solu.pathInZigZagTree(14));
    }
}
