package Session6;

public class Demo1 {
public static void main(String[] args) {
	ThreadGroup tg =Thread.currentThread().getThreadGroup().getParent();
	
	
	
	System.out.println("------------------------------------------");
	Thread[] t=new Thread[tg.activeCount()];
	tg.enumerate(t);
	for(Thread i:t) {
		System.out.println(i.getName());
	}
}
}
