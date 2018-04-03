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

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)

# You are given a string. Split the string on a " " (space) delimiter and join using a - hyphen.
