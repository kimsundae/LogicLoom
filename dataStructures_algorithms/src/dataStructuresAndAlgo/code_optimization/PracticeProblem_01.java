package dataStructuresAndAlgo.code_optimization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 518p 연습 문제 1번
*   두 종목 모두 뛰는 선수를 배열로 반환하는 함수 작성.
* */
public class PracticeProblem_01 {

    public List<String> getPlayer( List<Map<String,String>> basketballPlayers, List<Map<String,String>> footballPlayers ){
        Map< String, String > map = new HashMap<>();
        List<String> list = new ArrayList<>();
        basketballPlayers.forEach( basketballPlayer -> {
            map.put( "first_name", basketballPlayer.get("first_name") );
            map.put( "last_name", basketballPlayer.get("last_name"));
        });

        footballPlayers.forEach( footballPlayer -> {
            if( map.containsKey(footballPlayer.get("first_name")) && map.containsKey(footballPlayer.get("last_name")))
                list.add(footballPlayer.get("first_name") + " " + map.containsKey(footballPlayer.get("last_name")));
        });
        return list;
    }
}
