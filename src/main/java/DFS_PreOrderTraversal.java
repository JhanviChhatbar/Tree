import java.util.ArrayList;
import java.util.List;

public class DFS_PreOrderTraversal {

    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        preOrder(list, root);
        return list;
    }

    public void preOrder(List<Integer> list, TreeNode node){
        if(node == null)
            return;

        list.add(node.data);
        preOrder(list, node.left);
        preOrder(list, node.right);
    }

    public static void main(String[] args) {
        DFS_PreOrderTraversal dfsPreOrderTraversal = new DFS_PreOrderTraversal();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);

        List<Integer> treeData = dfsPreOrderTraversal.preOrderTraversal(root);
        treeData.forEach(System.out::println);
    }
}
