package 树_判断是不是子树;

import  阿_模板包.util.*;
import  阿_模板包.util;

class Solution {
    /**
     *
     * @param l
     * @param r
     * @return
     */
    private boolean isEqual(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        if (l.val == r.val)
            return isEqual(l.left, r.left) && isEqual(l.right, r.right);
        return false;
    }

    /**

     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null) return false;
        if (s.val == t.val) {
            return isEqual(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

}
