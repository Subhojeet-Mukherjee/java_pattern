class reverse_Character_Bridge{
    public static void main( String args[]){
            int n=8;
            
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n+1-i; j++){
                    System.out.print((char)(64+j)+" ");
                }
                for(int j=1; j<=2*i-3; j++){
                    System.out.print("  ");
                }
                // int temp=n-i;
                // if(i==1){
                //   for(int j=1; j<=n-i; j++){
                //     System.out.print((char)(64+temp) + " ");
                //     temp--;
                                            
                //   }
                // }
                // else{
                //         temp=n-i+1;
                //        for(int j=1; j<=n-i+1; j++){
                        
                //         System.out.print((char)(64+temp) + " ");
                //         temp--;
                        
                // }}

                if(i==1){
                  for(int j=n-i; j>=1; j--){
                    System.out.print((char)(64+j) + " ");                                           
                  }
                }
                else{
                       for(int j=n-i+1; j>=1; j--){  
                        System.out.print((char)(64+j) + " ");

                }}

               
                
             System.out.println();
            }

    }
}