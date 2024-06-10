package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.ReportDao;

@Service
public class ReportService {
	private ReportDao reportDao;
	
//	public  ReportService() {
//		System.out.println(" 0 param constructor");
//	}
	
	@Autowired  // always recommnded to use constructor injection
	public ReportService(ReportDao reportDao) {
		System.out.println("Parameterized constructor");
		this.reportDao=reportDao;
	}
	
	public void printName(Integer userId) {
		String nameById =reportDao.getNameById(userId);
		System.out.println(nameById);
	}

}
