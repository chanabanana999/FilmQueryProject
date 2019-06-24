package com.skilldistillery.filmquery.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.filmquery.database.DatabaseAccessor;
import com.skilldistillery.filmquery.database.DatabaseAccessorObject;
import com.skilldistillery.filmquery.entities.Actor;
import com.skilldistillery.filmquery.entities.Film;

public class FilmQueryApp {
	private static final String URL = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";

	public FilmQueryApp() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	DatabaseAccessor db = new DatabaseAccessorObject();

	public static void main(String[] args) throws ClassNotFoundException {
		FilmQueryApp app = new FilmQueryApp();
//		app.test();
		app.launch();
	}

//	private void test() {
//		Film film = db.findFilmById(1);
//		List<Film> films = ((DatabaseAccessorObject) db).findFilmsByActorId(4);
//		System.out.println(film.getActors().size());
//		System.out.println("Film ID:" + 1);
//		System.out.println(film.().size());
//		System.out.println(film);
//		Actor actor = db.findActorById(10);
//		System.out.println(films);
//	}

	private void launch() {
		Scanner input = new Scanner(System.in);

//		Welcome and display menu
		System.out.println("Welcome to the film query app. Please make a selection below:");
		boolean displayMenu = true;
		int menuChoice = 0;
		int filmID = 0;
		String keyWord = "";
		while (displayMenu = true) {
			System.out.println("1. Look up a film by its ID. (This must be an integer.)\n"
					+ "2. Look up a film by a search keyword (This will search for the entry"
					+ " in any part of the title or description)\n" + "3. Exit");
			menuChoice = input.nextInt();
			switch (menuChoice) {
			case 1:
				System.out.print("Enter film id: ");
				filmID = input.nextInt();
				displayFilmTitle(filmID);
				break;
			case 2:
				System.out.print("Enter a keyword to search on: ");
				String keyword = input.next();
				keyword = keyword.toUpperCase();
				searchFilmByKeyword(keyword);
				break;
			case 3:
				displayMenu = false;
				System.out.println("Thank you for searching for films.");
				System.exit(0);
			default:
				System.out.println("Invalid option. Please choose from the options above.");
			}
		}

//		Launch queries and display information
		startUserInterface(input);

//		Close input
		input.close();
	}

	private void startUserInterface(Scanner input) {

	}

	private void displayFilmTitle(int filmID) {
		Film film = null;
		if ((film = db.findFilmById(filmID)) != null) {
			printFilm(film);
		} else {
			System.out.println("Film not found.\n");
		}
	}

	private void searchFilmByKeyword(String keyword) {
		List<Film> films = null;
		if ((films = ((DatabaseAccessorObject) db).findFilmsByKeyword(keyword)) != null) {
			for (Film film : films) {
				printFilm(film);
			}
			int numFilms = films.size();
			if (numFilms == 0) {
				System.out.println("Keyword not found.\n");
			} else {
				System.out.println("Total number: " + films.size() + "\n");
			}
		}
	}

	private void printFilm(Film film) {
		System.out.println("\nFilm ID: " + film.getId());
		System.out.println("Film title: " + film.getTitle());
		System.out.println("Released in: " + film.getReleaseYear());
		System.out.println("Rating: " + film.getRating());
		System.out.println("Description: " + film.getDescription());
		System.out.println("Language: " + film.getLanguage());
		boolean first = true;
		System.out.print("Cast: ");
		for (Actor actor : film.getActors()) {
			if (first) {
				System.out.print(actor.getFirstName() + " " + actor.getLastName());
				first = false;
			} else {
				System.out.print(", " + actor.getFirstName() + " " + actor.getLastName());

			}
		}
		System.out.println("\n----------------------------------------");
	}

}
