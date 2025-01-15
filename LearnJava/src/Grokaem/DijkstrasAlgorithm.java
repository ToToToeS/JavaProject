package Grokaem;

import java.util.HashMap;
import java.util.Map;

public class DijkstrasAlgorithm {
    public static void main(String[] args){

    }
}

class Graf {
    public Map<String, String[]> graph = new HashMap<>();
    public Map<String[], Integer> cost = new HashMap<>();
    public Graf(){
        this.graph.put("start", new String[]{"A", "B"});
        this.graph.put("A", new String[]{"end"});
        this.graph.put("B", new String[]{"end"});


    }
}
