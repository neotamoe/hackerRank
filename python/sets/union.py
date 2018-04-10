english = int(input())
englishlist = set(map(int, input().split()))
french = int(input())
frenchlist = set(map(int, input().split()))

bothlists = englishlist.union(frenchlist)
print(len(bothlists))


# The first line contains an integer, n, the number of students who have subscribed to the English newspaper.
# The second line contains n space separated roll numbers of those students.
# The third line contains n, the number of students who have subscribed to the French newspaper.
# The fourth line contains n space separated roll numbers of those students.
# Output the total number of students who have at least one subscription.
