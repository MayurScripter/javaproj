class Mythreadrunable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<=20){
            System.out.println("Thread1 is runnable");
            i++;
        }
    }
}
class Mythreadrunable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<=20){
            System.out.println("Thread2 is runnable");
            i++;
        }
    }
}




public class runnable {
    public static void main(String[] args) {
        Mythreadrunable1 t1=new Mythreadrunable1();
        Thread a=new Thread(t1);
        Mythreadrunable2 t2=new Mythreadrunable2();
        Thread b= new Thread(t2);
        a.start();
        b.start();
        
    }
}
