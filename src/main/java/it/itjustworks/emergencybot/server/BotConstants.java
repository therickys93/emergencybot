package it.itjustworks.emergencybot.server;

public class BotConstants {

	public static final String CONNECTION_FAILED = "Error 1: Connection Failed.\n"+BotConstants.ACTION_ERROR;
	public static final String TOKEN_ERROR = "Wrong Telegram Server token";
	public static final String GET_RESPONSE_ERROR = "See the chat on Telegram for more details";
	public static final String PARSE_UPDATE_ERROR = "I cannot parse the update";
	public static final String GETTING_COUNTRY_ERROR = "Error 2: Getting Country Error.\n"+BotConstants.ACTION_ERROR;
	public static final String GETTING_EMERGENCY_ERROR = "Error 3: Getting Emergency Error.\n"+BotConstants.ACTION_ERROR;
	public static final String ACTION_ERROR = "If you see this message please see /credits and inform the developer about it. Thanks";
	public static final boolean UPGRADE = false;
	public static final String MAINTAINANCE_MESSAGE = "The bot is in maintainance!\nPlease retry later.\nWe apologize for the inconvenience.\n";
	
}
