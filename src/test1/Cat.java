package test1;

public class Cat {
    private String name ;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public void setAge(int name){
        this.age = age ;
    }

    public int getAge(){
        return  age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void speak(){
        System.out.println(name + " is speaking");
    }
    public void move(){
        System.out.println(name + " is running");
    }
    public void sleep(){

    }
    public void eat(){

    }
}