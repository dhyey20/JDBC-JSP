import java.net.*;
import java.io.*;

public class demo2 {
	public static void main(String args[]) throws UnknownHostException,IOException{
		int c;
		
		Socket s = new Socket("whois.internic.net",43);
		
		InputStream in=s.getInputStream();
		OutputStream out=s.getOutputStream();
		
		String str="www.facebook.com";
		byte buf[]=str.getBytes();
		out.write(buf);
		
		while ((c=in.read())!=-1)
			System.out.print((char)c);
		s.close();
	}
	
}
