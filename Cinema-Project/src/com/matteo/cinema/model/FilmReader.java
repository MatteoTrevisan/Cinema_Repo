package com.matteo.cinema.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilmReader {

	public FilmReader() {
		// TODO Auto-generated constructor stub
		
	}
	
	public List<Film> getFilmList() throws FileNotFoundException, IOException {
		ArrayList<Film> filmList = new ArrayList();
		try (BufferedReader br = new BufferedReader(new FileReader("Cinema_Persistence.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				// process the line.
				String[] columns = line.split(",");
				Film film = new Film(Integer.parseInt(columns[0].trim()), columns[1].trim(), columns[2].trim(),
						columns[3].trim());
				filmList.add(film);
			}

		}

		return filmList;

	}

}
