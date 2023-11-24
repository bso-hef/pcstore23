package de.bsohef.order;

import java.util.ArrayList;

public class OrderService {

    final ArrayList<Order> orders = new ArrayList<>();

    /**
     * create a new Order and returns the OrderNumber.
     * The orderNuber of die object will be overwritten.
     *
     * @param order
     * @return order number
     */
    public Long addOrder(Order order) {
        long id = orders.size();
        order.setId(id);
        this.orders.add(order);
        return id;
    }

    public Order getOrder(long id) {
        return orders.get((int) id);
    }
}
