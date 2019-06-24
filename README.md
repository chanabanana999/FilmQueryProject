## Film Query Project

#### Skill Distillery Week 7 Homework

This project provided an opportunity to query a film database by ID or keyword and return data to the user. Through a menu, the user may enter a film database ID or a keyword and view specific details of the movie per the instructions, such as film ID, title, year released, description, language, actors, etc. The ID search will return only one film, as the ID is a primary key in the database. The keyword search could return one or multiple movies, depending on how many movie titles or descriptions contain the keyword as a whole or part of any of the title or description. If no movie is found, either in the ID search or the keyword search, an error message is displayed. The user may also exit the application from the menu.

#### Technologies Used
Java, mysql, JDBC, Maven.

#### Lessons Learned
I learned that passing SQL queries via Java can be more complicated than directly entering queries via command line, and it was easy to throw errors. Layering the requirements from the instructions could sometimes cause unwanted effects in other methods that were previously working. 

I would have liked to continue to some of the stretch goals, such as JUnit tests, but it took me a very long time to get all the user stories working. For example, adding a search by keyword in both the title and the description proved difficult, as did figuring out how to join multiple tables.

However, overall, I appreciate the power of being able to perform queries and work with data via Java an JDBC, as retrieving data from a database seems critical to most applications.