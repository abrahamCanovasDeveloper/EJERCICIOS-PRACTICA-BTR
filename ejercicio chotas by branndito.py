# Programa para encontrar el árbol más alto

print("Introduce la altura de cada árbol en cm. Escribe -1 para terminar.")

etiqueta = 0  # cm asignado a cada árbol
altura_mas_alta = 0  # Altura del más alto
etiqueta_mas_alto = -1  # Número en la lista (arbol)

while True:
    # Pedir al usuario la altura del árbol
    altura = int(input(f"Altura del árbol {etiqueta}: "))

    # Si ingresa -1, se termina el bucle
    if altura == -1:
        break

    # Si la altura ingresada es mayor que la más alta encontrada, actualizar datos
    if altura > altura_mas_alta:
        altura_mas_alta = altura
        etiqueta_mas_alto = etiqueta

    # Mostrar el numero y la altura del arbol más alto hasta ahora
    print(f"El árbol más alto hasta ahora es el número {etiqueta_mas_alto}, con una altura de {altura_mas_alta} cm.")

    # Pasar al siguiente árbol si la altur es mayor a etiqueta
    etiqueta += 1

# Imprimir resultado final en consola
if etiqueta_mas_alto == -1:
    print("No se ingresaron datos de árboles.")
else:
    print(f"El árbol más alto es el número {etiqueta_mas_alto}, con una altura de {altura_mas_alta} cm.")
