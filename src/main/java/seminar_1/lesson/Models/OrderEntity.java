package seminar_1.lesson.Models;

import java.util.Collection;

public interface OrderEntity {

    String getAddress();

    String getPhone();

    Collection<OrderItem> getItems();

}
