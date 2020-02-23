import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import Sprint1.HealthCareSystem.DiagnosticCenter;

public class HealthTest  {
	List<Test>list=new ArrayList<Test>();
	DiagnosticCenter center=new
	DiagnosticCenter();
	
	@Test
	public void addCenter(){
		String expectedName="apolo";
		assertEquals(expectedName,center.getCenterName());
	}

	private void assertEquals(String expectedName, String centerName) {
		// TODO Auto-generated method stub
		
	}
	
}
