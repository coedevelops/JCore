package me.Coe.Utils;

public final class Validate{
    public static boolean checkUsername(String Username){
		return Username.matches("[0-9A-Za-z_]{3,16}");
	}
	public static boolean checkUUID(String UUID){
		return UUID.matches("[0-9a-f]{8}-?[0-9a-f]{4}-?[1-5][0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}");
	}
	public static boolean checkEmail(String Email){
		return Email.matches(".+@.+\\..+");
	}
	public static boolean isNumber(String Value){
		try{
			Long.parseLong(Value);
			return true;
		}catch(NumberFormatException Error){
			return false;
		}
	}
	public static boolean isDecimal(String Value){
		try{
			Double.parseDouble(Value);
			return true;
		}catch(NumberFormatException Error){
			return false;
		}
	}
}