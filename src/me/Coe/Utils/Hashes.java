package me.Coe.Utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public enum Hashes{
	MD5("MD5", 32),
	SHA1("SHA-1", 40),
	SHA256("SHA-256", 64);
	private String  Algorithm = (null);
	private Integer Length    = (null);
	private Hashes(String Algorithm, Integer Length){
		this.Algorithm = Algorithm;
		this.Length    = Length;
	}
	public String encrypt(String Source){
		try{
			return Strings.fillLeft(new BigInteger(1, MessageDigest.getInstance(Algorithm).digest(Source.getBytes("UTF-8"))).toString(16), Length, "0");
		}catch(NoSuchAlgorithmException | UnsupportedEncodingException Error){
			Error.printStackTrace();
		}	return (null);
	}
}