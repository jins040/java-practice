package mapparsing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapParsingService {

    public static List<String> coordinateConverting(String corString) {

        List<String > stringArrayList = Arrays.asList(corString.split("new daum.maps.LatLng"));
        List<String> resultList = new ArrayList<>();

        for (String e : stringArrayList) {
            if (e.length() == 0) {

            } else {
                String tempStr = "{\n\tlat: " + e.substring(1, e.indexOf(",")) +
                                ",\n\tlng: " + e.substring(e.indexOf(",")+1, e.indexOf(")")) +
                                ",\n\tdraggable: true\n},";
                resultList.add(tempStr);
            }
        }

        return resultList;
    }
}
