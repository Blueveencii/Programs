package system;

public class User {

    private final int height;
    private int age;
    private int weight ;
    private int position;
    private int energyLeft;

    public User (int age, int _height, int _weight) {
        this.age = age;
        this.height =_height;
        this.weight =_weight;
        position =0;
        energyLeft =100;
    }
    public int getAge(){
        return age;
    }
    public final int getHeight(){
        return height ;
    }
    public int getWeight(){
        return weight ;
    }
    public int getPosition(){
        return position ;
    }
    public void move(int distance){
        if (energyLeft>=distance){
            position=position+distance;
            energyLeft =energyLeft =distance ;
        }
    }
    public void refreshMe(){
        energyLeft =energyLeft +50;
    }

}
