public class Conditional {
  public static void main(String[] A){
    aksdirdp(10, 3);
    aksdirdp(3, 10);
  }

  public static void aksdirdp(int x, int y){
    if(x > y) {
      System.out.print("x의 값("+x+")은 y의 값("+y+")보다 크다.");
    } else {
      System.out.print("x의 값("+x+")은 y의 값("+y+")보다 작다.");
    }
  }
}