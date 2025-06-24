import java.util.ArrayList;
import java.util.List;

public class DFS_InorderTraversal {

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode node, List<Integer> list){
        if(node == null)
            return;

        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }

    public static void main(String[] args) {
        DFS_InorderTraversal dfsInorderTraversal = new DFS_InorderTraversal();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);

        List<Integer> treeData = dfsInorderTraversal.inOrderTraversal(root);
        treeData.forEach(System.out::println);
    }
}
