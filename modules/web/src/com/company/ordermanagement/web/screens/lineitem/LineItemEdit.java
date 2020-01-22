package com.company.ordermanagement.web.screens.lineitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.ordermanagement.entity.LineItem;

@UiController("ordermanagement_LineItem.edit")
@UiDescriptor("line-item-edit.xml")
@EditedEntityContainer("lineItemDc")
@LoadDataBeforeShow
public class LineItemEdit extends StandardEditor<LineItem> {
}