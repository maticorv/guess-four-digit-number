from itertools import permutations
from random import shuffle
import time

try:
    raw_input
except:
    raw_input = input
try:
    from itertools import izip
except:
    izip = zip
 
digits = '123456789'
size = 4
 
def parse_score(score):
    score = score.strip().split(',')
    return tuple(int(s.strip()) for s in score)
 
def scorecalc(guess, chosen):
    bulls = cows = 0
    for g,c in izip(guess, chosen):
        if g == c:
            bulls += 1
        elif g in chosen:
            cows += 1
    return bulls, cows
 
choices = list(permutations(digits, size))
shuffle(choices)
answers = []
scores  = []
 
print ("Estamos jugando a adivinar tu numero con %i digitos \n" % size)
print("Ingresa los numeros solicitados con el formato X,X")
 
while True:
    ans = choices[0]
    answers.append(ans)
    #print ("(Narrowed to %i possibilities)" % len(choices))
    score = raw_input("Intento %2i es %*s. Tu respuesta (Good,Regular)?"
                      % (len(answers), size, ''.join(ans)))
    score = parse_score(score)
    scores.append(score)
    found =  score == (size, 0)
    if found:
        print ("Felicitaciones!")
        time.sleep(10)
        break
    choices = [c for c in choices if scorecalc(c, ans) == score]
    if not choices:
        print ("Nada encaja con las indicaciones que me diste")
        print ('  ' +
               '\n  '.join("%s -> %s" % (''.join(an),sc)
                           for an,sc in izip(answers, scores)))

        