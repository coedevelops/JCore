package me.Coe.Reflection;

public final class EntityPlayer{
	public static Object getPlayerConnection(Object EntityPlayer){
		if(Classes.EntityPlayer.isInstance(EntityPlayer)){
			try{
				return Classes.EntityPlayer.getField("playerConnection").get(EntityPlayer);
			}catch(IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException Error){
				Error.printStackTrace();
			}
		} return null;
	}
	public static Object getAbilities(Object EntityPlayer){
		if(Classes.EntityPlayer.isInstance(EntityPlayer)){
			try{
				return Classes.EntityPlayer.getField("abilities").get(EntityPlayer);
			}catch(IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException Error){
				Error.printStackTrace();
			}
		} return null;
	}
}