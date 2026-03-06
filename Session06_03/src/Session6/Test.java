package Session6;


public class Test {
public static void main(String[] args) {
	 
//	System.out.println(Thread.currentThread().getName());
//	System.out.println(Thread.currentThread().getThreadGroup().getName());
//	System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

ThreadGroup tg =new ThreadGroup("tag");
Thread t1 =new Thread (tg,"first");
Thread t2 =new Thread(tg,"second");
System.out.println(tg.getMaxPriority());
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());



tg.setMaxPriority(3);


Thread t3 =new Thread(tg,"Third ");
System.out.println(tg.getMaxPriority());
System.out.println(t3.getPriority());                                                                                                                                                                                                
}
}