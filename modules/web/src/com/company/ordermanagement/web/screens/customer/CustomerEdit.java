package com.company.ordermanagement.web.screens.customer;

import com.company.ordermanagement.entity.Address;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.Customer;

import javax.inject.Inject;

@UiController("ordermanagement_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private CollectionPropertyContainer<Address> addressesDc;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private Table<Address> addressesTable;

    @Subscribe("addressesTable.create")
    public void onAddressesTableCreate(Action.ActionPerformedEvent event) {
        screenBuilders.editor(Address.class,this).newEntity().withLaunchMode(OpenMode.DIALOG).build().show();
    }


}