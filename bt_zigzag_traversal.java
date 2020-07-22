/*

Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its zigzag level order traversal as:

[
  [3],
  [20,9],
  [15,7]
]


 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.ArrayList;
import java.io.*; 
import java.util.*; 


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        // Edge case
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        
        
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        int count = 0;
        TreeNode x;
        
        
        // Queue to implement level order
        queue.add(root);
        
        
        while(queue.size() > 0){    
            
            List<Integer> temp = new ArrayList<Integer>();
            ArrayList<TreeNode> c = new ArrayList<TreeNode>();

            for(int i = 0; i < queue.size(); i++){
                temp.add(queue.get(i).val);
            }
            
            if(count % 2 != 0){
                Collections.reverse(temp);
            }
        
            while(queue.size()>0){
                    x = queue.remove(0);
                    if(x.left != null)
                        c.add(x.left);
                    if(x.right != null)
                        c.add(x.right);
            }

            res.add(temp);
            queue = c;
            count += 1;
        }
        return res;
            
    }
}