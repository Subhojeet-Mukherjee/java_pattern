class triangular_Patterns_Of_Alphabets_a{
    public static void main(String args[]){
            int n=5;

            char letter ='A';

            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i+1; j++){

                    // System.out.print((char) (64+i+j-1)+" ");
                    
                    System.out.print((char) (letter+i+j-2) + " ");
                }
            System.out.println();
            }

    }
}