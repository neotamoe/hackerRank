def capitalize(string):
    newstring = ""
    i=0
    for i in range(0,len(string)):
        if i==0:
            newstring += string[i].upper()
        elif string[i-1]==" " and string[i]!=" ":
            newstring += string[i].upper()
        else:
            newstring += string[i]
    return newstring


if __name__ == '__main__':
    string = input()
    capitalized_string = capitalize(string)
    print(capitalized_string)


# Given a string, capitalize the first letter of each "name"
# The string consists of alphanumeric characters and spaces
# in a word only the first character is capitalized.
# 12abc capitalized remains 12abc.
