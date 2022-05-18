package memorymanagement;

public class Logicaloperator {

	public static void main(String[] args) {
		int age=18;
		char bloodgr='A';
		boolean res1,res2;
		res2=(bloodgr=='A');
		res1=(age>18);
		System.out.println("res1 && res2:" +(res1 && res2));//f
		System.out.println("res1|| res2:" +(res1 || res2));//t
		System.out.println("! res1 && res2:" +!(res1 && res2));//t
		System.out.println("! res1|| res2:" +!(res1 || res2));//f

	}

}
