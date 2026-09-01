class triangular_Patterns_Of_Alphabets_b{
    public static void main( String args[]){
        
        int n=5;


        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print((char) (64+n-i+1) + " ");
            }
            System.out.println();
        }
    }
}