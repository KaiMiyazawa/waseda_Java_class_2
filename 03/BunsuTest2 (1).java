class BunsuTest2 {
    public static void main(String[] args) {
        Bunsu2 b = new Bunsu2(1, 2);
        System.out.println(b);
        b.multi(2);
        System.out.println(b);

        Bunsu2 x = new Bunsu2(2, 3);
        b.multi(x);
        System.out.println(b);
    }
}