class Bunsu2 extends 
Bunsu {
    Bunsu2(int n) {
        super(n);
    }
    Bunsu2(int m, int n) {
        super(m, n);
    }
    public int gcd() {
        return gcd(this.bunshi,
        this.bunbo);    
    }
    public int gcd(int m, int n) {
        int r;
        while (n>0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}