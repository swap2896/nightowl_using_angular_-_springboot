Created An Angular frontend and Spring Boot Backend Application.

For running Angular Application (Frontend)
-> Go inside folder nightowlfrontend and run "npm install" and
   then run "ng serve" to make your application run on port 4200.

For running SpringBoot Application (Backend)
-> Go inside folder nightowl and open it in intellij/eclipse. Run main file
   to make your application run on port 8080.
   
About the application
There are three views for the end users .

Home : consists of all the books with author's name, rating and other details.
Bookdetails : consits of details of a specific book with rating, type of book, ISBN etc. It also provides the actual website link for the books.
Dashboard: consists of a stats of all the books based on rating, types and top 10 rated books. For chart in dashboard view, Highcharts is used. The application also provides the user with light and dark theme functionality. It allows the users to toggle themes.
