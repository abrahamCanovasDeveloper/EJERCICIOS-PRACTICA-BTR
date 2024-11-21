comida_diaria = 0

num_animales = input("¿Cuantos animales hay en la granja?")
kilos_por_animal = input("¿Cuantos kilos come cada bestia al dia?")


comida_diaria = kilos_por_animal * num_animales

print(f'Necesitas {comida_diaria} al dia')