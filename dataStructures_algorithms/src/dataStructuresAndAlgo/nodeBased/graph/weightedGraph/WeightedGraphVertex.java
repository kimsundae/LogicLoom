package dataStructuresAndAlgo.nodeBased.graph.weightedGraph;

import java.util.HashMap;
import java.util.Map;

/*
*  가중 그래프 441p
* */
public class WeightedGraphVertex {

    private Map<WeightedGraphVertex, Integer > adjacentVertices;
    private int value;
    public WeightedGraphVertex(int value ){
        this.adjacentVertices = new HashMap<>();
        this.value = value;
    }
    public Map<WeightedGraphVertex, Integer> getAdjacentVertices() {
        return adjacentVertices;
    }
    public int getValue() {
        return value;
    }
    // 정점 추가 메서드
    public void addAdjacentVertex(WeightedGraphVertex vertex, int weight ){
        adjacentVertices.put(vertex, weight);
    }


}
