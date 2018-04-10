def average(array):
    # your code goes here
    plantSet = set(array)
    return sum(plantSet) / len(plantSet)

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)

# A set is an unordered collection of elements without duplicate entries.
# When printed, iterated or converted into a sequence, its elements will appear in an arbitrary order.
#
# Ms. Gabriel Williams is a botany professor at District College. One day, she asked her student Mickey to compute the average of all the plants with distinct heights in her greenhouse.
#
# Formula used:
# average = sum of distinct heights / total number of distinct heights
