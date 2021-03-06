package encapsulation;

class Account {
//private data members
	private long acc_no;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public float getAmount() {
		return amount;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}

public class Encapsulation5 {

	public static void main(String[] args) {
		 Account e1 = new  Account();
		System.out.println("use getter mrthod acc_no:" + e1.getAcc_no());//0
		System.out.println("use getter mrthod acc_no:" + e1.getAmount());//0
		e1.setAcc_no(456789);
		e1.setAmount(400.10f);
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println("use getter mrthod acc_no:" + e1.getAcc_no());//456789
		System.out.println("use getter mrthod acc_no:" + e1.getAmount());//400.10

	}
}
