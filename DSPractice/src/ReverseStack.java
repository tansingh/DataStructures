import java.util.Stack;

public class ReverseStack {

	public static void reverse(Stack<Integer> s) {
		if (!s.isEmpty()) {
			int temp = s.pop();
			reverse(s);
			sortedInsert(s, temp);
		}
		
	}
	
	static void sortedInsert(Stack<Integer> s, int x) {
		if (s.isEmpty() || x > s.peek()) {
			s.push(x);
		} else {
			int temp = s.pop();
			sortedInsert(s, x);
			s.push(temp);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(30);
		s.push(-5);
		s.push(18);
		s.push(14);
		s.push(-3);
		reverse(s);
		
		while(!s.isEmpty()) {
			int temp = s.pop();
			System.out.println(temp);
		}

	}

}
