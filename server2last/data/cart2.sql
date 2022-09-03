CREATE TABLE `aut_user` (
  `aut_user_id` int NOT NULL AUTO_INCREMENT,
  `aut_user_nume` varchar(20) NOT NULL,
  `aut_user_parola` varchar(20) NOT NULL,
  `aut_user_activ_yn` varchar(1) NOT NULL,
  `aut_user_startdt` datetime NOT NULL,
  `aut_user_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`aut_user_id`),
  UNIQUE KEY `aut_user_nume_unique` (`aut_user_nume`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `cart2.aut_user` (
  `aut_user_id` int NOT NULL AUTO_INCREMENT,
  `aut_user_nume` varchar(20) NOT NULL,
  `aut_user_parola` varchar(20) NOT NULL,
  `aut_user_activ_yn` varchar(1) NOT NULL,
  `aut_user_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `aut_user_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`aut_user_id`),
  UNIQUE KEY `aut_user_nume_unique` (`aut_user_nume`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




INSERT INTO cart2.aut_user (`aut_user_id`, `aut_user_nume`, `aut_user_parola`, 
                       `aut_user_activ_yn`, `aut_user_startdt`, `aut_user_enddt`) 
        VALUES  (1, 'superadmin', 'partid2020#','y');


CREATE TABLE `aut_rol` (
  `aut_rol_id` int NOT NULL AUTO_INCREMENT,
  `aut_rol_cod` varchar(9) NOT NULL,
  `aut_rol_nume` varchar(32) NOT NULL,
  `aut_rol_activ_yn` varchar(1) NOT NULL,
  `aut_rol_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `aut_rol_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`aut_rol_id`),
  UNIQUE KEY `aut_rol_cod_unique` (`aut_rol_cod`),
  UNIQUE KEY `aut_rol_nume_unique` (`aut_rol_nume`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

TRUNCATE TABLE cart2.aut_rol;
INSERT INTO cart2.aut_rol (`aut_rol_id`, `aut_rol_cod`, `aut_rol_nume`, 
                      `aut_rol_activ_yn`) 
        VALUES  (1,	'SUPERADM', 'Superadministrator','y'),
                (2, 'ADMIN', 'Administrator','y'),
                (3, 'COORDPRI', 'Coordonator principal','y'),
                (4, 'ORGVOT', 'Organizator votare','n'),
                (5, 'CREVOT', 'Creator votare','n'),
                (6, 'EVLVOT', 'Evaluator rezultate votare','n'),
                (7, 'VALVOT', 'Validator evaluare votare','n'),
                (8, 'VOTANT', 'Votant','n'),
                (9, 'CREACT', 'Creator acțiune','n'),
                (11, 'EXEACT', 'Executant (/Organizator) acțiune','y'),
                (12, 'EVLREZ', 'Evaluator rezultate acțiune','y'),
                (13, 'VALEVAL', 'Validator evaluare acțiune','y'),
                (14, 'SIMPATIZ', 'Simpatizant','y'),
                (15, 'MEMINCAFL', 'Membru începător afiliat','y'),
                (16, 'MBRINCNFL', 'Membru începător neafiliat','y'),
                (17, 'MEMACTAFL', 'Membru activ afiliat','y'),
                (18, 'MEMACTNFL', 'Membru activ neafiliat','y'),
                (19, 'MEMEXPAFL', 'Membru experimentat afiliat','y'),
                (20, 'MEMEXPNFL', 'Membru experimentat neafiliat','y'),
                (21, 'SEFGRUP', 'Șef de grup','y');



CREATE TABLE `aut_userrol` (
  `aut_userrol_id` int NOT NULL AUTO_INCREMENT,
  `aut_userrol_rolid` int NOT NULL,
  `aut_userrol_rolcod` varchar(9) NOT NULL,
  `aut_userrol_userid` int NOT NULL,
  `aut_userrol_activ_yn` varchar(1) NOT NULL,
  `aut_userrol_startdt` datetime NOT NULL,
  `aut_userrol_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`aut_userrol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `aut_userinfo` (
  `aut_userinfo_id`	int NOT NULL AUTO_INCREMENT,
  `aut_userinfo_userid`  int NOT NULL,
  `aut_userinfo_nume`	varchar(32),
  `aut_userinfo_prenume`	varchar(32),
  `aut_userinfo_telefon`	varchar(12) NOT NULL,
  `aut_userinfo_sex`	varchar(1),
  `aut_userinfo_email`	varchar(32),
  `aut_userinfo_datanasterii`	int(8),
  `aut_userinfo_dom_zonataraid`	int,
  `aut_userinfo_dom_zonataracod`	varchar(2),
  `aut_userinfo_dom_judetid`	int,
  `aut_userinfo_dom_judetcod`	varchar(2),
  `aut_userinfo_dom_localitateid`	int,
  `aut_userinfo_dom_localitatecod`	int(8),
  `aut_userinfo_dom_codpostal`	varchar(16),
  `aut_userinfo_dom_adresa`	varchar(128),
  `aut_userinfo_rez_dif_de_dom`	char(1),
  `aut_userinfo_rez_zonataraid`	int,
  `aut_userinfo_rez_zonataracod`	varchar(2),
  `aut_userinfo_rez_judetid`	int,
  `aut_userinfo_rez_judetcod`	varchar(2),
  `aut_userinfo_rez_localitateid`	int,
  `aut_userinfo_rez_localitatecod`	int(8),
  `aut_userinfo_rez_codpostal`	varchar(16),
  `aut_userinfo_rez_adresa`	varchar(128),
  PRIMARY KEY (`aut_userinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `adm_superadmin` (
  `adm_superadmin_id`	int NOT NULL AUTO_INCREMENT,
  `adm_superadmin_userid`	int,
  `adm_superadmin_activ_yn`	char(1),
  `adm_superadmin_startdt`	datetime,
  `adm_superadmin_enddt`	datetime,
  PRIMARY KEY (`aut_superadmin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `adm_admin` (
  `adm_admin_id`	int NOT NULL AUTO_INCREMENT,
  `adm_admin_userid`	int,
  `adm_admin_activ_yn`	char(1),
  `adm_admin_startdt`	datetime,
  `adm_admin_enddt`	datetime,
  PRIMARY KEY (`aut_admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `geo_zonatara` (
  `geo_zonatara_id`	int NOT NULL AUTO_INCREMENT,
  `geo_zonatara_cod`	varchar(2),
  `geo_zonatara_nume`	varchar(10),
  primary key (`geo_zonatara_id`),
  UNIQUE KEY `geo_zonatara_cod_unique` (`geo_zonatara_cod`),
  UNIQUE KEY `geo_zonatara_nume_unique` (`geo_zonatara_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;


INSERT INTO `geo_zonatara` (`geo_zonatara_id`, `geo_zonatara_cod`,`geo_zonatara_nume`)
       VALUES              (                1,               `TR`,             `Țară`),
                           (                2,               `DS`,         `Diaspora`);


CREATE TABLE `geo_judet` (
  `geo_judet_id`	  int NOT NULL AUTO_INCREMENT,
  `geo_judet_zonataraid`	int,
  `geo_judet_zonataracod`   varchar(2),
  `geo_judet_zonataranume`	varchar(10),
  `geo_judet_cod`	varchar(2),
  `geo_judet_nume`	varchar(32),
  primary key (`geo_judet_id`),
  UNIQUE KEY `geo_judet_cod_unique` (`geo_judet_cod`),
  UNIQUE KEY `geo_judet_nume_unique` (`geo_judet_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;


CREATE TABLE `geo_localitate` (
  `geo_localitate_id` int not null AUTO_INCREMENT,	
  `geo_localitate_zonataraid`	int not null,
  `geo_localitate_zonataracod` varchar(2)	not null,
  `geo_localitate_zonataranume`	varchar(10) not null,
  `geo_localitate_judetid`	int not null,
  `geo_localitate_judetcod`	varchar(2)	not null,
  `geo_localitate_judetnume`	varchar(32)	not null,
  `geo_localitate_cod`	int	not null,
  `geo_localitate_nume`	varchar(32)	idx, not null	
  `geo_localitate_longitudine`	decimal(18,16)	not null	
  `geo_localitate_latitudine`	decimal(18,16)	not null	
  `geo_localitate_regiune`	varchar(64)	not null	
  primary key (`geo_localitate_id`)
  UNIQUE KEY `geo_localitate_cod_unique` (`geo_localitate_cod`),
  UNIQUE KEY `geo_localitate_nume_unique` (`geo_localitate_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;



CREATE TABLE `geo_zonajudet` (
    `geo_zonajudet_id`	int not null AUTO_INCREMENT,
    `geo_zonajudet_zonataraid`	int	not null, 
    `geo_zonajudet_zonataracod`	varchar(2) not null, 
    `geo_zonajudet_zonataranume`	varchar(10)	not null, 
    `geo_zonajudet_judetid`	int	not null, 
    `geo_zonajudet_judetcod`	varchar(2) not null, 
    `geo_zonajudet_judetnume`	varchar(32)	not null, 
    `geo_zonajudet_cod`	varchar(9) not null, 
    `geo_zonajudet_nume` varchar(32) not null, 		
  primary key (`geo_zonajudet_id`),
  UNIQUE KEY `geo_zonajudet_cod_unique` (`geo_zonajudet_cod`),
  UNIQUE KEY `geo_zonajudet_nume_unique` (`geo_zonajudet_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;


CREATE TABLE `geo_zonalocalitate` (
    `geo_zonalocalitate_id`	int not null AUTO_INCREMENT,
    `geo_zonalocalitate_zonataraid`	int not null, 
    `geo_zonalocalitate_zonataracod`	varchar(2) not null, 
    `geo_zonalocalitate_zonataranume`	varchar(10) not null, 
    `geo_zonalocalitate_judetid`	int	not null, 
    `geo_zonalocalitate_judetcod`	varchar(2)	not null, 
    `geo_zonalocalitate_judetnume`	varchar(32)	not null, 
    `geo_zonalocalitate_zonajudetid`	int	not null, 
    `geo_zonalocalitate_zonajudetcod`	varchar(9)	not null, 
    `geo_zonalocalitate_zonajudetnume`	varchar(32)	not null, 
    `geo_zonalocalitate_localitateid`	int	not null, 
    `geo_zonalocalitate_localitatecod`	int	not null, 
    `geo_zonalocalitate_localitatenume`	varchar(32)	not null, 
    `geo_zonalocalitate_cod`	varchar(9) not null, 
    `geo_zonalocalitate_nume`	varchar(32)	not null, 
  primary key (`geo_zonalocalitate_id`),
  UNIQUE KEY `geo_zonalocalitate_cod_unique` (`geo_zonalocalitate_cod`),
  UNIQUE KEY `geo_zonalocalitate_nume_unique` (`geo_zonalocalitate_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;

 
CREATE TABLE `geo_sectievotare` (
   `geo_sectievotare_id`	int not null AUTO_INCREMENT,  
   `geo_sectievotare_zonataraid`	int	not null, 
   `geo_sectievotare_zonataracod`	varchar(2) not null, 
   `geo_sectievotare_zonataranume`	varchar(10)	not null, 
   `geo_sectievotare_judetid`	int	not null, 
   `geo_sectievotare_judetcod`	varchar(2)	(redundant)	
   `geo_sectievotare_judetnume`	varchar(32)	(redundant)	
   `geo_sectievotare_zonajudetid`	int	fk, idx	
   `geo_sectievotare_zonajudetcod`	varchar(9)	(redundant)	
   `geo_sectievotare_zonajudetnume`	varchar(32)	(redundant)	
   `geo_sectievotare_localitateid`	int	fk, idx	
   `geo_sectievotare_localitatecod`	int	(redundant)	siruta
   `geo_sectievotare_localitatenume`	varchar(32)	(redundant)	
   `geo_sectievotare_zonalocalitateid`	int	fk, idx	
   `geo_sectievotare_zonalocalitatecod`	varchar(9)	(redundant)	
   `geo_sectievotare_zonalocalitatenume`	varchar(32)	(redundant)	
   `geo_sectievotare_nr`	int	idx, not null	
   `geo_sectievotare_sediu`	varchar(128)	idx, not null	
   `geo_sectievotare_nrbe`	int	not null	
   `geo_sectievotare_codsiruta`	int	not null	
   `geo_sectievotare_uatcod`	varchar(2)		
   `geo_sectievotare_uatnume`	varchar(128)		
  primary key (`geo_sectievotare_id`),
  UNIQUE KEY `geo_sectievotare_nr_unique` (`geo_sectievotare_nr`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;


 
CREATE TABLE `geo_codpostal` (
  `geo_codpostal_id`	int	pk	
  `geo_codpostal_zonataraid`	int	not null, 	
  `geo_codpostal_zonataracod`	varchar(2) not null, 
  `geo_codpostal_zonataranume`	varchar(10)	not null, 
  `geo_codpostal_judetid`	int	not null, 
  `geo_codpostal_judetcod`	varchar(2) not null, 
  `geo_codpostal_judetnume`	varchar(32)	not null, 
  `geo_codpostal_zonajudetid`	int	not null, 
  `geo_codpostal_zonajudetcod`	varchar(9) not null, 
  `geo_codpostal_zonajudetnume`	varchar(32)	not null, 
  `geo_codpostal_localitateid`	int	not null, 
  `geo_codpostal_localitatecod`	int	not null, 
  `geo_codpostal_localitatenume`	varchar(32)	not null, 
  `geo_codpostal_zonalocalitateid`	int	not null, 
  `geo_codpostal_zonalocalitatecod`	varchar(9)	not null, 
  `geo_codpostal_zonalocalitatenume`	varchar(32)	not null, 
  `geo_codpostal_sectievotareid`	int	 not null, 
  `geo_codpostal_sectievotarenr`	int	 not null, 
  `geo_codpostal_sectievotaresediu`	varchar(128) not null, 
  `geo_codpostal_cod` 	varchar(16)	not null, 
  `geo_codpostal_tipstrada` int	idx, not null	
  `geo_codpostal_strada`	varchar(128)	not null	
  `geo_codpostal_numerebloc`	varchar(128)	not null	
  primary key (`geo_codpostal_id`),
  UNIQUE KEY `geo_codpostal_cod_unique` (`geo_codpostal_cod`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;

 
