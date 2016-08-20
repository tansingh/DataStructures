
public class BinaryTreeExpressions {

	public static void main(String[] args) {
	    Node n1 = new Node("1");
	    Node n2 = new Node("&");
	    Node n3 = new Node("3");
	    
	    n2.left = n1;
	    n2.right = n3;
	    
	    System.out.println(Node.eval(n2));

	}

}

class Node {
	  String val;
	  Node left;
	  Node right;
	  
	  public Node (String s) {
	    val = s;
	  }
	  
	  public static int eval(Node n) {
	    try {
	      return Integer.parseInt(n.val);
	    } catch (NumberFormatException e) {
	    	
	        try {
		    return evaluateEx(eval(n.left), eval(n.right), n.val);
		} catch (NotOperandExpression e1) {
		    System.out.println("Not a valid operand");
		    return 0;
		}
	    } 
	  }
	  
	  public static int evaluateEx(int a, int b, String ex) throws NotOperandExpression {
	    switch(ex) {
	      case "+":
	        return a + b;
	      case "/":
	        return a/b;
	      case "-":
	        return a - b;
	      case "*":
	        return a * b;
	      default:
	        throw new NotOperandExpression();
	    }
	  }
}
