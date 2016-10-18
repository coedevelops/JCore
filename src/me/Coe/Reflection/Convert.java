package me.Coe.Reflection;

import java.lang.reflect.InvocationTargetException;

public final class Convert{
	public static Object fromCraftPlayerToEntityPlayer(Object CraftPlayer){
		if(Classes.CraftPlayer.isInstance(CraftPlayer)){
			try{
				return Classes.CraftPlayer.getMethod("getHandle").invoke(CraftPlayer);
			}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException Error){
				Error.printStackTrace();
			}
		} return null;
	}
}