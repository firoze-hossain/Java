package com.roze.fileHandling.jsonFileOperations.jsonSimple;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonFileReadUsingJsonSimple {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader fileReader = new FileReader(".\\data\\employee.json");
//            Object obj = jsonParser.parse(fileReader);
//            JSONObject jsonObject = (JSONObject) obj;
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            String fname = (String) jsonObject.get("firstName");
            String lname = (String) jsonObject.get("lastName");
            System.out.println("First Name: " + fname);
            System.out.println("Last Name: " + lname);
            JSONArray jsonArray = (JSONArray) jsonObject.get("address");
            System.out.println("Address....");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject address = (JSONObject) jsonArray.get(i);
                String street = (String) address.get("street");
                String city = (String) address.get("city");
                String state = (String) address.get("state");
                System.out.println(street + "\t" + city + "\t" + state);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
