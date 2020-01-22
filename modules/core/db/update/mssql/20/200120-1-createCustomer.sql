create table ORDERMANAGEMENT_CUSTOMER (
    ID uniqueidentifier,
    VERSION integer not null,
    CREATE_TS datetime2,
    CREATED_BY varchar(50),
    UPDATE_TS datetime2,
    UPDATED_BY varchar(50),
    DELETE_TS datetime2,
    DELETED_BY varchar(50),
    --
    FIRSTNAME varchar(255) not null,
    LASTNAME varchar(255) not null,
    BIRTHDATE datetime2,
    --
    primary key nonclustered (ID)
);