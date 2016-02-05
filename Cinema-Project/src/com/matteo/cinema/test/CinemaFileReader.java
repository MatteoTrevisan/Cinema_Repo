package com.matteo.cinema.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.matteo.cinema.model.Film;

public class CinemaFileReader {

	public CinemaFileReader() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<Film> filmList = new ArrayList();
		
		try (BufferedReader br = new BufferedReader(new FileReader("Cinema_Persistence.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				// process the line.
				String[] columns = line.split(",");
				Film film = new Film(Integer.parseInt(columns[0].trim()), columns[1].trim(), columns[2].trim(), columns[3].trim());
				filmList.add(film);
				
			}

		}

		
	}

}
