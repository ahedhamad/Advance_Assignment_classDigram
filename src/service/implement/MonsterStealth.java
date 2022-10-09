package service.implement;

import service.interfaces.IMonsterWays;

public class MonsterStealth extends MyMonsterWays {

    //override render method from My Monster Ways class

    @Override
    public void render() {
        System.out.println("My MonsterFast Class : function render");
    }
}
