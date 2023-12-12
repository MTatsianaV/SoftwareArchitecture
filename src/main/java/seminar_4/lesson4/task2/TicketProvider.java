package seminar_4.lesson4.task2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TicketProvider {
    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider){
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    // Предусловие: clientId должен быть положительным числом
    public Collection<Ticket> searchTicket(int clientId, Date date){
        if (clientId <= 0) {
            throw new IllegalArgumentException("clientId должен быть положительным числом");
        }


        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket: database.getTickets()) {
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date))
                tickets.add(ticket);
        }
        return tickets;
    }

    // Предусловие: clientId должен быть положительным числом, cardNo должен быть непустой строкой
    public boolean buyTicket(int clientId, String cardNo){
        if (clientId <= 0 || cardNo.isEmpty()) {
            throw new IllegalArgumentException("clientId должен быть положительным числом, а cardNo не должен быть пустым");
        }

        int orderId = database.createTicketOrder(clientId);
        double amount = database.getTicketAmount();
        return paymentProvider.buyTicket(orderId, cardNo, amount);
    }

    // Инусловие: qrcode должен быть непустой строкой
    public boolean checkTicket(String qrcode){
        if (qrcode.isEmpty()) {
            throw new IllegalArgumentException("qrcode не должен быть пустым");
        }

        for (Ticket ticket: database.getTickets()) {
            if (ticket.getQrcode().equals(qrcode)){
                ticket.setEnable(false);
                // Save database ...
                return true;
            }
        }
        return false;
    }
}