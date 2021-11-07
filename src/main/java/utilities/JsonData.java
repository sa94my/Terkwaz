package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
utility class to handle json data
 */
public class JsonData {
    static JSONParser jsonParser ;
    static FileReader reader;
   /*
   Reads the json file and returns its content as an object
   @Param
   String file : full qualified file name (filePath/filename.extension)
    */
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
    /*
    parse the Json file contents to get the value of a single test data item
    @Param
    Object jsonDataObject : Object containing Json file contents
    int testDataIndex: index of test data within the json array
    String testName : test given name to distinguish different tests within the etst class
    String attributeKey : key to the desired value
     */
    public static String getAttribute(Object jsonDataObject,int testDataIndex,String testName,String attributeKey){
        JSONArray wholeJson = (JSONArray) jsonDataObject ;
        JSONObject firstObject = (JSONObject) wholeJson.get(testDataIndex);
        JSONObject firstObjectContents = (JSONObject) firstObject.get(testName);
        return firstObjectContents.get(attributeKey).toString();
    }



}

