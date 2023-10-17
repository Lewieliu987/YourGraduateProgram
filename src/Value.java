public abstract class Value{
    private double weight;
    public Value(double my_weight)
    {
        this.weight = my_weight;
    }
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public abstract double calculateWeightedValue();
}
