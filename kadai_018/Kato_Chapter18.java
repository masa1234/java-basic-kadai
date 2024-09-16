package kadai_018;

public abstract class Kato_Chapter18 {
  // 姓を表す
  public String familyName = "加藤";
  // 名を表す
  public String givenName;
  // 住所を表す
  public String address = "住所は東京都中野区〇×です";

  // 共通の紹介を出力する
  public void commonIntroduce() {
    System.out.println(address);
  }

  public Kato_Chapter18() {
    commonIntroduce();
    eachIntroduce();
  }

  // 個別の紹介を出力する
  public abstract void eachIntroduce();

  // 紹介を実行する
  public void execIntroduce() {
    System.out.println("名前は" + familyName + givenName + "です");

  }

}
