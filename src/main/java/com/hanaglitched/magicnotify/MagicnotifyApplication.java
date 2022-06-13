package com.hanaglitched.magicnotify;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;

@SpringBootApplication
public class MagicnotifyApplication {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			//https://crunchify.com/how-to-read-json-object-from-file-in-java/
			//parse object json.
			Object obj = parser.parse(new FileReader("/my projects/magicnotify/src/main/resources/json/AllPrintings.json"));

			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			JSONObject jsonObject = (JSONObject) obj;

			// A JSON array. JSONObject supports java.util.List interface.
			JSONObject data = (JSONObject) jsonObject.get("data"); // magic 2014 core set get
			JSONObject m14 = (JSONObject) data.get("M14");
			JSONArray cards = (JSONArray) m14.get("cards"); // cards.
			JSONObject firstCard = (JSONObject) cards.get(0);

			System.out.println(firstCard.get("name").toString());



		} catch (Exception e) {
			e.printStackTrace();
		}
		SpringApplication.run(MagicnotifyApplication.class, args);
	}

}
