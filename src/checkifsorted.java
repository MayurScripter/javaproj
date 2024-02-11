public class checkifsorted {
    public static boolean checksorted(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
    
    return true;
}
public static void main(String[] args) {
    int [] arr={3,5,2,4,1};
    System.out.println(checksorted(arr));
}
}



    



