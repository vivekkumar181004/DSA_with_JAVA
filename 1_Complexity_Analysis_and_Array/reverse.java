// !code to reverse the elements of an array----------------------------------------------------------------------------------

class reverse{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        int n= array.length;
        for(int i=0; i<n/2; i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
    }
}