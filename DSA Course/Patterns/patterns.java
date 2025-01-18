public class patterns{

    public static void starPatt(int n){
        for(int i=1; i<=n; i++){ //outer loop for rows
            //one line  
            for(int j=1; j<=i; j++){  //inner loop 
                System.out.print("*");
            }
            System.out.println();
        }        
    }

    public static void invStarPatt(int n){
        //Outer Loop for rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(int totRows, int totColms){
        //Outer Loop for rows 
        for(int i=1; i<=totRows; i++){
            //Inner Column
            for(int j=1; j<=totColms; j++){
                //cell(i,j)
                if( i == 1 || i ==totRows || j == 1 || j == totColms){  //Boundary Conditions 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inv_rot_half_pyramid(int n){
        //Outer Loop rows
        for(int i=1; i<=n; i++){
            //Inner Loops 
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        //Counter
        int counter = 1;
        //Outer Loop Rows
        for(int i=1; i<=n; i++){
            //Inner Loop
            for (int j=1; j<=i; j++) {
               System.out.print(" " + counter); 
               counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        //Outer Loop For Rows
        for(int i=1; i<=n; i++){
            //Inner Loop
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){ //Even condition
                    System.out.print("1");
                }else{  //Odd Condition
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n){
        //1st Half
        for(int i=1; i<=n; i++){//Outer Loop rows
            //Inner Loops
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Space
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half 
        for(int i=n; i>=1; i--){ // Outer Loops rows
            //Inner Loops
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Space
            for(int j=1; j<=(2*(n-i)); j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_Rhombus(int n){
        //Outer Loop rows
        for(int i=1; i<=n; i++){
            //Inner Loop
            //Space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        // starPatt(5);
        // invStarPatt(5);
        // hollow_rectangle(5,5);
        // inv_rot_half_pyramid(5);
        // floyds_triangle(5);
        // zero_one_triangle(6);
        // butterfly_pattern(10);
        solid_Rhombus(5);
    }
}