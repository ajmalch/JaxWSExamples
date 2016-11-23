

import com.example.Facility;
import com.example.FacilitySOAPService;
import com.example.FacilityService;

public class Client {

	public static void main(String[] args) {
	
		FacilitySOAPService service=new FacilitySOAPService();
		 FacilityService name=service.getFacilityServicePort();

		 Facility f=name.getFacility();
		 
		 System.out.println(f.getId());
		 System.out.println(f.getName());
		 System.out.println(f.getType());
	}

}
