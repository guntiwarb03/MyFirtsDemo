package ThreadPracticeProgram;

public class ThreadDemo extends Thread{
	public void run() {
		for(int i=0; i<3; i++)
		System.out.println(i);
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	ThreadDemo td = new ThreadDemo();
	td.start();
	System.out.println(td.getName());
	System.out.println(td.getId());
	System.out.println(td.getPriority());
	System.out.println(td.getState());
	System.out.println(" ");
	
	ThreadDemo td1 = new ThreadDemo();
	td1.start();
	System.out.println(td1.getName());
	System.out.println(td1.getId());
	System.out.println(td1.getPriority());
	System.out.println(td1.getState());
	System.out.println(" ");
	
	ThreadDemo td2= new ThreadDemo();
	td2.start();
	System.out.println(td2.getName());
	System.out.println(td2.getId());
	System.out.println(td2.getPriority());
	System.out.println(td2.getState());
	
}
}
