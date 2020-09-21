import java.util.Scanner;

public class Auto extends Transport {
    public Driver driver;
    public Pricep pricep;

    public Auto(String mark, String model, int max_speed, int weight, int peoples, int max_weight, int current_speed) {
        super(mark, model, max_speed, weight, peoples, max_weight, current_speed);

    }

    public void check_permissible_weight() throws Exception {
        if(this.pricep!=null) {
            try {
                if (this.pricep.Weight + this.Weight > this.max_weight)
                    throw new Exception("Недопустимый вес транс.средства!Вам следует уменшить вес прицепа на " + (-1) * (this.max_weight - this.pricep.Weight - this.Weight) + "кг");
                else System.out.println("Ваш прицеп допустимого веса!");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        else{
            System.out.println("У вашего автомобиля отсутствует прицеп!");
        }
        }


    public void check_current_speed() {
             if(this.current_speed>20&&this.driver!=null&&this.pricep!=null) {
                 System.out.println("Старший лейтинант Петров!Вы привысили скорость, штраф 500 рублей!");
                 this.driver.Cash-=500;
             }
    }


    public void add_driver(Driver dri){
        this.driver=dri;
    }
    public void add_pricep(Pricep pr){
        this.pricep=pr;
    }

}
