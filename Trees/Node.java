package Trees;

import java.util.Stack;

//class NodesT<T> {
//    T value;
//    NodesT<T> left;
//    NodesT<T> right;
//
//    public NodesT(T value, NodesT<T> left, NodesT<T> right) {
//        this.value = value;
//        this.left = left;
//        this.right = right;
//    }
//    public NodesT(T value) {
//        this.value = value;
//    }
//}

public class Node{
    int value;
    Node left;
    Node right;
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public Node(int value) {
        this.value = value;
    }

    public int sum(){
        int result = this.value;
        if (this.left != null){
            result += left.sum();
        }
        if (this.right != null){
            result += right.sum();
        }
        return result;
    }

    public int sumDeep(){
        Stack<Node> stack = new Stack<>();
        stack.push(this);
        int sum = 0;
        while (!stack.isEmpty()){
            Node node = stack.pop();
            sum += node.value;
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return sum;
    }
}
