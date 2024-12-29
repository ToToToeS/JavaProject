import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;


public class Graph {
    public static void main(String args[]){
        System.out.println(search(getGraph()));
        String s = "fdf";
    }

    public static HashMap<String, String[]> getGraph(){
        HashMap<String, String[]> graph = new HashMap<>();

        graph.put("you", new String[]{"alice", "bob", "claire"});
        graph.put("bob", new String[]{"peggi", "anuj"});
        graph.put("alice", new String[]{"peggy"});
        graph.put("claire", new String[]{"tom", "jonny"});
        graph.put("tom", null);
        graph.put("jonny", null);
        graph.put("anuj", null);
        graph.put("peggy", null);

        return graph;
    }

    public static String search(HashMap<String, String[]> graph){
        Deque<String> que = new ArrayDeque<>();
        que.add("you");
        while(!que.isEmpty()){
            String person = que.pollFirst();
            if(person.equals("claire")){
                return person;
            }else{
                String[] friends = graph.get(person);
                for(int i = 0; i < friends.length; i++){
                    if(friends[i] != null && !que.contains(friends[i])){
                        que.add(friends[i]);
                    }
                }
            }
        }
        return null;
    }

    public static boolean isMangoSeller(String person){

        return false;
    }
}
