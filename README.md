# Advance_Assignment_classDigram

Q1.
##Explain what are the problems in this design##:  All classes depend on each other, as any modification to the Entity class needs modification to the Player 
and Monster classes, as well as modification to the Monster Fast and Monster Stealth classes,
##explain how easy/hard it is to maintain this application##: hard to maintain, debug, and refactor because there are many classes that depend on each other , 
they are not easily modified and the program becomes complex.
##For instance, adding a new monster which is fast and stealth##: The addition of monster fast and Stealth needs two Super Classes of ( Entity and Monster) ,
as many inheritance are not preferred by the developer because it is difficult to understand, maintain, debug, and refactor.


Q2: A- ![Advance](https://user-images.githubusercontent.com/99614732/194774976-a5fa9a18-2d25-4d09-9d25-fe36885acb78.png)

B- code

C-
  ##Explain how your design fix the design issue mentioned by you in question 1##:

1- The classes that depend on each other have been reduced by breaking the inheritance relationship between the Monster Class and the (Fast Class, Stealth), 
   thus creating an Interface (IMonsterWays) with the methods and we can override all the interface methods in an abstract parent (MyMonsterWays ) class,
   and in a child( MonsterFast and MonsterSleath) class override those methods only required by that particular child(MonsterFast and MonsterSleath ) class.
2- Because of this sentence (This function -makeNoise- is only valid for monsters, for Players this function is empty) an Interface (IMakeNoise) has been created that contains a function (makeNoise), and therefore an implementation only for Class Monster to get the method
3- Due to reduced dependence, it is easily maintained, refactored and debugged

