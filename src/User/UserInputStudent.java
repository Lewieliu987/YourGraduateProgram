package User;

import java.util.Scanner;

import Value.Gpa;
import Value.Major;
import Value.LanguageScore;

public class UserInputStudent implements UserInput {

    @Override
    public void inputUser(User user) {
        Student student = (Student) user;
        Scanner scanner = new Scanner(System.in);

        // degree applying （Master/Phd）
        System.out.println("Please select your application type (Master/Phd):");
        String applicationType = scanner.next();
        student.setMyApplicationType(applicationType);

        // major（String）
        System.out.println();
        System.out.println("Please select your home major code:");
        System.out.println("1. Computer Science (CS)");
        System.out.println("2. Electrical Engineering (EE)");
        System.out.println("3. Mathematics (MA)");
        System.out.println("4. Physics (PHY)");
        System.out.println("Enter your selection:");
        String majorName = scanner.next();
        Major major = new Major();
        major.setMajorName(majorName);
        student.setMyMajor(major);

        // bachelor's degrees level（1-5）
        System.out.println();
        System.out.println("Please enter your Home School Rank (from 1 to 5, the larger the better):");
        int homeSchoolRank = scanner.nextInt();
        student.setMyHomeSchoolRank(homeSchoolRank);

        // GPA
        System.out.println();
        System.out.println("Please enter your CGPA:");
        String CGPA = scanner.next();
        String[] parts = CGPA.split("/");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid GPA format: " + CGPA);
        }
        float cgpa = Float.parseFloat(parts[0]) / Float.parseFloat(parts[1]);
        System.out.println("Please enter your Major GPA:");
        String major_GPA = scanner.next();
        String[] part = major_GPA.split("/");
        if (part.length != 2) {
            throw new IllegalArgumentException("Invalid GPA format: " + major_GPA);
        }
        float mgpa = Float.parseFloat(part[0]) / Float.parseFloat(part[1]);
        Gpa gpa = new Gpa(cgpa, mgpa);
        student.setMyGpa(gpa);

        // language scores
        System.out.println("Please enter IELTS Score:");
        float IELTS = scanner.nextFloat();
        System.out.println("Please enter TOEFL Score:");
        float TOEFL = scanner.nextFloat();
        System.out.println("Please enter GRE Score:");
        float GRE = scanner.nextFloat();
        LanguageScore languageScore = new LanguageScore(IELTS, TOEFL, GRE);
        student.setMyLanguageScore(languageScore);

        // internship experi
        System.out.println();
        System.out.println("How many numbers of internship did you have? Please enter your answer:");
        int rounds = scanner.nextInt();
        // every internship experience
        System.out.println("Please enter your company size one by one (from the scale of 1 to 5)");
        for (int i = 1; i <= rounds; i++) {
            System.out.println("Company " + i + " : ");
            int companyLevel = scanner.nextInt();
            System.out.println("Please enter the duration:");
            double duration = scanner.nextDouble();
            student.setMyInternship(companyLevel, duration);
            System.out.println("Internship information stored successfully!");
        }

        // recommendation letters
        System.out.println();
        System.out.println("How many recommendation letters did you get in total? Please enter your answer:");
        int number = scanner.nextInt();
        // every single recommendation letter
        for (int i = 1; i <= number; i++) {
            System.out.println(
                    "Please enter the professor's level for your recommendation letter " + i
                            + "(1 for Assistant Professor, 2 for Associate Professor, 3 for Professor, 4 for Chair Professor):");
            int prof_level = scanner.nextInt();
            System.out.println(
                    "How do you feel the quanlity of this letter, please enter the rank (from 1-5, the larger the better):");
            int quality = scanner.nextInt();
            student.setMyRecommendation(prof_level, quality);
            System.out.println("Recommendation letter information stored successfully!");
        }

        // publications
        System.out.println();
        System.out.println("How many publications do you have? Please enter your answer:");
        int num = scanner.nextInt();
        // every single publication
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter the level for your publication");
            int level = scanner.nextInt();
            student.setMyPublication(level);
            System.out.println("Publication information stored successfully!");
        }

        // preferable region
        System.out.println();
        System.out.println("In the following region, which one do you prefer to study in?");
        System.out.println("1. USA");
        System.out.println("2. UK");
        System.out.println("3. Europe");
        System.out.println("4. Japan");
        System.out.println("5. Hong Kong & Singapore");
        System.out.println("6. China Mainland");
        System.out.println("Please enter the number before each statement:");
        int regionCode = scanner.nextInt();
        student.setMyPreferRegion(regionCode);

        // tuition fee
        System.out.println();
        System.out.println("Please enter your prefer yearly tuition:");
        float yearlyTuition = scanner.nextFloat();
        student.setMyPreferTuitionFee(yearlyTuition);

        // scanner.close();
    }
}
