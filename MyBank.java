package threadprog;
class Customer{
         int amount;
         public Customer() {
        	 //amount=10000;
         }
         
        synchronized void deposit(int amount) {
        	 System.out.println("inside deposite");
        	 this.amount=this.amount+amount;
        	 System.out.println("Amount is deposited");
        	 notify();
         }
        
        synchronized void withdraw(int amount) throws InterruptedException {
       	 System.out.println("inside withdraw");
       	 if(amount>this.amount) {
       	 System.out.println("withdraw is not possible");
       	 System.out.println("first you have to deposite");
       	 wait();
       	 this.amount=this.amount-amount;
       	 System.out.println("your balance after withdraw=" +this.amount);
       	 }
       	 else {
       		 this.amount=this.amount-amount;
       		 System.out.println("your balance after withdraw=" +this.amount);
       	 }
        }
}
        
 public class MyBank {

	public static void main(String[] args) {
		Customer cob=new Customer();
		Thread tob=new Thread() {
			public void run() {
				cob.deposit(4000);
			}
		};
		tob.start();
		Thread tob1=new Thread(){
		  public void run() {
			  try {
				  cob.withdraw(6000);
			  }catch(InterruptedException e) {
				  e.printStackTrace();
			  };
		  }
			
		};
	   tob1.start();

}
 }
