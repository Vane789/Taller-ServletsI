
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
@WebServlet("/Punto3")
public class Punto3 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("Imprimiendo HTML");
        out.println("<!DOCTYPE html>");
        out.print("<html lang='es'>");
        out.print("<head>");
        out.print("<title>JavaServer Faces</title>");
        out.print("<style>"
                + ".texto{background-color: #6172d8;font-style: italic;font-weight: bold;}+"
                + "</style>"
        );
        out.print("</head>");
        out.print("<body>");
        out.print("<body>");
        out.print("<h1>JavaServer Faces</h1>");
        out.print("<div class='texto'>Es una tecnología y framework para aplicaciones Java basadas en web que simplifica el desarrollo de interfaces de usuario en aplicaciones Java EE.</div>");
        out.print("</body>");
        out.print("</html>");

    }
}


