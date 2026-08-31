class stair_Case_Pattern{
    public static void main( String args[]){

        int n=11;
        
        for(int i=1; i<=n; i++){ 
            int stars=2*((i+1)/2);
            int spaces=2 * ((n + 1) / 2) - stars;

            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        
    }
}