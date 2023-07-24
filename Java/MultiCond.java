public class MultiCond {
  public static void xyzCond(int x, int y, int z){
    if(z != 0){
      System.out.println("z의 값이 0이 아닙니다.");
    } else if(x != y){
      System.out.print("z의 값이 0입니다. 그리고 x와 y의 값이 다릅니다.");
    } else {
      System.out.print("z의 값이 0입니다. 그리고 x와 y의 값이 같습니다.");
    }
  }

  public static void main(String[] a){
    xyzCond(1,2,3);
    xyzCond(1,2,0);
    xyzCond(2,2,0);
    xyzCond(2,2,3);
  }
}