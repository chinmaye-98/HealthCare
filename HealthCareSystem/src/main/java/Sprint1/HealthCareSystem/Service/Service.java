package Sprint1.HealthCareSystem.Service;

import java.util.List;

import Sprint1.HealthCareSystem.DiagnosticCenter;
import Sprint1.HealthCareSystem.HealthException.HealthException;

public interface Service {
public boolean addCenter(DiagnosticCenter center)throws HealthException;
public List<DiagnosticCenter> displaycenter()throws HealthException;
}
