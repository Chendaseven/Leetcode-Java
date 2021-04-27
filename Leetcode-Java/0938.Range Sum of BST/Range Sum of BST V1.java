/*
    使用DFS获取二叉搜索树排序的链表，然后遍历链表找到结点之和
 * @Author Chenpeng
 * @Date
 * @Param  * @param null
 * @return
 */
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int rangeSumBST(TreeNode root, int low, int high) {
        DFS(root);
        int sum = 0;
        for(Integer num:list){
            if(num >= low && num <= high){
                sum+=num;
            }
        }
        return sum;
    }

    public void DFS(TreeNode root){
        if(root == null){
            return;
        }
        DFS(root.left);
        list.add(root.val);
        DFS(root.right);
    }
}