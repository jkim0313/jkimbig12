import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleEx extends HttpServlet{
	private static final long serialVerisonUID = 1L;
	
	public LifeCycleEx() {
		super();
		System.out.println("생성자 호출되었다.");
	}
	
	public void init() throws ServletException{
		System.out.println("init 호출");
	}
	
	public void destroy() {
		System.out.println("destroy 호출");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("doPost 호출되었다.");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("doGet 호출되었다.");
	}

}
