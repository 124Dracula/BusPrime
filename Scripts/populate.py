import re
import unicodedata

def remove_accents(input_str):
    nfkd_form = unicodedata.normalize('NFKD', input_str)
    only_ascii = nfkd_form.encode('ASCII', 'ignore')
    return only_ascii

def calcula_preco(paragens):
    preco = 1 + 0.1*paragens
    return preco

contentRE = re.compile(
	r'([0-9]+),(.+?),([-*0-90-9.[0-9]+),([-*0-90-9.[0-9]+)')

#stop id name x y
paragens = dict()

with open('stops.txt') as f:
    lines = f.readlines()
for line in lines:
    line2 = str (remove_accents(line))
    line3 = re.search(contentRE, line2)
    if line3:
        paragens[line3[1]] = [line3[1],line3[2],line3[3],line3[4]]

f.close()
 #bus id name
autocarros = dict()
autocarrosID = dict()
id = 1

contentRE = re.compile(
	r'(\d+),.*,.*,(.*),(\d+)')

with open('routes.txt') as f2:
    lines = f2.readlines()
for line in lines:
    line2 = str (remove_accents(line))
    line3 = re.search(contentRE, line2)
    if line3:
        autocarros[line3[1]] = [line3[1],line3[2]]
        autocarrosID[int(line3[1])] = id
        id += 1
f2.close()


#viagemid busid
viagem = dict()
viagemID = dict()
i = 1
contentRE = re.compile( r'(\d+),(\d+),(\d+_\d+),.*?,(\d+),')

with open('trips.txt') as f:
    lines = f.readlines()
for line in lines:
    line2 = str (remove_accents(line))
    line3 = re.search(contentRE, line2)
    if line3:
        viagemid = line3[3].replace('_', '')
        viagem[int(viagemid)] = [viagemid,line3[1],line3[2]]
        viagemID[int(viagemid)] = i
        i += 1
f.close

#idviagem hora idparagem
paragemTempo = dict()
contentRE = re.compile( r'(\d+_\d+),\d{2}:\d{2}:\d{2},(\d{2}:\d{2}:\d{2}),(\d+),(\d+)')

with open('stop_times.txt') as f:
    lines = f.readlines()
for line in lines:
    line2 = str (remove_accents(line))
    line3 = re.search(contentRE, line2)
    if line3:
        viagemid = (line3[1].replace('_',''))
        paragemid = line3[3]
        paragemTempo[paragemid] = [paragemid,line3[2],viagemid]
f.close()


full = open('insert1.sql','w+',encoding='utf-8')

full.write('\n\n-- Autocarros\n\n')
for item in autocarros.items():
    full.write("insert into busprime.autocarro values ("+ str(autocarrosID [int(item[1][0])])+",1,"+str(item[1][0])+");\n")


full.write('\n\n-- VIAGENS\n\n')
for item in viagem.items():
    coroa = int(item[1][2])
    if coroa == 1:
        preco = 1.55
    else: 
        preco = 2

    full.write("insert into busprime.viagem values ("+ str(viagemID[int(item[1][0])])+","+str(autocarrosID[ int(item[1][1])])+",30,"+str(preco)+",0);\n")


index = 1
full.write('\n\n-- ParagemTempo \n\n')
for item in paragemTempo.items():
    full.write("insert into busprime.paragemhora values ("+str(index)+","+ str(item[1][0])+","+str(viagemID[int(item[1][2])])+","+str(item[1][1])+");\n")
    index += 1


full.write('\n\n-- Paragem / Coordenadas\n\n')
for item in paragens.items():
    full.write("insert into busprime.coordenadas values ("+ str(item[1][0])+","+str(item[1][2])+","+str(item[1][3])+");\n")
    full.write("insert into busprime.paragem values ("+ str(item[1][0])+","+str(item[1][0])+","+str(item[1][1])+");\n")
