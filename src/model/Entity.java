package model;

import service.interfaces.IMakeNoise;

import java.util.ArrayList;

public class Entity {

    private String location; // for example
    private int id;//for example
    private ArrayList<IMakeNoise> makeNoiseEntity; // Array list of make noise interface
    public Entity(String location,int id){ //constructor method
        this.id = id;
        this.location=location;
        makeNoiseEntity = new ArrayList<>();

    }
    // all getter and setter methods

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id ) {
        this.id = id;
    }

    public ArrayList<IMakeNoise> getMakeNoiseEntity() {
        return makeNoiseEntity;
    }

    public void setMakeNoiseEntity(ArrayList<IMakeNoise> makeNoiseEntity) {
        this.makeNoiseEntity = makeNoiseEntity;
    }

    // two methods move and render
    public void move(){
        System.out.println("My Entity Class : function move");
    }
    public void render(){
        System.out.println("My Entity Class : function render");
    }
}
