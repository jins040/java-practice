package jsonparsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by danawacomputer on 2017-07-18.
 */
public class JsonParsing {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("src\\jsonparsing\\jsonsample.txt"));

            String line = "";
            String data = "";

            while ((line = in.readLine()) != null) {
                if(line.contains("<stnko>")) {
                    ArrayList<String[]> item = JsonParsingService.parseXML(data);
                    System.out.println(line);
                    data = line;
                } else {
                    data += line;
            }
            }

        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ie) {
            ie.printStackTrace();
            System.out.println("파일 IO에 에러가 발생했습니다.");
        }
    }//main
}
