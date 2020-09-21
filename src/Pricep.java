public class Pricep extends Transport{
    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        this.Weight = weight;
    }

    public Pricep(int weight) {
        super();
        Weight = weight;
    }

    public int Weight;

    @Override
    public String toString() {
        return "Pricep{" +
                "Weight=" + Weight +
                '}';
    }
}
