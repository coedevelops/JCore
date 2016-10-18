package me.Coe.Reflection;

public final class PlayerAbilities{
	public static void setInvulnerable(Object PlayerAbilities, Object Invunerable){
		if(Classes.PlayerAbilities.isInstance(PlayerAbilities)){
			if(Classes.Boolean.isInstance(Invunerable)){
				try{
					Classes.PlayerAbilities.getField("isInvulnerable").set(PlayerAbilities, Invunerable);
				}catch(IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException Error){
					Error.printStackTrace();
				}
			}
		}
	}
	public static Boolean isInvulnerable(Object PlayerAbilities){
		if(Classes.PlayerAbilities.isInstance(PlayerAbilities)){
			try{
				return Classes.PlayerAbilities.getField("isInvulnerable").getBoolean(PlayerAbilities);
			}catch(IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException Error){
				Error.printStackTrace();
			}
		} return null;
	}
}