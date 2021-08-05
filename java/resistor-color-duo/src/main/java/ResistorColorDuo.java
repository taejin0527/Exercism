import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    private List<String> registor = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue",
            "violet", "grey", "white");

    int value(String[] colors) {
        int first = registor.indexOf(colors[0]) * 10;
        int second = registor.indexOf(colors[1]);

        return first + second;
    }
}
