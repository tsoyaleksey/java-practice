package holding;

import java.util.Map;

/**
 * Created by c0dyy on 1/8/17.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
