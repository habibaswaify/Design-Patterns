package creation_patterns.abstract_factory;

public class InputHandled implements InputHandling{
    private String handlingRepresentation;
    @Override
    public void setKeyboardHandling() {
        handlingRepresentation = "keyboard";
    }

    @Override
    public void setTouchHandling() {
        handlingRepresentation = "touch";
    }

    @Override
    public void setConsoleHandling() {
        handlingRepresentation = "console";
    }

    @Override
    public String getInputHandling() {
       return handlingRepresentation;
    }
    
    
}
