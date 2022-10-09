package service.implement;

import service.interfaces.IMonsterWays;

public abstract class MyMonsterWays implements IMonsterWays {

    // override methods from interface IMonsterWays
    @Override
    public void move() {
        System.out.println("My MyMonsterWays Class : function move");

    }
    @Override
    public void render() {
        System.out.println("My MyMonsterWays Class : function render");

    }
}
