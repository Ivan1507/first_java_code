public class Transport {
    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getPeoples() {
        return peoples;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public int getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(int max_weight) {
        this.max_weight = max_weight;
    }

    public String Mark;
    public String Model;
    public int max_speed;

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int Weight;
    public int peoples;
    public int max_weight;

    public Transport(String mark, String model, int max_speed, int weight, int peoples, int max_weight, int current_speed) {
        Mark = mark;
        Model = model;
        this.max_speed = max_speed;
        Weight = weight;
        this.peoples = peoples;
        this.max_weight = max_weight;
        this.current_speed = current_speed;
    }
    public Transport(){

    }

    public int getCurrent_speed() {
        return current_speed;
    }

    public void setCurrent_speed(int current_speed) {
        this.current_speed = current_speed;
    }

    public int current_speed;

    @Override
    public String toString() {
        return "Transport{" +
                "Mark='" + Mark + '\'' +
                ", Model='" + Model + '\'' +
                ", max_speed=" + max_speed +
                ", Weight=" + Weight +
                ", peoples=" + peoples +
                ", max_weight=" + max_weight +
                ", cur_speed="+ current_speed;
    }
}
