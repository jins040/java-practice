package mapparsing;

import java.util.List;

public class MapParsing {

    public static void main(String[] args) {

        String corSample = "new daum.maps.LatLng(37.14636173285517,129.36409556951807),\n" +
                "                new daum.maps.LatLng(37.116993294531504,129.27195914560068),\n" +
                "                new daum.maps.LatLng(37.04073562647372,129.19495765138078),\n" +
                "                new daum.maps.LatLng(37.09206894657519,128.92232373735848),\n" +
                "                new daum.maps.LatLng(37.04489763182982,128.89616512366052),\n" +
                "                new daum.maps.LatLng(37.08772009686231,128.78506184183564),\n" +
                "                new daum.maps.LatLng(37.065456865700284,128.65222772089592)";


        List<String> parsingResult = MapParsingService.coordinateConverting(corSample);

        for (String e : parsingResult) {
            System.out.println(e);
        }
    }
}
