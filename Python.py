def occurence(arr, n, x):
    count = 0
    
    for i in range(n):
        if(arr[i] == x):
            count += 1
            
    return count


if __name__ == "__main__":
    arr = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8]
    n = len(arr)
    x = int(input("Enter the element to count occurence: "))
    print(occurence(arr, n, x))
    