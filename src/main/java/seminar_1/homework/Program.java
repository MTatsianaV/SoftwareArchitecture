package seminar_1.homework;
import seminar_1.homework.InMemoryModel.ModelStore;
import seminar_1.homework.InMemoryModel.Observer1;
import seminar_1.homework.InMemoryModel.Observer2;
import seminar_1.homework.ModelElements.PoligonalModel;
public class Program {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        ModelStore modelStore = new ModelStore();
        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);
        String name1 = null;
        modelStore.addModel(new PoligonalModel(name1, 200, 300, true));
    }
}
