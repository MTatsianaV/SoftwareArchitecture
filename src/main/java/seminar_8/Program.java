package seminar_8;

import seminar_8.models.TableService;
import seminar_8.presenters.BookingPresenter;
import seminar_8.presenters.Model;
import seminar_8.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашнее задание - метод changeReservationTable заработал!
     * @param args
     */
    public static void main(String[] args) {

        Model tableService = new TableService();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableService, bookingView);
        bookingPresenter.updateUILoadTables();

        Date reservationDate = new Date(); // Получение даты из консоли
        int oldReservation = bookingView.promptInt("Введите номер старой брони");
        int tableNo = bookingView.promptInt("Введите номер столика для новой брони");
        String name = bookingView.promptString("Введите ваше имя");

        bookingView.changeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    }


