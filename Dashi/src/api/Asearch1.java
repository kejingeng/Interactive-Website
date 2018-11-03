package api;
/*
 * response.setContentType("application/json");
		response.setHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out = response.getWriter();
		String username = "";
		String age = "";
		if(request.getParameter("username") != null && request.getParameter("age") != null) {
			username = request.getParameter("username");
			age = request.getParameter("age");
			out.println("Name: " + username + ", Age: " + age);
		}
		out.flush();
		out.close();
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchRestaurants1
 */
@WebServlet("/restaurants1")
public class Asearch1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Asearch1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		response.addHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out = response.getWriter();
		String username = "";
		String age = "";
		if(request.getParameter("username") != null && request.getParameter("age") != null) {
			username = request.getParameter("username");
			age = request.getParameter("age");
			out.println("Name: " + username + ", Age:" + age);
		}
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
