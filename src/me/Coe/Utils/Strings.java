package me.Coe.Utils;

import java.util.Arrays;

public final class Strings{
	public static String repeat(String Source, int Count){
		char[] Result = new char[Source.length()*Count];
		for(int i = 0; i < Count; i++)
			System.arraycopy(Source.toCharArray(), 0, Result, Source.length()*i, Source.length());
		return new String(Result);
	}
	public static String fillLeft(String Source, int Size, String Filler){
		char[] Result = new char[Size];
		if(Filler.length() == 1)
			Arrays.fill(Result, Filler.charAt(0));
		else for(int i = 0; i < Size; i++)
			Result[i] = Filler.charAt(i % Filler.length());
		System.arraycopy(Source.toCharArray(), 0, Result, Result.length - Source.length(), Source.length());
		return new String(Result);
	}
	public static String fillRight(String Source, int Size, String Filler){
		char[] Result = new char[Size];
		if(Filler.length() == 1)
			Arrays.fill(Result, Filler.charAt(0));
		else for(int i = 0; i < Size-Source.length(); i++)
			Result[Source.length()+i] = Filler.charAt(i % Filler.length());
		System.arraycopy(Source.toCharArray(), 0, Result, 0, Source.length());
		return new String(Result);
	}
}