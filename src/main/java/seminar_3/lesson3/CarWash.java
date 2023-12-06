package seminar_3.lesson3;

public class CarWash implements Wiping {
    @Override
    public void wipMirrors() {
        System.out.println("Протираем зеркала");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Моем лобовое стекло");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Моем фары");
    }
}
