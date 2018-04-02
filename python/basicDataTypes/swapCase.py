# You are given a string and your task is to swap cases. In other words, convert all
# lowercase letters to uppercase letters and vice versa.

def swap_case(s):
    newString = ""
    for c in s:
        if c.islower():
            newString += c.upper()
        elif c.isupper():
            newString += c.lower()
        else:
            newString += c
    return newString
