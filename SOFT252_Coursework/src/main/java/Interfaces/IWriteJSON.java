/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import org.json.simple.JSONObject;

/**
 *
 * @author Lewis
 */
public interface IWriteJSON {
    public boolean WriteToJSON(String fileName, JSONObject objectToWrite, String arrayName); 
    //This method forces the user to ensure that the same structure for writing to the JSON is used every time.
    
}
