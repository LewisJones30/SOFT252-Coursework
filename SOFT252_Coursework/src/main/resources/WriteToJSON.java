package JSON;




import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.Reader;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lewis
 */
public abstract class WriteToJSON {
    
    
    
    public void writeToJSON(String fileName, String arrayName, JSONObject objectToAdd)
    {
        JSONParser parser = new JSONParser();
            try (Reader reader = new FileReader(fileName))
            {
                
                JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
                JSONArray array = (JSONArray) jsonObject.get(arrayName);
                array.add(objectToAdd);
                FileWriter JSONFile = new FileWriter(fileName);
                try
                {
                    String intro = ("{" + (char)34 + "admins" + (char)34) + ":";
                    JSONFile.write(intro + array.toJSONString() + "}");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                JSONFile.flush();
                JSONFile.close();
                
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
    }
}
