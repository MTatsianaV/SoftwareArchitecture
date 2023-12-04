package seminar_1.homework.InMemoryModel;
public class Observer2 implements ModelChangedObserver{    @Override
    public void applyUpdateModel(ModelChanger changer) {
        System.out.println("Observer2 реагирует на изменения ...");
    }
}
