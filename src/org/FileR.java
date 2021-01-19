import java.io.FileReader;

public class FileR{
	private String filePath;
	
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
	
	public static void main(String[] args){
		FileReader fr = new FileReader(new File(this.filePath));
		char[] c = new char[fr.available()];
		int len = fr.read(c);
		String content = new String(c,0,len);
	}
}