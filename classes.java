public class classes {
    public static void main(String[] args) {

        int y = 5;
        int x = 10;
        // Tyep_of_object object_name = new_keyword_to_give_it_space_on_ram
        // name_of_functionality
        funct obj = new funct();

        // method overloading
        int h = obj.addition(x, y, 10);
        int f = obj.addition(x, y);

        System.err.println(h);
        System.err.println(f);

    }
}

// pass by reference
class funct {
    public int addition(int l, int m) {
        System.err.println("Hello");
        return (l + m);
    }

    public int addition(int l, int m, int x) {
        System.err.println("Hello 2");
        return (l + m + x);
    }
}