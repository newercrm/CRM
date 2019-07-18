/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/7/18 14:10:17                           */
/*==============================================================*/


drop table if exists area;

drop table if exists bargain;

drop table if exists client;

drop table if exists emp;

drop table if exists log;

drop table if exists menu;

drop table if exists product;

drop table if exists role;

/*==============================================================*/
/* Table: area                                                  */
/*==============================================================*/
create table area
(
   aid                  bigint not null,
   areaname             varchar(255),
   level                int,
   parentId             bigint,
   primary key (aid)
);

/*==============================================================*/
/* Table: bargain                                               */
/*==============================================================*/
create table bargain
(
   bid                  varchar(255) not null,
   bmessage             varchar(255),
   bstate               int,
   b_cid                bigint,
   primary key (bid)
);

/*==============================================================*/
/* Table: client                                                */
/*==============================================================*/
create table client
(
   cid                  bigint not null,
   cname                varchar(255),
   cpass                varchar(255),
   c_eid                bigint,
   c_aid                bigint,
   cnumstate            int,
   cstate               int,
   primary key (cid)
);

/*==============================================================*/
/* Table: emp                                                   */
/*==============================================================*/
create table emp
(
   eid                  bigint not null,
   enumber              varchar(255),
   epass                varchar(255),
   ename                varchar(255),
   etel                 numeric(11,0),
   e_rid                bigint,
   e_aid                bigint,
   estate               int,
   primary key (eid)
);

/*==============================================================*/
/* Table: log                                                   */
/*==============================================================*/
create table log
(
   lid                  bigint not null,
   logmessage           varchar(255),
   l_eid                bigint,
   logtime              datetime,
   primary key (lid)
);

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   mid                  bigint not null,
   mname                varchar(255),
   mlevel               int,
   mparentid            bigint,
   primary key (mid)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   pid                  bigint not null,
   pname                varchar(255),
   details              varchar(255),
   price                numeric(10,2),
   amount               numeric(10,0),
   stock                numeric(10,0),
   sales                numeric(10,0),
   primary key (pid)
);

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   rid                  bigint not null,
   rolename             varchar(255),
   primary key (rid)
);

