package Sprint1.HealthCareSystem.Service;

import java.util.List;
import java.util.Random;

import Sprint1.HealthCareSystem.DiagnosticCenter;
import Sprint1.HealthCareSystem.DAO.DAO;
import Sprint1.HealthCareSystem.DAO.DAOImpl;
import Sprint1.HealthCareSystem.HealthException.HealthException;

public class ServiceImpl implements Service{
	private DAO DAO;
	public ServiceImpl(){
		DAO=new DAOImpl();
	}
	public boolean addCenter(DiagnosticCenter center) throws HealthException {
		String name=center.getCenterName();
		boolean flag=name.matches("[a-zA-Z]+");
		if(!flag){
			throw new HealthException("Center name should contain alphabets");
		}
		Random r=new Random();
		int id=r.nextInt(100)+1000;
		String s=Integer.toString(id);
		center.setCenterId(s);
		DAO.addCenter(center);
		return true;
	}
	public List<DiagnosticCenter> displaycenter()throws HealthException{
		return DAO.displaycenter();
	}

}
