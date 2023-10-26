package Algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Parameter {
    private int AdmissionTier;

    // conditional probability: P(background tier=1|admission tier=x)
    private double P1;
    // conditional probability: P(background tier=2|admission tier=x)
    private double P2;
    // conditional probability: P(background tier=3|admission tier=x)
    private double P3;
    // conditional probability: P(background tier=4|admission tier=x)
    private double P4;
    // conditional probability: P(background tier=5|admission tier=x)
    private double P5;

    // mean(weighted GPA|admission tier=x)
    private double MeanGPA;

    // standard deviation(weighted GPA|admission tier=x)
    private double sdGPA;

    // mean(weighted others|admission tier=x)
    private double MeanOthers;

    // standard deviation(weighted Others|admission tier=x)
    private double sdOthers;

    public Parameter(int tier) {
        AdmissionTier = tier;

        // load the database which contains the parameters
        File csv = new File("./file/parameters.csv");
        csv.setReadable(true);
        csv.setWritable(true);
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            isr = new InputStreamReader(new FileInputStream(csv), "UTF-8");
            br = new BufferedReader(isr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String line = "";
        ArrayList<String> records = new ArrayList<>();
        for (int i = 0; i <= tier; i++) {
            try {
                while (!(line = br.readLine()).equals(null)) {
                    // System.out.println(line);
                    records.add(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String theline = records.get(tier);
        double[] data = new double[9];

        for (int x = 0; x < 9; x++) {
            String num = theline.split(",")[x];
            if (num.contains("/")) {
                String[] str = num.split("/");
                data[x] = Double.parseDouble(str[0]) / Double.parseDouble(str[1]);
            } else {
                data[x] = Double.parseDouble(num);
            }
        }

        setP1(data[0]);
        setP2(data[1]);
        setP3(data[2]);
        setP4(data[3]);
        setP5(data[4]);

        setMeanGPA(data[5]);
        setMeanOthers(data[6]);
        setsdGPA(data[7]);
        setsdOthers(data[8]);
    }

    public void setP1(double p) {
        P1 = p;
    }

    public void setP2(double p) {
        P2 = p;
    }

    public void setP3(double p) {
        P3 = p;
    }

    public void setP4(double p) {
        P4 = p;
    }

    public void setP5(double p) {
        P5 = p;
    }

    public void setMeanGPA(double m) {
        MeanGPA = m;
    }

    public void setsdGPA(double sd) {
        sdGPA = sd;
    }

    public void setMeanOthers(double m) {
        MeanOthers = m;
    }

    public void setsdOthers(double sd) {
        sdOthers = sd;
    }

    public int getTier() {
        return AdmissionTier;
    }

    public double getP1() {
        return P1;
    }

    public double getP2() {
        return P2;
    }

    public double getP3() {
        return P3;
    }

    public double getP4() {
        return P4;
    }

    public double getP5() {
        return P5;
    }

    public double getmeanGPA() {
        return MeanGPA;
    }

    public double getmeanOthers() {
        return MeanOthers;
    }

    public double getsdGPA() {
        return sdGPA;
    }

    public double getsdOthers() {
        return sdOthers;
    }

}
