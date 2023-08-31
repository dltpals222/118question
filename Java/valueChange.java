public class valueChange {
  public static void main (String[] args){
    //* 임시변수 사용 
    int a = 1;
    int b = 2;

    System.out.println("변경 전 a = " + a);
    System.out.println("변경 전 b = " + b);

    int c = a;
    a = b;
    b = c;

    System.out.println("변경 후 a = " + a);
    System.out.println("변경 후 b = " + b);

    //자바는 배열 디스트럭처링을 지원하지 않으므로 사용할 수 없다.
  }
}