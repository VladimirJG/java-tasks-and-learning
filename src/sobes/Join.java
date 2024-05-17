package sobes;

public class Join {
      public static void main(String[] args) {
          String[] arr = {"Mapped","Papped","Cisko","Summit"};
          String delimiter = " and ";
          String join = String.join(delimiter, arr);
          System.out.println(join);
      }
}
