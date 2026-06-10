ingenieros_senior=[]
ingenieros_junior=[]

while True:
    try:
        registro=int(input('¿Cuantos ingenieros desea registrar? '))
        if registro <= 0:
            print( "¡Dato inválido! Ingresa un entero positivo para continuar el registro.")
        else:
            break    
    except ValueError:
        print('¡Dato inválido! Ingresa un entero positivo para continuar el registro.')    

for i in range(registro):
    while True:
        alias=input('Ingrese el Alias del ingeniero: ')
        if len(alias) >= 6 and ' ' not in alias:
            break
        else:
            print('Alias inválido. Debe tener al menos 6 caracteres, sin espacios y solo letras o números.')
            print('Por favor ingrese un alias valido')
    while True:
        try:
            experiencia=int(input('Ingresa el nivel técnico del ingeniero: '))
            if experiencia > 0:
                break
            else:
                print('¡Error de validación! Ingresa un número entero positivo para el nivel técnico.')
        except ValueError:
            print('¡Error de validación! Ingresa un número entero positivo para el nivel técnico.')
    if experiencia > 45:
        categoria = 'Senior'
    else:
        categoria = 'Junior'
    ingeniero= {
        'alias' : alias,
        'nivel' : experiencia,
        'categoria' : categoria
    }
    if ingeniero['categoria'] == 'Senior':
        ingenieros_senior.append(ingeniero)
    elif ingeniero['categoria'] == 'Junior':
        ingenieros_junior.append(ingeniero) 
    print(f"Ingenierio '{ingeniero['alias']}' registrado como {ingeniero['categoria']} (nivel {ingeniero['nivel']})")

print('Registro completado')
print(f'El instituto cuenta con {len(ingenieros_senior)} Ingenieros Senior y {len(ingenieros_junior)} Ingenieros Junior.')                               