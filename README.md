# Your Graduate Program
## A Java Project for CS3343 in CityU HK

### Project Description
In this project, our primary focus is on maintaining a comprehensive database that encompasses master's degree application results from past students. Leveraging this extensive training dataset, we employ the Naive Bayes algorithm to train a robust machine learning model capable of effectively modelling the distribution and probabilities associated with each university tier, including the prestigious QS top 10, top 10-20, and top 20-30 tiers. 

For aspiring applicants seeking guidance in their pursuit of higher education, our software allows them to input their unique academic backgrounds and personal preferences. By harnessing the power of our state-of-the-art machine learning models, the software analyses the input data and provides tailored recommendations that align with the applicants' academic profiles and individual preferences. This recommendation process is achieved through a comprehensive matching procedure against our pre-existing database, which contains a wealth of previously stored data points.  

In addition to empowering applicants, our system also caters to administrators who play a key role in managing and updating the system. Administrators have the capability to effortlessly update the database with the latest data points, ensuring that the information remains current and relevant. Furthermore, they can initiate periodic retraining of the machine learning model, allowing it to continuously adapt to the evolving landscape of master's degree applications. 

By combining the power of sophisticated machine learning techniques with an extensive and meticulously maintained database, our project provides a comprehensive solution that assists applicants in making informed decisions about their academic journeys. Simultaneously, administrators can efficiently manage and update the system, ensuring its accuracy and reliability over time. 

### User Guideline 
Please use SSH to clone the project  
Please add your code to your local repo before commit  
Remember to pull(update) the project before any updates
Please enter "git remote update origin --prune" in terminal if you cannot find branches  
Please enter "find . -name '*.java' | xargs wc -l" to check the number of java lines

### File Structure Description
./file: necessary csv files for I/O system, including pre-trained data sets & newest QS ranking information /n
./src: core java files for the whole programe /n
  ./src/Algorithm: alogorithm java files /n
  ./src/Database: database java files /n
  ./src/Exceptions: exception java files /n
  ./src/Other: other necessary components /n
  ./src/System: core part /n
  ./src/University: universities's object information /n
  ./src/User: users' object & I/O information /n
  ./src/Value: objects' value information /n
./test: test cases for development /n

### Credits : Group Members
Wang Zixuan 

Liu Zihan

Wang Yuyang

Belekov Myrzabek

Kaur Kirandeep

Mahir Labib
