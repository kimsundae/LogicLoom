package dataStructuresAndAlgo.nodeBased.graph;

import java.util.*;

/*
*  인접 리스트
* */
public class Vertex {
    private String value;
    private List<Vertex> adjacentVertices;

    public Vertex(String value){
        this.value = value;
        this.adjacentVertices = new ArrayList<>();
    }
    public String getValue(){return value;}
    public List<Vertex> getAdjacentVertices(){return adjacentVertices;}

    // 정점 추가
    public void addAdjacentVertex( Vertex vertex ){
        if( vertex.getAdjacentVertices().contains( vertex ) ) return;
        adjacentVertices.add(vertex);
        vertex.addAdjacentVertex(this);
    }

    // 깊이 우선 탐색
    public void dfsTraverse(Vertex vertex, HashMap< String, Boolean > visitedVertices ){
        // 정점을 해시 테이블에 추가해 방문했다고 표시한다.
        visitedVertices.put( vertex.value, true );

        // 정점의 값을 출력해 제대로 순회하는지 확인한다.
        System.out.println(vertex.value);

        // 현재 정점의 인접 정점을 순회한다.
        for( Vertex v : vertex.getAdjacentVertices() ){
            // 이미 방문했던 인접 정점은 무시한다.
            if ( !visitedVertices.containsKey(v.value) ) {
                // 인접 정점에 대해 메서드를 재귀적으로 호출한다.
                dfsTraverse(v, visitedVertices);
            }
        }// end for
    } // end dfsTraverse
    // 깊이 우선 탐색 Vertex 검색
    public Vertex dfsVertexSearch( Vertex vertex, String searchValue, HashMap<String, Boolean> visitedVertices ){
        // 찾고 있던 정점이면 원래의 vertex를 반환한다.
        if( vertex.value.equals(searchValue) ) return vertex;

        visitedVertices.put( vertex.value, true );

        for( Vertex v : vertex.getAdjacentVertices() ){
            if( !visitedVertices.containsKey( v.value ) ) {

                // 인접 정점이 찾고 있던 정점이면
                // 그 인접 정점을 반환한다.
                if( v.value.equals( searchValue ) ) return v;

                // 인접 정점에 메서드를 재귀적으로 호출해
                // 찾고 있던 정점을 계속 찾는다.
                Vertex vertexWereSearchingFor =
                        dfsVertexSearch( v, searchValue, visitedVertices );

                // 위 재귀에서 올바른 정점을 찾았다면
                // 그 정점을 반환한다.
                if( vertexWereSearchingFor != null ) return vertexWereSearchingFor;

            }
        } // end for
        return null;
    } // end dfsVertexSearch
    // 너비 우선 탐색
    public void bfsTraverse( Vertex startingVertex ){
        Queue<Vertex> queue = new LinkedList<>();

        Map<String, Boolean> visitedVertices = new HashMap<>();
        visitedVertices.put( startingVertex.value, true );
        queue.add( startingVertex );

        // 큐가 빌 때까지 실행한다.
        while( !queue.isEmpty() ){

            // 큐에서 첫 번째 정점을 삭제해 현재 정점으로 만든다.
            Vertex currentVertex = queue.poll();

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
        } // end while
    }// end bfsTraverse
    public Vertex bfsVertexSearch( Vertex vertex, String searchValue ){

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
    }
}
