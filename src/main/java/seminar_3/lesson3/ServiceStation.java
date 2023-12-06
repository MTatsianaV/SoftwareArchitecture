package seminar_3.lesson3;

public class ServiceStation implements Refueling, Wiping {
    @Override
    public void fuel(FuelType fuelType) {
        System.out.println("Заправляем автомобиль " + fuelType);
    }

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
