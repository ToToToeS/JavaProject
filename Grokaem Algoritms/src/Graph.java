import java.util.HashMap;

public class Graph {
    public static void main(String args[]){
        HashMap<String, String[]> graph = new HashMap<>();

        graph.put("you", new String[]{"alice", "bob", "claire"});

        System.out.println(graph);
    }
}
