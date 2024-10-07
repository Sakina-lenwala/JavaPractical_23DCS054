class MyThread extends Thread
{
    int count=0;
    public void run()
    {
        while (true)
        {
            count++;
            System.out.println(count);
            try
            {
                MyThread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Practical_35 {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
    }
}
