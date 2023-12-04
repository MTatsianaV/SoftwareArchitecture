package seminar_1.homework.ModelElements;
/**
 * Камера
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {
        // Rotate the camera by the specified angle
    }

    public void move(Point3D point) {
        // Move the camera to the specified point
    }
}
