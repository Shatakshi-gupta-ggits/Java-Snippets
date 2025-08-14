public class halfPyramid {
    // public static void half_pyramid(int n){
    //     //outer looop
    //     for(int i=1; i<=n; i++){
    //         //inner looop for Spaces 
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print(" ");
              
    //         }
    //         // inner loop for stars
    //         for(int j=1; j<=i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println(); // new line after each row
    //     }
    // }

    // public static void inverted_half_pyramid(int n){
    //     //outer Loop
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i+1; j++){
    //             System.out.print(j+"");
    //         }
    //         System.out.println(); // new line after each row
    //     }
    // }

    public static void floyd_triangle(int n){
         int counter=1;
        for(int i=1; i<=n; i++){
            //inner - how many times counter will be printed
            for(int j=1; j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        //outer loop- n lines
        for(int i=1; i<=n; i++){
            //inner loop - how many times 0 and 1 will be printed
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        
    }

    public static void main(String[] args){
     //  inverted_half_pyramid(5);
          //floyd_triangle(5);
            zero_one_triangle(5);
    }
}
