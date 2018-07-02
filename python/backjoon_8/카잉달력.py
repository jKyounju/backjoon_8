# https://www.acmicpc.net/problem/6064

def kaingCalendar(im) :
    count = 0
    c_x = 0
    c_y = 0
    for i in range(im[0]*im[1]) :
        count += 1
        if c_x < im[0] :
            c_x += 1
        else :
            c_x = 1
        if c_y < im[1] :
            c_y += 1
        else :
            c_y = 1
        if c_x == im[2] and c_y == im[3] :
            return count
    return -1

def main() :
    inputs = input()
    im = inputs.split()
    for i in range(len(im)) :
        im[i] = int(im[i])
    count = kaingCalendar(im)
    print(count)

if __name__ == "__main__" :
    main()