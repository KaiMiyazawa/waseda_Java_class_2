class BunsuTest {
    public static void main(String[] args) {
        Bunsu2 b = 
        new Bunsu2(4,2);
        // b.printBunsu();
        System.out.println(
            b.bunshi + "/"
            + b.bunbo
        );
    System.out.println(b);
    // int n = b.gcd(
    //     b.bunshi,
    //      b.bunbo);
    int n = b.gcd();
    System.out.println(n);
    }
}