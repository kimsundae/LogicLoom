package dataStructuresAndAlgo.nodeBased.graph.weightedGraph;

import dataStructuresAndAlgo.nodeBased.graph.Vertex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
* 462p. 4. 너비 우선 탐색
* */
public class PracticeProblem_04 {
    /*
    *
    * */
    /*public Vertex bfsVertexSearch(Vertex vertex, String searchValue ){

        Queue<Vertex> queue = new LinkedList<>();

        Map<String,Boolean> visitedVertices = new HashMap<>();
        visitedVertices.put( vertex.value, true );
        queue.add(vertex);
        while(!queue.isEmpty()){

            Vertex currentVertex = queue.poll();

            if( currentVertex.value.equals(searchValue) )
                return currentVertex;

            // 현재 정점의 값을 출력한다.
            System.out.println(currentVertex.getValue());

            // 현재 정점의 인접 정점을 순회한다.
            for( Vertex v : currentVertex.getAdjacentVertices() ){



                // 아직 방문하지 않은 인접 정점이면
                if( !visitedVertices.containsKey( v.value ) ){

                    // 그 인접 정점에 방문했다고 표시한다.
                    visitedVertices.put( v.value, true );

                    // 그 인접 정점을 큐에 추가한다.
                    queue.add( v );
                }
            } // end for
        }
        return null;
    }*/
}
