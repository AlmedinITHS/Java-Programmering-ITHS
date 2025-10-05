package EnklaOvningarFranSlide;

import java.util.Scanner;

public class Triangle {
    private int base;
    private int height;

    static double ComputeArea(int base, int height) {
        double area = base + height/2;
        return area;
    }
    public int getHeight() {//Gettermetod som läser av värdet på sinstansvariabeln som är private
        return height;
    }
    public void setHeight(int height) {//Settermetod som tilldelar/modifierar värdet på instansvariabeln som är private
        this.height = height;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public static void main(String[] args) {
       double area = ComputeArea(2,4);
       System.out.println(area);
    }
    
}
