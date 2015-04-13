package ayakut;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class WriteFileExample {

	public static void main(String[] args) {
		try{
			FileOutputStream fos =
				new FileOutputStream("c:\\eclipse\\cpe411.txt");
				/*fos.write(65);	
				fos.write(66);
				fos.write(67);
				fos.write(68);*/
				String str = "To day, it is not raining.";
				for (char c : str.toCharArray()) {
					byte b = (byte)c;
					fos.write(b);
				}
		}catch(Exception e){
			
		}

	}

}
