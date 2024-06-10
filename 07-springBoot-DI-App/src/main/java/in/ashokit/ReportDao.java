package in.ashokit;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDao {
	public String getNameById(Integer userId) {
		if(userId==100) {
			return "Yogesh";
		}
		else if(userId==101){
			return "Tawde";
		}
		else {
			return "Name not found";
		}
	}

}
