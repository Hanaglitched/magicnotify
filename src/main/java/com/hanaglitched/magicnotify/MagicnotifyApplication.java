package com.hanaglitched.magicnotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MagicnotifyApplication {

	public static void main(String[] args) {
<<<<<<< Updated upstream
		JSONParser parser = new JSONParser();
		try {
			//https://crunchify.com/how-to-read-json-object-from-file-in-java/
			//parse object json.
			Object obj = parser.parse(new FileReader("/my projects/magicnotify/src/main/resources/json/output.json"));

			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			JSONArray jsonObject = (JSONArray) obj;

			// A JSON array. JSONObject supports java.util.List interface.
			JSONObject data = (JSONObject) jsonObject.get(0); // parse 1 : first array
			JSONObject get_data = (JSONObject) data.get("53532290-9194-5066-9318-b9cc09c52d8f"); // parse 2 : key value parse
			String name = (String) get_data.get("name");

			System.out.println("parsing normal data : ");
			System.out.println("data");

			System.out.println(data.toString());
			System.out.println("get_data");
			System.out.println(get_data.toString());
			System.out.println("name : " + name);

			String multiverseId = "";
			if(get_data.get("multiverseId") == null) multiverseId = "null";
			else multiverseId = get_data.get("multiverseId").toString();

			String uuid = "53532290-9194-5066-9318-b9cc09c52d8f";
			System.out.println("multiverseId : " + multiverseId);
			System.out.println("uuid : " + "53532290-9194-5066-9318-b9cc09c52d8f");

			Object price = parser.parse(new FileReader("/my projects/magicnotify/src/main/resources/json/AllPrices.json"));
			JSONObject priceObject = (JSONObject) price;
			JSONArray data_ = (JSONArray) priceObject.get("data"); // magic 2014 core set get
			int i = 0;
			for(i = 0; i < data_.size(); i++){
				JSONObject uuid_array = (JSONObject) data_.get(i);
				if(uuid == uuid_array.toString()){
					break;
				}
			}
			JSONObject paper = (JSONObject) data_.get(i);
			JSONObject cardkingdom = (JSONObject) paper.get("retail");
			JSONObject retail = (JSONObject) cardkingdom.get("foil");
			String foil = retail.get("2022-06-11").toString();

			System.out.println("price of 2022-06-11 : " + foil);

		} catch (Exception e) {
			e.printStackTrace();
		}
=======
>>>>>>> Stashed changes
		SpringApplication.run(MagicnotifyApplication.class, args);
	}

}
