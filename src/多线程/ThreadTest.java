package 多线程;

public class ThreadTest {

    public static void main(String[] args) {
        Number number = new Number(0);

        Thread t1 = new MyThread1(number);
        t1.setName("线程1");
        Thread t2 = new MyThread2(number);
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}

class Number{
    int num;

    public Number(int num){
        this.num = num;
    }

    public int add(){
        return this.num += 1;
    }
}

class MyThread1 extends Thread{
    public Number number;

    public MyThread1(Number number){
        this.number = number;
    }

    public void run(){
        while (true){
            synchronized (number){
                if (number.num % 2 == 1){
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "-->" + number.num);
                number.add();
                number.notify();
            }
            if (number.num == 100){
                break;
            }
        }
    }
}

class MyThread2 extends Thread{
    public Number number;

    public MyThread2(Number number){
        this.number = number;
    }

    public void run(){
        while (true){
            synchronized (number){
                if (number.num % 2 == 0){
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "-->" + number.num);
                number.add();
                number.notify();
            }
            if (number.num == 100){
                break;
            }
        }
    }
}
