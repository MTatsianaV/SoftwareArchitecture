package seminar_1.homework.ModelElements;
import java.util.ArrayList;
import java.util.Collection;
public class PoligonalModel {
    private String name;
    private int verticesCount;
    private int edgesCount;
    private boolean visible;

    public PoligonalModel(String name, int verticesCount, int edgesCount, boolean visible) {
        this.name = name;
        this.verticesCount = verticesCount;
        this.edgesCount = edgesCount;
        this.visible = visible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVerticesCount() {
        return verticesCount;
    }

    public void setVerticesCount(int verticesCount) {
        this.verticesCount = verticesCount;
    }

    public int getEdgesCount() {
        return edgesCount;
    }

    public void setEdgesCount(int edgesCount) {
        this.edgesCount = edgesCount;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void translate(Point3D point) {
        // Translate the model by the specified point
    }

    public void rotate(Angle3D angle) {
        // Rotate the model by the specified angle
    }

    public void scale(float scaleFactor) {
        // Scale the model by the specified factor
    }
}
