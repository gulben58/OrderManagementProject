create table ORDERMANAGEMENT_ORDER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    ORDER_ID varchar(255),
    CUSTOMER_ID uniqueidentifier not null,
    ORDER_DATE datetime2 not null,
    DELIVERYDATE datetime2 not null,
    --
    primary key nonclustered (ID)
);