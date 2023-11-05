package Value;

import java.util.ArrayList;

public class Internship {
    private ArrayList<EveryInternship> internships;

    public Internship(ArrayList<EveryInternship> internships) {
        this.internships = internships;
    }
    // 需要遍历函数

    public void addInternship(EveryInternship one) {
        internships.add(one);
    }
    public ArrayList<EveryInternship> getInternships() {
    	return internships;
    }
}
