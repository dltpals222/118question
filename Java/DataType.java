public class DataType {
  public static void main(String[] args) {
    String name = "이름";
    int age = 11;
    boolean wow = true;
    Integer ageObj = 11;

    System.out.println(name instanceof String);
    // System.out.println(age instanceof Int); //int는 원시 데이터 타입이기 때문에 integer으로는 제대로 작동하지 않는다.
    System.out.println(ageObj instanceof Integer);
    System.out.println(wow);

    System.out.println(name.getClass().getName());
    System.out.println(ageObj.getClass().getName());
    System.out.println(wow);
  }

}

