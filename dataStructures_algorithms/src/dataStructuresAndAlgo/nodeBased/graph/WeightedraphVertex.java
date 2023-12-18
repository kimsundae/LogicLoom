package dataStructuresAndAlgo.nodeBased.graph;

import java.util.HashMap;
import java.util.Map;

/*
*  가중 그래프 441p
* */
public class WeightedraphVertex {

    private Map< WeightedraphVertex, Integer > adjacentVertices;
    private int value;
    public WeightedraphVertex( int value ){
        this.adjacentVertices = new HashMap<>();
        this.value = value;
    }
    public Map<WeightedraphVertex, Integer> getAdjacentVertices() {
        return adjacentVertices;
    }
    public int getValue() {
        return value;
    }
    // 정점 추가 메서드
    public void addAdjacentVertex( WeightedraphVertex vertex, int weight ){
        adjacentVertices.put(vertex, weight);
    }


}
