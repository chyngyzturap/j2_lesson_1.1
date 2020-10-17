import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Colors color;
    private Shelter shelter;

    public Pet(){}

    public Pet(Colors color, Shelter shelter){
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge (){
        return age;
    }

    public Colors getColor (){
        return color;
    }

    public void setColor (Colors color){
        this.color = color;
    }

    public Shelter getShelter (){
        return shelter;
    }
    public void setShelter(Shelter shelter){
        this.shelter = shelter;
    }

    private int generateDefaultAge (){
        /*Random random = new Random();
        return random.nextInt(15);*/
        return (int)Math.random()*10+5;

    }

    public String getInfo(){
        return "Pet = " +
                "\nage = " + age +
                "\ncolor = "+ color +
                "\nShelter = " + shelter+
                "\n";
    }
}
