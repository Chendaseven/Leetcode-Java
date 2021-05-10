/*
    使用DFS获取两颗树的叶值序列，然后比较两棵树的叶值序列是否相同
 * @Author Chenpeng
 * @Date
 * @Param  * @param null
 * @return
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        leaf_Similar(root1,list1);
        leaf_Similar(root2,list2);

        return list1.equals(list2);
    }

    public void leaf_Similar(TreeNode root,ArrayList<Integer> list) {
        if(root.left == null && root.right==null){
            list.add(root.val);
        }else{
            if(root.left != null){
                leaf_Similar(root.left,list);
            }
            if(root.right != null){
                leaf_Similar(root.right,list);
            }
        }
    }
}