if __name__ == '__main__':
    s = input()

    for i in range(0, len(s)):
        if s[i].isalnum():
            print("True")
            break
        elif not s[i].isalnum() and i==len(s)-1:
            print("False")

    for i in range(0, len(s)):
        if s[i].isalpha():
            print("True")
            break
        elif not s[i].isalpha() and i==len(s)-1:
            print("False")

    for i in range(0, len(s)):
        if s[i].isdigit():
            print("True")
            break
        elif not s[i].isdigit() and i==len(s)-1:
            print("False")

    for i in range(0, len(s)):
        if s[i].islower():
            print("True")
            break
        elif not s[i].islower() and i==len(s)-1:
            print("False")

    for i in range(0, len(s)):
        if s[i].isupper():
            print("True")
            break
        elif not s[i].isupper() and i==len(s)-1:
            print("False")

# Python has built-in string validation methods for basic data. It can check if a string
# is composed of alphabetical characters, alphanumeric characters, digits, etc.
# You are given a string S.
# Your task is to find out if the string S contains: alphanumeric characters,
# alphabetical characters, digits, lowercase and uppercase characters.

# COMMENT:  This was my first pass.  You can tell it's my code due to the large number
# of for loops--haha!  In the discussions section, another person posted a really simple
# solution:
# https://www.hackerrank.com/challenges/string-validators/forum/comments/86859
str = raw_input()
print any(c.isalnum() for c in str)
print any(c.isalpha() for c in str)
print any(c.isdigit() for c in str)
print any(c.islower() for c in str)
print any(c.isupper() for c in str)

# and  yet another great one...
# https://www.hackerrank.com/challenges/string-validators/forum/comments/346845
for method in [str.isalnum, str.isalpha, str.isdigit, str.islower, str.isupper]:
    print any(method(c) for c in s)
