/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node node) {
        if(node == null) return 0;
        var max = 0;
        for(var child : node.children)
        max = Math.max(max,maxDepth(child));
        return max + 1;
    }
}