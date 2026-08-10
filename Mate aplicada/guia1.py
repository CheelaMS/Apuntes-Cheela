#problema 1
print ("Problema 1")
def transmision(segundos):
    #100megabits x segundo
    return segundos * 100
#45 segundos
segundos = 45
print ("1) 45 segundos")
print (f"{transmision(segundos)} megabits x segundo")
#1,5 min
segundos = 90
print ("2) 1,5 minutos")
print (f"{transmision(segundos)} megabits x segundo")
# 1 hora
print ("3) 1 hora")
segundos = 60*60#60 minutos, con 60 segundos cada uno = 1 hora

print (f"{transmision(segundos)} megabits x segundo")
print ("-----")
print ("Problema 2")
#problema 2
segundos = 0
while segundos <= 1000:
    print (f"- {segundos} segundos")

    print (f"{transmision(segundos)} megabits x segundo")
    segundos += 100

#problema 3
#transformar  a ipynb