import javax.swing.tree.TreeNode;

public class MH306 {
    public static void main(String[] args) {
        
    }
    public Boolean isCompleteTree(TreeNode node) {
        int numberNodes = countNodes(node);
        return isComplete(node, 0, numberNodes);
    }
    
    private Boolean isComplete(TreeNode node, int index, int numberNodes) {
        if (node == null)
            return true;
    
        if (index > numberNodes)
            return false;
    
        return isComplete(node.left(), 2 * index + 1, numberNodes) &&
                isComplete(node.right(), 2 * index + 2, numberNodes);
    }
    
    private Integer countNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left()) + countNodes(node.right());
    }
}
