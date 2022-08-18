public class Codigo {
    public static void main(String args[]){
        StringBuilder A = new StringBuilder("ZYWXVUTSRQPONMLKJIHGFEDCBA");
        
        System.out.println(A);
        for(int i=A.length();i>=1;i--){
            A = A.deleteCharAt(A.length()-i);
            System.out.println(A);
        }
        
    }
}
