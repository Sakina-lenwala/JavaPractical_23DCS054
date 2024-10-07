class SharedBuffer {
    private int value = 0;
    private boolean hasValue = false;


    public synchronized void produce() throws InterruptedException {
        while (true) {

            if (hasValue) {
                wait();
            }
            value++;
            System.out.println("Produced: " + value);
            hasValue = true;
            notify();
            Thread.sleep(1000);
        }
    }


    public synchronized void consume() throws InterruptedException {
        while (true) {

            if (!hasValue) {
                wait();
            }

            System.out.println("Consumed: " + value);
            hasValue = false;
            notify();
            Thread.sleep(1500);
        }
    }
}


class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            buffer.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            buffer.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class Practical_37 {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
