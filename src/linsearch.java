public class linsearch {
    public static int linearsearch(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=4;
        int location=linearsearch(arr, target);
        System.out.println("Element found at index" +location);

    }
    
}
