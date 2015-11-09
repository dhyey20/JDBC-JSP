import java.net.*;
public class demo1 {

		public static void main(String args[]) throws UnknownHostException{
			InetAddress a=InetAddress.getLocalHost();
			System.out.println(a);
			
			a=InetAddress.getByName("www.facebook.com");
			System.out.println(a);
			
			InetAddress b[]=InetAddress.getAllByName("www.nba.com");
			for(int i=0;i<b.length;i++)
				System.out.println(b[i]);
			
		}
}
