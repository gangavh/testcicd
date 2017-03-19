package simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
	
	@RequestMapping(value = "/Hello",method = RequestMethod.GET)
	@ResponseBody
	public String getHealthCheckStatus() {
		return "Hi Guy";
	}
}
