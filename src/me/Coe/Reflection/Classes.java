package me.Coe.Reflection;

import org.bukkit.Bukkit;

public final class Classes{
	protected static final String Version = Bukkit.getServer().getClass().getPackage().getName().substring(23);
	protected static Class<?> getClass(String Name){
		try{
			return Class.forName(
				Name.replaceAll("(?i)\\{V\\}", Version)
			);
		}catch(ClassNotFoundException Error){
			Error.printStackTrace();
		} return null;
	}
	
	protected static final Class<?> CraftPlayer = getClass("org.bukkit.craftbukkit.{V}.entity.CraftPlayer");
	protected static final Class<?> EntityPlayer = getClass("net.minecraft.server.{V}.EntityPlayer");
	protected static final Class<?> Packet = getClass("net.minecraft.server.{V}.Packet");
	protected static final Class<?> PacketPlayOutChat = getClass("net.minecraft.server.{V}.PacketPlayOutChat");
	protected static final Class<?> PlayerConnection = getClass("net.minecraft.server.{V}.PlayerConnection");
	protected static final Class<?> PlayerAbilities = getClass("net.minecraft.server.{V}.PlayerAbilities");
	protected static final Class<?> IChatBaseComponent = getClass("net.minecraft.server.{V}.IChatBaseComponent");
	protected static final Class<?> ChatSerializer = getClass("net.minecraft.server.{V}.IChatBaseComponent$ChatSerializer");
	protected static final Class<?> String = getClass("java.lang.String");
	protected static final Class<?> Boolean = getClass("java.lang.Boolean");

}