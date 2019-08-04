package br.com.tiss.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleCorsFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;
		resp.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PATCH");
        resp.setHeader("Access-Control-Max-Age", "3600");
        resp.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Content-Type, Accept, Accept-Language, Origin, User-Agent, x-requested-with, authorization");

        if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
            resp.setStatus(HttpServletResponse.SC_OK);
        } else {
            chain.doFilter(request, response);
        }
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}

}
