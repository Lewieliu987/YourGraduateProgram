package Algorithm;

import java.util.ArrayList;

public abstract class NaiveBayes {
    private ArrayList<Parameter> ps;

    public NaiveBayes() {
        ps = new ArrayList<Parameter>();

        // in parameter.java, each
        for (int i = 1; i <= 5; i++) {
            Parameter p = new Parameter(i);
            ps.add(p);
        }
    }

    public ArrayList<Parameter> getps() {
        return ps;
    }

}