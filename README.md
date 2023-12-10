# Your Graduate Program
## A Java Project for CS3343 in CityU HK

### Project Description
In this project, our primary focus is on maintaining a comprehensive database that encompasses master's degree application results from past students. Leveraging this extensive training dataset, we employ the Naive Bayes algorithm to train a robust machine learning model capable of effectively modelling the distribution and probabilities associated with each university tier, including the prestigious QS top 10, top 10-20, and top 20-30 tiers. 

For aspiring applicants seeking guidance in their pursuit of higher education, our software allows them to input their unique academic backgrounds and personal preferences. By harnessing the power of our state-of-the-art machine learning models, the software analyses the input data and provides tailored recommendations that align with the applicants' academic profiles and individual preferences. This recommendation process is achieved through a comprehensive matching procedure against our pre-existing database, which contains a wealth of previously stored data points.  

In addition to empowering applicants, our system also caters to administrators who play a key role in managing and updating the system. Administrators have the capability to effortlessly update the database with the latest data points, ensuring that the information remains current and relevant. Furthermore, they can initiate periodic retraining of the machine learning model, allowing it to continuously adapt to the evolving landscape of master's degree applications. 

By combining the power of sophisticated machine learning techniques with an extensive and meticulously maintained database, our project provides a comprehensive solution that assists applicants in making informed decisions about their academic journeys. Simultaneously, administrators can efficiently manage and update the system, ensuring its accuracy and reliability over time. 

### Developer Guideline 
Please use SSH to clone the project  
Please add your code to your local repo before commit  
Remember to pull(update) the project before any updates
Please enter "git remote update origin --prune" in terminal if you cannot find branches  
Please enter "find . -name '*.java' | xargs wc -l" to check the number of java lines

### Usage Guideline
You can follow the steps below to quickly get up and running this java project:
1. use git clone to clone all the files to your local repository
2. after opening it with an IDE, find main.java and run it
3. all the information and instruction will be shown in the terminal

### File Structure Description
./file: necessary csv files for I/O system, including pre-trained data sets & newest QS ranking information  
./src: core java files for the whole programe  
  ./src/Algorithm: alogorithm java files  
  ./src/Database: database java files  
  ./src/Exceptions: exception java files  
  ./src/Other: other necessary components  
  ./src/System: core part  
  ./src/University: universities's object information  
  ./src/User: users' object & I/O information  
  ./src/Value: objects' value information  
./test: test cases for development  

### Credits : Group Members
Wang Zixuan 

Liu Zihan

Wang Yuyang

Belekov Myrzabek

Kaur Kirandeep

Mahir Labib
