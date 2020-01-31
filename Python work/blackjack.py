import random
possible_numbers = [1,2,3,4,5,6,7,8,9,10,10,10,10]
cards = [random.choice(possible_numbers)]
cards.append (random.choice(possible_numbers))
print (cards, "Total =", sum(cards))

bust = False
stick=False
while (stick == False) & (sum(cards)<=21):
    choice = input("Twist or Stick? ")
    if choice == "Twist":
        cards.append (random.choice(possible_numbers))
        if sum(cards)>21:
            print (cards, "Total =", sum(cards))
            print("BUST")
            bust = True
        else:
            print (cards, "Total =", sum(cards))
    elif choice == "Stick":
        print(sum(cards))
        stick = True
    else:
        print("Incorrect Input")
    
print("ENTER THE DEALER")
dealer_cards = [random.choice(possible_numbers)]
dealer_cards.append (random.choice(possible_numbers))
print (dealer_cards, "Total =", sum(dealer_cards))
while sum(dealer_cards) <+ 16:
    dealer_cards.append(random.choice(possible_numbers))
print("Dealer's cards")
print(dealer_cards, "Total =", sum(dealer_cards))
if sum(dealer_cards) > 21:
    print("Dealer bust")
    print("You win!")
elif sum(dealer_cards)>= sum(cards):
    print("dealer wins!")
elif sum(cards) > sum(dealer_cards) & bust == False:
    print("You win!")