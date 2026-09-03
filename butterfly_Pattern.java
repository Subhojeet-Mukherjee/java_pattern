class butterfly_Pattern{
    public static void main(String args[]){

        int n=6;

        for(int i=1; i<=n; i++){
                       
                for(int j=1; j<=n; j++){
                if(j<=i){
                System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
                }             
               
                for(int j=1; j<=n-i-1; j++){
                    System.out.print("  ");
                } 
                       
            if(i==n){    
                for(int j=1; j<=i-1; j++){
                    System.out.print("* ");
                } 
            } else{
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                } 
            }   
                
                System.out.println();
        }

        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }  

            for(int j=1; j<=i-1; j++){
                    System.out.print("  ");
            }

            for(int j=1; j<=n-i; j++){
                    System.out.print("* ");
            } 
            
        
        System.out.println();
        }     
        
         

    }
}