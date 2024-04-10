class Bunsu2 extends Bunsu{
  Bunsu2(int m, int n){
    super(m, n);
    // this.bunsi = m;
    // this.bunbo = n;
  }
  Bunsu2(int n){
    super(n);
  }
  public int gcd(){
    return gcd(this.bunsi,this.bunbo);
  }
  public int gcd(int m,int n){
    int r;
    while(n>0){
      r = m % n;
      m = n;
      n = r;
    }
    return m;
  }

  @Override
  public String toString(){
    int r = gcd();
    String data;
    int newBunsi = this.bunsi/r;
    int newBunbo = this.bunbo/r;
    if(newBunbo == 1){
      data = String.valueOf(newBunsi);
    }else{
      data = newBunsi + "/" + newBunbo;
    }
    return data;
  }

  public void multi(int n){
    Bunsu2 b = new Bunsu2(n);
    multi(b);
  }
  public void multi(Bunsu2 b){
    this.bunsi *= b.bunsi;
    this.bunbo *= b.bunbo;
  }
}