h_w_var = "Hello World!" #string var + print
#print(h_w_var)

def new_func(printstring): #output string
    print(printstring)

#new_func("Bonjour")

def func_two(a,b, bool): #2 int returns sum
    if a + b >= 5 and bool : #conditionals
        return a + b
    else:
        return "error"

#print(func_two(2,7,True))

def func_three(a,b):
    if a == 0 or b == 0:
        return "0"
    else:
        return a + b

#for count in range(10):
    #print(func_three(3,count))


# array_numbers = [0,1,2,3,4,5,6,7,8,9]
# for i in range (len(array_numbers)):
#     print(func_two(array_numbers[i], 2, True))
# for i in array_numbers:
#     print (i)
# size = int (input("How large do you want it to be?"))
# array_new = []
# for i in range (size):
#     array_new.append(i)

# print(array_new)

# for i in array_new:
#     array_new[i] = array_new[i]*10

# print(array_new)

dbl = partial(multiply,2)
print((dbl),4)
