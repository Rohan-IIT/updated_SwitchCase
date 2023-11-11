class Hello {
    public static void main(String args[]) {
        int b;
        b = 5;

        // while loop in java
        while (b > 1) {
            System.out.println(" While loop " + b);
            b--;
        }

        // Do while loop in java
        int c = 1;
        do {
            System.out.println("Do while " + (c++));
        } while (c >= 4);

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop " + i);
        }

        int j = 0;
        for (; j < 5;) {
            System.out.println("for loop " + (j++));
        }
    }
}