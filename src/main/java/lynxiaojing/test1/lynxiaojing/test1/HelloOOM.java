package lynxiaojing.test1.lynxiaojing.test1;

public class HelloOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hello = "hello world";
		for(int i=0; i<23; i++) {
			hello += hello;
		}
	}

}
