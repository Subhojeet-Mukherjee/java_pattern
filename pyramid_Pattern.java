class pyramid_Pattern{
    public static void main( String args[]){
            int n=5;
            int count=1;
            for(int i=1; i<=n; i++){

                int temp=count+i-1;
                
                for(int j=1; j<=2*i - 1; j++){
                    
                    if(j%2==0){
                    System.out.print("* ");
                    }
                    else if(i%2==0){
                        System.out.print(temp+" ");
                        temp--;
                        count++;
                    }else{
                        System.out.print(count+" ");
                        count++;
                    }             
                }
                
             System.out.println();
            }

    }
}