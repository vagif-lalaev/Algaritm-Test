public class TreeNode {
    public static void main(String[] args) {
        TreeNode1 treeNode1 = new TreeNode1(123);
        System.out.println(new Solution().rangeSumBST(treeNode1, 2, 3));
    }

    public static class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;

        TreeNode1(int x) {
            val = x;
        }
    }

    static class Solution {
        public static int rangeSumBST(TreeNode1 root, int L, int R) {
            int result = 0;
            if (root.val >= L && root.val <= R) {
                result = result + root.val;
                return result;
            }
            return 0;
        }
    }
}
