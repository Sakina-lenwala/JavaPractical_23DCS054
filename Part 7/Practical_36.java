class threadPriority extends Thread
{

    threadPriority(String threadName)
    {
        super(threadName);
    }

    public void run()
    {
        System.out.println("Thread :- "+this.getName());
    }

}

public class Practical_36
{
    public static void main(String[] args) {
        threadPriority t1 = new threadPriority("FIRST");
        threadPriority t2 = new threadPriority("SECOND");
        threadPriority t3 = new threadPriority("THIRD");
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);
        t1.start();
        t2.start();
        t3.start();
    }

}
