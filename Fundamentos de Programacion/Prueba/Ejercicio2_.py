capacidad_maxima = 50
habitaciones_disponibles=50
habitaciones_ocupadas=0
historial = 0
checkin = 0
checkout = 0
programa= True

print( "¡Bienvenido al sistema de gestión de habitaciones del Hotel Estelar!")
while programa == True:
    try:
        print(''' 
 === MENÚ PRINCIPAL ===
 1. Habitaciones disponibles
 2. Realizar check-in
 3. Realizar check-out
 4. Historial de ocupaciones
 5. Salir
''')
        opcion= int(input('Selecione una opción del menu: '))
        if opcion == 1: #HABITACIONES DISPONIBLES
            print(f'Quedan {habitaciones_disponibles} habitaciones disponibles')
        elif opcion == 2: #CHECK INS
            while True:
                try:
                    checkin=int(input('¿Cuantas habitaciones desea reservar?' ))
                    if checkin > 0 and checkin <= habitaciones_disponibles:
                        habitaciones_disponibles -= checkin
                        habitaciones_ocupadas += checkin
                        historial += checkin
                        print ('Check-in realizado')
                        print (f'{checkin} habitaciones reservadas')
                        print (f'{habitaciones_disponibles} Habitaciones disponibles')
                        break
                    elif checkin > habitaciones_disponibles:
                        print('No hay suficientes habitaciones disponibles')
                        print (f'{habitaciones_disponibles} Habitaciones disponibles')
                    elif checkin == 0:
                        print('Operacion cancelada')
                        break
                    else:
                        print('Por favor ingrese un numero valido')
                except ValueError:
                    print('Porfavor ingrese un numero valido')
        elif opcion == 3: #CHECK OUTS
            while True:
                try:
                    checkout=int(input('¿Cuantas habitaciones desea liberar? '))
                    if checkout > 0 and (checkout + habitaciones_disponibles) <= capacidad_maxima:
                        habitaciones_disponibles += checkout
                        habitaciones_ocupadas -= checkout
                        historial -= checkout
                        print ('Check-out realizado')
                        print (f'{checkout} habitaciones liberadas')
                        print (f'{habitaciones_disponibles} Habitaciones disponibles')
                        break
                    elif checkout + habitaciones_disponibles > capacidad_maxima:
                        print('Cantidad ingresada excede capacidad maxima')
                        print(f'Habitaciones disponibles: {habitaciones_disponibles}')
                        print(f'Capacidad maxima = {capacidad_maxima}')
                    elif checkout == 0:
                        print ('Operacion cancelada')
                        break
                    else:
                        print('Numero invalido')    
                except ValueError:
                    print('Porfavor ingrese un numero valido')                                 
                except:
                    print('Otro error')
        elif opcion == 4: # HISTORIAL DE MOVIMIENTOS
            print (f'El movimiento neto de habitaciones de la sesion actual es {historial}' )
        elif opcion == 5: #APAGAR EL PROGRAMA
            print ("Gracias por utilizar nuestro software, hasta la próxima.")
            programa = False
        else:
            print('Por favor ingrese una opcion valida del menu (1,2,3,4 o 5)')                            
    except ValueError:
        print('Por favor ingrese una opcion valida del menu (1,2,3,4 o 5)')

    except:
        print('Ocurrio un error')        
    #finally: #DEBUG
    #    print (habitaciones_disponibles)
    #    print (habitaciones_ocupadas)
    #    print (historial)
    #    print (checkin)
    #    print (checkout)
    # AGREGUE EL 0 COMO OPCION PARA CANCELAR PARA EVITAR ATASCOS

