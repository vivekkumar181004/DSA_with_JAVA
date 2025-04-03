// !code to check a palindromic array ---------------------------------------------------------------------------------------

class palindrome {
    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 6, 4, 2 };
        int n = array.length;
        int flag=0;
        for (int i=0; i<n/2; i++) {
            if (array[i] == array[n - i - 1]) {
                flag=1;
                continue;
            }else{
                flag=0;
                System.out.println("not a palindrome");
                break;
            }
        }
        if(flag==1){
            System.out.println("array is a palindrome");
        }
    }

}