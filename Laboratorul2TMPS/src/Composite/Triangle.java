package Composite;

public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Desenam triunghiul cu culoarea "+fillColor);
    }

}
