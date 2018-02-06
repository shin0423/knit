drop database if exists knit;
create database if not exists knit;

use knit;

drop table if exists user_info;

create table user_info(
id int primary key auto_increment,
user_id varchar(16) unique not null,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint(1) not null,
email varchar(32) not null,
status tinyint(1) not null,
logined tinyint(1) not null,
regist_date datetime not null,
update_date datetime,
admin_flg tinyint(1) not null
);

drop table if exists item_info;

create table item_info(
id int primary key auto_increment,
item_id int unique not null,
item_name varchar(100) unique not null,
item_name_kana varchar(100) unique not null,
item_description varchar(200) not null,
category_id int not null,
price int,
item_stock int not null,
image_file_path varchar(100),
image_file_name varchar(50),
release_date datetime not null,
release_company varchar(50),
status tinyint(1) not null,
regist_date datetime not null,
update_date datetime
);

drop table if exists cart_info;

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
temp_user_id varchar(128) unique,
item_id int not null,
item_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime
);

drop table if exists purchase_history_info;

create table purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
item_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime,
order_num varchar(8)
);

drop table if exists destination_info;

create table distination_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
email varchar(32) not null,
tel_number varchar(13) not null,
regist_date datetime not null,
update_date datetime
);

drop table if exists m_category;

create table m_category(
id int not null primary key auto_increment,
category_id int not null unique,
category_name varchar(20) not null unique,
category_description varchar(100),
insert_date datetime not null,
update_date datetime
);

drop table if exists review_transaction;

create table review_transaction(
id int not null primary key auto_increment,
user_id varchar(16) unique,
item_id int not null,
review int not null,
review_body varchar(100),
insert_date datetime not null
);

insert into user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,status,logined,regist_date,admin_flg) values("internous","internous01","南里","健太","なんり","けんた",0,"nyandy1794@gmail.com",1,1,cast("2018-02-05" as date),1);

insert into item_info(item_id,item_name,item_name_kana,item_description,category_id,price,item_stock,image_file_path,image_file_name,release_date,release_company,status,regist_date) values(1,"コーヒー","コーヒー","濃厚で香り高いコーヒー",1,500,10,"file:///C:/Users/internousdev/Desktop/workspace/coffee.jpg","コーヒー","2018-02-06","株式会社South",1,"2018-02-06");
insert into item_info(item_id,item_name,item_name_kana,item_description,category_id,price,item_stock,image_file_path,image_file_name,release_date,release_company,status,regist_date) values(2,"レモン","レモン","すっぱいレモン",1,200,20,"file:///C:/Users/internousdev/Desktop/workspace/lemon.jpg","レモン","2018-02-06","株式会社South",1,"2018-02-06");

