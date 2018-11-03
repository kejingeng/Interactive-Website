package api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class D1
 */
@WebServlet("/restaurants4")
public class Dsearch4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dsearch4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JSONArray array = new JSONArray();
		try {
			if(request.getParameterMap().containsKey("user_id")
					&& request.getParameterMap().containsKey("lat")
					&& request.getParameterMap().containsKey("lon")) {
				String userId = request.getParameter("user_id");
				double lat = Double.parseDouble(request.getParameter("lat"));
				double lon = Double.parseDouble(request.getParameter("lon"));
				array.put(new JSONObject().put("name", "Panda Express"));
				array.put(new JSONObject().put("name", "Hond Kong Express"));
			}
		}catch(JSONException e) {
			e.printStackTrace();
		}
		RpcParser.writeOutput(response, array);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
