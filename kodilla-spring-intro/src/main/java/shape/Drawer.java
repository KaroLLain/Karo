package shape;

public class Drawer {

    public void doDrawing(){

        Figure figure;

        figure = new Circle();
        figure.draw();

        figure = new Triangle();
        figure.draw();
    }
}
