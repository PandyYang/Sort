package pandy.test.proxy;

import java.util.Date;

public class HelloServiceImpl implements HelloService {

	public String echo(String msg) {
		// TODO Auto-generated method stub
		return "echo:"+msg;
	}

	public Date getTime() {
		// TODO Auto-generated method stub
		return new Date();
	}
	
}
