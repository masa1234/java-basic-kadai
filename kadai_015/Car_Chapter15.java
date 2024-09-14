package kadai_015;

public class Car_Chapter15 {
  private int gear = 1;
  private int speed = 10;

  public void gearChange(int afterGear) {
    // ギアが1から5以外は時速10km
    if (afterGear < 1 || afterGear > 5) {
      System.out.println("ギアを" + this.gear + "から" + afterGear + "に切り替えました");
      afterGear = 1;
      gear = afterGear;
      this.speed = speed * gear;
    } else {
      System.out.println("ギアを" + this.gear + "から" + afterGear + "に切り替えました");
      gear = afterGear;
      this.speed = speed * gear;
    }
  }

  public void run() {
    System.out.println("速度は時速" + this.speed + "kmです");
  }

}
