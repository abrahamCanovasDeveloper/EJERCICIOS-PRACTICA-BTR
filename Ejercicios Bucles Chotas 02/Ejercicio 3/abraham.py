height_base = int(input("Insert how long is the triangule´s base and height"))

aux_height = 1
aux_base = height_base
tabs = aux_height

# Print triangle
while aux_height <= height_base:                # First Loop control height
    aux_base = (height_base - aux_height)       # Each level subtract 1 from weight

    while tabs < height_base:                   # Insert tabs to align correctly the triangle
        print("\t", end="")
        tabs += 1

    while aux_base < height_base:               # Second Loop set weight
        print("*\t\t", end="")
        aux_base += 1

    print("")                                   # After print weight set \n
    aux_height += 1                             # Sum up 1 to height to repeat until reach total height
    tabs = aux_height


# Example Solution
#               +
#           +       +
#       +       +       +    
#   +       +      +       +    