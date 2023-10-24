package User;
import java.util.Scanner;

import Value.Gpa;
import Value.LanguageScore;

public class UserInputStudent implements UserInput {

    @Override
    public void inputUser(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Home School Rank:");
        int homeSchoolRank = scanner.nextInt();
        Student student = (Student) user;
        student.setHomeSchoolRank(homeSchoolRank);

        System.out.println("Enter CGPA:");
        int CGPA = scanner.nextInt();
        System.out.println("Enter Major GPA:");
        int major_GPA = scanner.nextInt();
        Gpa gpa = new Gpa(CGPA, major_GPA);// create a new instance of GPA
        student.setMyGpa(gpa);

        System.out.println("Enter IELTS Score:");
        float IELTS = scanner.nextFloat();
        System.out.println("Enter TOEFL Score:");
        float TOEFL = scanner.nextFloat();
        System.out.println("Enter GRE Score:");
        float GRE = scanner.nextFloat();
        LanguageScore LanguageScore = new LanguageScore();
        user.setLanguageScore(LanguageScore, IELTS, TOEFL, GRE);

        System.out.println("Enter internship:");
        int internship = scanner.nextInt();
        user.setInternship(internship);

        System.out.println("Enter recommendations:");
        int recommendations = scanner.nextInt();
        user.setRecommendations(recommendations);

        System.out.println("Enter publication:");
        int publication = scanner.nextInt();
        user.setPublication(publication);

        System.out.println("Enter region:");
        String region = scanner.next();
        user.setRegion(region);

        System.out.println("Enter yearly tuition:");
        float yearlyTuition = scanner.nextFloat();
        user.setYearlyTuition(yearlyTuition);

        scanner.close();
    }
}
