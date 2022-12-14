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
  `aut_rol_cod` varchar(10) NOT NULL,
  `aut_rol_nume` varchar(32) NOT NULL,
  `aut_rol_activ_yn` varchar(1) NOT NULL,
  `aut_rol_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `aut_rol_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`aut_rol_id`),
  UNIQUE KEY `aut_rol_cod_unique` (`aut_rol_cod`),
  UNIQUE KEY `aut_rol_nume_unique` (`aut_rol_nume`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE `aut_rol`;
CREATE TABLE `aut_rol` (
  `aut_rol_id` int NOT NULL AUTO_INCREMENT,
  `aut_rol_cod` varchar(10) NOT NULL,
  `aut_rol_nume` varchar(64) NOT NULL,
  `aut_rol_descriere` varchar(256),
  `aut_rol_activ_yn` varchar(1) NOT NULL,
  `aut_rol_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `aut_rol_enddt` datetime DEFAULT NULL,
  `aut_rol_displaynume` varchar(64) NOT NULL,
  `aut_rol_displaydescriere` varchar(256),
  PRIMARY KEY (`aut_rol_id`),
  UNIQUE KEY `aut_rol_cod_unique` (`aut_rol_cod`),
  UNIQUE KEY `aut_rol_nume_unique` (`aut_rol_nume`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


TRUNCATE TABLE aut_rol;
INSERT INTO aut_rol ( `aut_rol_id`, `aut_rol_cod`, `aut_rol_nume`, `aut_rol_descriere`,
                      `aut_rol_activ_yn`, `aut_rol_displaynume`, `aut_rol_displaydescriere`) 
        VALUES  (1,	'SUPERADMIN', 'Superadministrator','Sunte??i Superadministrator IT. Intra??i pe pagina Superadministratorului IT...'
                            ,'y', 'Superadministrator','Sunte??i Superadministrator IT. Intra??i pe pagina Superadministratorului IT...'),

                (2, 'ADMIN',      'Administrator','Sunte??i Administrator IT. Intra??i pe pagina Administratorului IT...'
                            ,'y', 'Administrator','Sunte??i Administrator IT. Intra??i pe pagina Administratorului IT...'),

                (3, 'COORDPRINC', 'Coordonator principal','Sunte??i Coordonator Principal. Intra??i pe pagina Coordonatorului Principal...'
                            ,'y', 'Coordonator principal','Sunte??i Coordonator Principal. Intra??i pe pagina Coordonatorului Principal...'),

                (4, 'ORGANIZVOT', 'Organizator votare',           '','n', 'Organizator votare',''),
                (5, 'CREATORVOT', 'Creator votare',               '','n', 'Creator votare',''),
                (6, 'EVALUATVOT', 'Evaluator rezultate votare',   '','n', 'Evaluator rezultate votare',''),
                (7, 'VALIDATVOT', 'Validator evaluare votare',    '','n', 'Validator evaluare votare',''),
                (8, 'VOTANT',     'Votant',                       '','n', 'Votant',''),
                (9, 'CREATORACT', 'Creator ac??iune',              '','n', 'Creator ac??iune',''),

                (11, 'EXECUTACT', 'Executant ac??iune',            '','n', 'Executant ac??iune',''),

                (12, 'EVALUATREZ','Evaluator rezultate ac??iune', 'Sunte??i Evaluator al Rezultatelor Ac??iunilor. Intra??i pe pagina Evaluatorului...'
                             ,'y', 'Evaluator rezultate ac??iune','Sunte??i Evaluator al Rezultatelor Ac??iunilor. Intra??i pe pagina Evaluatorului...'),

                (13, 'VALIDATEVL','Validator evaluare ac??iune', 'Sunte??i Validator al Evalu??rilor f??cute Rezultatelor Ac??iunilor. Intra??i pe pagina Validatorului...'
                             ,'y', 'Validator evaluare ac??iune','Sunte??i Validator al Evalu??rilor f??cute Rezultatelor Ac??iunilor. Intra??i pe pagina Validatorului...'),

                (14, 'SIMPATIZ',  'Simpatizant al Partidului','Sunte??i Simpatizant al Partidului. Intra??i pe pagina Simpatizantului de Partid...'
                            ,'y', 'Simpatizant al Partidului','Sunte??i Simpatizant al Partidului. Intra??i pe pagina Simpatizantului de Partid...'),

                (15, 'MEMINCAFL', 'Membru ??ncep??tor Afiliat','Sunte??i Membru ??ncep??tor al Partidului Afiliat unui Grup. Intra??i pe pagina Membru ??ncep??tor Afiliat...'
                            ,'y', 'Membru ??ncep??tor Afiliat','Sunte??i Membru ??ncep??tor al Partidului Afiliat unui Grup. Intra??i pe pagina Membru ??ncep??tor Afiliat...'),

                (16, 'MEMINCNFL', 'Membru ??ncep??tor Neafiliat','Sunte??i Membru ??ncep??tor al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului ??ncep??tor Neafiliat...'
                            ,'y', 'Membru ??ncep??tor Neafiliat','Sunte??i Membru ??ncep??tor al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului ??ncep??tor neafiliat...'),

                (17, 'MEMACTAFL', 'Membru Activ Afiliat','Sunte??i Membru Activ al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Activ Afiliat...'
                            ,'y', 'Membru Activ Afiliat','Sunte??i Membru Activ al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Activ Afiliat...'),

                (18, 'MEMACTNFL', 'Membru Activ Neafiliat','Sunte??i Membru Activ al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Activ Neafiliat...'
                            ,'y', 'Membru Activ Neafiliat','Sunte??i Membru Activ al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Activ Neafiliat...'),

                (19, 'MEMEXPAFL', 'Membru Experimentat Afiliat','Sunte??i Membru Experimentat al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Experimentat Afiliat...'
                            ,'y', 'Membru Experimentat Afiliat','Sunte??i Membru Experimentat al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Experimentat Afiliat...'),

                (20, 'MEMEXPNFL', 'Membru Experimentat Neafiliat','Sunte??i Membru Experimentat al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Experimentat Neafiliat...'
                            ,'y', 'Membru Experimentat Neafiliat','Sunte??i Membru Experimentat al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Experimentat Neafiliat...'),

                (21, 'SEFGRUP',  '??ef de Grup', 'Sunte??i ??eful Unui Grup Al Partidului. Intra??i pe pagina ??efului de Grup...'                 
                           ,'y', '??ef de Grup', 'Sunte??i ??eful Unui Grup Al Partidului. Intra??i pe pagina ??efului de Grup...'),

                (22, 'ORGANIZACT','Organizator de Activit????i','Sunte??i Organizator de Activit????i ale Partidului. Intra??i pe pagina Organizatorului de Activit????i...'
                            ,'y', 'Organizator de Activit????i','Sunte??i Organizator de Activit????i ale Partidului. Intra??i pe pagina Organizatorului de Activit????i...'),

                (23, 'SIMPATPEND','Simpatizant ??n A??teptare','V-a??i ??nregistrat ca Simpatizant al Partidului. V?? rug??m s?? confirma??i ??nregistrarea...'
                            ,'y', 'Simpatizant ??n A??teptare','V-a??i ??nregistrat ca Simpatizant al Partidului. V?? rug??m s?? confirma??i ??nregistrarea...'),

                (24, 'ORGANIPEND','Organizator Activit????i ??n A??teptare','A??i fost invitat s?? deveni??i Organizator de Activit????i al Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'
                             ,'y','Organizator Activit????i ??n A??teptare','A??i fost invitat s?? deveni??i Organizator de Activit????i al Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'),

                (25, 'EVALUAPEND','Evaluator Rezultate ??n A??teptare','A??i fost invitat s?? deveni??i Evaluator al Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'
                             ,'y','Evaluator Rezultate ??n A??teptare','A??i fost invitat s?? deveni??i Evaluator al Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'),

                (26, 'VALIDAPEND','Validator Evalu??ri ??n A??teptare','A??i fost invitat s?? deveni??i Validator al Evalu??rilor Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'  
                           '','y','Validator Evalu??ri ??n A??teptare','A??i fost invitat s?? deveni??i Validator al Evalu??rilor Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'),

                (27, 'COORPRPEND','Coordonator Principal ??n A??teptare','A??i fost invitat s?? deveni??i Coordonator Principal al Activit????ilor ??i Vot??rilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'  
                             ,'y','Coordonator Principal ??n A??teptare','A??i fost invitat s?? deveni??i Coordonator Principal al Activit????ilor ??i Vot??rilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.');

CREATE TABLE `aut_userrol` (
  `aut_userrol_id` int NOT NULL AUTO_INCREMENT,
  `aut_userrol_rolid` int NOT NULL,
  `aut_userrol_rolcod` varchar(9) NOT NULL,
  `aut_userrol_userid` int NOT NULL,
  `aut_userrol_activ_yn` varchar(1) NOT NULL,
  `aut_userrol_startdt` datetime NOT NULL,
  `aut_userrol_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`aut_userrol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


CREATE TABLE `aut_grupactiuni` (
  `aut_grupactiuni_id` int NOT NULL AUTO_INCREMENT,
  `aut_grupactiuni_cod` varchar(10)	not null,
  `aut_grupactiuni_nume` varchar(128)	not null,
  `aut_grupactiuni_descriere` varchar(256)	not null,
  `aut_grupactiuni_displaynume` varchar(128)	not null,
  `aut_grupactiuni_displaydescriere` varchar(256)	not null,
  PRIMARY KEY (`aut_grupactiuni_id`),
  UNIQUE KEY `aut_grupactiuni_cod_unique` (`aut_grupactiuni_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



TRUNCATE TABLE aut_grupactiuni;
INSERT INTO aut_grupactiuni (`aut_grupactiuni_id`, `aut_grupactiuni_cod`,`aut_grupactiuni_nume`, 
                             `aut_grupactiuni_descriere`, `aut_grupactiuni_displaynume`, `aut_grupactiuni_displaydescriere`) 
VALUES
(10, 'GESTADMIN', 'Gestiune Administratori IT', 'Gestioneaz?? Administratorii IT ai Sistemului',
                 'Gestiune Administratori IT', 'Gestioneaz?? Administratorii IT ai Sistemului'),
			
(20, 'GESTCOOPRI', 'Gestiune Coordonatori Principali', 'Gestioneaz?? Coordonatorii Principali ai Partidului',	
                 'Gestiune Coordonatori Principali', 'Gestioneaz?? Coordonatorii Principali ai Partidului'),

(25, 'CONFIRMCOO', 'Confirmare Coordonator Principal', 'Confirm?? Invita??ia de a Deveni Coordonator Principal',
                   'Confirmare Coordonator Principal', 'Confirm?? Invita??ia de a Deveni Coordonator Principal'),	
(30, 'GESTORGNZ',  'Gestiune Organizatori Activit????i', 'Gestioneaz?? Organizatorii de Activit????i ai Partidului',	
                 'Gestiune Organizatori Activit????i', 'Gestioneaz?? Organizatorii de Activit????i ai Partidului'),
(40, 'GESTEVALTR', 'Gestiune Evaluatori Rezultate', 'Gestioneaz?? Evaluatorii Partidului - persoanele care vor evalua rezultatele activit????ilor',
                 'Gestiune Evaluatori Rezultate', 'Gestioneaz?? Evaluatorii Partidului - persoanele care vor evalua rezultatele activit????ilor'),
(50, 'GESTVALDTR', 'Gestiune Validatori Evalu??ri', 'Gestioneaz?? Validatorii Partidului - persoanele care vor valida evalu??rile f??cute de evaluator',
                 'Gestiune Validatori Evalu??ri', 'Gestioneaz?? Validatorii Partidului - persoanele care vor valida evalu??rile f??cute de evaluator'),
(60, 'GESTACTIV',  'Gestiunea Activit????ilor', 'Ini??iaz?? ??i Gestioneaz?? Activit????ile f??cute de Membri ??i Simpatizan??ii Partidului',
                 'Gestiunea Activit????ilor', 'Ini??iaz?? ??i Gestioneaz?? Activit????ile f??cute de Membri ??i Simpatizan??ii Partidului'),
(70, 'GESTVOT??RI', 'Gestiunea Vot??rilor', 'Ini??iaz?? ??i Gestioneaz?? Vot??rile interne ale Partidului',
                 'Gestiunea Vot??rilor', 'Ini??iaz?? ??i Gestioneaz?? Vot??rile interne ale Partidului'),
(80, 'VIZGRUPURI', 'Vizualizarea Grupurilor', 'Vizualizeaz?? Grupurile de Membri existente in Partid',
                 'Vizualizarea Grupurilor', 'Vizualizeaz?? Grupurile de Membri existente in Partid'),
(90, 'VIZMEMBRI', 'Vizualizarea Membrilor', 'Vizualizeaz?? Membri Partidului	Vizualizarea Membrilor',
                'Vizualizarea Membrilor', 'Vizualizeaz?? Membri Partidului	Vizualizarea Membrilor'),
(100, 'VIZSIMPAT', 'Vizualizarea Simpatizan??ilor', 'Vizualizeaz?? Simpatizan??ilor Partidului',
                 'Vizualizarea Simpatizan??ilor', 'Vizualizeaz?? Simpatizan??ilor Partidului'),
(110, 'GESTMESAJE', 'Gestionarea Mesajelor', 'Vizualizeaz?? ??i Gestioneaz?? Mesajele ??i Notific??rile',	
                  'Gestionarea Mesajelor', 'Vizualizeaz?? ??i Gestioneaz?? Mesajele ??i Notific??rile'),
			
(120, 'CONFIRMORG', 'Confirmare Organizator', 'Confirm?? Invita??ia de a Deveni Organizator de Activit????i',
                	  'Confirmare Organizator', 'Confirm?? Invita??ia de a Deveni Organizator de Activit????i'),
(130, 'GESTORGACT', 'Gestiune Organiz??ri Activit????i', 'Gestioneaz?? Organiz??rilor Alocate',
                    'Gestiune Organiz??ri Activit????i', 'Gestioneaz?? Organiz??rilor Alocate'),
(135,	'CONFINVORG', 'Noi Invita??ii primite pentru a Organiza Activit????i', 'Confirm?? invita??iile primite de a fi organizator pentru Activit????i noi',
                    'Noi Invita??ii primite pentru a Organiza Activit????i', 'Confirm?? invita??iile primite de a fi organizator pentru Activit????i noi'),

(140, 'CONFIRMEVL', 'Confirmare Evaluator', 'Confirm?? Invita??ia de a Deveni Evaluator de Rezultate al Activit????ilor Partidului',
                 	  'Confirmare Evaluator', 'Confirm?? Invita??ia de a Deveni Evaluator de Rezultate al Activit????ilor Partidului'),
(150, 'GESTEVLREZ', 'Gestiune Evalu??ri Rezultate', 'Evalueaz?? Rezultatelor Activit????ilor din Partid',
                    'Gestiune Evalu??ri Rezultate', 'Evalueaz?? Rezultatelor Activit????ilor din Partid'),
(155, 'CONFINVEVL', 'Noi Invita??ii primite pentru a fi Evalua Rezultate', 'Confirm?? invita??iile primite de a fi Evaluator pentru Rezultatele unor Activit????i noi',
                    'Noi Invita??ii primite pentru a fi Evalua Rezultate', 'Confirm?? invita??iile primite de a fi Evaluator pentru Rezultatele unor Activit????i noi'),

(160, 'CONFIRMVAL', 'Confirmare Validator', 'Confirm?? Invita??ia de a Deveni Validator de Evalu??ri ale Activit????ilor Partidului',
                    'Confirmare Validator', 'Confirm?? Invita??ia de a Deveni Validator de Evalu??ri ale Activit????ilor Partidului'),
(170, 'GESTVALEVL', 'Gestiune Validare Evalu??ri', 'Valideaz?? Evaluarea Rezultatelor Activit????ilor efectuate',
                    'Gestiune Validare Evalu??ri', 'Valideaz?? Evaluarea Rezultatelor Activit????ilor efectuate'),
(175, 'CONFINVVAL', 'Noi Invita??ii primite pentru a fi Valida Evalu??ri', 'Confirm?? invita??iile primite de a fi Validator pentru Evalu??rile Rezultatelor unor Activit????i noi',
                    'Noi Invita??ii primite pentru a fi Valida Evalu??ri', 'Confirm?? invita??iile primite de a fi Validator pentru Evalu??rile Rezultatelor unor Activit????i noi'),


(180, 'CONFIRMSIM', 'Confirm?? ??nregistrarea ca Simpatizant', 'Confirm?? Inregistrarea ca Simpatizant al Partidului',
                   'Confirm?? ??nregistrare ca Simpatizant', 'Confirm?? Inregistrarea ca Simpatizant al Partidului'),
(190, 'INDRUMMEM',  'Cum Po??i Deveni Membru?', '??ndrum??tor pentru a deveni Membru al Partidului',
                   'Cum Po??i Deveni Membru?', '??ndrum??tor pentru a deveni Membru al Partidului'),
(200, 'CEREREMEM',  'Cerere Membru', 'Gestioneaz?? Cererea ??i Condi??iile pentru a Deveni Membru',
                    'Cerere Membru', 'Gestioneaz?? Cererea ??i Condi??iile pentru a Deveni Membru'),
			
(220, 'INDRMEMACT', 'Cum Po??i Deveni Membru Activ?', '??ndrum??tor pentru a deveni Membru Activ al Partidului',
                    'Cum Po??i Deveni Membru Activ?', '??ndrum??tor pentru a deveni Membru Activ al Partidului'),
(230, 'AFILGRPMEM', 'Afiliaz??-te la un Grup', 'Afiliaz??-te la un Grup de Membri',
                    'Afiliaz??-te la un Grup', 'Afiliaz??-te la un Grup de Membri'),
(240, 'GESTEXEACT', 'Particip?? la Activit????i', '??nscrie-te ??i Particip?? la la Activit????ile Partidului',
                    'Particip?? la Activit????i', '??nscrie-te ??i Particip?? la la Activit????ile Partidului'),
(250, 'GESTEXEVOT', 'Particip?? la Vot??ri', '??nscrie-te ??i Particip?? la la Vot??rile Partidului',
                    'Particip?? la Vot??ri', '??nscrie-te ??i Particip?? la la Vot??rile Partidului'),

(255, 'CERMEMACTN',  'TEST Cerere Membru Activ Neafiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru	Activ Neafiliat',
                     'TEST Cerere Membru Activ Neafiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru	Activ Neafiliat'),
(256, 'CERMEMACTA',  'TEST Cerere Membru Activ Afiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru	Activ Afiliat',
                     'TEST Cerere Membru Activ Afiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru	Activ Afiliat'),
(257, 'CERMEMEXPN',  'TEST Cerere Membru Experimentat Neafiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru Experimentat Neafiliat',
                     'TEST Cerere Membru Experimentat Neafiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru Experimentat Neafiliat'),
(258, 'CERMEMEXPA',  'TEST Cerere Membru Experimentat Afiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru Experimentat Afiliat',
                     'TEST Cerere Membru Experimentat Afiliat', 'TEST Gestioneaz?? Cererea de a Deveni Membru Experimentat Afiliat'),


(260, 'INDRMEMEXP', 'Cum Po??i Deveni Membru Experimentat?', '??ndrum??tor pentru a deveni Membru Experimentat al Partidului',
                    'Cum Po??i Deveni Membru Experimentat?', '??ndrum??tor pentru a deveni Membru Experimentat al Partidului'),
(270, 'DAFLGRPMEM', 'Dezafiliaz??-te de la Grup', 'Dezafiliaz??-te de la Grupul T??u',
                    'Dezafiliaz??-te de la Grup', 'Dezafiliaz??-te de la Grupul T??u'),
(280, 'VIZGRUPMEM', 'Grupul Meu', 'Vizualizeaz?? ??i Particip?? la Activitatea Grupului din care faci parte',
                    'Grupul Meu', 'Vizualizeaz?? ??i Particip?? la Activitatea Grupului din care faci parte'),
			
(290, 'CREAREGRUP',  'Creare Grup', 'Creaz??-??i Propriul T??u Grup',
                   	 'Creare Grup', 'Creaz??-??i Propriul T??u Grup'),
			
(300, 'GESTGRUP', 'Gestiune Grup', 'Gestioneaz?? Grupul pe care l-ai ??nfiin??at',
                  'Gestiune Grup', 'Gestioneaz?? Grupul pe care l-ai ??nfiin??at'),
(310, 'VIZACTGRUP','Activit????ile din Grup', 'Vizualizeaz?? Activit????ile Membrilor din Grupul T??u',
                   'Activit????ile din Grup', 'Vizualizeaz?? Activit????ile Membrilor din Grupul T??u'),
(320, 'VIZVOTGRUP','Vot??rile din Grup', 'Vizualizeaz?? Participarea la Vot??ri a Membrilor din Grupul T??u',
                   'Vot??rile din Grup', 'Vizualizeaz?? Participarea la Vot??ri a Membrilor din Grupul T??u'),
(330, 'DAFLGRPSEF','Dezafiliaz??-te ca ??ef de Grup', 'Dezafiliaz??-te de la Grupul ??nfiin??at de Tine',
                   'Dezafiliaz??-te ca ??ef de Grup', 'Dezafiliaz??-te de la Grupul ??nfiin??at de Tine'
);

#(210, 'GESTACTSIM','Gestiune Activit????i', 'Gestioneaz?? Activit????ile la care participi ca Simpatizant al Partidului',
#                   'Gestiune Activit????i', 'Gestioneaz?? Activit????ile la care participi ca Simpatizant al Partidului'),


CREATE TABLE `aut_rolgrupact` (
  `aut_rolgrupact_id` int not null AUTO_INCREMENT,
  `aut_rolgrupact_rolid` int not null,
  `aut_rolgrupact_rolcod` varchar(10)	not null,
  `aut_rolgrupact_grupactid` int not null,
  `aut_rolgrupact_grupactcod` varchar(10)	not null,
  `aut_rolgrupact_importanta` int	not null,
  PRIMARY KEY (`aut_rolgrupact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



TRUNCATE TABLE aut_rolgrupact;
INSERT INTO aut_rolgrupact  (`aut_rolgrupact_id`, `aut_rolgrupact_rolid`, `aut_rolgrupact_rolcod`,
                             `aut_rolgrupact_grupactid`, `aut_rolgrupact_grupactcod`,`aut_rolgrupact_importanta` ) 
VALUES
(10,   1, 'SUPERADMIN',  10, 'GESTADMIN',  1),
(20,   1, 'SUPERADMIN', 110, 'GESTMESAJE', 2),
				
(30,   2, 'ADMIN',  20, 'GESTCOOPRI', 1),
(40,   2, 'ADMIN', 110, 'GESTMESAJE', 2),

(45,  27, 'COORPRPEND',  25, 'CONFIRMCOO', 1),  
(50,   3, 'COORDPRINC',  30, 'GESTORGACT', 5),
(60,   3, 'COORDPRINC',  40, 'GESTEVLREZ', 3),
(70,   3, 'COORDPRINC',  50, 'GESTVALREZ', 4),
(80,   3, 'COORDPRINC',  60, 'GESTACTIV',  1),
(90,   3, 'COORDPRINC',  70, 'GESTVOT??RI', 2),
(100,  3, 'COORDPRINC',  80, 'VIZGRUPURI', 7),
(110,  3, 'COORDPRINC',  90, 'VIZMEMBRI',  6),
(120,  3, 'COORDPRINC', 100, 'VIZSIMPAT',  8),
(130,  3, 'COORDPRINC', 110, 'GESTMESAJE', 9),
				
(140,  24, 'ORGANIPEND', 120, 'CONFIRMORG', 1),
(150,  22, 'ORGANIZACT', 130, 'GESTORGACT', 1),
(160,  22, 'ORGANIZACT', 135, 'CONFINVACT', 2),
(170,  22, 'ORGANIZACT', 110, 'GESTMESAJE', 3),
				
(180,  25, 'EVALUAPEND', 140, 'CONFIRMEVL', 1),
(190,  12, 'EVALUATREZ', 150, 'GESTEVLREZ', 1),
(200,  12, 'EVALUATREZ', 155, 'CONFINVEVL', 2),
(210,  12, 'EVALUATREZ', 110, 'GESTMESAJE', 3),
				
(220,  26, 'VALIDAPEND', 160, 'CONFIRMVAL', 1),
(230,  13, 'VALIDATEVL', 170, 'GESTVALEVL', 1),
(240,  13, 'VALIDATEVL', 175, 'CONFINVVAL', 2),
(250,  13, 'VALIDATEVL', 110, 'GESTMESAJE', 3),
				
(260,  23, 'SIMPATPEND', 180, 'CONFIRMSIM', 1),
(270,  14, 'SIMPATIZ',   190, 'INDRUMMEM',  1),
(280,  14, 'SIMPATIZ',   200, 'CEREREMEM',  2),
(290,  14, 'SIMPATIZ',   240, 'GESTEXEACT', 3),
(300,  14, 'SIMPATIZ',   110, 'GESTMESAJE', 4),
				
(310,  16, 'MEMINCNFL', 220, 'INDRMEMACT', 1),
(320,  16, 'MEMINCNFL', 230, 'AFILGRPMEM', 4),
(330,  16, 'MEMINCNFL', 240, 'GESTEXEACT', 2),
(340,  16, 'MEMINCNFL', 250, 'GESTEXEVOT', 3),
(350,  16, 'MEMINCNFL', 110, 'GESTMESAJE', 5),
(355,  16, 'MEMINCNFL', 255, 'CERMEMACTN', 6),
				
(360,  15, 'MEMINCAFL', 220, 'INDRMEMACT', 1),
(370,  15, 'MEMINCAFL', 240, 'GESTEXEACT', 2),
(380,  15, 'MEMINCAFL', 250, 'GESTEXEVOT', 3),
(390,  15, 'MEMINCAFL', 280, 'VIZGRUPMEM', 4),
(400,  15, 'MEMINCAFL', 270, 'DAFLGRPMEM', 5),
(410,  15, 'MEMINCAFL', 110, 'GESTMESAJE', 6),
(415,  15, 'MEMINCAFL', 256, 'CERMEMACTA', 7),
				
(420,  18, 'MEMACTNFL', 260, 'INDRMEMEXP', 1),
(430,  18, 'MEMACTNFL', 290, 'CREAREGRUP', 4),
(440,  18, 'MEMACTNFL', 230, 'AFILMEMGRP', 5),
(450,  18, 'MEMACTNFL', 240, 'GESTEXEACT', 2),
(460,  18, 'MEMACTNFL', 250, 'GESTEXEVOT', 3),
(470,  18, 'MEMACTNFL', 110, 'GESTMESAJE', 6),
(475,  18, 'MEMACTNFL', 257, 'CERMEMEXPN', 7),
				
(480,  17, 'MEMACTAFL', 260, 'INDRMEMEXP', 1),
(490,  17, 'MEMACTAFL', 240, 'GESTEXEACT', 2),
(500,  17, 'MEMACTAFL', 250, 'GESTEXEVOT', 3),
(510,  17, 'MEMACTAFL', 280, 'VIZGRUPMEM', 4),
(520,  17, 'MEMACTAFL', 270, 'DAFLGRPMEM', 5),
(530,  17, 'MEMACTAFL', 110, 'GESTMESAJE', 6),
(535,  17, 'MEMACTAFL', 258, 'CERMEMEXPA', 7),
				
(550,  20, 'MEMEXPNFL', 290, 'CREAREGRUP', 3),
(560,  20, 'MEMEXPNFL', 230, 'AFILMEMGRP', 4),
(570,  20, 'MEMEXPNFL', 240, 'GESTEXEACT', 1),
(580,  20, 'MEMEXPNFL', 250, 'GESTEXEVOT', 2),
(590,  20, 'MEMEXPNFL', 110, 'GESTMESAJE', 5),
				
(610,  19, 'MEMEXPAFL', 240, 'GESTEXEACT', 1),
(620,  19, 'MEMEXPAFL', 250, 'GESTEXEVOT', 2),
(630,  19, 'MEMEXPAFL', 280, 'VIZGRUPMEM', 3),
(640,  19, 'MEMEXPAFL', 270, 'DAFLGRPMEM', 4),
(650,  19, 'MEMEXPAFL', 110, 'GESTMESAJE', 5),
				
(660,  21, 'SEFGRUP', 300, 'GESTGRUP',   1),
(670,  21, 'SEFGRUP', 310, 'VIZACTGRUP', 2),
(680,  21, 'SEFGRUP', 320, 'VIZVOTGRUP', 3),
(690,  21, 'SEFGRUP', 240, 'GESTEXEACT', 4),
(700,  21, 'SEFGRUP', 250, 'GESTEXEVOT', 5),
(710,  21, 'SEFGRUP', 330, 'DAFLGRPSEF', 6),
(720,  21, 'SEFGRUP', 110, 'GESTMESAJE', 7
);

DROP TABLE IF EXISTS `aut_actiune`;
CREATE TABLE `aut_actiune` (
  `aut_actiune_id` int not null AUTO_INCREMENT,
  `aut_actiune_cod` varchar(25)	not null,
  `aut_actiune_nume` varchar(128)	not null,
  `aut_actiune_descriere` varchar(256)	not null,
  `aut_actiune_displaynume` varchar(128)	not null,
  `aut_actiune_displaydescriere` varchar(256)	not null,

  `aut_actiune_subactiuninume` varchar(128)	null,
  `aut_actiune_subactiunidescriere` varchar(256)	null,
  `aut_actiune_subactiunidisplaynume` varchar(128)	null,
  `aut_actiune_subactiunidisplaydescriere` varchar(256) null,
  PRIMARY KEY (`aut_actiune_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


TRUNCATE TABLE aut_actiune;
INSERT INTO aut_actiune (`aut_actiune_id`, `aut_actiune_cod`,
                         `aut_actiune_nume`, `aut_actiune_descriere`, 
                         `aut_actiune_displaynume`, `aut_actiune_displaydescriere`,
                         `aut_actiune_subactiuninume`, `aut_actiune_subactiunidescriere`, 
                         `aut_actiune_subactiunidisplaynume`, `aut_actiune_subactiunidisplaydescriere`
                         ) 
VALUES
(110910, 'GESTMESAJENOTIFAPP', 'Notific??ri Aplica??ie', 'Vizualizeaz?? ??i Gestioneaz?? Notific??rile Aplica??iei',
                               'Notific??ri Aplica??ie', 'Vizualizeaz?? ??i Gestioneaz?? Notific??rile Aplica??iei',
                               null, null, null, null),

(180910, 'CONFIRMSIMACT', 'Validare ??nregistrare', 'Confirm?? Inregistrarea ca Simpatizant al Partidului prin Codul de Validare Primit', 
			                    'Validare ??nregistrare', 'Confirm?? Inregistrarea ca Simpatizant al Partidului prin Codul de Validare Primit',
                          null, null, null, null), 
(190910, 'INDRUMMEMACT', '??ndrum??tor cum Po??i Deveni Membru', '??ndrum??tor pentru a deveni Membru al Partidului',
                         '??ndrum??tor cum Po??i Deveni Membru', '??ndrum??tor pentru a deveni Membru al Partidului',
                         null, null, null, null),
(200920, 'CEREREMEMCOMPLETCNP', 'Completeaz?? CNP, Nr. ??i Seria CI', 'Pentru a deveni membru va rug??m s?? completa??i CNP, Nr. ??i Seria CI',
                                'Completeaz?? CNP, Nr. ??i Seria CI', 'Pentru a deveni membru va rug??m s?? completa??i CNP, Nr. ??i Seria CI',
                                null, null, null, null),
(200930, 'CEREREMEMCOMPLETADR', 'Completeaz?? Adresa de Domiciliu', 'Pentru a deveni membru va rug??m s?? completa??i  sau s?? revizui??i adresa exact?? de domiciliu ??i de reziden????',
                                'Completeaz?? Adresa de Domiciliu', 'Pentru a deveni membru va rug??m s?? completa??i  sau s?? revizui??i adresa exact?? de domiciliu ??i de reziden????',
                                null, null, null, null),
(200940, 'CEREREMEMDOVADACOT', 'Dovad?? Plat?? Cotiza??ie Anual??', 'Pentru a deveni membru v?? rug??m sa face??i dovada pl????ii Cotiza??iei pe Anul Curent',
                               'Dovad?? Plat?? Cotiza??ie Anual??', 'Pentru a deveni membru v?? rug??m sa face??i dovada pl????ii Cotiza??iei pe Anul Curent',
                               null, null, null, null),
(200950, 'CEREREMEMTRIMITECER', 'Trimite Cererea de Membru', 'Trimite??i cererea de a deveni Membru',
                                'Trimite Cererea de Membru', 'Trimite??i cererea de a deveni Membru',
                                null, null, null, null),

(200955, 'CEREREMEMACTNTRICER', 'TEST Trimite Cererea de Membru Activ Neafiliat', 'TEST Trimite??i cererea de a deveni Membru Activ Neafiliat',
                                'TEST Trimite Cererea de Membru Activ Neafiliat', 'TEST Trimite??i cererea de a deveni Membru Activ Neafiliat',
                                null, null, null, null),
(200956, 'CEREREMEMACTATRICER', 'TEST Trimite Cererea de Membru Activ Afiliat', 'TEST Trimite??i cererea de a deveni Membru Activ Afiliat',
                                'TEST Trimite Cererea de Membru Activ Afiliat', 'TEST Trimite??i cererea de a deveni Membru Activ Afiliat',
                                null, null, null, null),
(200957, 'CEREREMEMEXPNTRICER', 'TEST Trimite Cererea de Membru Experimentat Neafiliat', 'TEST Trimite??i cererea de a deveni Membru Experimentat Neafiliat',
                                'TEST Trimite Cererea de Membru Experimentat Neafiliat', 'TEST Trimite??i cererea de a deveni Membru Experimentat Neafiliat',
                                null, null, null, null),
(200958, 'CEREREMEMEXPATRICER', 'TEST Trimite Cererea de Membru Experimentat Afiliat', 'TEST Trimite??i cererea de a deveni Membru Experimentat Afiliat',
                                'TEST Trimite Cererea de Membru Experimentat Afiliat', 'TEST Trimite??i cererea de a deveni Membru Experimentat Afiliat',
                                null, null, null, null),


(210905, 'GESTACTEXELISTACTC', 'Lista activit????i ??n curs de desf????urare', 'Lista de Activit????i  ??n curs de desf????urare la care sunte??i ??nscris',
                               'Lista activit????i ??n curs de desf????urare', 'Lista de Activit????i  ??n curs de desf????urare la care sunte??i ??nscris',
                               null, null, null, null),
(210910, 'GESTACTEXELISTACTV', 'Lista activit????i viitoare', 'Lista de Activit????i  noi la care v?? pute??i ??nscrie',
                               'Lista activit????i viitoare', 'Lista de Activit????i  noi la care v?? pute??i ??nscrie',
                               null, null, null, null),
(210915, 'GESTACTEXELISTACTT', 'List?? activit????i trecute', 'Lista de Activit????i la care a??i Participat ??i c??te puncte a??i luat la fiecare activitate',
                               'List?? activit????i trecute', 'Lista de Activit????i la care a??i Participat ??i c??te puncte a??i luat la fiecare activitate',
                               null, null, null, null),
(210920, 'GESTACTEXEVIZACTC', 'Vizualizare Activitate Curent??', 'Vizualizarea unei Activit????i la care Participa??i ??n prezent sau la care v-a??i ??nscris s?? Participa??i',
                              'Vizualizare Activitate Curent??', 'Vizualizarea unei Activit????i la care Participa??i ??n prezent sau la care v-a??i ??nscris s?? Participa??i',
                              null, null, null, null),
(210925, 'GESTACTEXEVIZACTV', 'Vizualizare Activitate Viitoare', 'Vizualizarea unei Activit????i Viitoare la care sunte??i ??nscris sau la care v?? pute??i ??nscrie',
                              'Vizualizare Activitate Viitoare', 'Vizualizarea unei Activit????i Viitoare la care sunte??i ??nscris sau la care v?? pute??i ??nscrie',
                              null, null, null, null),
(210930, 'GESTACTEXEVIZACTT', 'Vizualizare Activitate Trecute', 'Vizualizarea unei Activit????i Trecute la care a??i participat',
                              'Vizualizare Activitate Trecute', 'Vizualizarea unei Activit????i Trecute la care a??i participat',
                              null, null, null, null),
(210935, 'GESTACTEXEINSCACTV', '??nscrierea la o Activitate Nou??', '??nscrie??i-v?? la o Activitate Nou?? care urmeaz?? s?? se desf????oare',
                               '??nscrierea la o Activitate Nou??', '??nscrie??i-v?? la o Activitate Nou?? care urmeaz?? s?? se desf????oare',
                               null, null, null, null),
(210940, 'GESTACTEXERENUACTV', 'Renun??a??i la o Activitate Nou??', 'Renun??a??i la ??nscrierea la o Activitate Nou?? care urmeaz?? s?? se desf????oare',
                               'Renun??a??i la o Activitate Nou??', 'Renun??a??i la ??nscrierea la o Activitate Nou?? care urmeaz?? s?? se desf????oare',
                               null, null, null, null),
(210945, 'GESTACTEXEADDREZACTC', 'Ad??ugare Rezultat Activitate', 'Ad??ugarea unui Rezultat pentru o Activitate la care participa??i',
                                 'Ad??ugare Rezultat Activitate', 'Ad??ugarea unui Rezultat pentru o Activitate la care participa??i',
                                 null, null, null, null),

(210950, 'GESTACTEXEMODREZACTC', 'Modificare Rezultat Activitate', 'Modificare unui Rezultat pentru o Activitate la care participa??i',
                                 'Modificare Rezultat Activitate', 'Modificare unui Rezultat pentru o Activitate la care participa??i',
                                 null, null, null, null),
(210955, 'GESTACTEXEDELREZACTC', '??tergere Rezultat Activitate', '??tergerea unui Rezultat pentru o Activitate la care participa??i',
                                 '??tergere Rezultat Activitate', '??tergerea unui Rezultat pentru o Activitate la care participa??i',
                                 null, null, null, null),
(210960, 'GESTACTEXEVIZREZACTT', 'Vizualizare Rezultat Activitate', 'Vizualiza??i Rezultatul pentru o Activitate la care a??i participat',
                                 'Vizualizare Rezultat Activitate', 'Vizualiza??i Rezultatul pentru o Activitate la care a??i participat',
                                 null, null, null, null),
(210965, 'GESTACTEXELISTFAZVACTV', 'List?? Faze Activitate Viitoare', 'Vizualizarea Fazelor unei Activit????i Viitoare (care se desf????oar?? ??n mai multe Faze)',
                                   'List?? Faze Activitate Viitoare', 'Vizualizarea Fazelor unei Activit????i Viitoare (care se desf????oar?? ??n mai multe Faze)',
                                   null, null, null, null),
(210970, 'GESTACTEXEVIZFAZVACTV', 'Vizualizare Faz?? Viitoare', 'Vizualizarea unei Faze Viitoare a unei Activit????i Viitoare (care se desf????oar?? ??n mai multe Faze)',
                                  'Vizualizare Faz?? Viitoare', 'Vizualizarea unei Faze Viitoare a unei Activit????i Viitoare (care se desf????oar?? ??n mai multe Faze)',
                                  null, null, null, null),
(210972, 'GESTACTEXEINSCFAZVACTV', '??nscrierea Participare Faz?? Activitate', '??nscrie??i-v?? la o Faz?? a unei Activit????i Viitoare care urmeaz?? s?? se desf????oare',
                                   '??nscrierea Participare Faz?? Activitate', '??nscrie??i-v?? la o Faz?? a unei Activit????i Viitoare care urmeaz?? s?? se desf????oare',
                                   null, null, null, null),
(210974, 'GESTACTEXERENUFAZVACTV', 'Renun??are Participare Faz?? Activitate', 'Renun??a??i la ??nscrierea la o Faz?? a unei Activit????i Viitoare care urmeaz?? s?? se desf????oare',
                                   'Renun??are Participare Faz?? Activitate', 'Renun??a??i la ??nscrierea la o Faz?? a unei Activit????i Viitoare care urmeaz?? s?? se desf????oare',
                                   null, null, null, null),
(210976, 'GESTACTEXELISTFAZACTC', 'List?? Faze Activitate Curent??', 'Vizualizarea Fazelor unei Activit????i Curente (care se desf????oar?? ??n mai multe Faze)',
                                  'List?? Faze Activitate Curent??', 'Vizualizarea Fazelor unei Activit????i Curente (care se desf????oar?? ??n mai multe Faze)',
                                  null, null, null, null),
(210978, 'GESTACTEXEVIZFAZACTC', 'Vizualizare Faz?? Activitate Curent??', 'Vizualizarea unei Faze a unei Activit????i Curente (care se desf????oar?? ??n mai multe Faze)',
                                 'Vizualizare Faz?? Activitate Curent??', 'Vizualizarea unei Faze a unei Activit????i Curente (care se desf????oar?? ??n mai multe Faze)',
                                 null, null, null, null),
(210980, 'GESTACTEXEADDREZFAZC', 'Ad??ugare Rezultat Faz?? ??n Desf????urare', 'Adaug?? Rezuultat pentru o Faz?? ??n Desf????urare a unei Activit????i Curente la care participa??i',
                                 'Ad??ugare Rezultat Faz?? ??n Desf????urare', 'Adaug?? Rezuultat pentru o Faz?? ??n Desf????urare a unei Activit????i Curente la care participa??i',
                                 null, null, null, null),
(210982, 'GESTACTEXEMODREZFAZC', 'Modificare Rezultat Faz?? ??n Desf????urare', 'Modificare unui Rezultat pentru o Faz?? ??n Desf????urare a unei Activit????i Curente la care participa??i',
                                 'Modificare Rezultat Faz?? ??n Desf????urare', 'Modificare unui Rezultat pentru o Faz?? ??n Desf????urare a unei Activit????i Curente la care participa??i',
                                 null, null, null, null),
(210984, 'GESTACTEXEDELREZFAZC', '??tergere Rezultat Faz?? ??n Desf????urare', '??tergerea unui Rezultat pentru o Faz?? ??n Desf????urare a unei Activit????i Curente la care participa??i',
                                 '??tergere Rezultat Faz?? ??n Desf????urare', '??tergerea unui Rezultat pentru o Faz?? ??n Desf????urare a unei Activit????i Curente la care participa??i',
                                 null, null, null, null),
(210986, 'GESTACTEXEVIZREZFAZTACTC', 'Vizualizare Rezultat Faz?? Trecut?? Activitate Curent??', 'Vizualizare unui Rezultat pentru o Faz?? Trecut?? a unei Activit????i Curente',
                                     'Vizualizare Rezultat Faz?? Trecut?? Activitate Curent??', 'Vizualizare unui Rezultat pentru o Faz?? Trecut?? a unei Activit????i Curente',
                                     null, null, null, null),
(210988, 'GESTACTEXELISTFAZACTT', 'List?? Faze Activitate Trecut??', 'Vizualizarea Fazelor unei Activit????i Trecute (care se desf????oar?? ??n mai multe Faze)',
                                  'List?? Faze Activitate Trecut??', 'Vizualizarea Fazelor unei Activit????i Trecute (care se desf????oar?? ??n mai multe Faze)',
                                  null, null, null, null),
(210990, 'GESTACTEXEVIZFAZTACTT', 'Vizualizare Faz?? Trecut?? Activitate Trecut??', 'Vizualizarea unei Faze a unei Activit????i Trecute (care se desf????oar?? ??n mai multe Faze)',
                                  'Vizualizare Faz?? Trecut?? Activitate Trecut??', 'Vizualizarea unei Faze a unei Activit????i Trecute (care se desf????oar?? ??n mai multe Faze)',
                                  null, null, null, null),
(210992, 'GESTACTEXEVIZREZFAZTACTT', 'Vizualizare Rezultat Faz?? Activitate Trecut??', 'Vizualizare unui Rezultat pentru o Faz?? Trecut?? a unei Activit????i Trecute',
                                     'Vizualizare Rezultat Faz?? Activitate Trecut??', 'Vizualizare unui Rezultat pentru o Faz?? Trecut?? a unei Activit????i Trecute',
                                     null, null, null, null),

(290905, 'CREAREGRUPMEMACTEXPNFL', 'Creare Grup Propriu', 'Crea??i-v?? Propriul Grup ??i deveni??i ??ef de Grup',
                                   'Creare Grup Propriu', 'Crea??i-v?? Propriul Grup ??i deveni??i ??ef de Grup',
                                   null, null, null, null),

(230905, 'AFILGRPMEMMEMINCACTEXPNFL', 'Afiliere la un Grup', 'Afilia??i-v?? la un Grup de Membri ??i deveni??i Membru Afiliat',
                                      'Afiliere la un Grup', 'Afilia??i-v?? la un Grup de Membri ??i deveni??i Membru Afiliat',
                                      null, null, null, null),

(270905, 'DAFLGRPMEMMEMINCACTEXPAFL','Dezafiliere de la Grup', 'Dezafilia??i-v?? de la Grupul din care face??i parte ??i deveni??i Membru Neafiliat',
                                      'Dezafiliere de la Grup', 'Dezafilia??i-v?? de la Grupul din care face??i parte ??i deveni??i Membru Neafiliat',
                                      null, null, null, null),

(300901, 'GESTGRUPVIZUALIZGRUP', 'Vizualizare Grup', 'Vizualizeaz?? Grupul ??i Membri s??i',
                                 'Vizualizare Grup', 'Vizualizeaz?? Grupul ??i Membri s??i',
                                 "Gestiune Membru", "Informatii Membru, Activit????i, Punctaje, Excludere",
                                 "Gestiune Membru", "Informatii Membru, Activit????i, Punctaje, Excludere"),

(300905, 'GESTGRUPPENDINGMEM', 'Cereri Noi de Afiliere la Grup', 'Vizualizeaz?? ??i Aprob?? Noile Cereri de ??nscriere la Grup',
                               'Cereri Noi de Afiliere la Grup', 'Vizualizeaz?? ??i Aprob?? Noile Cereri de ??nscriere la Grup',
                               "Gestiune Cerere Membru", "Gestioneaza cererea de afiliere la grup",
                               "Gestiune Cerere Membru", "Gestioneaza cererea de afiliere la grup"),


(300910, 'GESTGRUPVIZUALIZMEM',  'Vizualizare Membru', 'Vizualizeaz?? Membrul Grupului ??i Informa??iile Sale',
                                 'Vizualizare Membru', 'Vizualizeaz?? Membrul Grupului ??i Informa??iile Sale',
                                 null, null, null, null),

(300915, 'GESTGRUPEXCLUDEREMEM', 'Excludere Membru', 'Exclude Membrul din Grup',
                                 'Excludere Membru', 'Exclude Membrul din Grup',
                                 null, null, null, null), 

(300920, 'GESTGRUPVIZPENDMEM',  'Vizualizare Membru ??n a??teptare', 'Vizualizeaz?? Membrul care dore??te s?? se ??nscrie ??n grup ??i Informa??iile Sale',
                                'Vizualizare Membru ??n a??teptare', 'Vizualizeaz?? Membrul care dore??te s?? se ??nscrie ??n grup ??i Informa??iile Sale',
                                 null, null, null, null),

(300925, 'GESTGRUPACCPENDMEM', 'Acceptare sau Respingere Membru ??n A??teptare', 'Accept?? sau Respinge afilierea unei cereri de ??nscriere ??n grup',
                                 'Acceptare sau Respingere Membru ??n A??teptare', 'Accept?? sau Respinge afilierea unei cereri de ??nscriere ??n grup',
                                 null, null, null, null),

(280901, 'VIZGRUPMEMVIZGRUP', 'Vizualizare Grup din care fac parte', 'Vizualizeaz?? Grupul Meu ??i Membri s??i',
                                 'Vizualizare Grup din care fac parte', 'Vizualizeaz?? Grupul Meu ??i Membri s??i',
                                 "Informa??ii Membru", "Informatii Membru, Activit????i, Punctaje",
                                 "Informa??ii Membru", "Informatii Membru, Activit????i, Punctaje"),

-- ===============================================================
--   GESTIUNE ADMINISTRATORI 
-- ===============================================================
(10905, 'GESTADMINVIZLISTADM', 'Vizualizare Lista de Administratori', 'Vizualizeaz?? Lista de Administratori',
                                'Vizualizare Lista de Administratori', 'Vizualizeaz?? Lista de Administratori',
                                "Informa??ii Administrator", "Informatii despre Administrator",
                                "Informa??ii Administrator", "Informatii despre Administrator"),
(10910, 'GESTADMINVIZADMIN',  'Vizualizare Administrator', 'Vizualizeaz?? Administratorul ??i Informa??iile sale',
                               'Vizualizare Administrator', 'Vizualizeaz?? Adminsitratorul ??i Informa??iile sale',
                               null, null, null, null),
(10915, 'GESTADMINEXCLUDADMIN', 'Excludere Administrator', 'Exclude??i Administratorul din Lista de Administratori',
                                 'Excludere Administrator', 'Exclude??i Administratorul din Lista de Administratori',
                                 null, null, null, null), 

(10920, 'GESTADMININVITADM', 'Invita??ie Administrator', 'Invita??i o Persoan?? pentru a deveni Administrator',
                              'Invita??ie Administrator', 'Invita??i o Persoan?? pentru a deveni Administrator',
                              null, null, null, null), 

(10925, 'GESTADMINPENDLISTADM', 'Vizualizare Lista Invita??i Administratori', 'Vizualizeaz?? Lista de Persoane Invitate pentru rolul de Administrator',
                                'Vizualizare Lista Invita??i Administratori', 'Vizualizeaz?? Lista de Persoane Invitate pentru rolul de Administrator',
                                "Persoan?? Invitat?? pentrul rolul de Administrator", "Informatii despre persoana invitat?? pentru rolul de Administrator",
                                "Persoan?? Invitat?? pentrul rolul de Administrator", "Informatii despre persoana invitat?? pentru rolul de Administrator"),
(10930, 'GESTADMINVIZPENDADM', 'Vizualizare Invitat Administrator', 'Vizualizeaz?? Informa??ii despre Persoana invitat?? pentru rolul de Administrator',
                                'Vizualizare Invitat Administrator', 'Vizualizeaz?? Informa??ii despre Persoana invitat?? pentru rolul de Administrator',
                                null, null, null, null),

(10935, 'GESTADMINREFUZLISTADM', 'Vizualizare Lista Refuzuri Administratori', 'Vizualizeaz?? Lista de Persoane care au refuzat rolul de Administrator',
                                 'Vizualizare Lista Refuzuri Administratori', 'Vizualizeaz?? Lista de Persoane care au refuzat rolul de Administrator',
                                "Persoan?? Invitat?? pentrul rolul de Administrator", "Informatii despre persoana care a refuzat rolul de Administrator",
                                "Persoan?? Invitat?? pentrul rolul de Administrator", "Informatii despre persoana care a refuzat rolul de Administrator"),
(10940, 'GESTADMINVIZREFUZMEM', 'Vizualizare Refuz Administrator', 'Vizualizeaz?? Informa??ii despre Persoana care a refuzat rolul de Administrator',
                             'Vizualizare Refuz Administrator', 'Vizualizeaz?? Informa??ii despre Persoana care a refuzat rolul de Administrator',
                                null, null, null, null),


(10945, 'GESTADMINEXCLUSLISTADM', 'Vizualizare Lista Administratori Exclu??i', 'Vizualizeaz?? Lista de Persoane care au fost exclu??i din rolul de Administrator',
                                  'Vizualizare Lista Administratori Exclu??i', 'Vizualizeaz?? Lista de Persoane care au fost exclu??i din rolul de Administrator',
                                "Persoan?? Exclus?? din rolul de Administrator", "Informa??ii despre persoana exclus?? din rolul de Administrator",
                                "Persoan?? Exclus?? din rolul de Administrator", "Informa??ii despre persoana exclus?? din rolul de Administrator"),
(10950, 'GESTADMINVIZEXCLUSMEM', 'Vizualizare Administrator Exclus', 'Vizualizeaz?? Informa??ii despre Persoana care a fost exclus?? din rolul de Administrator',
                                 'Vizualizare Administrator Exclus',  'Vizualizeaz?? Informa??ii despre Persoana care a fost exclus?? din rolul de Administrator',
                                null, null, null, null),


(10955, 'GESTADMINPLECATLISTADM', 'Vizualizare Lista Administratori Pleca??i', 'Vizualizeaz?? Lista de Persoane care au fost exclu??i din rolul de Administrator',
                                  'Vizualizare Lista Administratori Pleca??i', 'Vizualizeaz?? Lista de Persoane care au fost exclu??i din rolul de Administrator',
                                "Persoana Plecat?? din rolul de Administrator", "Informa??ii despre persoana exclus?? din rolul de Administrator",
                                "Persoan?? Plecat?? din rolul de Administrator", "Informa??ii despre persoana exclus?? din rolul de Administrator"),
(10960, 'GESTADMINVIZPLECATMEM', 'Vizualizare Administrator Plecat', 'Vizualizeaz?? Informa??ii despre Persoana care a plecat din rolul de Administrator',
                                'Vizualizare Administrator Plecat',  'Vizualizeaz?? Informa??ii despre Persoana care a plecat din rolul de Administrator',
                                null, null, null, null)

;

CREATE TABLE `aut_grupactactiune` (
  `aut_grupactactiune_id` int NOT NULL AUTO_INCREMENT,
  `aut_grupactactiune_grupactid` int NOT NULL,
  `aut_grupactactiune_grupactcod` varchar(10) COLLATE utf8mb4_bin NOT NULL,
  `aut_grupactactiune_actid` int NOT NULL,
  `aut_grupactactiune_actcod` varchar(25) COLLATE utf8mb4_bin NOT NULL,
  `aut_grupactactiune_importanta` int NOT NULL,
  `aut_grupactactiune_parentactid` int DEFAULT NULL,
  `aut_grupactactiune_parentactcod` varchar(25) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`aut_grupactactiune_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



TRUNCATE TABLE aut_grupactactiune;
INSERT INTO aut_grupactactiune (`aut_grupactactiune_id`,    `aut_grupactactiune_grupactid`, `aut_grupactactiune_grupactcod`,
                                `aut_grupactactiune_actid`, `aut_grupactactiune_actcod`,    `aut_grupactactiune_importanta`,
                                `aut_grupactactiune_parentactid`, `aut_grupactactiune_parentactcod` )
VALUES
(2001, 180, 'CONFIRMSIM', 180910, 'CONFIRMSIMACT', 1, null, null),
						
						
(2002, 190, 'INDRUMMEM', 190910, 'INDRUMMEMACT', 1, null, null),	
						
(2003, 200, 'CEREREMEM', 200920, 'CEREREMEMCOMPLETCNP', 1, null, null),	
(2004, 200, 'CEREREMEM', 200930, 'CEREREMEMCOMPLETADR', 2, null, null),	
(2005, 200, 'CEREREMEM', 200940, 'CEREREMEMDOVADACOT',  3, null, null),	
(2006, 200, 'CEREREMEM', 200950, 'CEREREMEMTRIMITECER', 4, null, null),

(3001, 255, 'CERMEMACTN', 200955, 'CEREREMEMACTNTRICER', 1, null, null),
(3002, 256, 'CERMEMACTA', 200956, 'CEREREMEMACTATRICER', 1, null, null),
(3003, 257, 'CERMEMEXPN', 200957, 'CEREREMEMEXPNTRICER', 1, null, null),
(3004, 258, 'CERMEMEXPA', 200958, 'CEREREMEMEXPATRICER', 1, null, null),
						
(2007, 240, 'GESTEXEACT', 210905, 'GESTACTEXELISTACTC',        1,   null,                null),		
(2008, 240, 'GESTEXEACT', 210910, 'GESTACTEXELISTACTV',        2,   null,                null),	
(2009, 240, 'GESTEXEACT', 210915, 'GESTACTEXELISTACTT',        3,   null,                null),
(2010, 240, 'GESTEXEACT', 210920, 'GESTACTEXEVIZACTC',         4, 210905, 'GESTACTEXELISTACTC'),
(2011, 240, 'GESTEXEACT', 210925, 'GESTACTEXEVIZACTV',         5, 210910, 'GESTACTEXELISTACTV'),
(2012, 240, 'GESTEXEACT', 210930, 'GESTACTEXEVIZACTT',         6, 210915, 'GESTACTEXELISTACTT'),
(2013, 240, 'GESTEXEACT', 210935, 'GESTACTEXEINSCACTV',        7, 210925, 'GESTACTEXEVIZACTV'),
(2014, 240, 'GESTEXEACT', 210940, 'GESTACTEXERENUACTV',        8, 210925, 'GESTACTEXEVIZACTV'),
(2015, 240, 'GESTEXEACT', 210945, 'GESTACTEXEADDREZACTC',      9, 210920, 'GESTACTEXEVIZACTC'),
(2016, 240, 'GESTEXEACT', 210950, 'GESTACTEXEMODREZACTC',     10, 210920, 'GESTACTEXEVIZACTC'),
(2017, 240, 'GESTEXEACT', 210955, 'GESTACTEXEDELREZACTC',     11, 210920, 'GESTACTEXEVIZACTC'),
(2018, 240, 'GESTEXEACT', 210960, 'GESTACTEXEVIZREZACTT',     12, 210930, 'GESTACTEXEVIZACTT'),
(2019, 240, 'GESTEXEACT', 210965, 'GESTACTEXELISTFAZVACTV',   13, 210925, 'GESTACTEXEVIZACTV'),
(2020, 240, 'GESTEXEACT', 210970, 'GESTACTEXEVIZFAZVACTV',    14, 210965, 'GESTACTEXELISTFAZVACTV'),
(2021, 240, 'GESTEXEACT', 210972, 'GESTACTEXEINSCFAZVACTV',   15, 210970, 'GESTACTEXEVIZFAZVACTV'),
(2022, 240, 'GESTEXEACT', 210974, 'GESTACTEXERENUFAZVACTV',   16, 210970, 'GESTACTEXEVIZFAZVACTV'),
(2023, 240, 'GESTEXEACT', 210976, 'GESTACTEXELISTFAZACTC',    17, 210905,'GESTACTEXELISTACTC'),
(2024, 240, 'GESTEXEACT', 210978, 'GESTACTEXEVIZFAZACTC',     18, 210976, 'GESTACTEXELISTFAZACTC'),
(2025, 240, 'GESTEXEACT', 210980, 'GESTACTEXEADDREZFAZC',     19, 210978, 'GESTACTEXEVIZFAZACTC'),
(2026, 240, 'GESTEXEACT', 210982, 'GESTACTEXEMODREZFAZC',     20, 210978, 'GESTACTEXEVIZFAZACTC'),
(2027, 240, 'GESTEXEACT', 210984, 'GESTACTEXEDELREZFAZC',     21, 210978, 'GESTACTEXEVIZFAZACTC'),
(2028, 240, 'GESTEXEACT', 210986, 'GESTACTEXEVIZREZFAZTACTC', 22, 210978, 'GESTACTEXEVIZFAZACTC'),
(2029, 240, 'GESTEXEACT', 210988, 'GESTACTEXELISTFAZACTT',    23, 210915, 'GESTACTEXELISTACTT'),
(2030, 240, 'GESTEXEACT', 210990, 'GESTACTEXEVIZFAZTACTT',    24, 210988, 'GESTACTEXELISTFAZACTT'),
(2031, 240, 'GESTEXEACT', 210992, 'GESTACTEXEVIZREZFAZTACTT', 25, 210992, 'GESTACTEXEVIZREZFAZTACTT'),
						
(2032, 110, 'GESTMESAJE', 110910, 'GESTMESAJENOTIFAPP', 1, null, null	),

(2501, 290, 'CREAREGRUP', 290905, 'CREAREGRUPMEMACTEXPNFL',        1,   null,                null),

(2601, 230, 'AFILGRPMEM', 230905, 'AFILGRPMEMMEMINCACTEXPNFL',       1,   null,                null),
(2611, 270, 'DAFLGRPMEM', 270905, 'DAFLGRPMEMMEMINCACTEXPAFL',       1,   null,                null),

(2701, 300, 'GESTGRUP', 300901, 'GESTGRUPVIZUALIZGRUP',      1,   null,                null),
(2720, 300, 'GESTGRUP', 300910, 'GESTGRUPVIZUALIZMEM',       3, 300901, 'GESTGRUPVIZUALIZGRUP'),
(2725, 300, 'GESTGRUP', 300915, 'GESTGRUPEXCLUDEREMEM',      4, 300901, 'GESTGRUPVIZUALIZGRUP'),

(2705, 300, 'GESTGRUP', 300905, 'GESTGRUPPENDINGMEM',       2,   null,                null),
(2730, 300, 'GESTGRUP', 300920, 'GESTGRUPVIZPENDMEM',       3, 300905, 'GESTGRUPPENDINGMEM'),
(2735, 300, 'GESTGRUP', 300925, 'GESTGRUPACCPENDMEM',       4, 300905, 'GESTGRUPPENDINGMEM'),

(2745, 280, 'VIZGRUPMEM', 280901, 'VIZGRUPMEMVIZGRUP',     1, null, null),


-- ===============================================================
--   GESTIUNE ADMINISTRATORI 
-- ===============================================================
(2801, 10, 'GESTADMIN', 10905, 'GESTADMINVIZLISTADM',      1,   null,                null),
(2810, 10, 'GESTADMIN', 10910, 'GESTADMINVIZADMIN',        10, 10905, 'GESTADMINVIZLISTADM'),
(2815, 10, 'GESTADMIN', 10915, 'GESTADMINEXCLUDADMIN',     11, 10910, 'GESTADMINVIZLISTADM'),

(2820, 10, 'GESTADMIN', 10920, 'GESTADMININVITADM',        2,   null,                null),

(2825, 10, 'GESTADMIN', 10925, 'GESTADMINPENDLISTADM',      3,   null,                null),
(2830, 10, 'GESTADMIN', 10930, 'GESTADMINVIZPENDADM',       31, 10925, 'GESTADMINPENDLISTADM'),

(2835, 10, 'GESTADMIN', 10935, 'GESTADMINREFUZLISTADM',    6,   null,                null),
(2840, 10, 'GESTADMIN', 10940, 'GESTADMINVIZREFUZMEM',     61, 10955, 'GESTADMINREFUZLISTADM'),

(2845, 10, 'GESTADMIN', 10945, 'GESTADMINEXCLUSLISTADM',    4,   null,                null),
(2850, 10, 'GESTADMIN', 10950, 'GESTADMINVIZEXCLUSMEM',     41, 10935, 'GESTADMINEXCLUSLISTADM'),

(2855, 10, 'GESTADMIN', 10955, 'GESTADMINPLECATLISTADM',    5,   null,                null),
(2860, 10, 'GESTADMIN', 10960, 'GESTADMINVIZPLECATMEM',     51, 10945, 'GESTADMINPLECATLISTADM')
;



DROP TABLE IF EXISTS cart2.`aut_userinfo`;
CREATE TABLE cart2.`aut_userinfo` (
  `aut_userinfo_id`	int NOT NULL AUTO_INCREMENT,
  `aut_userinfo_userid`  int NOT NULL,
  `aut_userinfo_nume`	varchar(32) not null,
  `aut_userinfo_prenume`	varchar(32) not null,
  `aut_userinfo_telefon`	varchar(24) NOT NULL,
  `aut_userinfo_sex`	varchar(1),
  `aut_userinfo_email`	varchar(64),
  `aut_userinfo_datanasterii`	int(8),
  `aut_userinfo_dom_zonataraid`	int not null,
  `aut_userinfo_dom_zonataracod`	varchar(2) not null,
  `aut_userinfo_dom_judetid`	int not null,
  `aut_userinfo_dom_judetcod`	varchar(2) not null,
  `aut_userinfo_dom_uatid`	  int not null,
  `aut_userinfo_dom_uatcod`	  int	not null,
  `aut_userinfo_dom_localitateid`	int not null,
  `aut_userinfo_dom_localitatecod`	int not null,
  `aut_userinfo_dom_codpostal`	varchar(16),
  `aut_userinfo_dom_adresa`	varchar(128) not null,
  `aut_userinfo_rez_dif_de_dom`	char(1),
  `aut_userinfo_rez_zonataraid`	int,
  `aut_userinfo_rez_zonataracod`	varchar(2),
  `aut_userinfo_rez_judetid`	int,
  `aut_userinfo_rez_judetcod`	varchar(2),
  `aut_userinfo_rez_uatid`	  int,
  `aut_userinfo_rez_uatcod`	  int,
  `aut_userinfo_rez_localitateid`	int,
  `aut_userinfo_rez_localitatecod`	int,
  `aut_userinfo_rez_codpostal`	varchar(16),
  `aut_userinfo_rez_adresa`	varchar(128),
  PRIMARY KEY (`aut_userinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



CREATE TABLE `aut_validinreg` (
  `aut_validinreg_id` int NOT NULL AUTO_INCREMENT,
  `aut_validinreg_userid` int NOT NULL,
  `aut_validinreg_codvalidare` int NOT NULL,
  `aut_validinreg_activ_yn` varchar(1) NOT NULL,
  `aut_validinreg_startdt` datetime NOT NULL,
  `aut_validinreg_enddt` datetime NOT NULL,
  PRIMARY KEY (`aut_validinreg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;




CREATE TABLE `adm_superadmin` (
  `adm_superadmin_id` int NOT NULL AUTO_INCREMENT,
  `adm_superadmin_userid` int NOT NULL,
  `adm_superadmin_activ_yn` char(1) NOT NULL,
  `adm_superadmin_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `adm_superadmin_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`adm_superadmin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `adm_admin` (
  `adm_admin_id` int NOT NULL AUTO_INCREMENT,
  `adm_admin_userid` int NOT NULL,
  `adm_admin_activ_yn` char(1) NOT NULL,
  `adm_admin_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `adm_admin_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`adm_admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `gen_acoperiregeografica`;
CREATE TABLE `gen_acoperiregeografica` (
  `gen_acoperiregeografica_id` int NOT NULL AUTO_INCREMENT,	
  `gen_acoperiregeografica_cod` varchar(16) not null,	
  `gen_acoperiregeografica_nume` varchar(64) not null,
  `gen_acoperiregeografica_activ_yn` varchar(1) not null,
  `gen_acoperiregeografica_rol_yn` varchar(1) not null,
  `gen_acoperiregeografica_activitate_yn` varchar(1) not null,  
  `gen_acoperiregeografica_notificari_yn` varchar(1) not null,
  `gen_acoperiregeografica_displaynume` varchar(128) not null,
  UNIQUE KEY `gen_acoperiregeografica_cod_unique`  (`gen_acoperiregeografica_cod`),
  UNIQUE KEY `gen_acoperiregeografica_nume_unique` (`gen_acoperiregeografica_nume`),
  PRIMARY KEY (`gen_acoperiregeografica_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



INSERT INTO cart2.gen_acoperiregeografica
                      (`gen_acoperiregeografica_id`,`gen_acoperiregeografica_cod`, `gen_acoperiregeografica_nume`, 
                       `gen_acoperiregeografica_activ_yn`, `gen_acoperiregeografica_displaynume`,
                       `gen_acoperiregeografica_rol_yn`, `gen_acoperiregeografica_activitate_yn`, 
                       `gen_acoperiregeografica_notificari_yn`) 
VALUES  
  (1,  'TOATE',        'acoperire la toate nivelele',                       'y', 'Acoperire la toate nivelele: Na??ionale, Jude??ene ??i Locale', 'y', 'y', 'y'),
  (2,  'NIVROMANIA',   'acoperire la nivel de ??ar?? ??i diaspor??',            'y', 'Acoperire la nivel ??ntreaga ??ar?? ??i Diaspor??', 'y', 'y', 'y'),
  (3,  'NIVINTERNTARA','acoperire la nivel de ??ar??',                        'y', 'Acoperire pe ??ntreg Interiorul ????rii', 'y', 'y', 'y'),
  (4,  'NIVDIASPORA',  'acoperire la nivel de diaspora',         'y', 'Acoperire pe ??ntreaga Diaspora', 'y', 'y', 'y'),
  (5,  'NIVJUDET',     'acoperire la nivel de jude??',                       'y', 'Acoperire la nivel de Jude??', 'y', 'y', 'y'),
  (6,  'NIVTARADIASP', 'acoperire pe o ??ar?? din diaspora',                  'y', 'Acoperire pe o ??ar?? din Diaspora', 'y', 'y', 'y'),
  (7,  'NIVUAT',       'acoperire la nivel de unitate administrativ teritoriala','y','Acoperire la nivel Unitate Administrativ Teritoriala', 'y', 'y', 'y'),  
  (8,  'NIVLOCALIT',   'acoperire la nivel de localitate',                  'y', 'Acoperire la nivel de Localitate', 'y', 'y', 'y'),
  (9,  'NIVZONAJUDET', 'acoperire la nivel de zona jude??',                  'n', 'Acoperire pe o Zon?? de Jude??', 'n', 'n', 'n'),
  (10, 'NIVZONAUAT',   'acoperire la nivel de zon?? de unitate administrativ teritoriala', 'n', 'Acoperire pe o Zon?? a unei Unit????i Administrativ Teritoriale', 'n', 'n', 'n'),
  (11, 'NIVZONALOC',   'acoperire la nivel de zon?? a unei localit????i',      'n', 'Acoperire pe o Zon?? a unei Localit????i', 'n', 'n', 'n'),
  (12, 'NIVSECTVOT',   'acoperire pe zona definit?? de o sec??ie de votare',  'n', 'Acoperire pe Zona definit?? de o Sec??ie de Votare', 'n', 'n', 'n'),
  (13, 'NIVCODPOST',   'acoperire pe zona definit?? de un cod postal',       'n', 'Acoperire pe Zona definit?? de un Cod Postal', 'n', 'n', 'n'),
  (14, 'NIVPERSOANA',  'acoperire pentru o singura persoana',               'n', 'Acoperire pentru o singura persoana', 'n', 'n', 'y'
  );



DROP TABLE IF EXISTS `gen_zonageografica`;
CREATE TABLE `gen_zonageografica` (
  `gen_zonageografica_id` int NOT NULL AUTO_INCREMENT,	
  `gen_zonageografica_acopgeoid` int NOT NULL,	
  `gen_zonageografica_acopgeocod` varchar(16) not null,	
  `gen_zonageografica_zonataraid` int	not null, 	
  `gen_zonageografica_zonataracod` varchar(2) not null, 
  `gen_zonageografica_judetid` int	not null, 
  `gen_zonageografica_judetcod` varchar(2) not null, 
  `gen_zonageografica_uatid`	  int not null,
  `gen_zonageografica_uatcod`	  int	not null,
  `gen_zonageografica_zonauatid` int not null, 
  `gen_zonageografica_zonauatcod` varchar(9) not null, 
  `gen_zonageografica_zonajudetid` int	not null, 
  `gen_zonageografica_zonajudetcod` varchar(9) not null, 
  `gen_zonageografica_localitateid` int not null, 
  `gen_zonageografica_localitatecod` int	not null, 
  `gen_zonageografica_zonalocalitateid` int not null, 
  `gen_zonageografica_zonalocalitatecod` varchar(9) not null, 
  `gen_zonageografica_sectievotareid` int not null, 
  `gen_zonageografica_sectievotarenr` int not null, 
  `gen_zonageografica_codpostalid` int not null,  
  `gen_zonageografica_codpostalcod` varchar(16)	not null, 
  PRIMARY KEY (`gen_zonageografica_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



CREATE TABLE `geo_zonatara` (
  `geo_zonatara_id`	int NOT NULL AUTO_INCREMENT,
  `geo_zonatara_cod`	varchar(2) NOT NULL,
  `geo_zonatara_nume`	varchar(10) NOT NULL,
  primary key (`geo_zonatara_id`),
  UNIQUE KEY `geo_zonatara_cod_unique` (`geo_zonatara_cod`),
  UNIQUE KEY `geo_zonatara_nume_unique` (`geo_zonatara_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_0900_ai_ci;



INSERT INTO  cart2.geo_zonatara (geo_zonatara_id, geo_zonatara_cod, geo_zonatara_nume)
       VALUES              (                1,               "TR",             "??ar??"),
                           (                2,               "DS",         "Diaspora");

DROP TABLE geo_judet;
CREATE TABLE `geo_judet` (
  `geo_judet_id`	  int NOT NULL AUTO_INCREMENT,
  `geo_judet_zonataraid`	int NOT NULL,
  `geo_judet_zonataracod`   varchar(2) NOT NULL,
  `geo_judet_zonataranume`	varchar(10) NOT NULL,
  `geo_judet_cod`	varchar(2) NOT NULL,
  `geo_judet_nume`	varchar(64),
  `geo_judet_numescurt`	varchar(64) NOT NULL,
  `geo_judet_siruta`	int NULL,
  `geo_judet_regiuneid`	int NULL,
  primary key (`geo_judet_id`),
  UNIQUE KEY `geo_judet_cod_unique` (`geo_judet_zonataracod`,`geo_judet_cod`)
  -- , UNIQUE KEY `geo_judet_nume_unique` (`geo_judet_nume`)
) engine=innodb AUTO_INCREMENT=1 default charset=utf8mb4 collate=utf8mb4_romanian_ci;


TRUNCATE TABLE cart2.geo_judet;
INSERT INTO cart2.geo_judet (
    geo_judet_id,
    geo_judet_zonataraid,
    geo_judet_zonataracod,
    geo_judet_zonataranume,
    geo_judet_cod,
    geo_judet_numescurt)
SELECT null, 1, "TR", "??ar??", code, name 
         FROM localitati.account_county
         WHERE code NOT IN ("B","CL","GR")
         ORDER BY NAME COLLATE utf8_romanian_ci;

INSERT INTO cart2.geo_judet (
    geo_judet_id,
    geo_judet_zonataraid,
    geo_judet_zonataracod,
    geo_judet_zonataranume,
    geo_judet_cod,
    geo_judet_numescurt)
SELECT 40, 1, "TR", "??ar??", code, name 
         FROM localitati.account_county
         WHERE code IN ("B")
         ORDER BY NAME;

INSERT INTO cart2.geo_judet (
    geo_judet_id,
    geo_judet_zonataraid,
    geo_judet_zonataracod,
    geo_judet_zonataranume,
    geo_judet_cod,
    geo_judet_numescurt)
SELECT 51, 1, "TR", "??ar??", code, name 
         FROM localitati.account_county
         WHERE code IN ("CL")
         ORDER BY NAME;

INSERT INTO cart2.geo_judet (
    geo_judet_id,
    geo_judet_zonataraid,
    geo_judet_zonataracod,
    geo_judet_zonataranume,
    geo_judet_cod,
    geo_judet_numescurt)
SELECT 52, 1, "TR", "??ar??", code, name 
         FROM localitati.account_county
         WHERE code IN ("GR")
         ORDER BY NAME;

UPDATE cart2.geo_judet geojud
   INNER JOIN localitati.siruta sir ON sir.JUD = geojud.geo_judet_id
   SET 
      geojud.geo_judet_nume      = sir.DENLOC,
      geojud.geo_judet_siruta    = sir.SIRUTA,
      geojud.geo_judet_regiuneid = sir.REGIUNE
   WHERE sir.NIV = 1 ;
   
ALTER TABLE cart2.geo_judet AUTO_INCREMENT = 100;


INSERT INTO cart2.geo_judet (
    geo_judet_id,
    geo_judet_zonataraid,
    geo_judet_zonataracod,
    geo_judet_zonataranume,
    geo_judet_cod,
    geo_judet_nume,
    geo_judet_numescurt)
  SELECT null, 2, "DS", "Diaspora", id, name, name
         FROM localitati.countries;

/**
INSERT INTO cart2.geo_judet (
    geo_judet_id,
    geo_judet_zonataraid,
    geo_judet_zonataracod,
    geo_judet_zonataranume,
    geo_judet_cod,
    geo_judet_nume)
  SELECT null, 1, "TR", "??ar??", code, name 
         FROM localitati.account_county
         WHERE code NOT IN ("B","CL")
         ORDER BY NAME;
*/




DROP TABLE cart2.`geo_uat`;
CREATE TABLE cart2.`geo_uat` (
  `geo_uat_id` int not null AUTO_INCREMENT,	
  `geo_uat_zonataraid`	int not null,
  `geo_uat_zonataracod` varchar(2)	not null,
  `geo_uat_zonataranume`	varchar(10) not null,
  `geo_uat_judetid`	int not null,
  `geo_uat_judetcod`	varchar(2)	not null,
  `geo_uat_judetnume`	varchar(64)	not null,
  `geo_uat_cod`	int	not null,
  `geo_uat_nume`	varchar(64) not null,
  `geo_uat_longitudine`	decimal(18,16)	null,
  `geo_uat_latitudine`	decimal(18,16)	null,
  `geo_uat_regiuneid`	int	null,
  primary key (`geo_uat_id`),
  UNIQUE KEY `geo_uat_unique` (`geo_uat_cod`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_romanian_ci;


CREATE TABLE `geo_uat` (
  `geo_uat_id` int NOT NULL AUTO_INCREMENT,
  `geo_uat_zonataraid` int NOT NULL,
  `geo_uat_zonataracod` varchar(2) COLLATE utf8mb4_romanian_ci NOT NULL,
  `geo_uat_zonataranume` varchar(10) COLLATE utf8mb4_romanian_ci NOT NULL,
  `geo_uat_judetid` int NOT NULL,
  `geo_uat_judetcod` varchar(2) COLLATE utf8mb4_romanian_ci NOT NULL,
  `geo_uat_judetnume` varchar(64) COLLATE utf8mb4_romanian_ci NOT NULL,
  `geo_uat_cod` int NOT NULL,
  `geo_uat_nume` varchar(64) COLLATE utf8mb4_romanian_ci NOT NULL,
  `geo_uat_longitudine` decimal(18,16) DEFAULT NULL,
  `geo_uat_latitudine` decimal(18,16) DEFAULT NULL,
  `geo_uat_regiuneid` int DEFAULT NULL,
  `geo_uat_zonajudetid` int DEFAULT '0',
  `geo_uat_zonajudetcod` varchar(9) COLLATE utf8mb4_romanian_ci DEFAULT '',
  `geo_uat_zonajudetnume` varchar(64) COLLATE utf8mb4_romanian_ci DEFAULT '',
  PRIMARY KEY (`geo_uat_id`),
  UNIQUE KEY `geo_uat_unique` (`geo_uat_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=7887 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_romanian_ci;


INSERT INTO cart2.geo_uat
(
  geo_uat_id,	
  geo_uat_zonataraid,
  geo_uat_zonataracod,
  geo_uat_zonataranume,
  geo_uat_judetid,
  geo_uat_judetcod,
  geo_uat_judetnume,
  geo_uat_cod,
  geo_uat_nume,
  geo_uat_longitudine,
  geo_uat_latitudine,
  geo_uat_regiuneid
  )
  SELECT null, 1, "TR", "??ar??", geojud.geo_judet_id, geojud.geo_judet_cod, geojud.geo_judet_nume,
         uat.SIRUTA, uat.DENLOC, 0, 0, uat.REGIUNE
	FROM 
         cart2.geo_judet as geojud,
         localitati.siruta as uat
       WHERE uat.JUD = geojud.geo_judet_id  and 
             uat.NIV = 2;


INSERT INTO cart2.geo_uat(
  geo_uat_id,	
  geo_uat_zonataraid,
  geo_uat_zonataracod,
  geo_uat_zonataranume,
  geo_uat_judetid,
  geo_uat_judetcod,
  geo_uat_judetnume,
  geo_uat_cod,
  geo_uat_nume,
  geo_uat_longitudine,
  geo_uat_latitudine,
  geo_uat_regiuneid
  )
  SELECT null, 2, "DS", "Diaspora", 
         jud.geo_judet_id, jud.geo_judet_cod, jud.geo_judet_nume,
         ifnull(100000*jud.geo_judet_id + pro.id, 0), 
         ifnull(pro.name, "Whole country one region"), 
         0, 0, 0
	FROM geo_judet as jud
     RIGHT JOIN `localitati`.`provinces` as pro
    ON 
        jud.geo_judet_cod = pro.country_id
    WHERE 
	    jud.geo_judet_zonataraid = 2
        ;


DROP TABLE cart2.`geo_localitate`;
CREATE TABLE cart2.`geo_localitate` (
  `geo_localitate_id` int not null AUTO_INCREMENT,	
  `geo_localitate_zonataraid`	int not null,
  `geo_localitate_zonataracod` varchar(2)	not null,
  `geo_localitate_zonataranume`	varchar(10) not null,
  `geo_localitate_judetid`	int not null,
  `geo_localitate_judetcod`	varchar(2)	not null,
  `geo_localitate_judetnume`	varchar(64)	not null,
  `geo_localitate_uatid`	int not null,
  `geo_localitate_uatcod`	int	not null,
  `geo_localitate_uatnume`	varchar(64)	not null,
  `geo_localitate_cod`	int	not null,
  `geo_localitate_nume`	varchar(128) not null,
  `geo_localitate_longitudine`	decimal(18,16) null,
  `geo_localitate_latitudine`	decimal(18,16) null,
  `geo_localitate_regiuneid`	int	null,
  primary key (`geo_localitate_id`),
  UNIQUE KEY `geo_localitate_cod_unique` (`geo_localitate_cod`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_romanian_ci;


INSERT INTO cart2.geo_localitate(
  geo_localitate_id,	
  geo_localitate_zonataraid,
  geo_localitate_zonataracod,
  geo_localitate_zonataranume,
  geo_localitate_judetid,
  geo_localitate_judetcod,
  geo_localitate_judetnume,
  geo_localitate_uatid,
  geo_localitate_uatcod,
  geo_localitate_uatnume,
  geo_localitate_cod,
  geo_localitate_nume,
  geo_localitate_longitudine,
  geo_localitate_latitudine,
  geo_localitate_regiuneid
  )
  SELECT null, 1, "TR", "??ar??", 
         geojud.geo_judet_id, geojud.geo_judet_cod, geojud.geo_judet_nume,
         geouat.geo_uat_id, geouat.geo_uat_cod, geouat.geo_uat_nume,
         loc.SIRUTA, loc.DENLOC, 0, 0, loc.REGIUNE
	FROM 
         cart2.geo_judet as geojud,
         cart2.geo_uat   as geouat,
         localitati.siruta as loc
       WHERE loc.JUD = geojud.geo_judet_id  and 
             loc.SIRSUP = geouat.geo_uat_cod and
             loc.NIV = 3;


INSERT INTO cart2.geo_localitate(
  geo_localitate_id,	
  geo_localitate_zonataraid,
  geo_localitate_zonataracod,
  geo_localitate_zonataranume,
  geo_localitate_judetid,
  geo_localitate_judetcod,
  geo_localitate_judetnume,
  geo_localitate_uatid,
  geo_localitate_uatcod,
  geo_localitate_uatnume,
  geo_localitate_cod,
  geo_localitate_nume,
  geo_localitate_longitudine,
  geo_localitate_latitudine,
  geo_localitate_regiuneid
  )
  SELECT null, 2, "DS", "Diaspora", 
         geouat.geo_uat_judetid, geouat.geo_uat_judetcod, geouat.geo_uat_judetnume,
         geouat.geo_uat_id, geouat.geo_uat_cod, geouat.geo_uat_nume,
         geouat.geo_uat_cod*10, CONCAT("Orice localitate din regiunea ", geouat.geo_uat_nume), 
         0, 0, geouat.geo_uat_regiuneid
	     FROM 
         cart2.geo_uat   as geouat
       WHERE 
         geouat.geo_uat_zonataraid = 2;

/**
  SELECT loc.id, 1, "TR", "??ar??", jud.id, jud.code, jud.name, 
         loc.siruta, loc.name, loc.longitude, loc.latitude, loc.region
	FROM 
         localitati.account_county as jud,
         localitati.account_city as loc
       WHERE loc.county_id = jud.id       ;
*/

/**
INSERT INTO cart2.geo_localitate(
  geo_localitate_id,	
  geo_localitate_zonataraid,
  geo_localitate_zonataracod,
  geo_localitate_zonataranume,
  geo_localitate_judetid,
  geo_localitate_judetcod,
  geo_localitate_judetnume,
  geo_localitate_cod,
  geo_localitate_nume,
  geo_localitate_longitudine,
  geo_localitate_latitudine,
  geo_localitate_regiune
  )
  SELECT loc.id, 1, "TR", "??ar??", jud.id, jud.code, jud.name, 
         loc.siruta, loc.name, loc.longitude, loc.latitude, loc.region
	FROM 
         localitati.account_county as jud,
         localitati.account_city as loc
       WHERE loc.county_id = jud.id       ;


INSERT INTO cart2.geo_localitate(
  geo_localitate_id,	
  geo_localitate_zonataraid,
  geo_localitate_zonataracod,
  geo_localitate_zonataranume,
  geo_localitate_judetid,
  geo_localitate_judetcod,
  geo_localitate_judetnume,
  geo_localitate_cod,
  geo_localitate_nume,
  geo_localitate_longitudine,
  geo_localitate_latitudine,
  geo_localitate_regiune
  )
  SELECT null, 2, "DS", "Diaspora", 
         jud.geo_judet_id, jud.geo_judet_cod, jud.geo_judet_nume, 
         ifnull(100000*jud.geo_judet_id + pro.id, 0), 
         ifnull(pro.name, "Whole country one region"), 
         0, 0, ""
	FROM geo_judet as jud
     RIGHT JOIN `localitati`.`provinces` as pro
    ON 
        jud.geo_judet_cod = pro.country_id
    WHERE 
	    jud.geo_judet_zonataraid = 2
        ;

*/

'''
id	int	NO	PRI		auto_increment
county_id	int	NO	MUL		
siruta	bigint	NO			
longitude	decimal(18,16)	NO			
latitude	decimal(18,16)	NO			
name	varchar(64)	NO	MUL		
region	varchar(64)	NO			
'''

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
) engine=innodb default charset=utf8mb4 collate=utf8mb4_romanian_ci;


CREATE TABLE `geo_zonauat` (
    `geo_zonauat_id`	int not null AUTO_INCREMENT,
    `geo_zonauat_zonataraid`	int not null, 
    `geo_zonauat_zonataracod`	varchar(2) not null, 
    `geo_zonauat_zonataranume`	varchar(10) not null, 
    `geo_zonauat_judetid`	int	not null, 
    `geo_zonauat_judetcod`	varchar(2)	not null, 
    `geo_zonauat_judetnume`	varchar(32)	not null, 
    `geo_zonauat_zonajudetid`	int	not null, 
    `geo_zonauat_zonajudetcod`	varchar(9)	not null, 
    `geo_zonauat_zonajudetnume`	varchar(32)	not null, 
    `geo_zonauat_uatid`	int	not null, 
    `geo_zonauat_uatcod`	int	not null, 
    `geo_zonauat_uatnume`	varchar(32)	not null, 
    `geo_zonauat_cod`	varchar(9) not null, 
    `geo_zonauat_nume`	varchar(32)	not null, 
  primary key (`geo_uat_id`),
  UNIQUE KEY `geo_uat_cod_unique` (`geo_uat_cod`),
  UNIQUE KEY `geo_uat_nume_unique` (`geo_uat_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_romanian_ci;



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
    `geo_zonalocalitate_uatid`	int	not null, 
    `geo_zonalocalitate_uatcod`	int	not null, 
    `geo_zonalocalitate_uatnume`	varchar(64)	not null, 
    `geo_zonalocalitate_zonauatid`	int	not null, 
    `geo_zonalocalitate_zonauatcod`	varchar(9)	not null, 
    `geo_zonalocalitate_zonauatnume`	varchar(32)	not null, 
    `geo_zonalocalitate_localitateid`	int	not null, 
    `geo_zonalocalitate_localitatecod`	int	not null, 
    `geo_zonalocalitate_localitatenume`	varchar(128)	not null, 
    `geo_zonalocalitate_cod`	varchar(9) not null, 
    `geo_zonalocalitate_nume`	varchar(32)	not null, 
  primary key (`geo_zonalocalitate_id`),
  UNIQUE KEY `geo_zonalocalitate_cod_unique` (`geo_zonalocalitate_cod`),
  UNIQUE KEY `geo_zonalocalitate_nume_unique` (`geo_zonalocalitate_nume`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_romanian_ci;

???

CREATE TABLE `sectii` (
  `sectie_id` int NOT NULL AUTO_INCREMENT,
  `judet` varchar(2) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `uat` varchar(128) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `cod_siruta` int DEFAULT NULL,
  `nr_birou` int DEFAULT NULL,
  `nr_sv` int DEFAULT NULL,
  `sediu_sv` varchar(256) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `adresa_sv` varchar(256) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `localitate_sat` varchar(256) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `cod_artera` varchar(32) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `artera` varchar(512) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `numar_imobil` varchar(512) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `observatii` varchar(512) COLLATE utf8mb4_roman_ci DEFAULT NULL,
  `minsectieid` int DEFAULT NULL,
  `idx` int DEFAULT NULL,
  `codunic_artera` int DEFAULT NULL,
  PRIMARY KEY (`sectie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=131071 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


-- se repeta de n-ori --
update sectii a  join sectii b on a.sectie_id = b.sectie_id + 1
   set a.nr_sv     = b.nr_sv,
       a.sediu_sv  = b.sediu_sv,
       a.adresa_sv = b.adresa_sv
   where (a.nr_sv = 0) and (b.nr_sv > 0) ;

-- se repeta de n-ori --
update sectii a  join sectii b on a.sectie_id = b.sectie_id + 1
   set a.localitate_sat     = b.localitate_sat
   where (a.localitate_sat = '') and (b.localitate_sat <> '') ;


UPDATE localitati.sectii 
  SET cod_artera = 900000 + sectie_id,
	  artera = concat(localitate_sat, " - Strada Principal??")
    where cod_artera=0;


UPDATE sectii a 
  JOIN (select min(sectie_id) min, nr_sv, nr_birou from sectii group by nr_sv, nr_birou) b
    ON 	 (a.nr_sv  = b.nr_sv)
	 and (a.nr_birou = b.nr_birou)   
   SET a.minsectieid = b.min
       ;

UPDATE localitati.sectii 
  SET idx  = sectie_id - minsectieid;


UPDATE localitati.sectii 
  SET codunic_artera = nr_birou * 10000000 + nr_sv*1000 + idx;


DROP TABLE IF EXISTS `geo_sectievotare`;
CREATE TABLE `geo_sectievotare` (
  `geo_sectievotare_id` int NOT NULL AUTO_INCREMENT,
  `geo_sectievotare_zonataraid` int NOT NULL,
  `geo_sectievotare_zonataracod` varchar(2) NOT NULL,
  `geo_sectievotare_zonataranume` varchar(10) NOT NULL,
  `geo_sectievotare_judetid` int NOT NULL,
  `geo_sectievotare_judetcod` varchar(2) DEFAULT NULL,
  `geo_sectievotare_judetnume` varchar(32) DEFAULT NULL,
  `geo_sectievotare_zonajudetid` int DEFAULT NULL,
  `geo_sectievotare_zonajudetcod` varchar(9) DEFAULT NULL,
  `geo_sectievotare_zonajudetnume` varchar(32) DEFAULT NULL,
  `geo_sectievotare_uatid` int DEFAULT NULL,
  `geo_sectievotare_uatcod` int DEFAULT NULL,
  `geo_sectievotare_uatnume` varchar(128) DEFAULT NULL,
  `geo_sectievotare_zonauatid` int DEFAULT NULL,
  `geo_sectievotare_zonauatcod` varchar(9) DEFAULT NULL,
  `geo_sectievotare_zonauatnume` varchar(32) DEFAULT NULL,
  `geo_sectievotare_localitateid` int DEFAULT NULL,
  `geo_sectievotare_localitatecod` int DEFAULT NULL,
  `geo_sectievotare_localitatenume` varchar(128) DEFAULT NULL,
  `geo_sectievotare_zonalocalitateid` int DEFAULT NULL,
  `geo_sectievotare_zonalocalitatecod` varchar(9) DEFAULT NULL,
  `geo_sectievotare_zonalocalitatenume` varchar(32) DEFAULT NULL,
  `geo_sectievotare_nr` int NOT NULL,
  `geo_sectievotare_sediu` varchar(128) NOT NULL,
  `geo_sectievotare_nrbe` int NOT NULL,
  `geo_sectievotare_codsiruta` int NOT NULL,
  `geo_sectievotare_tmp_judet` varchar(2) DEFAULT NULL,
  `geo_sectievotare_tmp_uat` varchar(64) DEFAULT NULL,
  `geo_sectievotare_tmp_cod_siruta` int DEFAULT NULL,
  `geo_sectievotare_nr_birou` int DEFAULT NULL,
  `geo_sectievotare_nr_sv` int DEFAULT NULL,
  `geo_sectievotare_sediu_sv` varchar(256) DEFAULT NULL,
  `geo_sectievotare_adresa_sv` varchar(256) DEFAULT NULL,
  `geo_sectievotare_sirutalevel2_yn` varchar(1) DEFAULT NULL,
  `geo_sectievotare_sirutalevel3_yn` varchar(1) DEFAULT NULL,
  `geo_sectievotare_partedinsv_yn` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`geo_sectievotare_id`),
  UNIQUE KEY `geo_sectievotare_nr_unique` (`geo_sectievotare_nr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;




TRUNCATE TABLE cart2.geo_sectievotare;
INSERT INTO cart2.geo_sectievotare(
  `geo_sectievotare_id`,
  `geo_sectievotare_zonataraid`,
  `geo_sectievotare_zonataracod`,
  `geo_sectievotare_zonataranume`,
  `geo_sectievotare_judetid`,
  `geo_sectievotare_judetcod`,
  `geo_sectievotare_judetnume`,
  `geo_sectievotare_zonajudetid`,
  `geo_sectievotare_zonajudetcod`,
  `geo_sectievotare_zonajudetnume`,
  `geo_sectievotare_uatid`,
  `geo_sectievotare_uatcod`,
  `geo_sectievotare_uatnume`,
  `geo_sectievotare_zonauatid`,
  `geo_sectievotare_zonauatcod`,
  `geo_sectievotare_zonauatnume`,
  `geo_sectievotare_localitateid`,
  `geo_sectievotare_localitatecod`,
  `geo_sectievotare_localitatenume`,
  `geo_sectievotare_zonalocalitateid`,
  `geo_sectievotare_zonalocalitatecod`,
  `geo_sectievotare_zonalocalitatenume`,
  `geo_sectievotare_nr`,
  `geo_sectievotare_sediu`,
  `geo_sectievotare_nrbe`,
  `geo_sectievotare_codsiruta`,
  `geo_sectievotare_tmp_judet`,
  `geo_sectievotare_tmp_uat`,
  `geo_sectievotare_tmp_cod_siruta`,
  `geo_sectievotare_nr_birou`,
  `geo_sectievotare_nr_sv`,
  `geo_sectievotare_sediu_sv`,
  `geo_sectievotare_adresa_sv`,
  `geo_sectievotare_sirutalevel2_yn`,
  `geo_sectievotare_sirutalevel3_yn`,
  `geo_sectievotare_partedinsv_yn`
  )
  SELECT
     null, -- `geo_sectievotare_id`,
     0, -- `geo_sectievotare_zonataraid`,
     0, -- `geo_sectievotare_zonataracod`,
     0, -- `geo_sectievotare_zonataranume`,
     0, -- `geo_sectievotare_judetid`,
     0, -- `geo_sectievotare_judetcod`,
     0, -- `geo_sectievotare_judetnume`,
     0, -- `geo_sectievotare_zonajudetid`,
     0, -- `geo_sectievotare_zonajudetcod`,
     0, -- `geo_sectievotare_zonajudetnume`,
     0, -- `geo_sectievotare_uatid`,
     0, -- `geo_sectievotare_uatcod`,
     0, -- `geo_sectievotare_uatnume`,
     0, -- `geo_sectievotare_zonauatid`,
     0, -- `geo_sectievotare_zonauatcod`,
     0, -- `geo_sectievotare_zonauatnume`,
     0, -- `geo_sectievotare_localitateid`,
     0, -- `geo_sectievotare_localitatecod`,
     0, -- `geo_sectievotare_localitatenume`,
     0, -- `geo_sectievotare_zonalocalitateid`,
     0, -- `geo_sectievotare_zonalocalitatecod`,
     0, -- `geo_sectievotare_zonalocalitatenume`,
     nr_birou * 100000 + nr_sv, -- `geo_sectievotare_nr`,
     0, -- `geo_sectievotare_sediu`,
     0, -- `geo_sectievotare_nrbe`,
     0, -- `geo_sectievotare_codsiruta`,
     judet, -- `geo_sectievotare_tmp_judet`,
     uat, -- `geo_sectievotare_tmp_uat`,
     cod_siruta, -- `geo_sectievotare_tmp_cod_siruta`,
     nr_birou, -- `geo_sectievotare_nr_birou`,
     nr_sv, -- `geo_sectievotare_nr_sv`,
     sediu_sv, -- `geo_sectievotare_sediu_sv`,
     adresa_sv, -- `geo_sectievotare_adresa_sv`,
     null, -- `geo_sectievotare_sirutalevel2_yn`,
     null, -- `geo_sectievotare_sirutalevel3_yn`,
     null -- `geo_sectievotare_partedinsv_yn`
	     FROM 
         (SELECT distinct judet, uat, cod_siruta, nr_birou, nr_sv, sediu_sv, adresa_sv FROM localitati.sectii) as s
          WHERE nr_birou * 10000 + nr_sv is not null;


update geo_sectievotare a join geo_uat b on a.geo_sectievotare_tmp_cod_siruta = b.geo_uat_cod
   set 
      `geo_sectievotare_zonataraid`         =  `geo_uat_zonataraid`,
      `geo_sectievotare_zonataracod`        =  `geo_uat_zonataracod`,
      `geo_sectievotare_zonataranume`       =  `geo_uat_zonataranume`,
      `geo_sectievotare_judetid`            =  `geo_uat_judetid`,
      `geo_sectievotare_judetcod`           =  `geo_uat_judetcod`,
      `geo_sectievotare_judetnume`          =  `geo_uat_judetnume`,
      `geo_sectievotare_zonajudetid`        =  `geo_uat_zonajudetid`,
      `geo_sectievotare_zonajudetcod`       =  `geo_uat_zonajudetcod`,
      `geo_sectievotare_zonajudetnume`      =  `geo_uat_zonajudetnume`,
      `geo_sectievotare_uatid`              =  `geo_uat_id`,
      `geo_sectievotare_uatcod`             =  `geo_uat_cod`,
      `geo_sectievotare_uatnume`            =  `geo_uat_nume`,
      `geo_sectievotare_zonauatid`          =  0,
      `geo_sectievotare_zonauatcod`         =  0,
      `geo_sectievotare_zonauatnume`        =  '',
      `geo_sectievotare_localitateid`       = 0,
      `geo_sectievotare_localitatecod`      = 0,
      `geo_sectievotare_localitatenume`     = '',
      `geo_sectievotare_zonalocalitateid`   = 0,
      `geo_sectievotare_zonalocalitatecod`  = 0,
      `geo_sectievotare_zonalocalitatenume` = '',
      `geo_sectievotare_sirutalevel2_yn`    = 'y',
      `geo_sectievotare_sirutalevel3_yn`    = 'n',
      `geo_sectievotare_partedinsv_yn`      = 'n'
     ;

update geo_sectievotare a join geo_localitate b on a.geo_sectievotare_tmp_cod_siruta = b.geo_localitate_cod
   set 
      `geo_sectievotare_zonataraid`         =  `geo_localitate_zonataraid`,
      `geo_sectievotare_zonataracod`        =  `geo_localitate_zonataracod`,
      `geo_sectievotare_zonataranume`       =  `geo_localitate_zonataranume`,
      `geo_sectievotare_judetid`            =  `geo_localitate_judetid`,
      `geo_sectievotare_judetcod`           =  `geo_localitate_judetcod`,
      `geo_sectievotare_judetnume`          =  `geo_localitate_judetnume`,
      `geo_sectievotare_zonajudetid`        =  0, -- `geo_localitate_zonajudetid`,
      `geo_sectievotare_zonajudetcod`       =  0, -- `geo_localitate_zonajudetcod`,
      `geo_sectievotare_zonajudetnume`      =  '',-- `geo_localitate_zonajudetnume`,
      `geo_sectievotare_uatid`              =  `geo_localitate_uatid`,
      `geo_sectievotare_uatcod`             =  `geo_localitate_uatcod`,
      `geo_sectievotare_uatnume`            =  `geo_localitate_uatnume`,
      `geo_sectievotare_zonauatid`          =  0,
      `geo_sectievotare_zonauatcod`         =  0,
      `geo_sectievotare_zonauatnume`        =  '',
      `geo_sectievotare_localitateid`       = `geo_localitate_id`,
      `geo_sectievotare_localitatecod`      = `geo_localitate_cod`,
      `geo_sectievotare_localitatenume`     = `geo_localitate_nume`,
      `geo_sectievotare_zonalocalitateid`   = 0,
      `geo_sectievotare_zonalocalitatecod`  = 0,
      `geo_sectievotare_zonalocalitatenume` = '',
      `geo_sectievotare_sirutalevel2_yn`    = 'n',
      `geo_sectievotare_sirutalevel3_yn`    = 'y',
      `geo_sectievotare_partedinsv_yn`      = 'n'
     ;



DROP TABLE IF EXISTS `geo_strada`;
CREATE TABLE `geo_strada` (
  `geo_strada_id` int NOT NULL AUTO_INCREMENT,
  `geo_strada_zonataraid` int NOT NULL,
  `geo_strada_zonataracod` varchar(2) NOT NULL,
  `geo_strada_zonataranume` varchar(10) NOT NULL,
  `geo_strada_judetid` int NOT NULL,
  `geo_strada_judetcod` varchar(2) DEFAULT NULL,
  `geo_strada_judetnume` varchar(32) DEFAULT NULL,
  `geo_strada_zonajudetid` int DEFAULT NULL,
  `geo_strada_zonajudetcod` varchar(9) DEFAULT NULL,
  `geo_strada_zonajudetnume` varchar(32) DEFAULT NULL,
  `geo_strada_uatid` int DEFAULT NULL,
  `geo_strada_uatcod` int DEFAULT NULL,
  `geo_strada_uatnume` varchar(128) DEFAULT NULL,
  `geo_strada_zonauatid` int DEFAULT NULL,
  `geo_strada_zonauatcod` varchar(9) DEFAULT NULL,
  `geo_strada_zonauatnume` varchar(32) DEFAULT NULL,
  `geo_strada_sectievotareid` int DEFAULT NULL,
  `geo_strada_sectievotarecod` int DEFAULT NULL,
  `geo_strada_sectievotarenume` varchar(128) DEFAULT NULL,
  `geo_strada_localitateid` int DEFAULT NULL,
  `geo_strada_localitatecod` int DEFAULT NULL,
  `geo_strada_localitatenume` varchar(128) DEFAULT NULL,
  `geo_strada_zonalocalitateid` int DEFAULT NULL,
  `geo_strada_zonalocalitatecod` varchar(9) DEFAULT NULL,
  `geo_strada_zonalocalitatenume` varchar(32) DEFAULT NULL,
  `geo_strada_cod` int NOT NULL,
  `geo_strada_tip` varchar(16) NOT NULL,
  `geo_strada_nume` varchar(256) NOT NULL,
  `geo_strada_numecomplet` varchar(1024) NOT NULL,
  `geo_strada_numere` varchar(512) NOT NULL,
  `geo_strada_tmp_judet` varchar(2) DEFAULT NULL,
  `geo_strada_tmp_uat` varchar(64) DEFAULT NULL,
  `geo_strada_tmp_cod_siruta` int DEFAULT NULL,
  `geo_strada_tmp_nr` int DEFAULT NULL,
  `geo_strada_tmp_nrbe` int DEFAULT NULL,
  `geo_strada_tmp_nrsv` int DEFAULT NULL,
  `geo_strada_tmp_sediusv` varchar(256) DEFAULT NULL,
  `geo_strada_tmp_adresasv` varchar(256) DEFAULT NULL,
  `geo_strada_tmp_sirutalevel2_yn` varchar(1) DEFAULT NULL,
  `geo_strada_tmp_sirutalevel3_yn` varchar(1) DEFAULT NULL,
  `geo_strada_tmp_localitate` varchar(128) DEFAULT NULL,
  `geo_strada_tmp_codartera` int DEFAULT NULL,
  `geo_strada_tmp_artera` varchar(256) DEFAULT NULL,
  `geo_strada_tmp_numere` varchar(512) NOT NULL,
  `geo_strada_tmp_observatii` varchar(512) NOT NULL, 
  PRIMARY KEY (`geo_strada_id`),
  UNIQUE KEY `geo_strada_cod_unique` (`geo_strada_cod`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



TRUNCATE TABLE cart2.geo_strada;
INSERT INTO cart2.geo_strada(
  `geo_strada_id`,
  `geo_strada_zonataraid`,
  `geo_strada_zonataracod`,
  `geo_strada_zonataranume`,
  `geo_strada_judetid`,
  `geo_strada_judetcod`,
  `geo_strada_judetnume`,
  `geo_strada_zonajudetid`,
  `geo_strada_zonajudetcod`,
  `geo_strada_zonajudetnume`,
  `geo_strada_uatid`,
  `geo_strada_uatcod`,
  `geo_strada_uatnume`,
  `geo_strada_zonauatid`,
  `geo_strada_zonauatcod`,
  `geo_strada_zonauatnume`,
  `geo_strada_sectievotareid`,
  `geo_strada_sectievotarecod`,
  `geo_strada_sectievotarenume`,  
  `geo_strada_localitateid`,
  `geo_strada_localitatecod`,
  `geo_strada_localitatenume`,
  `geo_strada_zonalocalitateid`,
  `geo_strada_zonalocalitatecod`,
  `geo_strada_zonalocalitatenume`,
  `geo_strada_cod`,
  `geo_strada_tip`,
  `geo_strada_nume`,
  `geo_strada_numecomplet`,
  `geo_strada_numere`,
  `geo_strada_tmp_judet`,
  `geo_strada_tmp_uat`,
  `geo_strada_tmp_cod_siruta`,
  `geo_strada_tmp_nr`,
  `geo_strada_tmp_nrbe`,
  `geo_strada_tmp_nrsv`,
  `geo_strada_tmp_sediusv`,
  `geo_strada_tmp_adresasv`,
  `geo_strada_tmp_sirutalevel2_yn`,
  `geo_strada_tmp_sirutalevel3_yn`,
  `geo_strada_tmp_localitate`,
  `geo_strada_tmp_codartera`,
  `geo_strada_tmp_artera`,
  `geo_strada_tmp_numere`,
  `geo_strada_tmp_observatii` 
  )
  SELECT
     null, -- `geo_sectievotare_id`,
     0, -- `geo_sectievotare_zonataraid`,
     0, -- `geo_sectievotare_zonataracod`,
     0, -- `geo_sectievotare_zonataranume`,
     0, -- `geo_sectievotare_judetid`,
     0, -- `geo_sectievotare_judetcod`,
     0, -- `geo_sectievotare_judetnume`,
     0, -- `geo_sectievotare_zonajudetid`,
     0, -- `geo_sectievotare_zonajudetcod`,
     0, -- `geo_sectievotare_zonajudetnume`,
     0, -- `geo_sectievotare_uatid`,
     0, -- `geo_sectievotare_uatcod`,
     0, -- `geo_sectievotare_uatnume`,
     0, -- `geo_sectievotare_zonauatid`,
     0, -- `geo_sectievotare_zonauatcod`,
     0, -- `geo_sectievotare_zonauatnume`,
     0, -- `geo_strada_sectievotareid`,
     0, -- `geo_strada_sectievotarecod`,
     0, -- `geo_strada_sectievotarenume`,  
     0, -- `geo_sectievotare_localitateid`,
     0, -- `geo_sectievotare_localitatecod`,
     0, -- `geo_sectievotare_localitatenume`,
     0, -- `geo_sectievotare_zonalocalitateid`,
     0, -- `geo_sectievotare_zonalocalitatecod`,
     0, -- `geo_sectievotare_zonalocalitatenume`,

    codunic_artera,                    -- `geo_strada_cod`,
    '',                                 -- `geo_strada_tip`,
    artera,                            -- `geo_strada_nume`,
    concat(artera, ' ', numar_imobil), -- `geo_strada_numecomplet`,
    numar_imobil,                       -- `geo_strada_numere`,
    judet,                              -- `geo_strada_tmp_judet`,
    uat,                                -- `geo_strada_tmp_uat`,
    cod_siruta,                          -- `geo_strada_tmp_cod_siruta`,
    nr_birou * 100000 + nr_sv,           -- `geo_strada_tmp_nr`,
    nr_birou,                            -- `geo_strada_tmp_nrbe`,
    nr_sv,                               --  `geo_strada_tmp_nrsv`,
    sediu_sv,                            --  `geo_strada_tmp_sediusv`,
    adresa_sv,                           --  `geo_strada_tmp_adresasv`,
    null,                                -- `geo_strada_tmp_sirutalevel2_yn`,
    null,                                -- `geo_strada_tmp_sirutalevel3_yn`,
    localitate_sat,                      -- `geo_strada_tmp_localitate`,
    cod_artera,                          -- `geo_strada_tmp_codartera`,
    artera, -- `geo_strada_tmp_artera`,
    numar_imobil, -- `geo_strada_tmp_numere`,
    observatii -- `geo_strada_tmp_observatii` 

	     FROM 
         (SELECT judet, uat, cod_siruta, nr_birou, nr_sv, 
                          sediu_sv, adresa_sv, localitate_sat, cod_artera, artera, numar_imobil, observatii, codunic_artera
          FROM localitati.sectii) as s
          WHERE nr_birou * 10000 + nr_sv is not null;



update geo_strada a join geo_sectievotare b on a.geo_strada_tmp_nr = b.geo_sectievotare_nr
   set 
      `geo_strada_zonataraid`         =  `geo_sectievotare_zonataraid`,
      `geo_strada_zonataracod`        =  `geo_sectievotare_zonataracod`,
      `geo_strada_zonataranume`       =  `geo_sectievotare_zonataranume`,
      `geo_strada_judetid`            =  `geo_sectievotare_judetid`,
      `geo_strada_judetcod`           =  `geo_sectievotare_judetcod`,
      `geo_strada_judetnume`          =  `geo_sectievotare_judetnume`,
      `geo_strada_zonajudetid`        =  `geo_sectievotare_zonajudetid`,
      `geo_strada_zonajudetcod`       =  `geo_sectievotare_zonajudetcod`,
      `geo_strada_zonajudetnume`      =  `geo_sectievotare_zonajudetnume`,
      `geo_strada_uatid`              =  `geo_sectievotare_uatid`,
      `geo_strada_uatcod`             =  `geo_sectievotare_uatcod`,
      `geo_strada_uatnume`            =  `geo_sectievotare_uatnume`,
      `geo_strada_zonauatid`          =  `geo_sectievotare_zonauatid`,
      `geo_strada_zonauatcod`         =  `geo_sectievotare_zonauatcod`,
      `geo_strada_zonauatnume`        =  `geo_sectievotare_zonauatnume`,
      `geo_strada_localitateid`       =  `geo_sectievotare_localitateid`,
      `geo_strada_localitatecod`      =  `geo_sectievotare_localitatecod`,
      `geo_strada_localitatenume`     =  `geo_sectievotare_localitatenume`,
      `geo_strada_zonalocalitateid`   =  `geo_sectievotare_zonalocalitateid`,
      `geo_strada_zonalocalitatecod`  =  `geo_sectievotare_zonalocalitatecod`,
      `geo_strada_zonalocalitatenume` =  `geo_sectievotare_zonalocalitatenume`,
      `geo_strada_sectievotareid`     =  `geo_sectievotare_id`,
      `geo_strada_sectievotarecod`    =  `geo_sectievotare_nr`,
      `geo_strada_sectievotarenume`   =  `geo_sectievotare_sediu`
      ;



tip_artera	denumire_artera	numar_codpostal	sector	oficiu_distribuire siruta sector	niv	sirsup


TRUNCATE TABLE IF EXISTS geo_codpostal;
CREATE TABLE `geo_codpostal` (
  `geo_codpostal_id` int not null AUTO_INCREMENT,  
  `geo_codpostal_zonataraid` int	not null, 	
  `geo_codpostal_zonataracod` varchar(2) not null, 
  `geo_codpostal_zonataranume` varchar(10)	not null, 
  `geo_codpostal_judetid` int	not null, 
  `geo_codpostal_judetcod` varchar(2) not null, 
  `geo_codpostal_judetnume` varchar(32)	not null, 
  `geo_codpostal_zonajudetid` int	not null, 
  `geo_codpostal_zonajudetcod` varchar(9) not null, 
  `geo_codpostal_zonajudetnume` varchar(32)	not null, 
  `geo_codpostal_localitateid` int not null, 
  `geo_codpostal_localitatecod` int	not null, 
  `geo_codpostal_localitatenume` varchar(32) not null, 
  `geo_codpostal_zonalocalitateid` int not null, 
  `geo_codpostal_zonalocalitatecod` varchar(9) not null, 
  `geo_codpostal_zonalocalitatenume` varchar(32)	not null, 
  `geo_codpostal_sectievotareid` int not null, 
  `geo_codpostal_sectievotarenr` int not null, 
  `geo_codpostal_sectievotaresediu` varchar(128) not null, 
  `geo_codpostal_cod` varchar(16)	not null, 
  `geo_codpostal_tipstrada` int not null,	
  `geo_codpostal_strada` varchar(128)	not null,	
  `geo_codpostal_numerebloc` varchar(128)	not null,
  primary key (`geo_codpostal_id`),
  UNIQUE KEY `geo_codpostal_cod_unique` (`geo_codpostal_cod`)
) engine=innodb default charset=utf8mb4 collate=utf8mb4_romanian_ci;





-- ===============================================================
--   MEM
-- ===============================================================

DROP TABLE `mem_tiprol`;
CREATE TABLE `mem_tiprol` (
  `mem_tiprol_id` int NOT NULL AUTO_INCREMENT,
  `mem_tiprol_cod` varchar(10) NOT NULL,
  `mem_tiprol_nume` varchar(64) NOT NULL,
  `mem_tiprol_descriere` varchar(256),
  `mem_tiprol_activ_yn` varchar(1) NOT NULL,
  `mem_tiprol_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_tiprol_enddt` datetime DEFAULT NULL,
  `mem_tiprol_displaynume` varchar(64) NOT NULL,
  `mem_tiprol_displaydescriere` varchar(256),
  PRIMARY KEY (`mem_tiprol_id`),
  UNIQUE KEY `mem_tiprol_cod_unique` (`mem_tiprol_cod`),
  UNIQUE KEY `mem_tiprol_nume_unique` (`mem_tiprol_nume`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


TRUNCATE TABLE mem_tiprol;
INSERT INTO mem_tiprol ( `mem_tiprol_id`, `mem_tiprol_cod`, `mem_tiprol_nume`, `mem_tiprol_descriere`,
                         `mem_tiprol_activ_yn`, `mem_tiprol_displaynume`, `mem_tiprol_displaydescriere`) 
        VALUES  (1,	'SUPERADMIN', 'Superadministrator','Sunte??i Superadministrator IT. Intra??i pe pagina Superadministratorului IT...'
                            ,'y', 'Superadministrator','Sunte??i Superadministrator IT. Intra??i pe pagina Superadministratorului IT...'),

                (2, 'ADMIN',      'Administrator','Sunte??i Administrator IT. Intra??i pe pagina Administratorului IT...'
                            ,'y', 'Administrator','Sunte??i Administrator IT. Intra??i pe pagina Administratorului IT...'),

                (3, 'COORDPRINC', 'Coordonator principal','Sunte??i Coordonator Principal. Intra??i pe pagina Coordonatorului Principal...'
                            ,'y', 'Coordonator principal','Sunte??i Coordonator Principal. Intra??i pe pagina Coordonatorului Principal...'),

                (4, 'ORGANIZVOT', 'Organizator votare',           '','n', 'Organizator votare',''),
                (5, 'CREATORVOT', 'Creator votare',               '','n', 'Creator votare',''),
                (6, 'EVALUATVOT', 'Evaluator rezultate votare',   '','n', 'Evaluator rezultate votare',''),
                (7, 'VALIDATVOT', 'Validator evaluare votare',    '','n', 'Validator evaluare votare',''),
                (8, 'VOTANT',     'Votant',                       '','n', 'Votant',''),
                (9, 'CREATORACT', 'Creator ac??iune',              '','n', 'Creator ac??iune',''),

                (11, 'EXECUTACT', 'Executant ac??iune',            '','n', 'Executant ac??iune',''),

                (12, 'EVALUATREZ','Evaluator rezultate ac??iune', 'Sunte??i Evaluator al Rezultatelor Ac??iunilor. Intra??i pe pagina Evaluatorului...'
                             ,'y', 'Evaluator rezultate ac??iune','Sunte??i Evaluator al Rezultatelor Ac??iunilor. Intra??i pe pagina Evaluatorului...'),

                (13, 'VALIDATEVL','Validator evaluare ac??iune', 'Sunte??i Validator al Evalu??rilor f??cute Rezultatelor Ac??iunilor. Intra??i pe pagina Validatorului...'
                             ,'y', 'Validator evaluare ac??iune','Sunte??i Validator al Evalu??rilor f??cute Rezultatelor Ac??iunilor. Intra??i pe pagina Validatorului...'),

                (14, 'SIMPATIZ',  'Simpatizant al Partidului','Sunte??i Simpatizant al Partidului. Intra??i pe pagina Simpatizantului de Partid...'
                            ,'y', 'Simpatizant al Partidului','Sunte??i Simpatizant al Partidului. Intra??i pe pagina Simpatizantului de Partid...'),

                (15, 'MEMINCAFL', 'Membru ??ncep??tor Afiliat','Sunte??i Membru ??ncep??tor al Partidului Afiliat unui Grup. Intra??i pe pagina Membru ??ncep??tor Afiliat...'
                            ,'y', 'Membru ??ncep??tor Afiliat','Sunte??i Membru ??ncep??tor al Partidului Afiliat unui Grup. Intra??i pe pagina Membru ??ncep??tor Afiliat...'),

                (16, 'MEMINCNFL', 'Membru ??ncep??tor Neafiliat','Sunte??i Membru ??ncep??tor al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului ??ncep??tor Neafiliat...'
                            ,'y', 'Membru ??ncep??tor Neafiliat','Sunte??i Membru ??ncep??tor al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului ??ncep??tor neafiliat...'),

                (17, 'MEMACTAFL', 'Membru Activ Afiliat','Sunte??i Membru Activ al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Activ Afiliat...'
                            ,'y', 'Membru Activ Afiliat','Sunte??i Membru Activ al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Activ Afiliat...'),

                (18, 'MEMACTNFL', 'Membru Activ Neafiliat','Sunte??i Membru Activ al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Activ Neafiliat...'
                            ,'y', 'Membru Activ Neafiliat','Sunte??i Membru Activ al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Activ Neafiliat...'),

                (19, 'MEMEXPAFL', 'Membru Experimentat Afiliat','Sunte??i Membru Experimentat al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Experimentat Afiliat...'
                            ,'y', 'Membru Experimentat Afiliat','Sunte??i Membru Experimentat al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Experimentat Afiliat...'),

                (20, 'MEMEXPNFL', 'Membru Experimentat Neafiliat','Sunte??i Membru Experimentat al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Experimentat Neafiliat...'
                            ,'y', 'Membru Experimentat Neafiliat','Sunte??i Membru Experimentat al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Experimentat Neafiliat...'),

                (21, 'SEFGRUP',  '??ef de Grup', 'Sunte??i ??eful Unui Grup Al Partidului. Intra??i pe pagina ??efului de Grup...'                 
                           ,'y', '??ef de Grup', 'Sunte??i ??eful Unui Grup Al Partidului. Intra??i pe pagina ??efului de Grup...'),

                (22, 'ORGANIZACT','Organizator de Activit????i','Sunte??i Organizator de Activit????i ale Partidului. Intra??i pe pagina Organizatorului de Activit????i...'
                            ,'y', 'Organizator de Activit????i','Sunte??i Organizator de Activit????i ale Partidului. Intra??i pe pagina Organizatorului de Activit????i...'),

                (23, 'SIMPATPEND','Simpatizant ??n A??teptare','V-a??i ??nregistrat ca Simpatizant al Partidului. V?? rug??m s?? confirma??i ??nregistrarea...'
                            ,'y', 'Simpatizant ??n A??teptare','V-a??i ??nregistrat ca Simpatizant al Partidului. V?? rug??m s?? confirma??i ??nregistrarea...'),

                (24, 'ORGANIPEND','Organizator Activit????i ??n A??teptare','A??i fost invitat s?? deveni??i Organizator de Activit????i al Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'
                             ,'y','Organizator Activit????i ??n A??teptare','A??i fost invitat s?? deveni??i Organizator de Activit????i al Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'),

                (25, 'EVALUAPEND','Evaluator Rezultate ??n A??teptare','A??i fost invitat s?? deveni??i Evaluator al Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'
                             ,'y','Evaluator Rezultate ??n A??teptare','A??i fost invitat s?? deveni??i Evaluator al Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'),

                (26, 'VALIDAPEND','Validator Evalu??ri ??n A??teptare','A??i fost invitat s?? deveni??i Validator al Evalu??rilor Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'  
                           '','y','Validator Evalu??ri ??n A??teptare','A??i fost invitat s?? deveni??i Validator al Evalu??rilor Rezultatelor Activit????ilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'),

                (27, 'COORPRPEND','Coordonator Principal ??n A??teptare','A??i fost invitat s?? deveni??i Coordonator Principal al Activit????ilor ??i Vot??rilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.'  
                             ,'y','Coordonator Principal ??n A??teptare','A??i fost invitat s?? deveni??i Coordonator Principal al Activit????ilor ??i Vot??rilor Partidului. V?? rug??m s?? confirma??i sau s?? infirma??i invita??ia primit??.');




DROP TABLE `mem_tip`;
CREATE TABLE `mem_tip` (
  `mem_tip_id` int NOT NULL AUTO_INCREMENT,
  `mem_tip_cod` varchar(10) NOT NULL,
  `mem_tip_nume` varchar(64) NOT NULL,
  `mem_tip_descriere` varchar(256),
  `mem_tip_activ_yn` varchar(1) NOT NULL,
  `mem_tip_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_tip_enddt` datetime DEFAULT NULL,
  `mem_tip_displaynume` varchar(64) NOT NULL,
  `mem_tip_displaydescriere` varchar(256),
  PRIMARY KEY (`mem_tip_id`),
  UNIQUE KEY `mem_tip_cod_unique` (`mem_tip_cod`),
  UNIQUE KEY `mem_tip_nume_unique` (`mem_tip_nume`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


TRUNCATE TABLE mem_tip;
INSERT INTO mem_tip ( `mem_tip_id`, `mem_tip_cod`, `mem_tip_nume`, `mem_tip_descriere`,
                      `mem_tip_activ_yn`, `mem_tip_displaynume`, `mem_tip_displaydescriere`) 
        VALUES  
        (14, 'SIMPATIZ',  'Simpatizant al Partidului','Sunte??i Simpatizant al Partidului. Intra??i pe pagina Simpatizantului de Partid...'
        ,'y', 'Simpatizant al Partidului','Sunte??i Simpatizant al Partidului. Intra??i pe pagina Simpatizantului de Partid...'),

        (15, 'MEMINCAFL', 'Membru ??ncep??tor Afiliat','Sunte??i Membru ??ncep??tor al Partidului Afiliat unui Grup. Intra??i pe pagina Membru ??ncep??tor Afiliat...'
        ,'y', 'Membru ??ncep??tor Afiliat','Sunte??i Membru ??ncep??tor al Partidului Afiliat unui Grup. Intra??i pe pagina Membru ??ncep??tor Afiliat...'),

        (16, 'MEMINCNFL', 'Membru ??ncep??tor Neafiliat','Sunte??i Membru ??ncep??tor al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului ??ncep??tor Neafiliat...'
        ,'y', 'Membru ??ncep??tor Neafiliat','Sunte??i Membru ??ncep??tor al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului ??ncep??tor neafiliat...'),

        (17, 'MEMACTAFL', 'Membru Activ Afiliat','Sunte??i Membru Activ al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Activ Afiliat...'
        ,'y', 'Membru Activ Afiliat','Sunte??i Membru Activ al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Activ Afiliat...'),

        (18, 'MEMACTNFL', 'Membru Activ Neafiliat','Sunte??i Membru Activ al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Activ Neafiliat...'
        ,'y', 'Membru Activ Neafiliat','Sunte??i Membru Activ al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Activ Neafiliat...'),

        (19, 'MEMEXPAFL', 'Membru Experimentat Afiliat','Sunte??i Membru Experimentat al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Experimentat Afiliat...'
        ,'y', 'Membru Experimentat Afiliat','Sunte??i Membru Experimentat al Partidului Afiliat unui Grup. Intra??i pe pagina Membrului Experimentat Afiliat...'),

        (20, 'MEMEXPNFL', 'Membru Experimentat Neafiliat','Sunte??i Membru Experimentat al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Experimentat Neafiliat...'
        ,'y', 'Membru Experimentat Neafiliat','Sunte??i Membru Experimentat al Partidului Neafiliat nici unui Grup. Intra??i pe pagina Membrului Experimentat Neafiliat...'),

        (21, 'SEFGRUP',  '??ef de Grup', 'Sunte??i ??eful Unui Grup Al Partidului. Intra??i pe pagina ??efului de Grup...'                 
        ,'y', '??ef de Grup', 'Sunte??i ??eful Unui Grup Al Partidului. Intra??i pe pagina ??efului de Grup...'),

        (22, 'ORGANIZACT','Organizator de Activit????i','Sunte??i Organizator de Activit????i ale Partidului. Intra??i pe pagina Organizatorului de Activit????i...'
        ,'y', 'Organizator de Activit????i','Sunte??i Organizator de Activit????i ale Partidului. Intra??i pe pagina Organizatorului de Activit????i...'
      );





DROP TABLE IF EXISTS `mem_membru`;
CREATE TABLE `mem_membru` (
  `mem_membru_id` int NOT NULL AUTO_INCREMENT,
  `mem_membru_codunic`	varchar(16),	

  `mem_membru_userid` int	not null,
  `mem_membru_usernume` varchar(20)	not null,
  `mem_membru_userinfoid` int	not null,

  `mem_membru_tipid`	int,
  `mem_membru_tipcod`	varchar(10),	

  `mem_membru_grupid` int, 	
  `mem_membru_grupnume` varchar(20),
  `mem_membru_grupcodunic` varchar(16), 

  `mem_membru_adrrezidenta_yn`	char(1), 
  `mem_membru_zonataraid` int	not null, 	
  `mem_membru_zonataracod` varchar(2) not null, 
  `mem_membru_judetid` int	not null, 
  `mem_membru_judetcod` varchar(2) not null, 
  `mem_membru_zonajudetid` int	not null, 
  `mem_membru_zonajudetcod` varchar(9) not null, 
  `mem_membru_uatid`	  int not null,
  `mem_membru_uatcod`	  int	not null,
  `mem_membru_zonauatid` int not null, 
  `mem_membru_zonauatcod` varchar(9) not null, 
  `mem_membru_localitateid` int not null, 
  `mem_membru_localitatecod` int	not null, 
  `mem_membru_zonalocalitateid` int not null, 
  `mem_membru_zonalocalitatecod` varchar(9) not null, 
  `mem_membru_sectievotareid` int not null, 
  `mem_membru_sectievotarenr` int not null, 
  `mem_membru_codpostalid` int not null,  
  `mem_membru_codpostalcod` varchar(16)	not null, 

  `mem_membru_complci_yn` char(1),
  `mem_membru_compladr_yn` char(1),
  `mem_membru_platitcotiz_yn` char(1),
  `mem_membru_complskills_yn` char(1),
  `mem_membru_activ_yn` varchar(1) NOT NULL,
  `mem_membru_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_membru_enddt` datetime DEFAULT NULL,
  `mem_membru_suspended_yn` char(1),	

  PRIMARY KEY (`mem_membru_id`),
  UNIQUE KEY `mem_membru_codunique_unique` (`mem_membru_codunic`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE IF EXISTS `mem_membruci`;
CREATE TABLE `mem_membruci` (
  `mem_membruci_id` int NOT NULL AUTO_INCREMENT,
  `mem_membruci_membruid` int	not null,
  `mem_membruci_membrucodunic` varchar(16) not null,
  `mem_membruci_userid` int	not null,
  `mem_membruci_usernume` varchar(20)	not null,
  `mem_membruci_userinfoid` int	not null,
  `mem_membruci_cnp` int not null,
  `mem_membruci_serie` varchar(2)	not null,
  `mem_membruci_nr` int not null,
  `mem_membruci_activ_yn` char(1) not null,
  `mem_membruci_dataelib` datetime,	
  `mem_membruci_dataexp` datetime,		
  `mem_membruci_docurl` varchar(512),	
  `mem_membruci_doclocalpath` varchar(512),	
  PRIMARY KEY (`mem_membruci_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


DROP TABLE IF EXISTS cart2.`mem_membrucotizatie`;
CREATE TABLE cart2.`mem_membrucotizatie` (
  `mem_membrucotizatie_id` int NOT NULL AUTO_INCREMENT,
  `mem_membrucotizatie_membruid` int	not null,
  `mem_membrucotizatie_membrucodunic` varchar(16) not null,
  `mem_membrucotizatie_userid` int	not null,
  `mem_membrucotizatie_usernume` varchar(20)	not null,
  `mem_membrucotizatie_userinfoid` int	not null,
  `mem_membrucotizatie_tipcotizatie` varchar(10) not null, -- 100, 1000, 5000
  `mem_membrucotizatie_anul`    int	not null,
  `mem_membrucotizatie_ancomplet_yn` char(1) not null,
  `mem_membrucotizatie_ian_yn`  char(1)	not null,
  `mem_membrucotizatie_feb_yn`  char(1)	not null,
  `mem_membrucotizatie_mar_yn`  char(1)	not null,
  `mem_membrucotizatie_apr_yn`  char(1)	not null,
  `mem_membrucotizatie_mai_yn`  char(1)	not null,
  `mem_membrucotizatie_iun_yn`  char(1)	not null,
  `mem_membrucotizatie_iul_yn`  char(1)	not null,
  `mem_membrucotizatie_aug_yn`  char(1)	not null,
  `mem_membrucotizatie_sep_yn`  char(1)	not null,
  `mem_membrucotizatie_oct_yn`  char(1)	not null,
  `mem_membrucotizatie_nov_yn`  char(1)	not null,
  `mem_membrucotizatie_dec_yn`  char(1)	not null,
  `mem_membrucotizatie_transsaurefplatasaudoc_123` varchar(1),	
  `mem_membrucotizatie_paytransactionid` int,	
  `mem_membrucotizatie_refplata` varchar(64),		
  `mem_membrucotizatie_docurl` varchar(512),	
  `mem_membrucotizatie_doclocalpath` varchar(512),	
  PRIMARY KEY (`mem_membrucotizatie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


DROP TABLE IF EXISTS cart2.pay_transaction;
CREATE TABLE cart2.pay_transaction (
  `pay_transaction_id`        int NOT NULL AUTO_INCREMENT,
  `pay_transaction_userid`    int	not null,
  `pay_transaction_usernume`  varchar(20)	not null,  
  `pay_transaction_userinfoid` int	not null,
  `pay_transaction_succes_yn` varchar(1) NULL,
  `pay_transaction_date`      datetime  NULL DEFAULT CURRENT_TIMESTAMP,
  `pay_transaction_amount`         float not null,  	     -- Numeric	1-12	Order total amount in float format with decimal point (thousand separator not allowed). Ex: 1234.56
  `pay_transaction_curr`           varchar(3)	not null,    -- String	3	Order currency: 3-character currency code (RON, USD, EUR)
  `pay_transaction_orderdesc`      varchar(128)	not null,	   -- String	1-127	Order description
  `pay_transaction_merchid`        varchar(20)	not null,	  -- String	8-50	Merchant ID assigned by EuPlatesc.ro
  `pay_transaction_YYYYMMDDHHmmSSreq` varchar(14)	null,	   -- YYYYMMDDHHmmSS	14	Current timestamp in GMT: 20221106203255
  `pay_transaction_noncereq`       varchar(64)	not null,   --	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
  `pay_transaction_fphashreq`      varchar(256)	not null,  --	1-256	Merchant MAC in hexadecimal form
  `pay_transaction_nonceresp`       varchar(64)	 null,   --	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
  `pay_transaction_fphashresp`      varchar(256) null,  --	1-256	Merchant MAC in hexadecimal form
  `pay_transaction_epidresp`        varchar(40) null,  -- String	40	Gateway unique id for each transaction
  `pay_transaction_messageresp`     varchar(6)	 null,  -- String	6	Response code text message
  `pay_transaction_approvalresp`    varchar(6)	 null,  --	String	6	Client bank???s approval code. Can be empty if not provided by gateway
  `pay_transaction_YYYYMMDDHHmmSSresp` varchar(14)	null,	 -- timestamp	YYYYMMDD HHmmSS	14	Merchant transaction timestamp in GMT: 20221107143859
  PRIMARY KEY (`pay_transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



/**
amount	     -- Numeric	1-12	Echo from the request
curr	       -- String	3	Echo from the request
invoice_id	 -- String	1-27	Echo from the request
ep_id	       -- String	40	Gateway unique id for each transaction
merch_id	String	8-50	Echo from the request
action	Numeric	1	If 0 ??? transaction approved else transaction failed
message	String	6	Response code text message
approval	String	6	Client bank???s approval code. Can be empty if not provided by gateway
timestamp	YYYYMMDD HHmmSS	14	Merchant transaction timestamp in GMT: 20221107143859
nonce	String	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
fp_hash	String	1-256	Merchant MAC in hexadecimal form

@RequestParam String amount,
                                  @RequestParam String curr,
                                  @RequestParam String invoice_id,
                                  @RequestParam String ep_id,
                                  @RequestParam String merch_id,
                                  @RequestParam String action,
                                  @RequestParam String message,
                                  @RequestParam String approval,
                                  @RequestParam String timestamp,
                                  @RequestParam String nonce,
                                  @RequestParam String fp_hash
*/

-- --------------------------
--   table skills-uri
-- --------------------------

DROP TABLE IF EXISTS `mem_skilltip`;
CREATE TABLE `mem_skilltip` (
  `mem_skilltip_id`  int NOT NULL AUTO_INCREMENT,
  `mem_skilltip_cod` varchar(10)	not null,
  `mem_skilltip_nume` varchar(128)	not null,
  `mem_skilltip_displaynume` varchar(128)	not null,
  PRIMARY KEY (`mem_skilltip_id`),
  UNIQUE KEY `mem_skilltip_cod_unique` (`mem_skilltip_cod`),
  UNIQUE KEY `mem_skilltip_nume_unique` (`mem_skilltip_nume`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE IF EXISTS `mem_skillvaloare`;
CREATE TABLE `mem_skillvaloare` (
  `mem_skillvaloare_id`  int NOT NULL AUTO_INCREMENT,
  `mem_skillvaloare_skilltipid` int not null,
  `mem_skillvaloare_skilltipcod` varchar(10)	not null,
  `mem_skillvaloare_cod` varchar(10)	not null,
  `mem_skillvaloare_nume` varchar(128)	not null,
  `mem_skillvaloare_displaynume` varchar(128)	not null,
  PRIMARY KEY (`mem_skillvaloare_id`),
  UNIQUE KEY `mem_skillvaloare_cod_unique` (`mem_skillvaloare_cod`),
  UNIQUE KEY `mem_skillvaloare_nume_unique` (`mem_skillvaloare_nume`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;




DROP TABLE IF EXISTS `mem_membruskills`;
CREATE TABLE `mem_membruskills` (
  `mem_membruskills_id` int NOT NULL AUTO_INCREMENT,
  `mem_membruskills_membruid` int	not null,
  `mem_membruskills_membrucodunic` varchar(16) not null,
  `mem_membruskills_userid` int	not null,
  `mem_membruskills_usernume` varchar(20)	not null,
  `mem_membruskills_userinfoid` int	not null,
  PRIMARY KEY (`mem_membruskills_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE IF EXISTS `mem_membruoneskill`;
CREATE TABLE `mem_membruoneskill` (
  `mem_membruoneskill_id` int NOT NULL AUTO_INCREMENT,
  `mem_membruoneskill_memskillsid` int not null,
  `mem_membruoneskill_memskillscod` varchar(10)	not null,
  `mem_membruoneskill_skilltipid` int not null,
  `mem_membruoneskill_skilltipcod` varchar(10)	not null,
  `mem_membruoneskill_skillvalid` int not null,
  `mem_membruoneskill_skillvalcod` varchar(10)	not null,
  PRIMARY KEY (`mem_membruoneskill_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE IF EXISTS `mem_membrutip`;
CREATE TABLE `mem_membrutip` (
  `mem_membrutip_id`  int NOT NULL AUTO_INCREMENT,

  `mem_membrutip_membruid` int	not null,
  `mem_membrutip_membrucodunic` varchar(16) not null,

  `mem_membrutip_userid` int	not null,
  `mem_membrutip_usernume` varchar(20)	not null,
  `mem_membrutip_userinfoid` int	not null,

  `mem_membrutip_tipid`	int,
  `mem_membrutip_tipcod`	varchar(10),	

  `mem_membrutip_zonataraid` int	not null, 	
  `mem_membrutip_zonataracod` varchar(2) not null, 
  `mem_membrutip_judetid` int	not null, 
  `mem_membrutip_judetcod` varchar(2) not null, 
  `mem_membrutip_zonajudetid` int	not null, 
  `mem_membrutip_zonajudetcod` varchar(9) not null, 
  `mem_membrutip_uatid`	     int not null,
  `mem_membrutip_uatcod`	  int	not null,
  `mem_membrutip_zonauatid` int not null, 
  `mem_membrutip_zonauatcod` varchar(9) not null, 
  `mem_membrutip_localitateid` int not null, 
  `mem_membrutip_localitatecod` int	not null, 
  `mem_membrutip_zonalocalitateid` int not null, 
  `mem_membrutip_zonalocalitatecod` varchar(9) not null, 
  `mem_membrutip_sectievotareid` int not null, 
  `mem_membrutip_sectievotarenr` int not null, 
  `mem_membrutip_codpostalid` int not null,  
  `mem_membrutip_codpostalcod` varchar(16)	not null, 

  `mem_membrutip_activ_yn` varchar(1) NOT NULL,
  `mem_membrutip_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_membrutip_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mem_membrutip_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;






DROP TABLE IF EXISTS `mem_recomandatde`;
CREATE TABLE `mem_recomandatde` (
  `mem_recomandatde_id`  int NOT NULL AUTO_INCREMENT,
  
  `mem_recomandatde_refmembruid` int	not null,
  `mem_recomandatde_refmembrucodunic` varchar(16) not null,  
  `mem_recomandatde_refuserid` int	not null,
  `mem_recomandatde_refusernume` varchar(20)	not null,
  `mem_recomandatde_refuserinfoid` int	not null,

  `mem_recomandatde_newmembruid` int	not null,
  `mem_recomandatde_newmembrucodunic` varchar(16) not null,  
  `mem_recomandatde_newuserid` int	not null,
  `mem_recomandatde_newusernume` varchar(20)	not null,
  `mem_recomandatde_newuserinfoid` int	not null,

  PRIMARY KEY (`mem_recomandatde_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE IF EXISTS `mem_membrurol`;
CREATE TABLE `mem_membrurol` (
  `mem_membrurol_id`  int NOT NULL AUTO_INCREMENT,
  
  `mem_membrurol_membruid` int	not null,
  `mem_membrurol_membrucodunic` varchar(16) not null,
  
  `mem_membrurol_userid` int	not null,
  `mem_membrurol_usernume` varchar(20)	not null,
  `mem_membrurol_userinfoid` int	not null,

  `mem_membrurol_tiprolid` int	not null,
  `mem_membrurol_tiprolcod` varchar(10) not null,

  `mem_membrurol_acopgeoid` int not null,
  `mem_membrurol_acopgeocod` varchar(16)	not null,

  `mem_membrurol_adrrezidenta_yn`	char(1), 
  `mem_membrurol_zonataraid` int	not null, 	
  `mem_membrurol_zonataracod` varchar(2) not null, 
  `mem_membrurol_judetid` int	not null, 
  `mem_membrurol_judetcod` varchar(2) not null, 
  `mem_membrurol_zonajudetid` int	not null, 
  `mem_membrurol_zonajudetcod` varchar(9) not null, 
  `mem_membrurol_uatid`	     int not null,
  `mem_membrurol_uatcod`	   int	not null,
  `mem_membrurol_zonauatid` int not null, 
  `mem_membrurol_zonauatcod` varchar(9) not null, 
  `mem_membrurol_localitateid` int not null, 
  `mem_membrurol_localitatecod` int	not null, 
  `mem_membrurol_zonalocalitateid` int not null, 
  `mem_membrurol_zonalocalitatecod` varchar(9) not null, 
  `mem_membrurol_sectievotareid` int not null, 
  `mem_membrurol_sectievotarenr` int not null, 
  `mem_membrurol_codpostalid` int not null,  
  `mem_membrurol_codpostalcod` varchar(16)	not null, 

  `mem_membrurol_invitatie_yn` varchar(1) NULL,
  `mem_membrurol_acceptare_yn` varchar(1) NULL,
  `mem_membrurol_plecare_yn` varchar(1) NULL,
  `mem_membrurol_eliberare_yn` varchar(1) NULL,

  `mem_membrurol_activ_yn` varchar(1) NOT NULL,
  `mem_membrurol_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_membrurol_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mem_membrurol_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE IF EXISTS `mem_grup`;
CREATE TABLE `mem_grup` (
  `mem_grup_id` int NOT NULL AUTO_INCREMENT,
  `mem_grup_codunic` varchar(16) not null, 	
  `mem_grup_nume` varchar(20) not null, 		
  
  `mem_grup_sefgrupid` int	not null, 	
  `mem_grup_sefgrupcodunic` varchar(16)	not null, 	
  `mem_grup_sefgrupuserid` int	not null,
  `mem_grup_sefgrupusernume` varchar(20)	not null,
  `mem_grup_sefgrupuserinfoid` int	not null,

  `mem_grup_zonataraid` int	not null, 	
  `mem_grup_zonataracod` varchar(2) not null, 
  `mem_grup_judetid` int	not null, 
  `mem_grup_judetcod` varchar(2) not null, 
  `mem_grup_zonajudetid` int	not null, 
  `mem_grup_zonajudetcod` varchar(9) not null, 
  `mem_grup_uatid`	  int not null,
  `mem_grup_uatcod`	  int	not null,
  `mem_grup_zonauatid` int not null, 
  `mem_grup_zonauatcod` varchar(9) not null, 
  `mem_grup_localitateid` int not null, 
  `mem_grup_localitatecod` int	not null, 
  `mem_grup_zonalocalitateid` int not null, 
  `mem_grup_zonalocalitatecod` varchar(9) not null, 
  `mem_grup_sectievotareid` int not null, 
  `mem_grup_sectievotarenr` int not null, 
  `mem_grup_codpostalid` int not null,  
  `mem_grup_codpostalcod` varchar(16)	not null, 

  `mem_grup_activ_yn` varchar(1) NOT NULL,
  `mem_grup_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_grup_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mem_grup_id`),
  UNIQUE KEY `mem_grup_codunic_unique` (`mem_grup_codunic`),
  UNIQUE KEY `mem_grup_nume_unique` (`mem_grup_nume`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;




DROP TABLE `mem_membrugrup`;
CREATE TABLE `mem_membrugrup` (
  `mem_membrugrup_id`  int NOT NULL AUTO_INCREMENT,

  `mem_membrugrup_membruid` int	not null, 	
  `mem_membrugrup_membrucodunic` varchar(16) not null, 	

  `mem_membrugrup_userid` int	not null, 	
  `mem_membrugrup_usernume` varchar(20)	not null,
  `mem_membrugrup_userinfoid` int	not null, 	

  `mem_membrugrup_grupid` int	not null, 	
  `mem_membrugrup_grupnume` varchar(20)	not null,
  `mem_membrugrup_grupcodunic` varchar(16) not null, 

  `mem_membrugrup_sefgrupid` int	not null, 	
  `mem_membrugrup_sefgrupcodunic` varchar(16)	not null, 	
  `mem_membrugrup_sefgrupuserid` int	not null,
  `mem_membrugrup_sefgrupusernume` varchar(20)	not null,
  `mem_membrugrup_sefgrupuserinfoid` int	not null,

  `mem_membrugrup_zonataraid` int	not null, 	
  `mem_membrugrup_zonataracod` varchar(2) not null, 
  `mem_membrugrup_judetid` int	not null, 
  `mem_membrugrup_judetcod` varchar(2) not null, 
  `mem_membrugrup_uatid`	  int not null,
  `mem_membrugrup_uatcod`	  int	not null,
  `mem_membrugrup_zonauatid` int not null, 
  `mem_membrugrup_zonauatcod` varchar(9) not null, 
  `mem_membrugrup_zonajudetid` int	not null, 
  `mem_membrugrup_zonajudetcod` varchar(9) not null, 
  `mem_membrugrup_localitateid` int not null, 
  `mem_membrugrup_localitatecod` int	not null, 
  `mem_membrugrup_zonalocalitateid` int not null, 
  `mem_membrugrup_zonalocalitatecod` varchar(9) not null, 
  `mem_membrugrup_sectievotareid` int not null, 
  `mem_membrugrup_sectievotarenr` int not null, 
  `mem_membrugrup_codpostalid` int not null,  
  `mem_membrugrup_codpostalcod` varchar(16)	not null, 

  `mem_membrugrup_cerere_yn`     varchar(1) NOT NULL,
  `mem_membrugrup_cereredt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,

  `mem_membrugrup_acceptare_yn` varchar(1) NULL,
  `mem_membrugrup_acceptaredt` datetime NULL,

  `mem_membrugrup_plecare_yn` varchar(1) NULL,
  `mem_membrugrup_excludere_yn` varchar(1) NULL,

  `mem_membrugrup_activ_yn` varchar(1) NOT NULL,
  `mem_membrugrup_startdt` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_membrugrup_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mem_membrugrup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;




DROP TABLE `mem_sefgrup`;
CREATE TABLE `mem_sefgrup` (
  `mem_sefgrup_id` int NOT NULL AUTO_INCREMENT,

  `mem_sefgrup_membruid` int	not null, 	
  `mem_sefgrup_membrucodunic` varchar(16) not null, 	

  `mem_sefgrup_userid` int	not null, 	
  `mem_sefgrup_usernume` varchar(20)	not null,
  `mem_sefgrup_userinfoid` int	not null, 	

  `mem_sefgrup_grupid` int	not null, 	
  `mem_sefgrup_grupnume` varchar(20)	not null,
  `mem_sefgrup_grupcodunic` varchar(16) not null, 

  `mem_sefgrup_zonataraid` int	not null, 	
  `mem_sefgrup_zonataracod` varchar(2) not null, 
  `mem_sefgrup_judetid` int	not null, 
  `mem_sefgrup_judetcod` varchar(2) not null, 
  `mem_sefgrup_uatid`	  int not null,
  `mem_sefgrup_uatcod`	  int	not null,
  `mem_sefgrup_zonauatid` int not null, 
  `mem_sefgrup_zonauatcod` varchar(9) not null, 
  `mem_sefgrup_zonajudetid` int	not null, 
  `mem_sefgrup_zonajudetcod` varchar(9) not null, 
  `mem_sefgrup_localitateid` int not null, 
  `mem_sefgrup_localitatecod` int	not null, 
  `mem_sefgrup_zonalocalitateid` int not null, 
  `mem_sefgrup_zonalocalitatecod` varchar(9) not null, 
  `mem_sefgrup_sectievotareid` int not null, 
  `mem_sefgrup_sectievotarenr` int not null, 
  `mem_sefgrup_codpostalid` int not null,  
  `mem_sefgrup_codpostalcod` varchar(16)	not null, 

  `mem_sefgrup_activ_yn` varchar(1) NOT NULL,
  `mem_sefgrup_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mem_sefgrup_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mem_sefgrup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;





DROP TABLE `mes_tipmesaj`;
CREATE TABLE `mes_tipmesaj` (
  `mes_tipmesaj_id` int NOT NULL AUTO_INCREMENT,
  `mes_tipmesaj_cod` varchar(10)	not null,
  `mes_tipmesaj_relogin_yn` varchar(1)	not null,
  `mes_tipmesaj_nume` varchar(128)	not null,	
  `mes_tipmesaj_displaynume` varchar(128)	not null,
  PRIMARY KEY (`mes_tipmesaj_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


TRUNCATE TABLE mes_tipmesaj;
INSERT INTO mes_tipmesaj ( `mes_tipmesaj_id`, `mes_tipmesaj_cod`, `mes_tipmesaj_relogin_yn`, 
                           `mes_tipmesaj_nume`, `mes_tipmesaj_displaynume` ) 
        VALUES  
        (1, 'CERAFLGRUP', 'n',   'Cerere afiliere la Grup',    'Cerere afiliere la Grup'),
        (2, 'ACCAFLGRUP', 'y',   'Acceptare afiliere la Grup', 'Acceptare afiliere la Grup'),
        (3, 'REFAFLGRUP', 'n',   'Refuz afiliere la Grup',     'Refuz afiliere la Grup');


-- not used yet
DROP TABLE `mes_tipfrecventa`;
CREATE TABLE `mes_tipfrecventa` (
  `mes_tipfrecventa_id` int NOT NULL AUTO_INCREMENT,
  `mes_tipfrecventa_cod` varchar(9)	not null,
  `mes_tipfrecventa_nume` varchar(32)	not null,
  PRIMARY KEY (`mes_tipfrecventa_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


-- not used yet
DROP TABLE `mes_frecvtipmesaj`;
CREATE TABLE `mes_frecvtipmesaj` (
  `mes_frecvtipmesaj_id` int NOT NULL AUTO_INCREMENT,
  `mes_frecvtipmesaj_tipfrecvid` int	not null,
  `mes_frecvtipmesaj_tipfrecvcod` varchar(10)	not null,	
  `mes_frecvtipmesaj_tipmesid` int	not null,
  `mes_frecvtipmesaj_tipmescod` varchar(10)	not null,	
  PRIMARY KEY (`mes_frecvtipmesaj_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


DROP TABLE `mes_expeditor`;
CREATE TABLE `mes_expeditor` (
  `mes_expeditor_id` int NOT NULL AUTO_INCREMENT,

  `mes_expeditor_userid` int not null,
  `mes_expeditor_usernume` varchar(20)  null,
  `mes_expeditor_rolid` int not null,
  `mes_expeditor_rolcod` varchar(10) 	not null,

  `mes_expeditor_adrrezidenta_yn`	char(1), 
  `mes_expeditor_zonataraid` int	not null, 	
  `mes_expeditor_zonataracod` varchar(2) not null, 
  `mes_expeditor_judetid` int	not null, 
  `mes_expeditor_judetcod` varchar(2) not null, 
  `mes_expeditor_uatid`	     int not null,
  `mes_expeditor_uatcod`	   int	not null,
  `mes_expeditor_localitateid` int not null, 
  `mes_expeditor_localitatecod` int	not null, 
  `mes_expeditor_zonajudetid` int	not null, 
  `mes_expeditor_zonajudetcod` varchar(9) not null, 
  `mes_expeditor_zonauatid` int not null, 
  `mes_expeditor_zonauatcod` varchar(9) not null, 
  `mes_expeditor_zonalocalitateid` int not null, 
  `mes_expeditor_zonalocalitatecod` varchar(9) not null, 
  `mes_expeditor_sectievotareid` int not null, 
  `mes_expeditor_sectievotarenr` int not null, 
  `mes_expeditor_codpostalid` int not null,  
  `mes_expeditor_codpostalcod` varchar(16)	not null, 

  `mes_expeditor_activ_yn` varchar(1) NOT NULL,
  `mes_expeditor_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mes_expeditor_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mes_expeditor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


DROP TABLE `mes_destinatar`;
CREATE TABLE `mes_destinatar` (
  `mes_destinatar_id` int NOT NULL AUTO_INCREMENT,
  
  `mes_destinatar_userid` int not null,
  `mes_destinatar_usernume` varchar(20)	not null,
  `mes_destinatar_rolid` int not null,
  `mes_destinatar_rolcod` varchar(10)	not null,

  `mes_destinatar_adrrezidenta_yn`	char(1), 
  `mes_destinatar_zonataraid` int	not null, 	
  `mes_destinatar_zonataracod` varchar(2) not null, 
  `mes_destinatar_judetid` int	not null, 
  `mes_destinatar_judetcod` varchar(2) not null, 
  `mes_destinatar_uatid`	     int not null,
  `mes_destinatar_uatcod`	   int	not null,
  `mes_destinatar_localitateid` int not null, 
  `mes_destinatar_localitatecod` int	not null, 
  `mes_destinatar_zonajudetid` int	not null, 
  `mes_destinatar_zonajudetcod` varchar(9) not null, 
  `mes_destinatar_zonauatid` int not null, 
  `mes_destinatar_zonauatcod` varchar(9) not null, 
  `mes_destinatar_zonalocalitateid` int not null, 
  `mes_destinatar_zonalocalitatecod` varchar(9) not null, 
  `mes_destinatar_sectievotareid` int not null, 
  `mes_destinatar_sectievotarenr` int not null, 
  `mes_destinatar_codpostalid` int not null,  
  `mes_destinatar_codpostalcod` varchar(16)	not null, 

  `mes_destinatar_activ_yn` varchar(1) NOT NULL,
  `mes_destinatar_startdt` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mes_destinatar_enddt` datetime DEFAULT NULL,
  PRIMARY KEY (`mes_destinatar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;


DROP TABLE `mes_mesaj`;
CREATE TABLE `mes_mesaj` (
  `mes_mesaj_id` int NOT NULL AUTO_INCREMENT,
  `mes_mesaj_tipmesajid` int null,
  `mes_mesaj_tipmesajcod` varchar(10)	not null,

  `mes_mesaj_relogin_yn` varchar(1)	not null,

  `mes_mesaj_expid` int not null null,
  `mes_mesaj_expuserid` int not null,
  `mes_mesaj_expusernume` varchar(20)	not null,
  `mes_mesaj_exprolid` int not null,
  `mes_mesaj_exprolcod` varchar(10)	not null,

  `mes_mesaj_acopgeoid` int not null,
  `mes_mesaj_acopgeocod` varchar(16)	not null,

  `mes_mesaj_zonataraid` int	not null, 	
  `mes_mesaj_zonataracod` varchar(2) not null, 
  `mes_mesaj_judetid` int	not null, 
  `mes_mesaj_judetcod` varchar(2) not null, 
  `mes_mesaj_uatid`	     int not null,
  `mes_mesaj_uatcod`	   int	not null,
  `mes_mesaj_localitateid` int not null, 
  `mes_mesaj_localitatecod` int	not null, 
  `mes_mesaj_zonauatid` int not null, 
  `mes_mesaj_zonauatcod` varchar(9) not null, 
  `mes_mesaj_zonajudetid` int	not null, 
  `mes_mesaj_zonajudetcod` varchar(9) not null, 
  `mes_mesaj_zonalocalitateid` int not null, 
  `mes_mesaj_zonalocalitatecod` varchar(9) not null, 
  `mes_mesaj_sectievotareid` int not null, 
  `mes_mesaj_sectievotarenr` int not null, 
  `mes_mesaj_codpostalid` int not null,  
  `mes_mesaj_codpostalcod` varchar(16)	not null, 

  `mes_mesaj_an` int null,
  `mes_mesaj_luna` int null,
  `mes_mesaj_zi` int null,
  `mes_mesaj_datagenerarii` datetime not null DEFAULT CURRENT_TIMESTAMP,	
  
  `mes_mesaj_text` varchar(1024)	null,	
  PRIMARY KEY (`mes_mesaj_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;



DROP TABLE `mes_destinmesaj`;
CREATE TABLE `mes_destinmesaj` (
  `mes_destinmesaj_id` int NOT NULL AUTO_INCREMENT,
  `mes_destinmesaj_mesajid` int not null,

  `mes_destinmesaj_destid` int not null null,
  `mes_destinmesaj_destuserid` int not null,
  `mes_destinmesaj_destusernume` varchar(20) not null,
  `mes_destinmesaj_destrolid` int not null,
  `mes_destinmesaj_destrolcod` varchar(10) not null,
  
  `mes_destinmesaj_primit_yn` varchar(1) not null,
  
  `mes_destinmesaj_an` int null,
  `mes_destinmesaj_luna` int null,
  `mes_destinmesaj_zi` int null,
  `mes_destinmesaj_dataprimirii` datetime	null,	
  PRIMARY KEY (`mes_destinmesaj_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
