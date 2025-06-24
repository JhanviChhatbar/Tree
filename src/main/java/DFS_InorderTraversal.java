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
}
