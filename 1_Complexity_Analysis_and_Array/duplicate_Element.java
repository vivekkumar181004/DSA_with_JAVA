// !code to find the duplicate element in the array---------------------------------------------------------------

public class duplicate_Element {
    public static void main(String[] args) {
        int array[]={2,4,4,7,9,9,3,12,3};
        int n= array.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                if(array[i]==array[j]){
                    System.out.println("duplicate element is = "+array[i]);
                    break;
                }
            }
        }
    }
}
