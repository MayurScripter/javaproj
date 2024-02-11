public class maxelement {
    public static int Maxelem(int[] arr){
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={9,12,4,5,6};
        System.out.println("The largest element in array is" +(Maxelem(arr)));
    }
    
}
