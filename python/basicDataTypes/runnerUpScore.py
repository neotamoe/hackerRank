if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = sorted(arr, reverse=True)
    for x in range(len(arr)):
        if arr[x] != arr[x+1]:
            print(arr[x+1])
            break
        x += 1


# Given the participants’ score sheet for your University Sports Day, you are required
# to find the runner-up score. You are given n scores. Store them in a list and find
# the score of the runner-up.
