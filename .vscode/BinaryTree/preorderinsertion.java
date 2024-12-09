import java.util.*;
public class preorderinsertion {
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
        public static class BinaryTree
        {
            static int idx=-1;
            public static Node buildTree(int nodes[])
            {
                idx++;
                if(nodes[idx]==-1)
                {
                    return null;
                }
                Node newNode=new Node(nodes[idx]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);


                return newNode;
            }
            public static void preorder(Node root)
            {
                if(root==null)
                {
                    System.out.print(-1+" ");
                    return;
                }
                System.out.print(root.data+" ");
                preorder(root.left);
                preorder(root.right);
            }
            public static void postOrder(Node root)
            {
                if(root==null)
                {

                    System.out.print(-1+" ");
                    return;
                }
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data+" ");
            }
            public static void inorder(Node root)
            {
                if(root==null)
                {
                    System.out.print(-1+" ");
                    return;
                }
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
            } 
            public static void levelorder(Node root)
            {
                if(root==null)
                {
                    return;
                }
                Queue<Node> q=new LinkedList<>();
                q.add(root);
                q.add(null);
                int count=0;
                while(!q.isEmpty())
                {
                    Node currNode=q.remove();
                    if(currNode==null)
                    {
                        count+=1;
                        System.out.println();
                        if(q.isEmpty())
                        {
                            break;
                        }
                        else
                        {
                            q.add(null);
                        }
                    }
                        else
                        {
                            System.out.print(currNode.data+" ");
                            if(currNode.left!=null)
                            {
                                q.add(currNode.left);
                            }
                            if(currNode.right!=null)
                            {
                                q.add(currNode.right);
                            }
                        }
                }
                System.out.println("this is height:"+count);
            }
            public static int height(Node root)
            {
                if(root==null)
                {
                    return 0;
                }
                int lh=height(root.left);
                int rh=height(root.right);
                return Math.max(lh,rh)+1;
            }
            public static int countnode(Node root)
            {
                if(root==null)
                {
                    return 0;
                }
                int lh=countnode(root.left);
                int rh=countnode(root.right);
                return lh+rh+1;
            }
            public static int sum(Node root)
            {
                if(root==null)
                {
                    return 0;
                }
                int lh=sum(root.left);
                int rh=sum(root.right);
                return lh+rh+root.data;
            }
            public static int diameter(Node root)
            {
                if(root==null)
                {
                    return 0;
                }
             int left=diameter(root.left);
             int right=diameter(root.right);
             int r=height(root.left)+height(root.right)+1;
                return Math.max(r,Math.max(left,right));
            }
            public static class Raj
            {
                int ht;
                int diam;
                Raj(int ht, int diam)
                {
                    this.ht = ht;
                    this.diam = diam;
                }
            }
            public static Raj diame(Node root)
            {
                if(root==null)
                {
                   return new Raj(0,0);

                }
                Raj left=diame(root.left);
                Raj right=diame(root.right);
                int myhe=Math.max(left.ht,right.ht)+1;
                int diam1=left.diam;
                int diam2=right.diam;
                int diam3=left.ht+right.ht+1;
                int mydiam=Math.max(Math.max(diam1,diam2),diam3);
                Raj myinfo=new Raj(myhe,mydiam);
                return myinfo;

            }
        }
            public static void main(String arg[])
            {
                int[] nodes={1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,6,-1,-1};
                BinaryTree obj=new BinaryTree();
                Node root=obj.buildTree(nodes);
                obj.preorder(root);
                System.out.println("\n"+"this is for post order:");
                obj.postOrder(root);
                System.out.println("\n"+"this is for In order:");
                obj.inorder(root);
                System.out.println("\n"+"this is for level order:");
               obj. levelorder(root);
                System.out.println("\n"+"this is for height of tree:"+obj.height(root));
                System.out.println("\n"+"this is for Nodes of tree:"+obj.countnode(root));
                 
                System.out.println("\n"+"this is for diameter of node of tree:"+obj.diameter(root));
            System.out.println("\n"+"this is for diameter of node of tree:"+obj.diame(root).diam);
            
            }

    }

