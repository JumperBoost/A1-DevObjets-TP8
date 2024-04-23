package fr.umontpellier.iut.svg;

public class AppSVG {
    public static void main(String[] args) {
        SVG svg = new SVG(50, 50);
        Style style_root = new Style();
        style_root.setFill("#ffffff");
        Rectangle bg_root = new Rectangle(0, 0, 20, 20);
        bg_root.setStyle(style_root);
        svg.add(bg_root);

        Rectangle rectangle = new Rectangle(1, 1, 8, 3);
        Style style_rectangle = new Style();
        style_rectangle.setFill("#008000");
        style_rectangle.setStroke("#0000ff");
        style_rectangle.setStrokeWidth(0.05);
        rectangle.setStyle(style_rectangle);
        svg.add(rectangle);

        Style style_circle = new Style();
        style_circle.setFill("#00ffff");
        Circle cercle = new Circle(5, 10, 3);
        cercle.setStyle(style_circle);
        svg.add(cercle);

        Style style_circle2 = new Style();
        style_circle2.setFill("#ff0000");
        style_circle2.setFillOpacity(0.3);
        style_circle2.setStroke("#000000");
        style_circle2.setStrokeWidth(0.1);
        Circle cercle2 = new Circle(7, 12, 3);
        cercle2.setStyle(style_circle2);
        svg.add(cercle2);

        svg.saveAsFile("exercice2.svg");
    }
}
