# Initial balance
balance = 0

questions = [
    "How much do you have in the bank?",
    "How much money have you saved in your piggybank?",
    "How much money do you have in your pockets?",
    "How much money have you hidden under the mattress?"
]


for q in questions:
    amount = int(input(q))
    #Condition to end
    if amount == 0:
        break
    #Adding amount to total balance
    balance += amount

# Conclution
print(f"That´s a wrap. Your total balance is: {balance} ")



