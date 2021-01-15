import java.utils.List;

public class Test{
	public List<String> list;
	private String userName;
	private String passWd;
	public Test(String userName, String passWd){
		this.userName = userName;
		this.passWd = passWd;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getUserName(){
		return this.userName;
	}
}