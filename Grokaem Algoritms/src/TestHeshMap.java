import java.util.HashMap;

public class TestHeshMap {
    public static void main(String args[]) {
        HashMap<Integer, String> hashi = new HashMap<>();

        hashi.put(29, "Tolik");
        hashi.put(34, "Sonik");
        hashi.put(10, "Mamik");

        System.out.println(hashi);

        System.out.println(hashi.containsKey(1)); // Проверяет существует ли такой ключь
        System.out.println(hashi.containsValue("Mamik"));// Проверяеь сущ ли такое значение(ачувствителен к регисту)

        hashi.remove(10);
        System.out.println(hashi.get(10));

        hashi.clear();
        System.out.println(hashi);

        hashi.put(29, "Tolik");
        hashi.put(34, "Sonik");
        hashi.put(10, "Mamik");
        System.out.println(hashi.keySet());
        System.out.println(hashi.values());

        System.out.println(hashi.entrySet());

        System.out.println(hashi.size());

        System.out.println(hashi.isEmpty());

        
    }
}
