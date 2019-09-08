#Evan Jackson
#Calendar program, Assignment 1

#date time allows me to check and see if the date is a legitamate date
#documentation:https://docs.python.org/3/library/datetime.html
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
    #datetime will return a ValueError if the date is incorrect, and throw an error
    #in the code, therefore a try except is necessary for the code not to crash
    try: 
        datetime.datetime(year, month, day)
    except ValueError:
        Valid = False

    if(Valid is False):
        print("That is not a real date, try again")
    else:
        if(day * month is year):
            print(unparsed + " is magic because " + str(day) + ' * ' + str(month) + ' = ' + str(year))
        else:
            print(unparsed + " is not magic because " + str(day) + ' * ' + str(month) + ' ≠ ' + str(year))

    check = input("Would you like to continue? (Y/n)")
    
    if check is 'n':
        done = True
    





