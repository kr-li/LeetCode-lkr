package 多线程;

public class ThreadTest2 {

    public static void main(String[] args) {
        int x= 0;
        int y=10;
        while(++x < 6){
            y--;
        }
        System.out.println(++x + "," + y);


    }
}


