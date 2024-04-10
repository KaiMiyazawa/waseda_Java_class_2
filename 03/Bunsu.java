class Bunsu {

  int bunsi;
  int bunbo;

//分母が１なら省略する
  Bunsu(){
    this.bunsi = 0;
    this.bunbo = 1;
  }
  Bunsu(int sun, int parent){
    this.bunsi = sun;
    this.bunbo = parent;
  }
  Bunsu(int sun){
    this.bunsi = sun;
    this.bunbo = 1;
  }

  public void printBunsu() {
    if(bunbo == 1){
        System.out.println(this.bunsi);
    }else{
        System.out.println(this.bunsi + "/" + this.bunbo);
    }
  }
  public String toString(){
    String data;
    data = this.bunsi + "/" + this.bunbo;
    return data;
  }

}