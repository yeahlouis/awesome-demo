package site.hanschen.patterns.decorator.ugly;

/**
 * @author HansChen
 */
public class RedTrilateralShadow implements Shape {

    @Override
    public void draw() {
        System.out.println("红色 三角形 有阴影");
    }
}
