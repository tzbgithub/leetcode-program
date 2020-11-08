package 阿_模板包;
import java.util.LinkedList;
import java.util.Queue;


public class util {
    /**
     *
     * @author zhatang
     */
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    /*
     * construct TreeNode from a array format string, for test cases of LeetCode
     */
    public static TreeNode createTree(String tree) {
        // {1,2,3,4,#,#,#,5,#,6,#,7,#,8}
        String[] ss = tree.split(",");
        return createTree(ss);
    }

    public static TreeNode createTree(String[] tree) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        // 1st one should not be #
        TreeNode root = constructOne(tree[0]);
        q.add(root);
        int idx = 1;
        while (!q.isEmpty()) {

            TreeNode tn = q.poll();
            if (tn == null) {
                continue;
            }
            // construct tn's left&right node
            // when to stop
            if (idx == tree.length) {
                break;
            }
            TreeNode left_ = constructOne(tree[idx]);
            tn.left = left_;
            q.add(left_);
            idx++;
            if (idx == tree.length) {
                break;
            }
            TreeNode right_ = constructOne(tree[idx]);
            idx++;


            tn.right = right_;
            // add to queue
            q.add(right_);
        }

        return root;

    }

    private static void printNode(TreeNode tn, int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("\t");
        }
        sb.append(tn.val);
        System.out.println(sb.toString());
    }

    public static void printTree(TreeNode root, int indent) {
        if (root == null) {
            return;
        }
//      if (root.left == null && root.right == null) {
//          printNode(root, indent);
//      }
        // right
        printTree(root.right, indent + 1);
        // self
        printNode(root, indent);
        // left
        printTree(root.left, indent + 1);
    }

    public static void printTree(TreeNode root) {
        // right first
        printTree(root, 0);
    }

    private static TreeNode constructOne(String s) {
        if (s.compareTo("#") == 0) {
            return null;
        } else {
            return new TreeNode(Integer.parseInt(s));
        }
    }

    /**
     *
     * @author zhatang
     */
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }//
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.printf("%d -> ", current.val);
            current = current.next;
        }
        System.out.println("NULL");
    }


    public static void main(String args[]) {
//        TreeNode tn = createTree("2,#,3,#,4,#,5,#,6");
//        printTree(tn);
        int[] x = {1, 2, 3, 4, 5, 6};
        ListNode list = createLinkedList(x);
        printLinkedList(list);
    }
}