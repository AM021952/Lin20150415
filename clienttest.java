import java.net.*;
import java.io.*;
public class clienttest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket connect = new Socket("127.0.0.1", 9999);
		
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));		
		String input = kb.readLine();
		
		PrintWriter pw = new PrintWriter(connect.getOutputStream());		
		pw.write(input);
		pw.write("\n");
		pw.flush();

		
		BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
		String data = "";
		
		/*data = br.readLine();
		System.out.println(data);*/
		
		
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		
			
		input = kb.readLine();
		if(input.equals("get"))
		{
			nput = kb.readLine();
			PrintWriter pw1 = new PrintWriter(connect.getOutputStream());
		}
		
		br.close();

		connect.close();
		
		
		
	}

}
