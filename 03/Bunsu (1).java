class Bunsu {
    int bunshi;
    int bunbo;

    Bunsu() {
        this.bunshi = 0;
        this.bunbo = 1;
    }
    Bunsu(int n) {
        this.bunshi = n;
        this.bunbo = 0;
    }
    Bunsu(int m, int n) {
        this.bunshi = m;
        this.bunbo = n;
    }
    void printBunsu() {
        System.out.println(
            this.bunshi +
             "/" +
            this.bunbo);
    }
    public String toString() {
        String data;
        data = this.bunshi + "/"
         + this.bunbo;
        return data;
    }
}