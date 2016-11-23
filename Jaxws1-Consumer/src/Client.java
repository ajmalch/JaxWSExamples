

import com.mycalc.MyCalcService;
import com.mycalc.MyException_Exception;
import com.mycalc.MyName;

public class Client {

	public static void main(String[] args) {
	
		MyCalcService service=new MyCalcService();
		 MyName name=service.getMyPort();

		 System.out.println("Addition Result"+ name.addition(1,2));
		 try {
			int d= name.division("1", "we");
			System.out.println("Division Result: "+ d);
		} catch (MyException_Exception e) {
			System.out.println("Exeception occured : " +e.getFaultInfo().getMessage()+"\n Severity Level =" +e.getFaultInfo().getSeverityLevel());
		}
	}

}
