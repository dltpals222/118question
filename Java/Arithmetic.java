public class Arithmetic {
  public static int add (int a, int b){
    return a + b;
  }
  public static int minus (int a, int b){
    return a - b;
  }
  public static int multi (int a, int b){
    return a * b;
  }
  public static int division (int a, int b){
    return a / b;
  }

  public static void main(String[] A){
    int a = 4;
    int b = 2;

    int testAdd = add(a, b);
    int testMinus = minus(a, b);
    int testMulti = multi(a, b);
    int testDivision = division(a, b);

    System.out.print(testAdd);
    System.out.print(testMinus);
    System.out.print(testMulti);
    System.out.print(testDivision);
  }
}