package com.company.ordermanagement.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Order;

@UiController("ordermanagement_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}