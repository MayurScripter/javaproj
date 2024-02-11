public class pattern2 {
    static void pattern(int n){
        for( int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
    
}
