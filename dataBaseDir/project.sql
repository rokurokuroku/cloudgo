/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/7/24 16:31:42                           */
/*==============================================================*/


drop table if exists BankRole;

drop table if exists Orders;

drop table if exists Users;

drop table if exists products;

drop table if exists sellers;

/*==============================================================*/
/* Table: BankRole                                              */
/*==============================================================*/
create table BankRole
(
   user_id              bigint(12) not null,
   user_balance         float(15) not null default 0,
   user_score           bigint(15) not null default 0,
   payment_code         integer(6) not null,
   primary key (user_id)
);

/*==============================================================*/
/* Table: Orders                                                */
/*==============================================================*/
create table Orders
(
   order_id             bigint(30) not null auto_increment,
   buyer_id             bigint(12) not null,
   seller_id            bigint(12) not null,
   product_id           bigint(30) not null,
   product_numbers      integer(5) not null default 0,
   trading_hour         date not null default '1900-1-1',
   shipping_address     varchar(50) not null,
   transaction_amount   float(15) not null default 0,
   primary key (order_id)
)
auto_increment = 10000;

/*==============================================================*/
/* Table: Users                                                 */
/*==============================================================*/
create table Users
(
   user_id              bigint(12) not null auto_increment,
   user_name            varchar(30) not null,
   user_password        varchar(16) not null,
   user_telephone       bigint(11) not null,
   user_email           varchar(30) not null default '无',
   user_level           integer(3) not null default 0,
   user_gender          char(1) not null default '0',
   shipping_address     varchar(50) not null default '无',
   user_description     varchar(200) not null default '无',
   primary key (user_id, user_name)
)
auto_increment = 10000;

/*==============================================================*/
/* Table: products                                              */
/*==============================================================*/
create table products
(
   product_id           bigint(30) not null,
   seller_id            bigint(12) not null,
   product_name         varchar(100) not null default '无',
   product_price        float(15) not null default 0.0,
   product_remaining    bigint(10) not null default 0,
   product_sales        bigint(10) not null default 0,
   product_description  varchar(200) not null default '无',
   product_image        bigint(20) not null default 0,
   product_mark         float(3) not null default 0,
   primary key (product_id)
);

/*==============================================================*/
/* Table: sellers                                               */
/*==============================================================*/
create table sellers
(
   seller_id            bigint(12) not null auto_increment,
   seller_name          varchar(30) not null,
   seller_password      varchar(30) not null,
   seller_telephone     bigint(11) not null,
   seller_email         varchar(30) not null default '无',
   seller_level         integer(3) not null default 0,
   seller_gender        char(1) not null default '0',
   seller_description   varchar(200) not null default '无',
   primary key (seller_id, seller_name)
)
auto_increment = 10000;