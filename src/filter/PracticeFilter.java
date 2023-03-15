package filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns= {"/PracticeFilterServlet"})
public class PracticeFilter implements Filter{
	@Override
	public void init(FilterConfig config)throws ServletException{}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException{

		//前処理は無し
		chain.doFilter(request,  response);
		//後処理 コンソールに表示
		System.out.print("HelloFilter:");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 (E)HH時mm分"); //(E)は曜日
		Date date = new Date();
		String dateStr = sdf.format(date);
		System.out.println(dateStr);

	}
	@Override
	public void destroy() {}
}
