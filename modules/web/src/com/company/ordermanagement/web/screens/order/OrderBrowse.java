package com.company.ordermanagement.web.screens.order;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Order;

import javax.inject.Inject;

@UiController("ordermanagement_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {

}