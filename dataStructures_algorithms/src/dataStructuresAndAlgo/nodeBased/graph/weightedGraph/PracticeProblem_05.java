package dataStructuresAndAlgo.nodeBased.graph.weightedGraph;

import dataStructuresAndAlgo.nodeBased.graph.Vertex;

import java.util.*;

/*
* 462p. 5.
* */
public class PracticeProblem_05 {
    private String name;
    private List<PracticeProblem_05> follows;
    public PracticeProblem_05( String name ){
        this.name = name;
        this.follows = new ArrayList<>();
    }

    public String getName() {return name;}
    public List<PracticeProblem_05> getFollows() {return follows;}

    // 정점 추가
    public void addAdjacentVertex( PracticeProblem_05 vertex ){
        if( this.follows.contains( vertex ) ) return;
        follows.add(vertex);
    }

    public List<String> solvePracticeProblem(PracticeProblem_05 startVertex, PracticeProblem_05 endVertex ){

        Map<String, Integer> shortest = new HashMap<>();
        Map<String, String> shortestRoutes = new HashMap<>();

        Queue<PracticeProblem_05> queue = new LinkedList<>();
        shortest.put(startVertex.name, 0);

        queue.add(startVertex);

        while( !queue.isEmpty() ){

            PracticeProblem_05 currentVertex = queue.poll();

            currentVertex.follows.forEach( vertex -> {

                if( !shortestRoutes.containsKey(vertex.name) )
                    queue.add(vertex);

                int relationThroughCurrentVertex
                        = shortest.get(currentVertex.name) + 1;

                if(!shortest.containsKey(vertex.name) ) {
                    shortest.put(vertex.name, relationThroughCurrentVertex);
                    shortestRoutes.put(vertex.name, currentVertex.name);
                }
                else if( shortest.get(vertex.name) > relationThroughCurrentVertex){
                    shortest.put(vertex.name, relationThroughCurrentVertex );
                    shortestRoutes.put(vertex.name, currentVertex.name);
                }

            });

        }

        List<String> shortestRelation = new ArrayList<>();
        String currentVertex = endVertex.name;

        while ( !currentVertex.equals(startVertex.name) ){

            shortestRelation.add(currentVertex);

            currentVertex = shortestRoutes.get(currentVertex);

        }
        shortestRelation.add(startVertex.name);

        for( int i = 1; i <= shortestRelation.size()/2; i++ ){
            String temp = shortestRelation.get(i-1);
            shortestRelation.set(i-1, shortestRelation.get(shortestRelation.size()-i));
            shortestRelation.set(shortestRelation.size()-i, temp);
        }

        return shortestRelation;
    }

    public static void main(String[] args) {
        PracticeProblem_05 Idris = new PracticeProblem_05( "Idris" );
        PracticeProblem_05 Kamil = new PracticeProblem_05( "Kamil" );
        PracticeProblem_05 Talia = new PracticeProblem_05( "Talia" );
        PracticeProblem_05 Lina = new PracticeProblem_05( "Lina" );
        PracticeProblem_05 Ken = new PracticeProblem_05( "Ken" );
        PracticeProblem_05 Marco = new PracticeProblem_05( "Marco" );
        PracticeProblem_05 Sasha = new PracticeProblem_05( "Sasha" );

        Idris.addAdjacentVertex( Kamil );
        Idris.addAdjacentVertex( Talia );

        Kamil.addAdjacentVertex( Idris );
        Kamil.addAdjacentVertex( Lina );

        Talia.addAdjacentVertex( Idris );
        Talia.addAdjacentVertex( Ken );

        Lina.addAdjacentVertex( Kamil );
        Lina.addAdjacentVertex( Sasha );

        Ken.addAdjacentVertex( Talia );
        Ken.addAdjacentVertex( Marco );

        Marco.addAdjacentVertex( Ken );
        Marco.addAdjacentVertex( Sasha );

        Sasha.addAdjacentVertex( Marco );
        Sasha.addAdjacentVertex( Lina );

        Idris.solvePracticeProblem( Idris, Lina ).forEach(System.out::println);
        // result = Idris -> Kamil -> Lina

    }
}
