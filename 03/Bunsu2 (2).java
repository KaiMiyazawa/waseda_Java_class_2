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
    @Override
    public String toString() {
        int r = this.gcd();
        int newBunshi = this.bunshi/r;
        int newBunbo = this.bunbo/r;
        String data;
        if (newBunbo == 1) {
            data = "" + newBunshi;
        } else {
            data = 
            newBunshi + "/" +
            newBunbo;
        }
        return data; 
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