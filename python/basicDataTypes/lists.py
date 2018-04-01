if __name__ == '__main__':
    N = int(raw_input())
    list = []
    for _ in range(N):
        line = raw_input().split()
        command = line[0]
        if command == "insert":
            index1 = int(line[1])
            index2 = int(line[2])
            list.insert(index1, index2)
        elif command == "append":
            index1 = int(line[1])
            list.append(index1)
        elif command == "remove":
            index1 = int(line[1])
            list.remove(index1)
        elif command == "print":
            print(list)
        elif command == "sort":
            list.sort()
        elif command == "pop":
            list.pop()
        elif command == "reverse":
            list.reverse()


# Consider a list (list = []). You can perform the following commands:
# insert i e: Insert integer e at position i.
# print: Print the list.
# remove e: Delete the first occurrence of integer e.
# append e: Insert integer e at the end of the list.
# sort: Sort the list.
# pop: Pop the last element from the list.
# reverse: Reverse the list.
#
# Initialize your list and read in the value of n followed by n lines of commands where
# each command will be of the 7 types listed above. Iterate through each command in
# order and perform the corresponding operation on your list.
