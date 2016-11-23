

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.example.FacilitySOAPService;
import com.example.FacilityService;
import com.example.GetFacilityResponse;


class MyAsyncHandler implements AsyncHandler<GetFacilityResponse>{

	@Override
	public void handleResponse(Response<GetFacilityResponse> res) {
	
		try {
			System.out.println(res.get().getMyFacility().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Client {

	public static void main(String[] args) {
		
		FacilitySOAPService service = new FacilitySOAPService();
		FacilityService port= service.getFacilityServicePort();
		
		System.out.println(port.getFacility().getName());
		
		port.getFacilityAsync(new MyAsyncHandler());
		
		for(int i=1; i<10000 ;i++){
			System.out.print(".");
			if(i%50==0){
				System.out.println();
			}
		}
		
	}

}
