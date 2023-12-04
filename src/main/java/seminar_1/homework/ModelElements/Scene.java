package seminar_1.homework.ModelElements;
/**
 * Сцена
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class Scene {
    private int id;
    private PoligonalModel models;
    private Flash flashes;

    public Scene(int id, PoligonalModel models, Flash flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public int getId() {
        return id;
    }

    public PoligonalModel getModels() {
        return models;
    }
    public void setModels(PoligonalModel models) {
        this.models = models;
    }

    public Flash getFlashes() {
        return flashes;
    }

    public void setFlashes(Flash flashes) {
        this.flashes = flashes;
    }
}
