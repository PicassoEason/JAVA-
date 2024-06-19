import javax.swing.tree.TreeNode;

public class M111 {
    public static void main(String[] args) {
        
    }
    public Boolean isStrictTree(TreeNode node) {
        if (node == null) {
            return true;
        }
        if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null)) {
            return false;
        }
        return isStrictTree(node.left()) && isStrictTree(node.right());
    }
}

