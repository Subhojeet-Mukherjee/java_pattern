class triangular_Patterns_Of_Alphabets_d{
    public static void main( String args[]){

            int n=5;

            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print((char) (64+n+j-i)+" ");
                }
                System.out.println();
            }

    }
}