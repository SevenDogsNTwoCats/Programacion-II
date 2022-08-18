public class ADN {
    public static void main(String[] args) {
        String adn="AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        int a=0,c=0,g=0,t=0;
        
        for(int i=0;i<adn.length();i++){
            if(adn.charAt(i)=='A')
               a++;
               if(adn.charAt(i)=='C')
               c++; 
               if(adn.charAt(i)=='G')
               g++; 
               if(adn.charAt(i)=='T')
               t++;
        }
        System.out.println(a+" "+c+" "+g+" "+t);
    }
}
