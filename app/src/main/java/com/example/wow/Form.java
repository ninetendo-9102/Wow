package com.example.wow;

public class Form {
    enum shape {circle,rectangle,compose};
    float x;
    float y;
    float oldx;
    float oldy;
    Enum getShape(){
        return shape.circle;
    }
    float getX(){
        return x;
    }
    float getY(){
        return y;
    }
    float getOldX(){
        return oldx;
    }
    float getOldY(){
        return oldy;
    }
}
