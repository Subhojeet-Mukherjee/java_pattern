class stair_Case_Pattern_a{
    public static void main( String args[]){

        int n=7;
        
        for(int i=1; i<=n; i++){ 
                 
            for(int j=1; j<=2*((i+1)/2);j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        
    }
}