n = int(input())
s = set(map(int, input().split()))
x = int(input())

while (x>0):
    command = input().split()
    if command[0] == "pop":
        s.pop()
    elif command[0] == "remove":
        s.remove(int(command[1]))
    else:
        s.discard(int(command[1]))
    x-=1

print(sum(s))


# You have a non-empty set s, and you have to execute N commands given in N lines.
#
# The commands will be pop, remove and discard.
#
# Print the sum of the elements of set s on a single line.
