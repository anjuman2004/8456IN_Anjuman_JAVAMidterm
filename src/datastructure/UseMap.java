package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        HashMap<String,Integer> cityAndZipOfUSA= new HashMap<>();
        cityAndZipOfUSA.put("IN",46033);
        cityAndZipOfUSA.put("OH", 54321);
        cityAndZipOfUSA.put("IL", 90865);


        System.out.println(cityAndZipOfUSA.containsKey("IN"));//true
        System.out.println(cityAndZipOfUSA.containsValue("IN"));//false
        System.out.println(cityAndZipOfUSA.containsValue(46033));//true

        HashMap<String,Integer>cityAndZipOfCanada= new HashMap<>();
        cityAndZipOfCanada.put("CT",2165);
        cityAndZipOfCanada.put("DHK",4362);
        System.out.println(cityAndZipOfCanada.containsKey("CT"));
        System.out.println(cityAndZipOfCanada.containsKey("DHK"));
        System.out.println(cityAndZipOfCanada.containsValue(2165));
        System.out.println(cityAndZipOfCanada.containsValue(4362));

        HashMap<String,HashMap<String,Integer>> map= new HashMap();
        map.put("USA", cityAndZipOfUSA);
        map.put("Bangladesh", cityAndZipOfCanada);
        System.out.println(map);

        ArrayList<HashMap<String, Integer>> list= new ArrayList<>();
        list.add(cityAndZipOfCanada);
        list.add(cityAndZipOfUSA);
        System.out.println(list);


        List<String> movie= new ArrayList<>();
        movie.add("Avater");
        movie.add("Ice Age");

        List<String> theatre= new ArrayList<>();
        theatre.add("AMC");
        theatre.add("Regal");

        List<String> movieAndTheatre= new ArrayList<>();
        movieAndTheatre.add("Best of Movie");
        movieAndTheatre.add("Best of Theatre");

        Map<String,List<String>> things = new HashMap<>();
        things.put("My Favorite Movie is: ",movie);
        things.put("My FavoriteTheatre is: ", theatre);
        System.out.println(things);








    }

}
