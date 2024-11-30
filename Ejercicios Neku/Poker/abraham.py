import random

N_CARTAS_MANO = 2
N_CARTAS_MESA = 5

mano_jugador = []
mano_oponente = []
cartas_mesa = []

mazo = [
    {"palo": "corazon", "numero": 2, "activo": False},
    {"palo": "corazon", "numero": 3, "activo": False},
    {"palo": "corazon", "numero": 4, "activo": False},
    {"palo": "corazon", "numero": 5, "activo": False},
    {"palo": "corazon", "numero": 6, "activo": False},
    {"palo": "corazon", "numero": 7, "activo": False},
    {"palo": "corazon", "numero": 8, "activo": False},
    {"palo": "corazon", "numero": 9, "activo": False},
    {"palo": "corazon", "numero": 10, "activo": False},
    {"palo": "corazon", "numero": 11, "activo": False},
    {"palo": "corazon", "numero": 12, "activo": False},
    {"palo": "corazon", "numero": 13, "activo": False},
]

# Robar el nº deseado de cartas y las deja "activo": True en el mazo
def robar_cartas(num_cartas):
    cartas_robadas = []
    while len(cartas_robadas) < num_cartas:    
        cartas_disponibles = [carta for carta in mazo if not carta["activo"]]
        carta_robada = random.choice(cartas_disponibles)
        carta_robada['activo'] = True
        cartas_robadas.append(
            {
                "palo" : carta_robada['palo'],
                "numero" : carta_robada['numero']
            }
        )
    return cartas_robadas


# Roba cartas cada jugador
mano_jugador.append(robar_cartas(N_CARTAS_MANO))
mano_oponente.append(robar_cartas(N_CARTAS_MANO))

# Print Mano Jugador
print(mano_jugador)
print(mano_oponente)

# Cartas al centro
cartas_mesa.append(robar_cartas(N_CARTAS_MESA))
print(cartas_mesa)

# Calcular ganador