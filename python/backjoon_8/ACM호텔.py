# https://www.acmicpc.net/problem/10250


def initHotel(h, w) :
    hotel = []
    for i in range(h) :
        tmp = []
        for j in range(w) :
            tmp.append(0)
        hotel.append(tmp)
    return hotel

def reservation(hotel, count) :
    w = int(count/len(hotel))
    h = int(count%len(hotel))
    hotel[h][w] = 1
    if w < 10 :
        print(str(h) + '0' + str(w+1))
    else :
        print(str(h) + str(w+1))
    return hotel

def main() :
    inputs = input()
    h, w, n = inputs.split(' ')
    hotel = initHotel(int(h),int(w))
    hotel = reservation(hotel, int(n))


if __name__ == "__main__" :
    main()