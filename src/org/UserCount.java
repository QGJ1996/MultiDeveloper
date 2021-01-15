import src.Count
import java.utils.List;
public class UserCount Implements Count{
	private int count;
	
	public int userCount(){
		return this.count;
	}
	int computer(List<String> userList){
		Iterator it = userList.iterator();
		this.count = 0;
		while(it.hashNext()){
			System.out.println(it.next());
			this.count++;
		}
	}
}