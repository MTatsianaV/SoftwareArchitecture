package seminar_8.views;

import seminar_8.models.Table;
import seminar_8.presenters.View;
import seminar_8.presenters.ViewObserver;

import java.util.*;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        else
            System.out.println("Не удалось забронировать столик. Повторите попытку позже.");

    }


    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int newReservationNo = reservationTable(reservationDate, tableNo, name);
        if (newReservationNo > 0) {
            System.out.println("Старая бронь успешно удалена.");
        } else {
            System.out.println("Не удалось удалить старую бронь. Повторите попытку позже.");
        }
    }

    public int promptInt(String message) {
        System.out.print(message + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String promptString(String message) {
        System.out.print(message + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }



    public int reservationTable(Date orderDate, int tableNo, String name){
        for (ViewObserver observer : observers){
            observer.onReservationTable(orderDate, tableNo, name);
        }
        return tableNo;
    }

}
