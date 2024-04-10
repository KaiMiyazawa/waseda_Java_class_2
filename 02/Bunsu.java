class Bunsu {

  int bunsi;
  int bunbo;

//分母が１なら省略する
  Bunsu(){
    bunsi = 0;
    bunbo = 1;
  }
  Bunsu(int sun, int parent){
    bunsi = sun;
    bunbo = parent;
  }
  Bunsu(int sun){
    bunsi = sun;
    bunbo = 1;
  }

  public void printBunsu() {
    if(bunbo == 1){
        System.out.println(bunsi);
    }else{
        System.out.println(bunsi + "/" + bunbo);
    }
  }
}