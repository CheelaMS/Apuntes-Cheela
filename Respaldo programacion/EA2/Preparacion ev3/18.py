tecnicos_maestros= []
tecnicos_operarios= []

while True:
    try:
        cantidad_tecnicos=int(input('Por favor ingrese la cantidad de tecnicos a ingresar: '))
        if cantidad_tecnicos <= 0:
            print('Ingrese un numero valido por favor')
        else:
            for i in range(cantidad_tecnicos):
                while True:
                    codigo=input('Ingrese el codigo del tecnico ')
                    if len(codigo) < 6 or ' ' in codigo:
                        print('Por favor ingrese un codigo valido')
                    else:
                        break
                while True:
                    try:
                        anos_exp =int(input('Ingrese años de experiencia: '))
                        if anos_exp < 0:
                            print('Ingrese un numero valido por favor.')
                        else:
                            break    
                    except ValueError:
                        print('Ingrese un numero valido por favor.') 
                if anos_exp > 10:
                    tecnicos_maestros.append(codigo)
                elif anos_exp <= 10:
                    tecnicos_operarios.append(codigo)
            print (f'La planta cuenta con {len(tecnicos_maestros)} Tecnicos maestros y {len(tecnicos_operarios)} Tecnicos operarios.')
            print ('Sistema listo')
            break                    



    except ValueError:
        print('Ingrese un numero valido por favor.')    