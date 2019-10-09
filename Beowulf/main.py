#Evan Jackson
import re

def main():
    #dictionary for the translation chart
    translation = {
    'bairn' : 'child',
    'bight' : 'bay',
    'float' : 'ship',
    'carle' : 'hero'}

    #list to keep count of how many changes are made
    count = [0,0,0,0]

    #opens the file and cuts it into the needed section, and put into auxillary text file
    with open("/Users/evan/4143-ContemptLanguage/Beowulf/beowulf.txt", 'r+') as f:
        with open("/Users/evan/4143-ContemptLanguage/Beowulf/auxillary.txt", 'r+') as o:
            for _ in range(933): #starts at "BEOWULF."
                next(f)
            for line in f:
                if line.find("ADDENDA.") is not -1: #goes until "ADDENDA."
                    o.write(line)
                    break
                else:
                    o.write(line)

    #opens auxillary for editing, and put into beowulf2
    with open("/Users/evan/4143-ContemptLanguage/Beowulf/auxillary.txt", 'r+') as f:
        with open("/Users/evan/4143-ContemptLanguage/Beowulf/beowulf2.txt", 'r+') as o:   
            for line in f:
                for key in translation.keys(): #check each line for translation dictionary
                    if line.find(key) is not -1:
                        line = line.replace(key, translation[key])
                        if key is 'bairn':
                            count[0] += 1
                        if key is 'bight':
                            count[1] += 1
                        if key is 'float':
                            count[2] += 1
                        if key is 'carle':
                            count[3] += 1
                
                o.write(line)

    
if __name__ == '__main__':
    main()