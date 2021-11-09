package ua.com.alevel.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static class Node {
        int value;
        Node left, right;

        Node(int x) {
            this.value = x;
            left = null;
            right = null;
        }
    }

    public static int longestConsecutive(Node root) {

        if (root == null) {
            return 0;
        }
        int max = 0;
        Queue<Node> q = new LinkedList<Node>();
        Queue<Integer> l = new LinkedList<Integer>();
        q.add(root);
        l.add(1);
        while (q.size() > 0) {
            Node node = q.poll();
            int len = l.poll();
            max = Math.max(max, len);
            if (node.left != null) {
                if (node.left.value == node.value + 1) {
                    l.add(len + 1);
                } else {
                    l.add(1);
                }
                q.add(node.left);
            }
            if (node.right != null) {
                if (node.right.value == node.value + 1) {
                    l.add(len + 1);
                } else {
                    l.add(1);
                }
                q.add(node.right);
            }
        }
        return max;
    }

    public static void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of Node " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of Node " + node.value);
                node.right = new Node(value);
            }
        }
    }

    public static void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        Node rootNode;
        do {
            try {
                System.out.println("Enter root value: ");
                rootNode = new Node(Integer.parseInt(reader.readLine()));
                System.out.println("===================");
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Failed: Wrong input.");
            }
        } while (true);
        do {
            System.out.println("1. Insert new node.\n2. Find Longest Consecutive.\n3. Main Menu ");
            string = reader.readLine();
            switch (string) {
                case "1": {
                    do {
                        try {
                            System.out.print("Enter node value: ");
                            insert(rootNode, Integer.parseInt(reader.readLine()));
                            System.out.println();
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Failed: Wrong input.");
                        }
                    } while (true);
                    break;
                }
                case "2": {
                    System.out.println("Longest Consecutive:" + longestConsecutive(rootNode));
                    break;
                }
            }
        } while (!string.equals("3"));
    }
}