-- Empresa

insert into busprime.empresa values (1,"TUB");
insert into busprime.empresa values (2,"Flix Bus");

-- Paragem

insert into busprime.paragem values (2144,2144,'Guimarães');
insert into busprime.paragem values (2145,2145,"Porto (Camélias");
insert into busprime.paragem values (2146,2146,"Aveiro");
insert into busprime.paragem values (2147,2147,"Figueira da Foz");
insert into busprime.paragem values (2148,2148,"Nazaré");
insert into busprime.paragem values (2149,2149,"Lisboa (Oriente)");


-- Coordenadas

insert into busprime.coordenadas values (2144,41.44388025311014, -8.294708434801416);
insert into busprime.coordenadas values (2145,41.17165263529048, -8.582682220908103);
insert into busprime.coordenadas values (2146,40.63990011887782, -8.653726111087233);
insert into busprime.coordenadas values (2147,40.15181482608737, -8.852674490138309);
insert into busprime.coordenadas values (2148,39.60287808844233, -9.068294523941473);
insert into busprime.coordenadas values (2149,38.767573045474705, -9.101191486551555);

-- Autocarro

insert into busprime.autocarro values (77,2,1);
insert into busprime.autocarro values (78,2,2);
insert into busprime.autocarro values (79,2,3);
insert into busprime.autocarro values (80,2,4);
insert into busprime.autocarro values (81,2,5);
insert into busprime.autocarro values (82,2,6);

-- Viagem

insert into busprime.viagem values (3517,77,5,5,1);
insert into busprime.viagem values (3518,77,5,6.5,1);
insert into busprime.viagem values (3519,77,5,5.7,1);
insert into busprime.viagem values (3520,77,5,5.6,1);
insert into busprime.viagem values (3521,77,5,4.3,1);

-- ParagemHora

insert into busprime.paragemhora values(1813,3517,2144,"06:55");
insert into busprime.paragemhora values(1814,3518,2145,"07:45");
insert into busprime.paragemhora values(1815,3519,2146,"08:45");
insert into busprime.paragemhora values(1816,3520,2148,"10:30");
insert into busprime.paragemhora values(1817,3521,2149,"12:00");

insert into busprime.paragemhora values(1818,3521,2149,"16:55");
insert into busprime.paragemhora values(1819,3520,2148,"17:45");
insert into busprime.paragemhora values(1820,3519,2147,"18:45");
insert into busprime.paragemhora values(1821,3518,2145,"20:30");
insert into busprime.paragemhora values(1822,3517,2144,"22:00");