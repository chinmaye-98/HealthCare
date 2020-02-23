package Sprint1.HealthCareSystem.DAO;

import java.util.Date;
import java.util.List;

import Sprint1.HealthCareSystem.DiagnosticCenter;
import Sprint1.HealthCareSystem.Test;
import Sprint1.HealthCareSystem.User;
import Sprint1.HealthCareSystem.HealthException.HealthException;

public interface DAO {
	 public	boolean addCenter(DiagnosticCenter center) throws HealthException;
	 public	int removeCenter(DiagnosticCenter center) throws HealthException;
		
	 public	int addTest(Test test) throws HealthException;
		
	 public	int removeTest(Test test) throws HealthException;
	 public	int approveAppointement() throws HealthException;
	 public	int makeanAppointement(User user,DiagnosticCenter center, Test test,  Date datetime) throws HealthException;
	 public	int register(User User) throws HealthException;
	 public List<DiagnosticCenter >displaycenter()throws HealthException;
	 
}