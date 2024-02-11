public class fib {
    static int fibs(int n){
        if(n==0 || n==1){
            return n-1;
        }
        else{
            return fibs(n-1)+fibs(n-2);
        }
    }
    public static void main(String[] args) {
        int result=fibs(7);
        System.out.println(result);
    }
}


