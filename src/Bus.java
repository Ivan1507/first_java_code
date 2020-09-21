public class Bus extends Transport {
    public boolean for_child;
    public Pricep pr;

    public Bus(String mark, String model, int max_speed, int weight, int peoples, int max_weight, int current_speed, boolean for_child) {
        this.for_child = for_child;
    }
}
