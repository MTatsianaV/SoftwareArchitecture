package seminar_1.homework.InMemoryModel;
public class Observer1 implements ModelChangedObserver{    @Override
    public void applyUpdateModel(ModelChanger changer) {
        System.out.println("Observer1 реагирует на изменения ...");
    }
}
