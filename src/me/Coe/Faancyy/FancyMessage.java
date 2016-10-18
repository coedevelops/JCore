package me.Coe.Faancyy;

import org.bukkit.entity.Player;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import me.Coe.Reflection.ChatSerializer;
import me.Coe.Reflection.Convert;
import me.Coe.Reflection.EntityPlayer;
import me.Coe.Reflection.PacketPlayOutChat;
import me.Coe.Reflection.PlayerConnection;

public final class FancyMessage{
	protected static final JSONArray Json = new JSONArray();
	public FancyMessage(Object... Arguments){
		for(int i = 0; i < Arguments.length; i++){
			JSONObject Item = new JSONObject();
			if(Arguments[i] instanceof String){
				Item.put("text", Arguments[i]);
				while(Arguments.length > i+1 && Arguments[i+1] instanceof Object[]){
					Object[] Array = (Object[]) Arguments[i+1];
					Item.put(Array[0], Array[1]);
					i++;
				}
				Json.add(Item);
			}
		}
	}
	public void sendTo(Player... Players){
		for(Player Player : Players)
			PlayerConnection.sendPacket(
				EntityPlayer.getPlayerConnection(
					Convert.fromCraftPlayerToEntityPlayer(Player)
				),
				PacketPlayOutChat.__constructor(
					ChatSerializer.a(
							Json.toJSONString()
					)
				)
			);
	}
}