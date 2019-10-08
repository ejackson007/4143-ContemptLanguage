import re

def main():
    translation = {
    'bairn' : 'child',
    'bight' : 'bay',
    'float' : 'ship',
    'carle' : 'hero'}

    text = open("Beowulf.txt", 'r')
    text2 = text

    for key in translation.keys():
        re.sub(key, translation[key], text2)

    
if __name__ == '__main__':
    main()