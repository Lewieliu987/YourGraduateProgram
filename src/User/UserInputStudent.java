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
        System.out.println();
        String applicationType = "";

        while (!applicationType.equalsIgnoreCase("Master") && !applicationType.equalsIgnoreCase("Phd")) {
            System.out.print("Please select your application type (Master/Phd): ");
            applicationType = scanner.next();
            if (!applicationType.equalsIgnoreCase("Master") && !applicationType.equalsIgnoreCase("Phd")) {
                System.out.println("Invalid application type. Please select 'Master' or 'Phd'.");
            }
        }

        /*
         * System.out.print("Please select your application type (Master/Phd): ");
         * String applicationType = scanner.next();
         */

        student.setMyApplicationType(applicationType);

        // major（String）
        System.out.println();
        System.out.println("Please select your major:");
        System.out.println("1. Computer Science");
        System.out.println("2. Electrical Engineering");
        System.out.println("3. Mathematics");
        System.out.println("4. Physics");
        System.out.print("Enter the number corresponding to your major: ");
        String majorName = scanner.next();
        Major major = new Major();
        major.setMajorName(majorName);
        student.setMyMajor(major);

        // bachelor's degrees level（1-5）
        System.out.println();
        System.out.print("Please enter your Home School Rank (1 to 5, where 5 is the highest rank): ");
        int homeSchoolRank = scanner.nextInt();
        student.setMyHomeSchoolRank(homeSchoolRank);

        // GPA
        System.out.println();
        System.out.print("Please enter your CGPA as a fraction (e.g. CGPA/Full GPA): ");
        String CGPA = scanner.next();
        String[] parts = CGPA.split("/");
        float cgpa = 0;
        while (true) {
            if (parts.length != 2) {
                System.out.println(
                        "Invalid format: " + CGPA + ". Please re-enter your CGPA as a fraction (e.g. CGPA/Full GPA): ");
                CGPA = scanner.next();
                parts = CGPA.split("/");
            } else {
                try {
                    cgpa = Float.parseFloat(parts[0]) / Float.parseFloat(parts[1]);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format: " + CGPA
                            + ". Please re-enter your CGPA as a fraction (e.g. CGPA/Full GPA): ");
                    CGPA = scanner.next();
                    parts = CGPA.split("/");
                }
            }
        }

        System.out.print("Please enter your Major GPA as a fraction (e.g. GPA/Full GPA): ");
        String major_GPA = scanner.next();
        String[] part = major_GPA.split("/");
        float mgpa = 0;
        while (true) {
            if (part.length != 2) {
                System.out.println("Invalid format: " + major_GPA
                        + ". Please re-enter your GPA as a fraction (e.g. GPA/Full GPA): ");
                major_GPA = scanner.next();
                part = major_GPA.split("/");
            } else {
                try {
                    mgpa = Float.parseFloat(part[0]) / Float.parseFloat(part[1]);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid format: " + major_GPA
                            + ". Please re-enter your GPA as a fraction (e.g. GPA/Full GPA): ");
                    major_GPA = scanner.next();
                    part = major_GPA.split("/");
                }
            }
        }
        Gpa gpa = new Gpa(cgpa, mgpa);
        student.setMyGpa(gpa);

        // language scores
        float IELTS = -1;
        float TOEFL = -1;
        float GRE = -1;

        while (IELTS < 0 || IELTS > 9) {
            System.out.print("Please enter your IELTS score (0 to 9): ");
            IELTS = scanner.nextFloat();
            if (IELTS < 0 || IELTS > 9) {
                System.out.println("Invalid IELTS score. Please enter a value between 0 and 9.");
            }
        }

        while (TOEFL < 0 || TOEFL > 120) {
            System.out.print("Please enter your TOEFL Score (0-120): ");
            TOEFL = scanner.nextFloat();
            if (TOEFL < 0 || TOEFL > 120) {
                System.out.println("Invalid TOEFL score. Please enter a value between 0 and 120.");
            }
        }

        while (GRE < 260 || GRE > 340) {
            System.out.print("Please enter GRE Score (260-340): ");
            GRE = scanner.nextFloat();
            if (GRE < 260 || GRE > 340) {
                System.out.println("Invalid GRE score. Please enter a value between 260 and 340.");
            }
        }

        /*
         * System.out.print("Please enter your IELTS score (0 to 9): ");
         * IELTS = scanner.nextFloat();
         * System.out.print("Please enter your TOEFL Score (0-120): ");
         * TOEFL = scanner.nextFloat();
         * System.out.print("Please enter GRE Score (260-340): ");
         * GRE = scanner.nextFloat();
         */

        LanguageScore languageScore = new LanguageScore(IELTS, TOEFL, GRE);
        student.setMyLanguageScore(languageScore);

        // internship experi
        System.out.println();
        System.out.println("Please provide details about your other experiences.");
        System.out.print("Number of internships that you completed: ");
        int rounds = scanner.nextInt();
        System.out.println();

        // every internship experience
        for (int i = 1; i <= rounds; i++) {
            System.out.println("Company " + i + "'s information");
            System.out.println();
            System.out.println("Please select company " + i + "'s size? ");
            System.out.println("1 - Small (<= 10 employees)");
            System.out.println("2 - Medium-Small (11-50 employees)");
            System.out.println("3 - Medium (51-100 employees)");
            System.out.println("4 - Medium-Large (101-500 employees)");
            System.out.println("5 - Large (> 500 employees)");
            System.out.print("Enter the number corresponding to the company size: ");
            int companyLevel = scanner.nextInt();
            System.out.println();

            System.out.print("Please enter the duration of your internship (in months): ");
            double duration = scanner.nextDouble();
            System.out.println();
            student.setMyInternship(companyLevel, duration);
            System.out.println("Internship information stored successfully!");
            System.out.println();
        }

        // recommendation letters
        System.out.print("Number of recommendation letters you have in total: ");
        int number = scanner.nextInt();
        System.out.println();
        // every single recommendation letter
        for (int i = 1; i <= number; i++) {
            System.out.println("Recommendation letter " + i + "'s information");
            System.out.println("Please select the professor's postion that wrote the recommendation letter ");
            System.out.println("1. Assistant Professor ");
            System.out.println("2. Associate Professor ");
            System.out.println("3. Course Professor ");
            System.out.println("4. Chair Professor ");
            System.out.print("Enter the number corresponding to the type of professor: ");
            int prof_level = scanner.nextInt();
            System.out.println();
            System.out.print(
                    "Please enter a rank on how you think the quality of the letter is (1 to 5, where 5 is the highest rank): ");
            int quality = scanner.nextInt();
            System.out.println();
            student.setMyRecommendation(prof_level, quality);
            System.out.println("Recommendation letter information stored successfully!");
            System.out.println();
        }

        // publications
        System.out.print("Number of publications you have in total: ");
        int num = scanner.nextInt();
        System.out.println();
        // every single publication
        for (int i = 1; i < num + 1; i++) {
            System.out.println("Publication " + i + "'s information");
            System.out.println();
            System.out.print(
                    "Please enter the level of your publication" + i + " (1 to 5, where 5 is the highest rank): ");
            int level = scanner.nextInt();
            System.out.println();
            student.setMyPublication(level);
            System.out.println("Publication information stored successfully!");
            System.out.println();
        }

        // preferable region
        System.out.println("Please select your prefered region for further studies:");
        System.out.println("1. USA");
        System.out.println("2. UK");
        System.out.println("3. Europe");
        System.out.println("4. Japan");
        System.out.println("5. Hong Kong & Singapore");
        System.out.println("6. China Mainland");
        System.out.print("Enter the number corresponding to the region: ");
        int regionCode = scanner.nextInt();
        System.out.println();
        student.setMyPreferRegion(regionCode);

        // Tuition fee
        System.out.print("Please input the maximum annual tuition amount : ");
        float yearlyTuition = scanner.nextFloat();
        student.setMyPreferTuitionFee(yearlyTuition);
        System.out.println();

        // scanner.close();
    }
}
