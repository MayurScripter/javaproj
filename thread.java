class Mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<=40){
            System.out.println("thread1 is running");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<=40){
            System.out.println("Thread2 is running");
            System.out.println("I am good");
            i++;
        }
    }
}



public class thread {
    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread2 t2= new Mythread2();
        t1.start();
        t2.start();
    }
    
}
