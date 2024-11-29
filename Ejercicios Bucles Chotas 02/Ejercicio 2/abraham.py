num_a = 150
num_b = 225

common_divisor = 1
common_divisor_list = []

# Check all nums until reach the min number bewteen both
while common_divisor <= min(num_a, num_b):
    # Set var to save state of divisible. Default False
    divisor_a = False
    divisor_b = False

    if(num_a % common_divisor == 0):
        divisor_a = True
    if(num_b % common_divisor == 0):
        divisor_b = True

    # If both are divisible adding to list of common divisor
    if(divisor_a and divisor_b):
        common_divisor_list.append(common_divisor)

    # Sum up 1 to the possible common divisor
    common_divisor += 1

print(f"Max common divisor of {num_a} and {num_b} is: {max(common_divisor_list)}")