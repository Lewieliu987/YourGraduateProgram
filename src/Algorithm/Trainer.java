package Algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Other.Datapoint;
import Other.DatapointsAtier;

public class Trainer extends NaiveBayes {

    private ArrayList<Datapoint> database;
    private ArrayList<DatapointsAtier> fiveDataTiers;

    public Trainer() {
        // load parameters storded in database
        super();

        database = new ArrayList<Datapoint>();
        fiveDataTiers = new ArrayList<>();

        // load database for training
        File csv = new File("./file/datapoints.csv");
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
        try {
            while (!(line = br.readLine()).equals(null)) {
                records.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 1; i < records.size(); i++) {
            int[] ints = new int[5];
            Double[] d = new Double[2];

            for (int x = 1; x <= 2; x++) {
                ints[x - 1] = Integer.parseInt(records.get(i).split(",")[x]);
            }
            for (int x = 3; x <= 4; x++) {
                d[x - 3] = Double.valueOf(records.get(i).split(",")[x]);
            }
            for (int x = 5; x <= 7; x++) {
                ints[x - 3] = Integer.parseInt(records.get(i).split(",")[x]);
            }
            database.add(new Datapoint(ints[0], ints[1], d[0], d[1], ints[2], ints[3], ints[4]));
        }

        // reorganize datapoints to 5 tiers
        for (int x = 1; x <= 5; x++) {
            fiveDataTiers.add(new DatapointsAtier(x, database));
        }

    }

<<<<<<< HEAD
    // train ps bases on the current database
    public void trainParameters() {
        for (int x = 0; x < 5; x++) {
=======
    //train ps bases on the current database
    public void trainParameters(){
        System.out.println("Retrained conditional probability:");
        
        for(int x =0;x<5;x++){
>>>>>>> origin/zixuanw
            // update conditional prob
            this.getps().get(x).setP1(fiveDataTiers.get(x).computeP1());
            this.getps().get(x).setP2(fiveDataTiers.get(x).computeP2());
            this.getps().get(x).setP3(fiveDataTiers.get(x).computeP3());
            this.getps().get(x).setP4(fiveDataTiers.get(x).computeP4());
            this.getps().get(x).setP5(fiveDataTiers.get(x).computeP5());
            System.out.println("P(background tier=1|admission tier=" +(x+1)+") = "+this.getps().get(x).getP1());
            System.out.println("P(background tier=2|admission tier=" +(x+1)+") = "+this.getps().get(x).getP2());
            System.out.println("P(background tier=3|admission tier=" +(x+1)+") = "+this.getps().get(x).getP3());
            System.out.println("P(background tier=4|admission tier=" +(x+1)+") = "+this.getps().get(x).getP4());
            System.out.println("P(background tier=5|admission tier=" +(x+1)+") = "+this.getps().get(x).getP5());
            

            // update guassian for GPA
            this.getps().get(x).setMeanGPA(fiveDataTiers.get(x).computeMeanG());
            this.getps().get(x).setsdGPA(fiveDataTiers.get(x).computeSdG());
            System.out.println("Mean(weightedGPA|admission tier=" +(x+1) +") = " +this.getps().get(x).getmeanGPA());
            System.out.println("SD(weightedGPA|admission tier=" +(x+1) +") = " +this.getps().get(x).getsdGPA());

            // update guassian for Others
            this.getps().get(x).setMeanOthers(fiveDataTiers.get(x).computeMeanO());
            this.getps().get(x).setsdOthers(fiveDataTiers.get(x).computeSdO());
            System.out.println("Mean(weightedOthers|admission tier=" +(x+1) +") = " +this.getps().get(x).getmeanOthers());
            System.out.println("SD(weightedOthers|admission tier=" +(x+1) +") = " +this.getps().get(x).getsdOthers());
        }

        System.out.println("Finish retraining the parameter based on the current database.");
    }

<<<<<<< HEAD
    // update ps to parameters database
    public void updateParameters() {
=======
    //update ps to parameters database
    public void updateParameters(){
>>>>>>> origin/zixuanw

    }

}
