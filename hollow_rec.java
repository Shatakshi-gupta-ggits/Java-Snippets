public class hollow_rec {
    
    // Function to print a hollow rectangle

public static void hollow_rectangle(int totRows, int totCols){
    //outer loop
    for(int i=1; i<=totRows; i++){
        //inner loop
        for(int j=1; j<=totCols; j++){
            //cell- (i,j)
            if(i==1 || i==totRows || j==1 || j==totCols){
                //boundary cells
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(); // new line after each row
    }
}

    public static void main(String[] args){
                     int totRows = 5;
                     int totCols = 5;
                     hollow_rectangle(totRows, totCols);
    }
}