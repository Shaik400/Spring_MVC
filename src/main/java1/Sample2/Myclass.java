package Sample2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myclass {
	@RequestMapping("hello")
	public void hello()
	{
		System.out.println("Hello");
		
	}
	@RequestMapping("bye")
	public void bye()
	{
		System.out.println("Bye");
		
	}

}
