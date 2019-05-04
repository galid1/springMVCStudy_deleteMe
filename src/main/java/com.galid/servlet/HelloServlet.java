package com.galid.servlet;


import com.galid.mvc.service.NameService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        NameService nameService = context.getBean("nameService", NameService.class);

        resp.getWriter().println("<html><body>");
        resp.getWriter().println("hello, " + nameService.getName());
        resp.getWriter().println("</body></html>");
    }

}
