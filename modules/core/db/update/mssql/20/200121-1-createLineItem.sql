create table ORDERMANAGEMENT_LINE_ITEM (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID uniqueidentifier not null,
    PRICE decimal(19, 2) not null,
    QUANTITY integer not null,
    ORDER_ID uniqueidentifier not null,
    --
    primary key nonclustered (ID)
);