import re

def main():
    #dictionary for the translation chart
    translation = {
    'bairn' : 'child',
    'bight' : 'bay',
    'float' : 'ship',
    'carle' : 'hero'}

    count = [0,0,0,0]

    i = 0
    with open("/Users/evan/4143-ContemptLanguage/Beowulf/beowulf.txt", 'r+') as f:
        with open("/Users/evan/4143-ContemptLanguage/Beowulf/output.txt", 'r+') as o:
            for _ in range(933):
                next(f)
            for line in f:
                if line is "ADDENDA.":
                    break
                else:
                    o.write(line)

    with open("/Users/evan/4143-ContemptLanguage/Beowulf/output.txt", 'r+') as f:
        with open("/Users/evan/4143-ContemptLanguage/Beowulf/beowulf2.txt", 'r+') as o:   
            for line in f:
                for key in translation.keys():
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