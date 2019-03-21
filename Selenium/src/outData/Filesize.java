package outData;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Filesize {

	public static void main(String[] args) {
		
		String filePath = "F:\\Movies and download folder files\\Video\\Pillaa Raa Full Video Song 4K _ RX100 Songs _ Kart(1080P_HD).mp4";
		
		File file = new File(filePath);
		
		long filesize = FileUtils.sizeOf(file);
		
		long file12 = (filesize/1024)/1024;
		
		System.out.println(file12);
		
		
		
	}

}
