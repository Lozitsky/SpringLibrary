package com.kirilo.training.springlibrary.servlets;

import com.kirilo.training.springlibrary.objects.LibraryFacade;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "ShowImage", urlPatterns = {"/ShowImage"})
public class ShowImage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("image/jpeg");
        OutputStream outputStream = resp.getOutputStream();
        try {
            int index = Integer.valueOf(req.getParameter("index"));
            LibraryFacade libraryFacade = (LibraryFacade) getServletContext().getAttribute("libraryFacade");
            byte[] image = libraryFacade.getBooks().get(index).getImage();
            resp.setContentLength(image.length);
            outputStream.write(image);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            outputStream.close();
        }
    }
}
