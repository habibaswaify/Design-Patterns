package behavioral_patterns.chain_of_responsibility;

public class SupportRequest {
    private String description;
    private int complexityLevel;
    private boolean isResolved;

    public SupportRequest(String description, int complexityLevel) {
        this.description = description;
        this.complexityLevel = complexityLevel;
        this.isResolved = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getComplexityLevel() {
        return complexityLevel;
    }

    public void setComplexityLevel(int complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }

}
