package Value;

import java.util.ArrayList;

public class Internship {
    private ArrayList<EveryInternship> internships;

    public Internship() {
        internships = new ArrayList<EveryInternship>();
    }
    // 需要遍历函数

    public void addInternship(EveryInternship one) {
        internships.add(one);
    }
<<<<<<< HEAD
    public ArrayList<EveryInternship> getInternships() {
    	return internships;
=======

    public int getNumInternships() {
        return internships.size();
>>>>>>> branch 'main' of git@github.com:Lewieliu987/YourGraduateProgram.git
    }
}
