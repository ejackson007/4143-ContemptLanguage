def makeBinary(digit, binary):
    if digit is not 0:
        if digit is not 1:
            binary.append(digit % 2)
            print('.')
            makeBinary(digit // 2, binary)
        else:
            binary.append(1)
            makeBinary(0, binary)
    return binary

def main():
    digit = int(input("Enter in a Base 10 Number to see Binary, or -1 to exit: "))
    while digit > 0:
        binary = []
        binary = makeBinary(digit, binary)
        binary.reverse()
        print(str(digit) + " = ",end='')
        print(*binary)
        binary.clear()
        digit = int(input("Enter in a Base 10 Number to see Binary, or -1 to exit: "))

if __name__ == '__main__':
    main()
