public class revarr {
    public static void main(String[] args) {
        int [] arr={12,23,34,45,56};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;

        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;

        }
        for(int Element:arr){
            System.out.println(Element + " ");
        }

    }
    
}
