package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonData {
    static JSONParser jsonParser ;
    static FileReader reader;
    //Read JSON file

    public static Object read(String file){
        jsonParser = new JSONParser();
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
        try {
            return jsonParser.parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public static String getAttribute(Object jsonDataObject,int testDataIndex,String testName,String attributeKey){
        JSONArray wholeJson = (JSONArray) jsonDataObject ;
        JSONObject firstObject = (JSONObject) wholeJson.get(testDataIndex);
        JSONObject firstObjectContents = (JSONObject) firstObject.get(testName);
        return firstObjectContents.get(attributeKey).toString();
    }



}

