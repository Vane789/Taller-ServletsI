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
@WebServlet("/Punto4")
public class Punto4 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("Imprimiendo HTML");
        out.println("<!DOCTYPE html>");
        out.print("<html lang='es'>");
        out.print("<head>");
        out.print("<title>Spring MVC</title>");
        out.print("<style>"
                + ".texto{background-color: #6172d8;}+"
                + "</style>"
        );
        out.print("<script>"
                + "function cambiarTexto(){" +
                " document.getElementById('texto').innerHTML ='<p>Ayuda a construir aplicaciones basadas en la Web que sean flexibles y desvinculado de las tecnologías de vista subyacentes.</p>';}"+
                "</script>"
        );
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Spring MVC</h1>");
        out.print("<div id='texto'></div>");
        out.print("<p><button onclick='cambiarTexto();'>Mostrar texto</button></p>");
        out.print("</body>");
        out.print("</html>");

    }
}
