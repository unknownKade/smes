create database smes;


create table masterdata(
	id varchar(100) primary key,
	category varchar(100),
	name varchar(50),
	type varchar(50)
);

create table masterdatadetail(
	id varchar(100) primary key,
	masterdata varchar(100),
	name varchar(100),
	seq smallint,
	value varchar(100)
);

create table product(
	id varchar(100) primary key,
	name varchar(100),
	category varchar(100),
	lot varchar(100),
	unit varchar(50),
	perunit varchar(50),
	peramount numeric,
	inventory numeric
);

create table productdetail(
	id varchar(100) primary key,
	product varchar(100),
	detail varchar(100),
	value varchar(100)
);

create table productbom(
	id varchar(100) primary key,
	tree varchar(100),
	product varchar(100),
	level smallint,
	seq smallint,
	qty numeric
);

create table production(
	id varchar(100) primary key,
	date timestamp,
	facility varchar(100),
	worker varchar(100),
	product varchar(100),
	lot varchar(100),
	unit_qty numeric,
	perunit_qty numeric
);

create table productiondetail(
	id varchar(100) primary key,
	production varchar(100),
	seq smallint,
	product varchar(100),
	qty numeric,
	unit varchar
);

create table productionfail(
	id varchar(100) primary key,
	production varchar(100),
	seq smallint,
	faulty varchar(100),
	qty numeric,
	unit varchar(100)
);

create table inventory(
	id varchar(100) primary key,
	date timestamp,
	lot varchar(100),
	client varchar(100),
	type varchar(100),
	memo varchar(1000)
);

create table inventorydetail(
	id varchar(100) primary key,
	lot varchar(100),
	seq smallint,
	product varchar(100),
	production varchar(100),
	price numeric,
	unit varchar(100),
	qty numeric
);

alter table masterdatadetail add constraint fk_master_data foreign key(masterdata) references masterdata(id) on delete cascade on update cascade;
alter table productdetail add constraint fk_product foreign key(product) references product(id) on delete cascade on update cascade;
alter table productdetail add constraint fk_detail foreign key(detail) references masterdatadetail(id) on delete cascade on update cascade;
alter table productbom add constraint fk_product foreign key(product) references product(id) on delete cascade on update cascade;
alter table production add constraint fk_product foreign key(product) references product(id) on delete cascade on update cascade;
alter table production add constraint fk_facility foreign key(facility) references masterdata(id) on delete cascade on update cascade;
alter table productiondetail add constraint fk_production foreign key(production) references production(id) on delete cascade on update cascade;
alter table productiondetail add constraint fk_product foreign key(product) references product(id) on delete cascade on update cascade;
alter table productiondetail add constraint fk_unit foreign key(unit) references masterdatadetail(id) on delete cascade on update cascade;
alter table productionfail add constraint fk_production foreign key(production) references production(id) on delete cascade on update cascade;
alter table productionfail add constraint fk_faulty foreign key(faulty) references masterdata(id) on delete cascade on update cascade;
alter table productionfail add constraint fk_unit foreign key(unit) references masterdata(id) on delete cascade on update cascade;
alter table inventory add constraint fk_client foreign key(client) references masterdata(id) on delete cascade on update cascade;
alter table inventorydetail add constraint fk_product foreign key(product) references product(id) on delete cascade on update cascade;
alter table inventorydetail add constraint fk_unit foreign key(unit) references masterdata(id) on delete cascade on update cascade;
alter table inventorydetail add constraint fk_production foreign key(production) references production(id) on delete cascade on update cascade;
