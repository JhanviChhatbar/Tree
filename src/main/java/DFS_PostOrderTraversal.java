import java.util.ArrayList;
import java.util.List;

public class DFS_PostOrderTraversal {

    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        postOrder(list, root);
        return list;
    }

    public void postOrder(List<Integer> list, TreeNode node){
        if(node == null)
            return;

        postOrder(list, node.left);
        postOrder(list, node.right);
        list.add(node.data);
    }

    public static void main(String[] args) {
        DFS_PostOrderTraversal dfsPostOrderTraversal = new DFS_PostOrderTraversal();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);

        List<Integer> treeData = dfsPostOrderTraversal.postOrderTraversal(root);
        treeData.forEach(System.out::println);
    }
}
