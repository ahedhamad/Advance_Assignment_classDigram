package service.implement;

import service.interfaces.IMonsterWays;

public class MonsterFast extends MyMonsterWays {

    //override move method from My Monster Ways class

    @Override
    public void move() {
        System.out.println("My MonsterFast Class : function move");
    }

}
