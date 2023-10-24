package Other;

import java.util.ArrayList;

public class DatapointsAtier {
    private int tier;
    private ArrayList<Datapoint> datapoints;

    public DatapointsAtier(int i, ArrayList<Datapoint> database){
        datapoints = new ArrayList<>();
        tier = i;
        for(Datapoint d:database){
            if(d.getTierAdmission()==tier){
                this.addDataPoints(d);
            }
        }
    }

    public void addDataPoints(Datapoint d){
        datapoints.add(d);
    }

    public double computeP1(){
        int times = 0;
        for(Datapoint d:datapoints){
           if(d.getTierBackground() == 1){
                times += 1;
           }
            
        }
        double result = (double) times/datapoints.size();
        return result;
    }

    public double computeP2(){
        int times = 0;
        for(Datapoint d:datapoints){
           if(d.getTierBackground() == 2){
                times += 1;
           }
            
        }
        double result = (double) times/datapoints.size();
        return result;
    }

    public double computeP3(){
        int times = 0;
        for(Datapoint d:datapoints){
           if(d.getTierBackground() == 3){
                times += 1;
           }
            
        }
        double result = (double) times/datapoints.size();
        return result;
    }

    public double computeP4(){
        int times = 0;
        for(Datapoint d:datapoints){
           if(d.getTierBackground() == 4){
                times += 1;
           }
            
        }
        double result = (double) times/datapoints.size();
        return result;
    }

    public double computeP5(){
        int times = 0;
        for(Datapoint d:datapoints){
           if(d.getTierBackground() == 5){
                times += 1;
           }
            
        }
        double result = (double) times/datapoints.size();
        return result;
    }

    // compute mean for weighted GPA
    public double computeMeanG(){
        double[] Ds = new double[datapoints.size()];
        for(int x=0;x<datapoints.size();x++){
            Ds[x] = datapoints.get(x).getweightedG();
        }

        ComputeMean c = new ComputeMean(Ds);
        return c.getMean();
    }

    public double computeMeanO(){
        double[] Ds = new double[datapoints.size()];
        for(int x=0;x<datapoints.size();x++){
            Ds[x] = datapoints.get(x).getweighedO();
        }

        ComputeMean c = new ComputeMean(Ds);
        return c.getMean();
    }

    public double computeSdG(){
        double[] Ds = new double[datapoints.size()];
        for(int x=0;x<datapoints.size();x++){
            Ds[x] = datapoints.get(x).getweightedG();
        }

        ComputeSD c = new ComputeSD(Ds);
        return c.getSD();
    }

    public double computeSdO(){
        double[] Ds = new double[datapoints.size()];
        for(int x=0;x<datapoints.size();x++){
            Ds[x] = datapoints.get(x).getweighedO();
        }

        ComputeSD c = new ComputeSD(Ds);
        return c.getSD();
    }

}
