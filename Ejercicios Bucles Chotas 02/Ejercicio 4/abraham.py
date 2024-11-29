minors = 0
young_adults = 0
adults = 0

# Input number of total persons to include
n_people = int(input("How many people"))

# Setting and Adding persons by age
for x in range(n_people):
    age = int(input("How old is..."))

    match age:
        case x if x < 18:
            minors += 1
        case x if x >= 18 and x <= 35:
            young_adults += 1
        case _:
            adults += 1            

# Print survey Results
print(f"There is a total of {minors} minors")
print(f"There is a total of {young_adults} young_adults")
print(f"There is a total of {adults} adults")