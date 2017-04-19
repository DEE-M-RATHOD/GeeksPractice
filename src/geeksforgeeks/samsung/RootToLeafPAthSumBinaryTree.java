package geeksforgeeks.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by deepali on 25-08-2016.
 */
class Node {
    int data;
    Node left, right;

    Node(int item) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

public class RootToLeafPAthSumBinaryTree {
    Node root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RootToLeafPAthSumBinaryTree rootToLeafPAthSumBinaryTree = new RootToLeafPAthSumBinaryTree();
        int t = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        Map<Integer,String[]> map = new HashMap<Integer,String[]>();
        while (t > 0) {
            String s = br.readLine();
            String[] st = s.split(" ");
            for (int i = 0; i < edges; i++) {
                map.put(i,s.split("L|R"));

            }

            int sum = Integer.parseInt(br.readLine());

            if (rootToLeafPAthSumBinaryTree.hasPathSum(rootToLeafPAthSumBinaryTree.root, sum)) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            t--;
        }
    }

    private static void bstAdd(Node root, Node left, Node right) {
    }

    boolean hasPathSum(Node node, int sum) {
        if (node == null) {
            return (sum == 0);
        } else {
            boolean ans = false;
            int subSum = sum - node.data;
            if (subSum == 0 && node.left == null && node.right == null)
                return true;

            if (node.left != null)
                ans = ans || hasPathSum(node.left, subSum);

            if (node.right != null)
                ans = ans || hasPathSum(node.right, subSum);

            return ans;
        }

    }
}
