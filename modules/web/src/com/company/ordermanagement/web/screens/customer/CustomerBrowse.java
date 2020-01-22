package com.company.ordermanagement.web.screens.customer;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Customer;

import javax.inject.Inject;

@UiController("ordermanagement_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
    @Inject
    private GroupTable<Customer> customersTable;

    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe("customersTable.edit")
    public void onCustomersTableEdit(Action.ActionPerformedEvent event) {
        screenBuilders.editor(customersTable).withLaunchMode(OpenMode.NEW_TAB).build().show();
    }

    @Subscribe("customersTable.create")
    public void onCustomersTableCreate(Action.ActionPerformedEvent event) {
        screenBuilders.editor(Customer.class,this).newEntity().withLaunchMode(OpenMode.NEW_TAB).build().show();
    }
}