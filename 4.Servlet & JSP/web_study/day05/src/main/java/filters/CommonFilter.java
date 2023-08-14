package filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CommonFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //request.setCharacterEncoding("UTF-8");

        chain.doFilter(new CommonRequestWrapper((HttpServletRequest)request),
                new CommonResponseWrapper((HttpServletResponse) response));

    }
}
