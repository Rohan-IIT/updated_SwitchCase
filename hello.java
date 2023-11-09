class Hello {
    public static void main(String args[]) {
        int b = 3;
        System.out.println(b); 
        
        switch (b) {
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("default");
                break;
        }       
    }
}