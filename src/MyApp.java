package src;

public class MyApp {
  public static void main(String[] args) {
    /*
     * Author: Yasuhiro WATANABE
     */
    System.out.println(10);
    System.out.println(-8);
    System.out.println(2.5);
    System.out.println(1_000_000); // 1000000
    System.out.println(1.2e3); // 1200.0
    System.out.println(1.2e-3); // 0.0012

    System.out.println(10 + 3); // 13
    System.out.println(10 - 3); // 7
    System.out.println(10 * 3); // 30
    System.out.println(10 / 3); // 3
    System.out.println(10 % 3); // 1
    System.out.println(10 / 3.0); // 3.3333333333333335
    System.out.println(10 % 3.0); // 1.0
    System.out.println(10.0 / 3); // 3.3333333333333335

    System.out.println(10 + 2 * 3); // 16
    System.out.println((10 + 2) * 3); // 36

  }
}