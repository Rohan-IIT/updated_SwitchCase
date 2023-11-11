class Hello {
    public static void main(String args[]) {
        int b;
        b = 5;

        // while loop in java
        while (b > 1) {
            System.out.println(" While loop " + b);
            b--;
        }

        int c =1;
        do {    
            System.out.println("Do while " + (c++) );
        } 
        while (c >= 4);
    }
}