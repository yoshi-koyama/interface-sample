import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    String[] names = {"田中さん", "山田さん", "鈴木さん"};
    int index = 3;
    try {
      System.out.println(names[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("配列の範囲を超えています。");
    }

  }
}
