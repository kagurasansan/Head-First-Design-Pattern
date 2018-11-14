package factory_pattern;

import observer_pattern.Subject;

import java.awt.*;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public void prepare(){
        System.out.println("prepare..."+name);
    }
    public void bake(){
        System.out.println("bake");
    }
    public void cut(){
        System.out.println("cut");
    }
    public void box(){
        System.out.println("box");
    }

}
