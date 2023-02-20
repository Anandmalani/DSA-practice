package stacklearning;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s1=new stack();
		s1.push(20);
		s1.push(40);
		s1.push(70);
		while(s1.head!=null) {
			System.out.println(s1.pop());
		}

	}

}
