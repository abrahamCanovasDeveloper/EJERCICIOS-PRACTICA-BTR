comida_diaria = int(input("¿Cuantos kilos de comida compras al dia?"))
num_animales = int(input("¿Cuantos animales hay en la granja?"))
kilos_por_animal = int(input("¿Cuantos kilos come cada bestia al dia?"))


comida_diaria_necesaria = kilos_por_animal * num_animales

if comida_diaria >= comida_diaria_necesaria:
    print('Tenemos comida suficiente')
else:
    racion = comida_diaria / num_animales
    print(f'No tenemos comida suficiente. Con lo que tenemos cada animal toca a {racion} kg')
