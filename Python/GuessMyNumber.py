import random

def compare_numbers(number, user_guess):
    numbers = [0,0]
    for i in range(len(number)):
        if number[i] == user_guess[i]:
            numbers[1]+=1
        if user_guess[i] in number and number[i] != user_guess[i] :
            numbers[0]+=1
    return numbers

playing =True # gotta play the game

digits = '123456789'
size = 4
number = ''.join(random.sample(digits,size))
print(number)

guesses = 0
# Explanation
print("Juguemos a adivinar mi numero") 
print("Voy a generar un numero de cuatro digitos y tenes que adivinar los 4 a la vez")
print("Por cada numero en un lugar equivocado vas a recibir Regular.\nPor cada numero en un lugar correcto vas a recibir un Good")
print("El juego terminar cuando adivinas los cuatro numeros!")
print("En caso de que quieras salir, escribi exit")

while playing:
    user_guess = input("Ingresa un numero de 4 digitos: ")
    while len(user_guess) != 4:
        user_guess = input("Invalid guess. Try again. ")
    if user_guess == 'exit':
        break
    numbercount = compare_numbers(number, user_guess)
    guesses+=1

    print('Tenes {} Regular y {} Good.'.format(str(numbercount[0]),str(numbercount[1])))

    if numbercount[1] == 4:
        playing = False
        print('Ganaste despues de {} intentos! El numero era {}.'.format(str(guesses), number))
        break
    else:
        print("Tu numero no se acerca, prova de nuevo")
