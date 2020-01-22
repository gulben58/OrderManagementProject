alter table ORDERMANAGEMENT_ORDER add constraint FK_ORDERMANAGEMENT_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references ORDERMANAGEMENT_CUSTOMER(ID);
create index IDX_ORDERMANAGEMENT_ORDER_ON_CUSTOMER on ORDERMANAGEMENT_ORDER (CUSTOMER_ID);