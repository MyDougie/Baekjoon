package ex11654;

/**
 * 아스키코드 - 2017/04/17 - Complete
 * */
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			System.out.println(isr.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}