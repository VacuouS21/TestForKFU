INSERT INTO airport VALUES (0,'Чебоксары');
INSERT INTO airport VALUES (1,'Москва');
INSERT INTO airport VALUES (2,'Казань');
INSERT INTO airport VALUES (3,'Санкт-Питербург');
INSERT INTO airport VALUES (4,'Волгоград');
INSERT INTO airport VALUES (5,'Новосибирск');
INSERT INTO airport VALUES (6,'Якутск');
INSERT INTO airport VALUES (7,'Депутатск');
INSERT INTO airport VALUES (8,'Саратов');


INSERT INTO airplane_info VALUES (0,'Ту-204',150);
INSERT INTO airplane_info VALUES (1,'МС-21',128);
INSERT INTO airplane_info VALUES (2,'Superjet 100',170);
INSERT INTO airplane_info VALUES (3,'Boeing 777',228);
INSERT INTO airplane_info VALUES (4,'Ан-225',98);


INSERT INTO privilege VALUES (0,15,'Gold');
INSERT INTO privilege VALUES (1,10,'premium');
INSERT INTO privilege VALUES (2,5,'standart+');
INSERT INTO privilege VALUES (3,0,'standart');

INSERT INTO users VALUES (0,'Kulagin KV','vacuous','123',0);
INSERT INTO users VALUES (1,'Salikhov MA', 'mans','123',3);
INSERT INTO users VALUES (2,'Kalugin VB', 'kaluga','123',2);
INSERT INTO users VALUES (3,'Ivan II', 'grozniy','123',1);

INSERT INTO tickets_information VALUES (0,now(),100000,5,0,0,1,0);
INSERT INTO tickets_information VALUES (1,now(),70000,15,0,0,1,3);
INSERT INTO tickets_information VALUES (2,now(),50000,20,0,5,7,2);
INSERT INTO tickets_information VALUES (3,now(),40000,100,0,6,3,1);