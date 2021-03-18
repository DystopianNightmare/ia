// This class provides a stubbed-out environment.
// You are expected to implement the methods.
// Accessing an undefined variable should throw an exception.

// Hint!
// Use the Java API to implement your Environment.
// Browse:
//   https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html
// Read about Collections.
// Focus on the Map interface and HashMap implementation.
// Also:
//   https://www.tutorialspoint.com/java/java_map_interface.htm
//   http://www.javatpoint.com/java-map
// and elsewhere.

import java.util.HashMap;
import java.util.Map;

public class Environment {
    Map map = new HashMap<String, Double>();        //make a hashmap for holding environment variables
     /**
     *
     * @param var - string to place in map as key
     * @param val - value of freq of map,
     * @return int as frequency of associated string
     */
    public double put(String var, Double val) {
        map.put(var,val);
        return val; }
    /**
     *
     * @param pos - value of freq of map,
     * @param var - string to place in map as key
     * @return int 0
     */
    public double get(int pos, String var) throws EvalException {

        return Double.valueOf(String.valueOf(map.get(var)));
    }
    public double get(String var){
        return Double.valueOf(String.valueOf(map.get(var)));
    }
}
