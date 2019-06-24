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

	private void test() {
//		Film film = db.findFilmById(1);
//		List<Film> films = ((DatabaseAccessorObject) db).findFilmsByActorId(4);
//		System.out.println(film.getActors().size());
//		System.out.println("Film ID:" + 1);
//		System.out.println(film.().size());
//		System.out.println(film);
//		Actor actor = db.findActorById(10);
//		System.out.println(films);
	}

	private void launch() {
		Scanner input = new Scanner(System.in);

		startUserInterface(input);

		input.close();
	}

	private void startUserInterface(Scanner input) {

	}

}
