package cat;

public class Cat {
    String name;

    String breeds;

    double weight;

    void claw(){
        System.out.println("할퀴기!!");
    }

    void meow(){
        System.out.println("야옹");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBreeds(String breeds){
        this.breeds = breeds;
    }

    public String getBreeds(){
        return breeds;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
}
