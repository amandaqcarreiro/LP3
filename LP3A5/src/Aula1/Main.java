package Aula1;

public class Main{
			
	public static void main(String[] args) throws InterruptedException {
		MinhaThread mT1 = new MinhaThread(1);
		MinhaThread mT2 = new MinhaThread(2);
		MinhaThread mT3 = new MinhaThread(3);

		mT1.start();
		mT2.start();
		mT3.start();
				
	}
}

class MinhaThread extends Thread {
			
	private volatile static int num = 0;
			
	int numThread = 0;
			
	MinhaThread(int num) {
		this.numThread = num;
	}
			
	public void run() {
		System.out.println(getName());
				
		for(int i = 0; i < 4; i++) {
			if(getName().equals("Thread-0")) {
			     System.out.println("Valor de num (T1)): " + num);
			     num = 10;
			 } else if(getName().equals("Thread-1")){
			     System.out.println("Valor do num (T2):" + num);
			     num = 20;
			 } else {
			     System.out.println("Valor do num (T3):" + num);
				 num = 30;
			 }
		}	
	}
			
}

