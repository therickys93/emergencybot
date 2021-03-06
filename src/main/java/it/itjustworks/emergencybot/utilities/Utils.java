package it.itjustworks.emergencybot.utilities;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.pengrad.telegrambot.BotUtils;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;

public class Utils {

	public static boolean isInteger(String string) {
		try {
			Integer.parseInt(string);
		} catch(Exception e){
			return false;
		}
		return true;
	}
	
	public static boolean isJSONValid(String jsonInString) {
		try {
			Gson gson = new Gson();
			gson.fromJson(jsonInString, Emergency.class);
	        return true;
	    } catch(JsonSyntaxException ex) { 
	        return false;
	    }
	}	
	  
	public static Message createMessageWithText(String text){
		Message message = createUpdateWithResponse(createTelegramResponseWithMessage(text)).message();
		return message;
	}
		
	private static Update createUpdateWithResponse(String response){
		Update update = BotUtils.parseUpdate(response);
		if (update.updateId() != null) {
			return update;
		} else {
			return null;
		}
	}
			
	private static String createTelegramResponseWithMessage(String message) {
		String output = "";
		if(message.contains("/")) {
			output += "{\"update_id\":123456789,\"message\":{\"message_id\":123,"
					+ "\"from\":{\"id\":12345678,\"first_name\":\"John\",\"last_name\":\"Doe\","
					+ "\"username\":\"johndoe\"},\"chat\":{\"id\":12345678,"
					+ "\"first_name\":\"John\",\"last_name\":\"Doe\",\"username\":\"johndoe\"},"
					+ "\"date\":1439275732,\"text\":\"\\" + message + "\"}}";
		} else {
			output += "{\"update_id\":123456789,\"message\":{\"message_id\":123,"
					+ "\"from\":{\"id\":12345678,\"first_name\":\"John\",\"last_name\":\"Doe\","
					+ "\"username\":\"johndoe\"},\"chat\":{\"id\":12345678,"
					+ "\"first_name\":\"John\",\"last_name\":\"Doe\",\"username\":\"johndoe\"},"
					+ "\"date\":1439275732,\"text\":\"" + message + "\"}}";

		}
		return output;
	}

}
