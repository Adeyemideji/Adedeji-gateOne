import random 

correctAnswers = 0
wrongAnswer = 0

randomNumber = 0
randomNumberTwo = 0

for counter in range (1, 11):
	randomNumber = random_randint(1, 11)
	randomNumberTwo = random_randint(1,10)
	answer = randomNumber + randomNumberTwo

	randomQuestion = int(input(f' what is {randomNumber} + {randomNumberTwo}? '))

	if randomQuestion == answer:
		correctAnswer

	else  randomQuestion = answer:
		wrongAnswer