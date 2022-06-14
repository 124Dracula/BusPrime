SET SQL_SAFE_UPDATES = 0;

-- Coordenadas

insert into busprime.coordenadas values (1,0,0);

select * from busprime.coordenadas;

-- Paragem

insert into busprime.paragem values (1,1,'Ponte de Prado (Marginal)');
insert into busprime.paragem values (2,1,"Merelim S. Roque (25 de Abril)");
insert into busprime.paragem values (3,1,"Caires");
insert into busprime.paragem values (4,1,"Liberdade (25 de Abril)");
insert into busprime.paragem values (5,1,"João XXI (C Amarante)");
insert into busprime.paragem values (6,1,"Bom Jesus");

-- Empresa

insert into busprime.empresa values (1,"TUB");

-- Autocarro

insert into busprime.autocarro values (1,1,2);

-- Viagem

insert into busprime.viagem values (1,1,5,2.5,0);
insert into busprime.viagem values (2,1,5,2.5,0);
insert into busprime.viagem values (3,1,5,2.25,0);

-- ParagemHora

insert into busprime.paragemhora values(1,1,1,"06:00");
insert into busprime.paragemhora values(2,1,3,"06:20");
insert into busprime.paragemhora values(3,1,4,"06:25");
insert into busprime.paragemhora values(4,2,4,"06:40");
insert into busprime.paragemhora values(5,2,6,"07:00");
insert into busprime.paragemhora values(6,3,1,"06:45");
insert into busprime.paragemhora values(7,3,4,"07:10");
insert into busprime.paragemhora values(8,3,6,"07:30");

--PerguntaFrequente

insert into busprime.perguntafrequente values(1,"pergunta1","resposta1");
insert into busprime.perguntafrequente values(2,"pergunta2","resposta2");