/**
 * Created by carlosjoseanguiano on 02/09/17.
 */
public class Home {
    public static void main(String[] strings) {
        String name = "socrates";
        String value1 = "soc";
        String value2 = "rate";
        String value3 = "plato";
        if (name.contains(value1)) {
            System.out.println(value1);
        }
        if (name.contains(value2)) {
            System.out.println(value2);
        }
        if (!name.contains(value3)) {
            System.out.println("no: " + value3);
        }
    }
}
