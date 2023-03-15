package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns= {/* "/JSP/productMenu.jsp","/JSP/addProduct.jsp","/JSP/listProduct.jsp"*/})
public class LoginFilter2 implements Filter{
	@Override
	public void init(FilterConfig config)throws ServletException{}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException{

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(true);

		//フィルター処理
		if(session.getAttribute("ID")== null) {
			request.setAttribute("error2", "ログインしてください。");
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/login2.jsp");
			rd.forward(request, response);
		}
	}
	@Override
	public void destroy() {}
}
