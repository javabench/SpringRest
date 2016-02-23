CREATE TABLE companies
( compId int NOT NULL,
  compName varchar(50) NOT NULL,
  address varchar(50) not null,
  city varchar(50) not null,
  country varchar(50) not null,
  email varchar(50),
  phone varchar(50),
  CONSTRAINT compId PRIMARY KEY (compId)
);


CREATE TABLE owners
( ownerId int NOT NULL,
  compId int NOT NULL,
  ownerName varchar(50) NOT NULL,
  address varchar(50),
  CONSTRAINT ownerId PRIMARY KEY (ownerId)
);

CREATE TABLE companyOwners
( cownId int NOT NULL,
  compId int NOT NULL,
  ownerId int NOT NULL,
  CONSTRAINT cownId PRIMARY KEY (cownId)
);
