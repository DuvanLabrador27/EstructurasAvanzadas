import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        TreeNode ans = null;

        if (original == null)
            return null;

        Queue<TreeNode> originalQue = new LinkedList<TreeNode>();
        Queue<TreeNode> cloneQue = new LinkedList<TreeNode>();

        originalQue.offer(original);
        cloneQue.offer(cloned);

        while (originalQue.size() > 0) {
            TreeNode tempOrg = originalQue.poll();
            TreeNode tempCop = cloneQue.poll();
            if (tempOrg == target) {
                return tempCop;
            }
            if (tempOrg.left != null)
                originalQue.offer(tempOrg.left);
            if (tempOrg.right != null)
                originalQue.offer(tempOrg.right);

            if (tempCop.left != null)
                cloneQue.offer(tempCop.left);
            if (tempCop.right != null)
                cloneQue.offer(tempCop.right);
        }
        return ans;
    }
}
