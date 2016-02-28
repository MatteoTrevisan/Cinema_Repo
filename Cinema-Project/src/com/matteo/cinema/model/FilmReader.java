package com.matteo.cinema.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

public class FilmReader {

	private Film film;
	private Film filmData;
	private ArrayList<Film> filmList;
	private ArrayList<Film> filmDataList;

	public FilmReader() {
		// TODO Auto-generated constructor stub

	}

	public ArrayList<Film> getFilmList(ServletContext context, String path) throws FileNotFoundException, IOException {

		filmList = new ArrayList<Film>();
		InputStream is = context.getResourceAsStream(path);
		if (is != null) {
			InputStreamReader isr = new InputStreamReader(is);
			try (BufferedReader reader = new BufferedReader(isr);) {
				String line;
				while ((line = reader.readLine()) != null) {
					// process the line.
					String[] columns = line.split(",");
					film = new Film(Integer.parseInt(columns[0].trim()), columns[1].trim(), columns[2].trim(),
							columns[3].trim());
					filmList.add(film);
				}
			}

		}

		return filmList;

	}

	public ArrayList<Film> getDataFilmList(ServletContext context, String path)
			throws FileNotFoundException, IOException {

		filmDataList = new ArrayList<Film>();
		InputStream is = context.getResourceAsStream(path);
		if (is != null) {
			InputStreamReader isr = new InputStreamReader(is);
			try (BufferedReader reader = new BufferedReader(isr);) {
				String line;
				// ArrayList< String> r = null;
				while ((line = reader.readLine()) != null) {
					// process the line.
					String[] columns = line.split(",");
					String[] columns2 = new String[columns.length - 1];
					int x = 0;
					for (int i = 1; i < columns.length; i++) {
						columns2[x++] = columns[i];
					}
					filmData = new Film(Integer.parseInt(columns[0].trim()), columns2);
					filmDataList.add(filmData);
				}
			}

		}

		return filmDataList;

	}

	public String[] getEventDateFromId(int id) {

		String[] date = null;
		for (int i = 0; i < filmDataList.size(); i++) {
			if (filmDataList.get(i).getFilmIdDate() == id) {
				date = filmDataList.get(i).getDate();
				break;
			}
		}

		return date;

	}
	
	public String getEventNameFromId(int id){
		String name = null;
		for (int i = 0; i < filmList.size(); i++) {
			if (filmList.get(i).getFilmId() == id) {
				name = filmList.get(i).getTitle();
				break;
			}
	}
		return name;
	}
}
