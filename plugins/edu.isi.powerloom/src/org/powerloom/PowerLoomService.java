package org.powerloom;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import edu.isi.powerloom.PLI;

public class PowerLoomService {
	private static PowerLoomService powerLoomService = new PowerLoomService();

	public PowerLoomService() {
		PLI.initialize();
	}
	
	
	public static PowerLoomService getInstance() {
		return powerLoomService;
	}
	
	public static void reset() {
		PLI.resetPowerloom();
	}
	
	public void loadPlm(String path) {
		InputStream inputStream = PowerLoomService.class.getResourceAsStream(path);
		PushbackBufferedReader pbbr;
		try {
			pbbr = new PushbackBufferedReader(new InputStreamReader(inputStream, "UTF-8"));
			//PushbackInputStream pushbackInputStream = new PushbackInputStream(pbbr);
			PLI.loadNativeStream(pbbr, null);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
