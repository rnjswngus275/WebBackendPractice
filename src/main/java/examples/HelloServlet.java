package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response 객체 : 응답할 내용을 모두 모아놓은 추상화 해놓은 객체
		//추상화 되었기 때문에 SetContentType을 사용해서 type을 알려줘야한다.
		response.setContentType("text/html; charset=UTF-8");
		//GetWriter 객제를 사용해 response의 printwriter 객체 리턴 
		PrintWriter out=response.getWriter();
		out.print("<h1>Hello servlet</h1>");
	}

}
