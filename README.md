Job Portal - Back end code

I have done UI and Back-end separately so as to decouple the UI and Business Code. So the people working on front end and back end can work independently. 

Please follow the GitHub Links.
1. Front end Repo :  https://github.com/sundargsv/JobPortal-UI
2. Back end Repo : https://github.com/sundargsv/JobPortal-BackEnd

Tech Stack used :
1. Job Portal UI - Angular 1.x, Bootstrap 3 and Gulp (Task Runner)
2. Job Portal (Back end) - Core Java (1.7), Spring, RESTful endpoints, Hibernate, MySQL, Maven, Junit, Postman Client (Testing tools)

Follow the steps to run the Back end Module :

1. First run JobPortal (Back - end) by simply adding tomcat server to the project.

2.Execute the MySQL commands attached in JobPortal.sql (JobPortal Backend code) to create DB/ Tables/ Data

3. Change your DB properties details in dispatcher-servlet.xml (Spring dispatcher file) [/jobPortal/src/main/webapp/WEB-INF/dispatcher-servlet.xml]

Two API's were created (1. to get all jobs list and the second is for jobByID) but I have used the single API for both jobs
   API Link - http://localhost:8080/EMP/openJobs, http://localhost:8080/EMP/job/2 (You can use PostMan Client to test my API's)

If any info needed, please contact me anytime :

Mobile :  +91 9688 265787.
Skype : sundargsv2
E-mail : gsundar93@gmail.com
