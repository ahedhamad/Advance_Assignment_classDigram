package model;

public class Player extends Entity {
    private String name;

    //constructor method
    public Player(String location, int  id,String name) {
        super(location, id);
        this.name = name;
    }
    // getter and setter methods

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // override methods from Entity class
    @Override
    public void move(){
        System.out.println("My Player Class : function move");
    }
    @Override
    public  void render(){
        System.out.println("My Player Class : function render");
    }
}
