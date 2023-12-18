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
        Map<City, City> cheapestPreviousStopoverCityTable = new HashMap<>();

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
            currentCity.routes.forEach( (adjacentCity, price) -> {

                // 새 도시를 발견하면
                // unvisitedCities 리스트에 추가한다.
                if( !visitedCities.containsKey(adjacentCity.name) )
                    unvisitedCities.add(adjacentCity);

                // CURRENT city를 마지막으로 경유하는 도시로 사용해
                // STARTING city에서 ADJACENT city로 가는 비용을 계산한다.
                int priceThroughCurrentCity
                        = cheapestPricesTable.get(currentCity.name) + price;

                // STARTING city에서 ADJACENT city로 가는 비용이
                // 지금까지 알려진 비용보다 저렴하면
            });
        }
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

    }
}
