package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

  // 自分のじゃんけんの手を入力する
  public String getMyChoice() {
    System.out.println("自分のじゃんけんの手を入力しましょう");
    System.out.println("グーはrockのrを入力しましょう");
    System.out.println("チョキはscissorsのsを入力しましょう");
    System.out.println("パーはpaperのpを入力しましょう");
    Scanner sc = new Scanner(System.in);
    do {
      String input2 = sc.next();
      if (input2.equals("r") || input2.equals("s") || input2.equals("p")) {
        sc.close();
        return input2;
      }
      System.out.println("正しい手を入力してください");
    } while (true);

  }

  // 対戦相手のじゃんけんの手を乱数で選ぶ
  public String getRandom() {
    // 配列にじゃんけんの手をセットする
    String[] inputs = {"r", "s", "p"};
    // 乱数を生成する
    int num = (int) Math.floor(Math.random() * 3);
    // 乱数から対戦相手の手を返却する
    return inputs[num];
  }

  // じゃんけんを行う
  public void playGame() {

    HashMap<String, String> map = new HashMap<>();
    map.put("r", "グー");
    map.put("s", "チョキ");
    map.put("p", "パー");
    // 自分の手を出力する
    String myChoice = getMyChoice();
    System.out.print("自分の入力した手は" + myChoice + ",");

    // 対戦相手の手を出力する
    String otherChoice = getRandom();
    System.out.println("相手の入力した手は" + otherChoice);

    String myHand = map.get(myChoice);
    String yourHand = map.get(otherChoice);

    if (myHand.equals(map.get("r"))) {
      if (yourHand.equals(map.get("r"))) {
        System.out.println("あいこです");
      } else if (yourHand.equals(map.get("s"))) {
        System.out.println("自分の勝ちです");
      } else if (yourHand.equals(map.get("p"))) {
        System.out.println("自分の負けです");
      }
    } else if (myHand.equals(map.get("s"))) {
      if (yourHand.equals(map.get("r"))) {
        System.out.println("自分の負けです");
      } else if (yourHand.equals(map.get("s"))) {
        System.out.println("あいこです");
      } else if (yourHand.equals(map.get("p"))) {
        System.out.println("自分の勝ちです");
      }
    } else if (myHand.equals(map.get("p"))) {
      if (yourHand.equals(map.get("r"))) {
        System.out.println("自分の勝ちです");
      } else if (yourHand.equals(map.get("s"))) {
        System.out.println("自分の負けです");
      } else if (yourHand.equals(map.get("p"))) {
        System.out.println("あいこです");
      }
    }


  }

}
