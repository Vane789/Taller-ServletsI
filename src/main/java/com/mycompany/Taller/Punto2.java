
package com.mycompany.Taller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Anlly Vanessa Cardona
 */
@WebServlet("/Punto2")
public class Punto2 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("Imprimiendo HTML");
        out.println("<!DOCTYPE html>\n"
        + "<html>\n"
        + "<head><title>Hola Marte: Powered by the Perseverance</title></head>\n"
        + "<body bgcolor=\"#809ea4\">\n"
        + "<strong><em><h1>Hola Marte: Powered by the Perseverance</h1></em></strong>\n"
        + "</body></html>");
    }
}

