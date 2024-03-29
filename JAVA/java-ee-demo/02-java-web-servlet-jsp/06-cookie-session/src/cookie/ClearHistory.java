package cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClearHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Cookie cookie= new Cookie("history", "");
		cookie.setMaxAge(0);
		
		//路径
		cookie.setPath(request.getContextPath()+"/");
		
		response.addCookie(cookie);
		
		response.sendRedirect(request.getContextPath()+"/product_list.jsp");
	}

}
