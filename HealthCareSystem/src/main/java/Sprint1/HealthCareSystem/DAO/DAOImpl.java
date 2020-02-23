package Sprint1.HealthCareSystem.DAO;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import Sprint1.HealthCareSystem.Appointment;
import Sprint1.HealthCareSystem.DiagnosticCenter;
import Sprint1.HealthCareSystem.Test;
import Sprint1.HealthCareSystem.User;
import Sprint1.HealthCareSystem.HealthException.HealthException;

public class DAOImpl implements DAO{
	private Map<String,Test>map;
	HashMap<String,DiagnosticCenter>cMap;
	HashMap<String,Appointment>aMap;
	ArrayList<Test>listsOfTests=new ArrayList<Test>();
	public DAOImpl(){
		cMap=new HashMap<String,DiagnosticCenter>();

	}
 public boolean addCenter(DiagnosticCenter center) throws HealthException {
		if(cMap.containsKey(center.getCenterId())){ 
			throw new HealthException("center already exist");
		}
		else
		{
			List<Test>list=new ArrayList<Test>();
			Test test=new Test();
			test.setTestName("blood test");
			list.add(test);
			Test test1=new Test();
			test1.setTestName("blood group");
			list.add(test1);
			Test test2=new Test();
			test2.setTestName("blood pressure");
			list.add(test2);
			center.setListOfTests(list);
			cMap.put(center.getCenterId(), center);
			
		}
		return true;
	}

	public int removeCenter(DiagnosticCenter center) throws HealthException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addTest(Test test) throws HealthException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int removeTest(Test test) throws HealthException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int approveAppointement() throws HealthException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int makeanAppointement(User user, DiagnosticCenter center, Test test, Date datetime) throws HealthException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int register(User User) throws HealthException {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<DiagnosticCenter >displaycenter()throws HealthException{
		Collection<DiagnosticCenter> col=cMap.values();
		List<DiagnosticCenter>list=new ArrayList<DiagnosticCenter>(col);
		return list;
		
	}
	
}
	
	