public class minarr {
 static int min(int arr[]){
    int ans=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<ans){
            ans=arr[i];
        }
    }
    return ans;
    


 }   
 public static void main(String[] args) {
    
    int arr[]={1,-3,4,5,8,7,-10};
    System.out.print(min(arr));
  
 }
    
}
