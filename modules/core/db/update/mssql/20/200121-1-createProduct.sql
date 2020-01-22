create table ORDERMANAGEMENT_PRODUCT (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    PRODUCT_CODE varchar(20) not null,
    PRODUCT_NAME varchar(255) not null,
    --
    primary key nonclustered (ID)
);