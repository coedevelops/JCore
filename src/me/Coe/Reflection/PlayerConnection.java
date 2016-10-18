package me.Coe.Reflection;

import java.lang.reflect.InvocationTargetException;

public final class PlayerConnection{
	public static void sendPacket(Object PlayerConnection, Object Packet){
		if(Classes.PlayerConnection.isInstance(PlayerConnection)){
			if(Classes.Packet.isInstance(Packet)){
				try{
					Classes.PlayerConnection.getMethod("sendPacket", Classes.Packet).invoke(PlayerConnection, Packet);
				}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException Error){
					Error.printStackTrace();
				}
			}
		}
	}
}