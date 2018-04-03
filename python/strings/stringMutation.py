# Read a given string, change the character at a given index and then print the modified string.
# One solution is to convert the string to a list and then change the value.
# Another approach is to slice the string and join it back.

def mutate_string(string, position, character):
    l = list(string)
    l[position] = character
    newString = "".join(l)
    return newString


if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
