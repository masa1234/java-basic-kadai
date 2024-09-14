package kadai_015;

public class Car_Chapter15 {
  private int gear = 1;
  private int speed = 10;

  public void gearChange(int afterGear) {
    System.out.println("ギアを" + this.gear + "から" + afterGear + "に切り替えました");
    gear = afterGear;
  }

  public void run() {
    if (gear < 1 || gear > 5) {
      gear = 1;
    }
    System.out.println("速度は時速" + (gear * speed) + "kmです");
  }

}
