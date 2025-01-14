import java.util.*;


public class Graph {
    public static void main(String args[]){
        System.out.println(search(getGraph()));
    }

    public static HashMap<String, String[]> getGraph(){
        HashMap<String, String[]> graph = new HashMap<>();

        graph.put("you", new String[]{"bob", "alice", "claire"});
        graph.put("bob", new String[]{"peggi", "anuj"});
        graph.put("alice", new String[]{"peggy"});
        graph.put("claire", new String[]{"tom", "jonny"});
        graph.put("tom",new String[]{"you"});
        graph.put("jonny", null);
        graph.put("anuj", null);
        graph.put("peggy", null);

        return graph;
    }

    public static String search(HashMap<String, String[]> graph){
        Deque<String> que = new ArrayDeque<>();
        Set<String> wasBeFriends = new HashSet<>();
        que.add("you");
        while(!que.isEmpty()){
            String person = que.pollFirst();
            wasBeFriends.add(person);
            if(isMangoSeller(person)){
                return person;
            }else{
                String[] friends = graph.get(person);
                if(friends == null) continue;
                for(int i = 0; i < friends.length; i++){
                    if(friends[i] != null && !que.contains(friends[i]) && !wasBeFriends.contains(friends[i])){
                        que.add(friends[i]);
                    }
                }
            }
        }
        return null;
    }

    public static boolean isMangoSeller(String person){
        char[] chars = person.toCharArray();
        if(chars[0] == 't') return true;
        return false;
    }
}
