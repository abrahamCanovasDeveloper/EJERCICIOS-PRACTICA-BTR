#Creamos la lista donde guardamos los arboles y su altura
lista_arboles = []
#ID del arbol inicial
id_arbol = 0


while True:
    #Input
    altura_arbol = input(f'Introduce la altura en cm de el arbol numero {id_arbol}"')

    #Condicion que termina el bucle
    if int(altura_arbol) == -1:
        break

    #Guardar en la lista de arboles
    lista_arboles.append(
        {
            "id_arbol": id_arbol,
            "altura_arbol": altura_arbol
        }
    )

    #Aumentamos el id para el siguiente arbol
    id_arbol += 1

    print(lista_arboles)

    #Buscar el arbol mas alto
    arbol_mayor = max(lista_arboles, key=lambda arbol: arbol["altura_arbol"])

    print(f'El arbol mas alto es el {arbol_mayor['id_arbol']} con {arbol_mayor["altura_arbol"]} cm')

