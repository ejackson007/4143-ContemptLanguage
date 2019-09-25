#Evan Jackson
#Decimal to Binary Assignment 1

#This program uses recursion to turn a base 10 number into a binary. 
#As the recursive function goes through, it pushes each bit into a list
#to keep all of the bits together

def makeBinary(digit, binary):
    if digit is not 0:
        if digit is not 1:
            binary.append(digit % 2)
            #integer division used to keep from getting decimals
            makeBinary(digit // 2, binary)
        else:
            binary.append(1)
            makeBinary(0, binary)

def main():
    digit = int(input("Enter in a Base 10 Number to see Binary, or -1 to exit: "))
    while digit >= 0:
        binary = []
        makeBinary(digit, binary)
        binary.reverse()    #must reverse list before print for correct order
        print(str(digit) + " = ",end='') #print without next line
        #Did not let me use *list as a variable in conjunction with another variable
        #so i gave it its own print function
        print(*binary)  
        binary.clear()  #clear list for future use
        digit = int(input("Enter in a Base 10 Number to see Binary, or -1 to exit: "))

if __name__ == '__main__':
    main()
