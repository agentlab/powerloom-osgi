package org.powerloom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class PushbackBufferedReader extends BufferedReader {

	public PushbackBufferedReader(Reader in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		mark(1);
		return super.read();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		return super.read(cbuf, off, len);
	}
	
	/**
	 * Works only after reading only one character!!!
	 * 
	 * @param c
	 * @throws IOException
	 */
	public void unread(int c) throws IOException {
		reset();
	}
}
