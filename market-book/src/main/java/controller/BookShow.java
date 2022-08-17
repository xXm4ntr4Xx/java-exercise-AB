package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookInterfaceDAO;
import dao.BookQueryDAO;
import model.Book;
import services.BookServiceImplemantation;
import services.BookServiceInterface;

/**
 * Servlet implementation class BookShow
 */
@WebServlet("/BookShow")
public class BookShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookInterfaceDAO dao = new BookQueryDAO();
		BookServiceInterface bsi = new BookServiceImplemantation(dao);
		List<Book> list = bsi.showBooks();
		System.out.println(list);
		RequestDispatcher view = null;
		
		
		request.setAttribute("res","my new list");
		view =  request.getRequestDispatcher("/bookList.jsp");
		view.include(request, response);
			
	}
	
	

}
