public class majorelement{
    public static int majorelem(int[] v){
        int maxfreq=0;
        int ans=0;
        
        for(int i=0;i<v.length;i++){
            int count=0;
            for(int j=0;j<v.length;j++){
                if(v[i]==v[j]){
                    count++;
                }
                
            }
            if(maxfreq<count){
                maxfreq=count;
                ans=v[i];
            }

        }
        if(maxfreq>v.length/2){
            return ans;
        }
        else{
            return -1;
        }

        
    }
    public static void main(String[] args) {
        int[] v={3,2,3};
        System.out.println(majorelem(v));
    }
}


    