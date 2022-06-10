package Composite;

public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Desenam cercul cu culoarea "+fillColor);
    }

}
