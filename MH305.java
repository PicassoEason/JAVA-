import javax.swing.tree.TreeNode;

public class MH305 {
    public static void main(String[] args) {
        
    }
    public Boolean isPerfectTree(TreeNode node) {
        int treeDepth = depth(node);
        return isPerfectTree(node, 1, treeDepth);
    }
    
    private int depth(TreeNode node) {
        return node.left() != null ? 1 + depth(node.left()) : 1;
    }
    
    private Boolean isPerfectTree(TreeNode node, int depth, int treeDepth) {
        // check for last level node
        if (depth == treeDepth && (node.left() == null && node.right() == null)) {
            return true;
        }
        // check for inner levels
        if ((node.left() != null && node.right() != null)) {
            return isPerfectTree(node.left(), 1 + depth, treeDepth) &&
                    isPerfectTree(node.right(), 1 + depth, treeDepth);
        }
        return false;
    }
}
