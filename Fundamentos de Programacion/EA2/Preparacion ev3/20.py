stock = 60
capacidad = 60
historial = 0 #prestamos activos
programa = True
while programa == True:
    try:
        print('''=== BIBLIOTECA TECNOLÓGICA UNIVERSIDAD DEL SUR ===
1. Ver equipos disponibles
2. Prestar equipo(s)
3. Recibir devolución
4. Ver historial de préstamos activos
5. Salir''')
    
        print(f' \n Por favor seleccione una opcion:')
        opcion = int(input())
        if opcion == 1:
            print (f'Equipos en stock: {stock} equipos')
        elif opcion == 2:
            while True:
                try:
                    cantidad = int (input('¿Cuantos equipos desea pedir prestado?'))
                    if cantidad < 0 or cantidad > stock:
                        print('Por favor ingrese una cantidad de equipos valida (Numeros enteros positivos que no superen el stock o 0 para cancelar)')
                    elif cantidad == 0:
                        print ('Operacion cancelada, volviendo al menu...')
                        break
                    else:
                        print (f'Se prestaran {cantidad} equipos')
                        stock -= cantidad
                        historial += cantidad
                        print (f'Stock restante {stock} \nPrestamos activos: {historial}')
                        break
                except ValueError:
                    print ('Por favor ingrese una cantidad valida (Numeros enteros positivos que no superen el stock o 0 para cancelar)')    
        elif opcion == 3:
            while True:
                try:
                    devolucion = int (input('¿Cuantos equipos desea pedir prestado?'))
                    if devolucion < 0 or devolucion > historial:
                        print ('Por favor ingrese una cantidad valida (Numeros enteros positivos que no superen el historial de prestamos activos o 0 para cancelar)')
                    elif devolucion == 0:
                        print ('Operacion cancelada, volviendo al menu...')
                        break
                    else:
                        print (f'Se devolvieron {devolucion} equipos')
                        stock += devolucion
                        historial -= devolucion
                        print (f'Stock restante {stock} \nPrestamos activos: {historial}')
                        break            
                
                except ValueError:
                    print ('Por favor ingrese una cantidad valida (Numeros enteros positivos que no superen el historial de prestamos activos o 0 para cancelar)')                        
        elif opcion == 4:
            print (f'Prestamos activos: {historial} equipos')
        elif opcion == 5:
            print ("Gracias por utilizar el sistema. Hasta pronto.")
            programa = False
        elif opcion <= 0 or opcion > 5:
            print ('Opcion invalida por favor elija una de las opciones del menu.')

    except ValueError:
        print ('Opcion invalida por favor elija una de las opciones del menu.')    