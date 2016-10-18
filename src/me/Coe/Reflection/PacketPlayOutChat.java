package me.Coe.Reflection;

import java.lang.reflect.InvocationTargetException;

public final class PacketPlayOutChat{
	public static Object __constructor(Object IChatBaseComponent){
		if(Classes.IChatBaseComponent.isInstance(IChatBaseComponent)){
			try{
				return Classes.PacketPlayOutChat.getConstructor(Classes.IChatBaseComponent).newInstance(IChatBaseComponent);
			}catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException Error){
				Error.printStackTrace();
			}
		} return null;
	}
}