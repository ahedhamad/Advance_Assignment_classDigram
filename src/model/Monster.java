package model;

import service.interfaces.IMakeNoise;
import service.interfaces.IMonsterWays;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Entity implements IMakeNoise {

    //constructor method
    public Monster(String location, int id ) {
        super(location, id);
        monsterWays = new ArrayList<>();
    }
    //  Array list of monster Ways interface
    private ArrayList<IMonsterWays>  monsterWays;

 // getter and setter methods
    public ArrayList<IMonsterWays> getMonsterWays(){
        return monsterWays;
    }

    public void setMonsterWays(ArrayList<IMonsterWays> monsterWays) {
        this.monsterWays = monsterWays;
    }


    // override methods from Entity class
    @Override
    public void move(){
        System.out.println("My monster Class : function move");

    }
    @Override
    public  void render(){
        System.out.println("My monster Class : function render");
    }
 // override method from interface make noise
    @Override
    public void makeNoise() {
        System.out.println("My monster Class : function make noise");

    }
}
