class CBTInserter {
	LinkedList<TreeNode> que = new LinkedList<>();
	TreeNode _root;
	
    public CBTInserter(TreeNode root) {
    	_root = root;
        que.addLast(root);
        while(true) {
        	TreeNode last = que.get(0);
        	if(last.left == null)
        		break;
        	else
        		que.addLast(last.left);
        	if(last.right == null)
        		break;
        	else {
        		que.addLast(last.right);
        		que.removeFirst();
        	}
        }
    }
    
    public int insert(int val) {
    	TreeNode node = new TreeNode(val);
        TreeNode last = que.get(0);
        que.addLast(node);
        if(last.left == null) {
        	last.left = node;
        }else {
        	last.right = node;
        	que.removeFirst();
        }
    	return last.val;
    }
    
    public TreeNode get_root() {
        return _root;
    }
}
