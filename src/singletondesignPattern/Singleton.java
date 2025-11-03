package singletondesignPattern;


//only one object can be formed
//so we will make constructor private
//by making  constructor private we can cn even make one object
//so we will make a private static Singleton inst
//now directly call getTheSinglewInstance for one instance
public class Singleton {


    private static Singleton inst;
    private Singleton(){

    }

    public static Singleton getTheSinglewInstance(){
        if(inst == null){
            inst= new Singleton();

        }
        return inst;
    }
}
