class B implements Runnable
{
    public void run()
    {
        System.out.println("Hello World");
    }
}

public class Practical_32 {
    public static void main(String[] args) {

        B b = new B();
        Thread t = new Thread(b);
        t.start();
    }
}
