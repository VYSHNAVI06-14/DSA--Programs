  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class RecoverTree {
    TreeNode prev, first, middle, last;
    public static void main(String[] args) {
        RecoverTree tree = new RecoverTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        //root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        tree.recoverTree(root);
    }
    public void recoverTree(TreeNode root) {
       Inorder(root); 
       if(last==null)
        Swap(first,middle);
       else
        Swap(first,last);
        printTree( root);
    }
   void Swap(TreeNode a,TreeNode b)
    {
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
    }
    void Inorder(TreeNode root){
       if(root==null)
        return;
       Inorder(root.left);
       if(prev!=null && prev.val>root.val)
       {
        if(middle==null){
            first=prev;
            middle=root;
        }
        else
          last=root;
       }
       prev=root;
       Inorder(root.right);
    }
    void printTree(TreeNode root)
     {
         if(root==null)
          return;
         printTree(root.left);
         System.out.print(root.val);
         printTree(root.right);
     }
}