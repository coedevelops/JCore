package me.Coe.Reflection;

import java.lang.reflect.InvocationTargetException;

public final class ChatSerializer{
	public static Object a(Object String){
		if(Classes.String.isInstance(String)){
			try{
				return Classes.ChatSerializer.getMethod("a", Classes.String).invoke(null, String);
			}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException Error){
				Error.printStackTrace();
			}
		} return null;
	}
}