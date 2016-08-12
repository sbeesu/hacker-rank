import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		String pattern = "(?:(?:[0-9]|[0-9][0-9]?|[0-2][0-5]?[0-9]?)\\.){3}(?:[0-9]|[0-9][0-9]?|[0-2][0-5]?[0-9]?)";
		Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(pattern));
            
        }
        
        in.close();
		
	}
}