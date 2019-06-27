import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> Words = new LinkedList<String>();
        System.out.println(Words);
        Words.size();
        Words.addFirst("pie");
        Words.size();
        Words.addFirst("corn");
       System.out.println("size"+Words.size());
    }
}
