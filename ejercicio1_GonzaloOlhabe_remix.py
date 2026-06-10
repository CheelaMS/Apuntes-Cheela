def numeroEntero(texto):
    while True:
        try:
            numero = int(input(texto))
            if numero > 0:
                return numero
                
            print('Por favor ingrese un entero positivo')
        except ValueError:
            print ('Por favor ingrese un dato valido')
def codigoTecnico():
    while True:
        alias=input('Ingrese el Alias del ingeniero: ')
        if len(alias) >= 6 and ' ' not in alias and alias.isalnum():
            return alias 
        else:
            print('Alias inválido. Debe tener al menos 6 caracteres, sin espacios y solo letras o números.')
            print('Por favor ingrese un alias valido')
    

def categoria(experiencia):
    if experiencia > 45:
        categoria = 'Senior'
    else:
        categoria = 'Junior'
    return categoria    


ingenieros_senior=[]
ingenieros_junior=[]

#prueba= numeroEntero('x')
#print (prueba)
registro=numeroEntero('¿Cuantos ingenieros desea registrar? ')
  


for i in range(registro):
    
    alias = codigoTecnico()
    
    while True:
        experiencia=numeroEntero('Ingresa el nivel técnico del ingeniero: ')
        if experiencia < 101:
                break
        else:
            print('Debe ser dentro del rango 1 a 100')
    
    ingeniero= {
        'alias' : alias,
        'nivel' : experiencia,
        'categoria' : categoria(experiencia)
    }
    if ingeniero['categoria'] == 'Senior':
        ingenieros_senior.append(ingeniero)
    elif ingeniero['categoria'] == 'Junior':
        ingenieros_junior.append(ingeniero) 
    print(f"Ingenierio '{ingeniero['alias']}' registrado como {ingeniero['categoria']} (nivel {ingeniero['nivel']})")

print('Registro completado')
print(f'El instituto cuenta con {len(ingenieros_senior)} Ingenieros Senior y {len(ingenieros_junior)} Ingenieros Junior.')                               

print (ingenieros_senior)
print (ingenieros_junior)
