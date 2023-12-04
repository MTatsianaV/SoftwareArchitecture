package seminar_1.homework.InMemoryModel;
import seminar_1.homework.ModelElements.PoligonalModel;
import seminar_1.homework.ModelElements.Scene;
import seminar_1.homework.ModelElements.Flash;
import seminar_1.homework.ModelElements.Camera;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Хранилище 3D-элементов
 * TODO: Доработать самостоятельно в рамках домашней работы
 */
public class ModelStore implements ModelChanger {
    private Collection<ModelChangedObserver> observers = new ArrayList<>();
    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();

    @Override
    public void registerModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }

    private void notifyChange(ModelChanger changer) {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel(changer);
        }
    }

    public void addModel(PoligonalModel poligonalModel) {
        models.add(poligonalModel);
        notifyChange(this);
    }

    public Scene getScene(int id) {
        for (Scene scene : scenes) {
            if (scene.getId() == id) {
                return scene;
            }
        }
        return null;
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
        notifyChange(this);
    }

    public void addFlash(Flash flash) {
        flashes.add(flash);
        notifyChange(this);
    }

    public void addCamera(Camera camera) {
        cameras.add(camera);
        notifyChange(this);
    }
}
