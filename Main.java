
public class Main {
    public static void main(String[] args) {
        User g1 = new User("s533665@pjwstk.edu.pl");
        User g2 = new User("s34745845");
        User u1 = new User("Pasha", "Pavlow", "s3758594", "df9vb");
        g1.registerUser("Palina", "Zevakina", "gh9jk");
        g1.setPassword("Password2");
        System.out.println(g1.getPassword());
        Product p1 = new Product("banana", 2.0, "fr8hw", 3);
        Product p2 = new Product("apple", 4.0, "ge7ui");
        Product p3 = new Product("grape", 1.0, "dg4ui");
        p1.setPrice(9.0);
        p1.setNumberOfPiases(5);
        System.out.println(p1.getNumberOfPiases());

    }
}
