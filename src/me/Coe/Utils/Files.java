package me.Coe.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;

public final class Files{
	public static void download(URL From, File To){
		try(FileInputStream FileInputStream = new FileInputStream(To)){
			FileInputStream.getChannel().transferFrom(Channels.newChannel(From.openStream()), 0, Long.MAX_VALUE);
		}catch(IOException Error){
			Error.printStackTrace();
		}
	}
}