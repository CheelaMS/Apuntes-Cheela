print("=== AGENCIA ESPACIAL INTERNACIONAL ===")
print("Sistema de Registro de Astronautas")

while True:
    try:
        cantidad = int(input("¿Cuántos astronautas registrar? "))
        if cantidad > 0:
            break
        print("Debe ser un número positivo.")
    except ValueError:
        print("Entrada inválida. Ingresa un número entero.")

aptos = 0
entrenamiento = 0
suma_puntajes = 0

for i in range(cantidad):
    print(f"\n--- Astronauta {i+1} ---")

    while True:
        nombre = input("Nombre del astronauta: ").strip()
        if len(nombre) > 0:
            break
        print("El nombre no puede estar vacío.")

    while True:
        try:
            puntaje = int(input("Puntaje de aptitud (1-100): "))
            if 1 <= puntaje <= 100:
                break
            print("El puntaje debe estar entre 1 y 100.")
        except ValueError:
            print("Ingresa un número entero válido.")

    suma_puntajes += puntaje

    if puntaje > 80: # tiene que ser mayor o igual
        print(f"→ {nombre}: Apto para misión")
        aptos += 1
    else:
        print(f"→ {nombre}: En entrenamiento")
        entrenamiento += 1
#promedio deberia tener un try porque es posible que solo si ingrese 1 astronauta, y que no califique dentro de aptos, por lo que se puede tener 0 aptos y asi producirse el error ZeroDivision error
promedio = suma_puntajes / aptos #posible error de logica = dividir por los aptos solo cuenta parte de la cantidad. Pero tambien produce que si solo 
print(f"\n=== RESUMEN DE LA MISIÓN ===")
print(f"Aptos para misión: {aptos}")
print(f"En entrenamiento: {entrenamiento}")
print(f"Promedio general: {promedio}") # No esta redondeado a 2 decimales 