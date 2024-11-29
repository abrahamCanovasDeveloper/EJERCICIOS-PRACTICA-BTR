height_base = int(input("Insert how long is the triangule´s base and height"))

aux_height = 0
aux_base = height_base

# Print triangle
while aux_height <= height_base:                # First Loop control height
    aux_base = (height_base - aux_height)       # Each level subtract 1 from weight

    while aux_base < height_base:               # Second Loop set weight
        print("*", end="")
        aux_base += 1

    print("")                                   # After print weight set \n
    aux_height += 1                             # Sum up 1 to height to repeat until reach total height

