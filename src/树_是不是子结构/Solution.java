package 树_是不是子结构;
import  阿_模板包.util.*;
import  阿_模板包.util;
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null)
            return false;
        if (A == null)
            return false;
        if (A.val != B.val)
            return isSubStructure(A.left, B) || isSubStructure(A.right, B);
        return isBaoHan(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean isBaoHan(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return isBaoHan(A.left, B.left) && isBaoHan(A.right, B.right);
    }

}