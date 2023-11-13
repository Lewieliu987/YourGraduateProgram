package Other;

public class ComputerGuassian {


    public double getP(double m, double sd, double x){
        double e = Math.exp(-(x-m)*(x-m)/(2*sd*sd));
        double r = 1/(sd*Math.sqrt(2*Math.PI));
        return e*r;
    }
}
