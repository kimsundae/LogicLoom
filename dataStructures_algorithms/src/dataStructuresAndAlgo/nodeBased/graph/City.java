package dataStructuresAndAlgo.nodeBased.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {

    private String name;
    private Map<City, Integer> routes;
    public City( String name ){
        this.name = name;
        routes = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    public Map<City, Integer> getRoutes() {
        return routes;
    }

    public void addRoute( City city, int price ){
        routes.put( city, price );
    }
    /*
    * 데이크스트라 알고리즘
    * */
    public void dijkstraShortestPath( City startingCity, City finalDestination ){
        Map<String, Integer> cheapestPricesTable = new HashMap<>();
        Map<String, String> cheapestPreviousStopoverCityTable = new HashMap<>();

        // 아직 방문하지 않은 알려진 도시를 단순 배열에 기록한다.
        List<City> unvisitedCities = new ArrayList<>();

        // 방문했던 도시를 해시 맵에 기록한다.
        Map< String, Boolean > visitedCities = new HashMap<>();

        // cheapestPricesTable의 첫 번째 키로
        // 시작 도시의 이름을 추가한ㄷ.
        // 시작 도시로 가는 비용은 없으니 값은 0이다.
        cheapestPricesTable.put(startingCity.name, 0);

        City currentCity = startingCity;
        // 방문하지 않은 도시가 남아 있는 동안 실행된다.
        while( currentCity != null ){

            // visitedCities 해시에 currentCity의 이름을 추가해
            // 방문했음을 기록한다.
            // 또한 unvisitedCities 리스트에서는 제거한다.
            visitedCities.put(currentCity.name, true);
            unvisitedCities.remove(currentCity);

            // currentCity의 인접 도시를 각각 순회한다.
            for( Map.Entry<City,Integer> adjacentCity : currentCity.routes.entrySet()  ){
                // 새 도시를 발견하면
                // unvisitedCities 리스트에 추가한다.
                if( !visitedCities.containsKey(adjacentCity.getKey().name) )
                    unvisitedCities.add(adjacentCity.getKey());

                // CURRENT city를 마지막으로 경유하는 도시로 사용해
                // STARTING city에서 ADJACENT city로 가는 비용을 계산한다.
                int priceThroughCurrentCity
                        = cheapestPricesTable.get(currentCity.name) + adjacentCity.getValue();

                // STARTING city에서 ADJACENT city로 가는 비용이
                // 지금까지 알려진 비용보다 저렴하면
                if( !cheapestPricesTable.containsKey(adjacentCity.getKey().name) ||
                        priceThroughCurrentCity < cheapestPricesTable.get(adjacentCity.getKey().name)){
                    // 두 표를 업데이트한다.
                    cheapestPricesTable.put(adjacentCity.getKey().name, priceThroughCurrentCity);
                    cheapestPreviousStopoverCityTable.put(adjacentCity.getKey().name, currentCity.name);
                }
            }

            // 방문하지 않은 다음 도시를 방문한다.
            // STARTING city에서 갈 수 있는 가장 저렴한 도시로 선택한다.
            currentCity = unvisitedCities.stream()
                    .min( (city1, city2) ->
                         Integer.compare( cheapestPricesTable.get(city1.name), cheapestPricesTable.get(city2.name)  ))
                    .orElse(null);

        }// end while

        // 이제 cheapestPricesTable은 starting city에서 각 도시로 가는
        // 가장 저렴한 비용을 모두 포함한다. 하지만 starting city에서
        // final destination으로 가는 정확한 경로를 계산하려면 다음 단계로 가야한다.

        // 리스트로 최단 경로를 생성한다.
        List<String> shortestPath = new ArrayList<>();

        // 최단 경로를 구성하려면 final destination에서부터
        // 거슬러 올라가야 한다. currentCity을
        // final destination으로 시작한다.
        String currentCityName = finalDestination.name;

        // startingCity에 도달할 때까지 루프를 실행한다.
        while( currentCityName != startingCity.name ){

            // 도시가 나올 때마다 각 currentCityName을 shortestPath 리스트에 추가한다.
            shortestPath.add(currentCityName);

            // cheapestPreviousStopoverCityTable 을 사용해
            // 바로 이전 경유 도시를 따라간다.
            currentCityName
                        = cheapestPreviousStopoverCityTable.get(currentCityName);
        }

        // 마지막으로 startingCity를 shortestPath에 추가한다.
        shortestPath.add(startingCity.name);

        // 시작부터 끝까지 순서대로 경로를 나타내기 위해 출력을 뒤집는다.
        for( int i = 1; i <= shortestPath.size(); i++ )
            System.out.println(shortestPath.get(shortestPath.size() - i));

    }

    public static void main(String[] args) {
        City atlanta = new City("Atlanta");
        City boston = new City("Boston");
        City chicago = new City("Chicago");
        City denver = new City("Denver");
        City el_paso = new City("El Paso");

        atlanta.addRoute(boston, 100);
        atlanta.addRoute(denver, 160);
        boston.addRoute(chicago, 120);
        boston.addRoute(denver, 180);
        chicago.addRoute(el_paso, 80);
        denver.addRoute(chicago, 40);
        denver.addRoute(el_paso, 140);

        atlanta.dijkstraShortestPath( atlanta, el_paso );
    }
}
