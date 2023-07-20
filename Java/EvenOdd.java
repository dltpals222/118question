public class EvenOdd{
  static void EvenOddOne(int a){
    if(a % 2 == 1){
      System.out.print(a +"는 홀수입니다.");
    } else {
      System.out.print(a + "는 짝수입니다.");
    }
  }
  static void EvenOddTwo(int a){
    if(a % 2 == 1) {
      System.out.print(a +"는 홀수입니다.");
    } else if (a % 2 == 0) {
      System.out.print(a + "는 짝수입니다.");
    }
  }

  public static void main(String[] args){
    EvenOddOne(1);
    EvenOddOne(2);
    EvenOddTwo(1);
    EvenOddTwo(2);
  }
}