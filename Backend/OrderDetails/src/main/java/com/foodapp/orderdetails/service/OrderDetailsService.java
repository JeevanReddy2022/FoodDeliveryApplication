package com.foodapp.orderdetails.service;

import java.util.List;

import com.foodapp.orderdetails.dto.AddOrderDetailsDTO;
import com.foodapp.orderdetails.dto.ItemsInRestaurantOrderDTO;
import com.foodapp.orderdetails.dto.OrderDetailsDTO;
import com.foodapp.orderdetails.model.OrderDetails;
import com.foodapp.orderdetails.model.OrderItem;

public interface OrderDetailsService {

    public AddOrderDetailsDTO addOrder(Integer cartId);

    public OrderDetails updateOrder(OrderDetails orderDetails);

    public OrderDetails removeOrder(Integer orderId);

    public OrderDetailsDTO viewOrder(Integer orderId);

    public List<OrderDetailsDTO> viewOrderOfCustomer(Integer userId);

	List<ItemsInRestaurantOrderDTO> viewOrderOfRestaurant(Integer restaurantId);

	//List<OrderDetails> viewOrderOfRestaurant(Integer restaurantId);


}
