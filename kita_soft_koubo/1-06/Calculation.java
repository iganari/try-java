public class Calculation {
  public static void main(String args[]){
    int x = 7;
    
    System.out.println("3倍は" + ( 7 * 3 ) );
    System.out.println("半分(1/2)は" + ( x / 2) + " (int型のまま計算)");
    System.out.println("半分(1/2)は" + ( (double)x / 2) + " (double型に変換して計算)");
  }
}
