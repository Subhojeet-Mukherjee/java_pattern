class pattern_Of_Numbers_1{
    public static void main( String args[]){
            int n=5;
            
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print("  ");
                }
                    int count=i;
                for(int j=1; j<=i; j++){
                    
                    System.out.print(count+" ");
                    count++;
                }
                
                // for(int j=2*i - 2; j>=i; j--){
                    
                //     System.out.print(j+" ");
                    
                // }
                
                int rowValur=2*i-2;
                for(int j=1; j<=i-1; j++){
                    
                    System.out.print(rowValur+" ");
                    rowValur--;
                    
                }

            System.out.println();
            }

    }
}