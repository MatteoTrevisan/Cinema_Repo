package com.matteo.cinema.Servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.matteo.cinema.model.FilmReader;
import com.matteo.cinema.model.Film;

/**
 * Servlet implementation class CinemaServlet
 */
public class CinemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String path = null;

	// @Override
	// public void init() throws ServletException {
	// super.init();
	// if (this.getInitParameter("cinemaPath") != null){
	// this.path = this.getInitParameter("cinemaPath");
	// }
	// }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String filename = "/Cinema_Persistence.txt";
		ArrayList<Film> filmList = new ArrayList();
		FilmReader filmReader = new FilmReader();
//		List<Film> filmList = null;
		ServletContext context = getServletContext();
		InputStream is = context.getResourceAsStream(filename);
		if (is != null) {
			InputStreamReader isr = new InputStreamReader(is);
			try (BufferedReader reader = new BufferedReader(isr);) {
				String line;
				while ((line = reader.readLine()) != null) {
					// process the line.
					String[] columns = line.split(",");
					Film film = new Film(Integer.parseInt(columns[0].trim()), columns[1].trim(), columns[2].trim(),
							columns[3].trim());
					filmList.add(film);
				}
			}
			
//			filmList = filmReader.getFilmList();
			
		}
		
		request.setAttribute("filmList", filmList);
		request.getRequestDispatcher("Cinema.jsp").include(request, response);
		
	}	
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
