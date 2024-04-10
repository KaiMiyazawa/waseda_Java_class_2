public class sample {
  public static void main(String[] args) {
    //列挙型の例
    enum  Blood_type {
      A,
      B,
      AB,
      O
    };
    Blood_type my = Blood_type.B;
    System.out.println("私の血液型は"+my+"型です。\n\n");

    //ビット演算子の例
    System.out.println("ねずみ算をします。");
    int rat = 2;
    for(int i = 1; i < 10 ; i++){
      System.out.println(rat + "匹のネズミが被りなくペアを作って交尾すると...");
      rat = rat<<1;
      System.out.println("ネズミは" + rat + "匹になります。\n");
    }
    System.out.println("ねずみ算では、元が少なくてもどんどん数が増えてきます。最終的なネズミは" +rat +"匹になりました！\n\n\n");
    
    //単項演算子の例①
    int x = 1 ;
    System.out.println("１に簡略化した式で１を足します！");
    System.out.println("足す前：" + x);
    x += 1;
    System.out.println("足した後：" + x + "\n\n\n");

    //単項演算子の例②
    int num = 3;
    System.out.println(num);
    num++;
    System.out.println(num);
    num--;
    System.out.println(num);
    ++num;
    System.out.println(num);
    --num;
    System.out.println(num);
    System.out.println("\n\n\n");
    
    //三項演算子の例
    int a ;
    System.out.println("入力した数字が3の倍数かどうかを判定します。");
    a = new java.util.Scanner(System.in).nextInt();
    boolean b;
    if(b = a % 3 == 0?true:false){
    System.out.println(a+"は、３の倍数です。");
    }else{
    System.out.println(a+"は、３の倍数ではないです。");
    }
  }
}