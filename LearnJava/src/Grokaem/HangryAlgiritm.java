package Grokaem;

import java.util.*;

public class HangryAlgiritm {
    public static void main(String[] args){
        HashSet<String> states = new HashSet<>();
        states.add("mt");
        states.add("wa");
        states.add("or");
        states.add("id");
        states.add("nv");
        states.add("ut");
        states.add("ca");
        states.add("az");

        HashMap<String, String[]> station = new HashMap<>();
        station.put("kone", new String[]{"id", "nv", "ut"});
        station.put("ktwo", new String[]{"wa", "id", "mt"});
        station.put("kthree", new String[]{"or", "nv", "ca"});
        station.put("kfout", new String[]{"nv", "ut"});
        station.put("kfive", new String[]{"ca", "az"});

        HashSet<String> stationNeeded = new HashSet<>();

        HashSet<String> valid = states;
        while (!valid.isEmpty()){

            int maxPeresech = 0;
            String stationMaxState = null;

            for(String key : station.keySet()){
                for(String statesInStation : station.get(key)){
                    if(HangryAlgiritm.peresechMnojestv(valid, station.get(key)) > maxPeresech){
                        maxPeresech = HangryAlgiritm.peresechMnojestv(valid, station.get(key));
                        stationMaxState = key;
                    }
                }
            }



            stationNeeded.add(stationMaxState);
            for (String statesDelete : station.get(stationMaxState)) {
               valid.remove(statesDelete);
            }
            station.remove(stationMaxState);
        }

        System.out.println(stationNeeded);
    }

    private HashSet<String> difference (HashSet<String> a1, HashSet<String> a2){
        HashSet<String> solution = new HashSet<>();
        for(String a : a1){
            if(!a2.contains(a)) solution.add(a);
        }
        return solution;
    }

    private static int peresechMnojestv (HashSet<String> ArrayStr1, String[] ArrayStr2){
        int ret = 0;
        for(String str1 : ArrayStr1){
            for(String str2 : ArrayStr2){
                if(str2.equals(str1)){
                    ret++;
                    break;
                }
            }
        }
        return ret;
    }
}































