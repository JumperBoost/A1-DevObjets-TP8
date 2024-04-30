package fr.umontpellier.iut.svg;

public class AppSVG {
    public static void main(String[] args) {
        SVG svg = new SVG(50, 50);
        Style style_root = new Style();
        style_root.setFill("#ffffff");
        Rectangle bg_root = new Rectangle(0, 0, 20, 20);
        bg_root.setStyle(style_root);
        svg.add(bg_root);

        Scale rectangle_scale = new Scale(1.05, 0.5);
        Rotate rectangle_rotate = new Rotate(-10, 50, 100);
        Translate rectangle_translate = new Translate(20, 5);

        Rectangle rectangle = new Rectangle(1, 1, 8, 3, 1, 1);
        Style style_rectangle = new Style();
        style_rectangle.setFill("#008000");
        style_rectangle.setStroke("#0000ff");
        style_rectangle.setStrokeWidth(0.05);
        style_rectangle.addTransform(rectangle_scale);
        style_rectangle.addTransform(rectangle_rotate);
        style_rectangle.addTransform(rectangle_translate);
        rectangle.setStyle(style_rectangle);
        svg.add(rectangle);

        Style style_circle = new Style();
        SkewX circle_skewX = new SkewX(20);
        SkewY circle_skewY = new SkewY(10);
        style_circle.addTransform(circle_skewY).addTransform(circle_skewX);
        style_circle.setFill("#00ffff");
        Circle cercle = new Circle(5, 10, 3);
        cercle.setStyle(style_circle);

        Style style_circle2 = new Style();
        style_circle2.setFill("#ff0000");
        style_circle2.setFillOpacity(0.3);
        style_circle2.setStroke("#000000");
        style_circle2.setStrokeWidth(0.1);
        Circle cercle2 = new Circle(7, 12, 3);
        cercle2.setStyle(style_circle2);

        Group circle_group = new Group();
        circle_group.add(cercle);
        circle_group.add(cercle2);
        svg.add(circle_group);

        svg.saveAsFile("exercice2.svg");
        exercice_onze();
    }

    private static void exercice_onze() {
        SVG svg = new SVG(1000, 1000);

        Rectangle rectangle = new Rectangle(0, 0, 1000, 1000);
        Style rectangle_style = new Style();
        rectangle_style.setFill("lightblue");
        rectangle.setStyle(rectangle_style);
        svg.add(rectangle);

        Group group_root = new Group();
        Style group_root_style = new Style();
        group_root_style.setStroke("black");
        group_root_style.setStrokeWidth(20.0);
        group_root_style.setFillOpacity(0.8);
        group_root.setStyle(group_root_style);
        svg.add(group_root);

        Rectangle gRect1 = new Rectangle(100, 100, 200, 200);
        Style gRect1_style = new Style();
        gRect1_style.setFill("#080");
        gRect1.setStyle(gRect1_style);
        group_root.add(gRect1);

        Rectangle gRect2 = new Rectangle(200, 200, 400, 400);
        Style gRect2_style = new Style();
        gRect2_style.setFill("#0C0");
        gRect2.setStyle(gRect2_style);
        group_root.add(gRect2);

        Group group_first = new Group();
        Rotate group_first_rotate = new Rotate(-45, 100, 50);
        Translate group_first_translate = new Translate(0, 700);
        group_first.setStyle(new Style().addTransform(group_first_rotate).addTransform(group_first_translate));
        group_root.add(group_first);

        Rectangle gRect3 = new Rectangle(100, 100, 200, 200);
        Style gRect3_style = new Style();
        gRect3_style.setFill("#800");
        gRect3.setStyle(gRect3_style);
        group_first.add(gRect3);

        Rectangle gRect4 = new Rectangle(200, 200, 400, 400);
        Style gRect4_style = new Style();
        gRect4_style.setFill("#C00");
        gRect4.setStyle(gRect4_style);
        group_first.add(gRect4);

        svg.saveAsFile("exercice_onze.svg");
    }
}
