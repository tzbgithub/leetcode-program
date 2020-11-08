package 阿_模板包.树的模板.遍历树模板;

import 阿_模板包.util.*;

/**
 * Create by zhatang on 2020/7/4.
 */
public class DfsWithRecursion {

    public void dfs(TreeNode node) {
        if(node ==null)
            return;

        //在这里处理遍历到的树节点

        if(node.left !=null)
            dfs(node.left);
        if(node.right !=null)
            dfs(node.right);
    }
}
