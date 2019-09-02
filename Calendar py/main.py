import datetime

done = False
while done is False:
    print("Type in value to see if the day is Magic!")
    unparsed = input("MM/DD/YY: ")

    month, day, year = unparsed.split('/')

    month = int(month)
    day = int(day)
    year = int(year)
    
    Valid = True
    try: 
        datetime.datetime(year, month, day)
    except ValueError:
        Valid = False

    if(Valid is False):
        print("That is not a real date, try again")
    else:
        if(int(day) * int(month) is int(year)):
            print(unparsed + " is magic because " + str(day) + ' * ' + str(month) + ' = ' + str(year))
        else:
            print(unparsed + " is not magic because " + str(day) + ' * ' + str(month) + ' ≠ ' + str(year))

    check = input("Would you like to continue? (Y/n)")
    
    if check is 'n':
        done = True
    





