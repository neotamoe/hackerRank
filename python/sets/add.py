# Rupal has a huge collection of country stamps. She decided to count the total number of distinct country stamps in her collection. She asked for your help. You pick the stamps one by one from a stack of N country stamps.
#
# Find the total number of distinct country stamps.

places = set()

x = int(input())

while (x>0):
    places.add(input())
    x-=1

print(len(places))


# If we want to add a single element to an existing set, we can use the .add() operation.
# It adds the element to the set and returns ‘None’.
