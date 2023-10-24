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

        // 申请项目类型（Master/Phd）
        System.out.println("Please select your application type (Master/Phd):");
        String applicationType = scanner.next();
        student.setMyApplicationType(applicationType);

        // 本科专业（String）
        System.out.println(); 
        System.out.println("Please select your home major code:");
        System.out.println("1. Computer Science (CS)");
        System.out.println("2. Electrical Engineering (EE)");
        System.out.println("3. Mathematics (MA)");
        System.out.println("4. Physics (PHY)");
        System.out.println("Enter your selection:");
        String majorName = scanner.next();
        Major major = new Major(majorName);
        student.setMyMajor(major);

        // 本科学校等级（1-5）
        System.out.println();
        System.out.println("Please enter your Home School Rank (from 1 to 5, the larger the better):");
        int homeSchoolRank = scanner.nextInt();
        student.setMyHomeSchoolRank(homeSchoolRank);

        // GPA
        System.out.println();
        System.out.println("Please enter your CGPA:");
        int CGPA = scanner.nextInt();
        System.out.println("Please enter your Major GPA:");
        int major_GPA = scanner.nextInt();
        Gpa gpa = new Gpa(CGPA, major_GPA);// create a new instance of GPA
        student.setMyGpa(gpa);

        // 语言成绩
        System.out.println("Please enter IELTS Score:");
        float IELTS = scanner.nextFloat();
        System.out.println("Please enter TOEFL Score:");
        float TOEFL = scanner.nextFloat();
        System.out.println("Please enter GRE Score:");
        float GRE = scanner.nextFloat();
        LanguageScore languageScore = new LanguageScore(IELTS, TOEFL, GRE);
        student.setMyLanguageScore(languageScore);

        // 实习经历
        System.out.println();
        System.out.println("How many rounds of internship did you have? Please enter your answer(maximun 5 rounds):");
        int rounds = scanner.nextInt();
        // 每一段实习经历
        for(int i=0;i<rounds;i++){
            System.out.println("Please enter next company_level (from 1 to 5, the higher the better):");
            int companyLevel = scanner.nextInt();
            System.out.println("Please enter the duration:");
            double duration = scanner.nextDouble();
            student.setMyInternship(companyLevel, duration); 
            System.out.println("Internship information stored successfully!");
        }

        // 推荐信
        System.out.println();
        System.out.println("How many recommendation letters did you get in total? Please enter your answer:");
        int number = scanner.nextInt();
        // 每一封推荐信
        for(int i=0;i<number;i++){
            System.out.println("Please enter the professor's level for your next recommendation letter (1 for Assistant Professor, 2 for Associate Professor, 3 for Professor, 4 for Chair Professor):");
            int prof_level = scanner.nextInt();
            System.out.println("How do you feel the quanlity of this letter, please enter the rank (from 1-5, the larger the better):");
            int quality = scanner.nextInt();
            student.setMyRecommendation(prof_level, quality);
            System.out.println("Recommendation letter information stored successfully!");
        }

        // 科研成果
        System.out.println();
        System.out.println("How many publications do you have? Please enter your answer:");
        int num = scanner.nextInt();
        // 每一篇发表
        for(int i=0;i<num;i++){
            System.out.println("Please enter the level for your publication");
            int level = scanner.nextInt();
            student.setMyPublication(level);
            System.out.println("Publication information stored successfully!");
        }

        // 偏好地区
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

        // 学费
        System.out.println();
        System.out.println("Please enter your prefer yearly tuition:");
        float yearlyTuition = scanner.nextFloat();
        student.setMyPreferTuitionFee(yearlyTuition);

        scanner.close();
    }
}
