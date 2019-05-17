import java.util.Arrays;
public class DescendingOrder {
    public static int sortDesc(final int num) {
            //Your code
            char[] newArray = String.valueOf(num).toCharArray();
            Arrays.sort(newArray);
            return Integer.parseInt(new StringBuilder(new String(newArray)).reverse().toString());
        }
public static void main(String[] args){
        System.out.println("my kata is working");
}
}
