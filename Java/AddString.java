public class AddString {
  public static void exampleOne(String s1, String s2){
    System.out.println(s1 + s2);
  }

  static void exampleTwo(String s1, String s2){
    String addStr = s1 + s2;
    System.out.println(addStr);
  }

  static void exampleThree(String s1, String s2){
    String addStr = s1;
    System.out.println(addStr+s2);
  }

  public static void main(String[] args) {
    String s1 = "Hello, ";
    String s2 = "World!";
    exampleOne(s1, s2);
    exampleTwo(s1, s2);
    exampleThree(s1, s2);
  }
}
