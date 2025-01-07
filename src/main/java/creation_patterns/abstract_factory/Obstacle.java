package creation_patterns.abstract_factory;

public class Obstacle implements SceneryGraphics{

    @Override
    public void drawObject() {
       System.out.println("########");
        System.out.println("#      #");
        System.out.println("#      #");
        System.out.println("########");
    }
    
    
}
