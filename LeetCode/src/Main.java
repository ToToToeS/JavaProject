import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        HashMap<Integer, String> exist = new HashMap();
        exist.put(1, "df");

        exist.remove(1);

        System.out.println(exist);
    }
}