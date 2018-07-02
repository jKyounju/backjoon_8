# https://www.acmicpc.net/problem/1924

def checkDate(m, d) :
    # 제대로된 요일인지 확인 후 예외처리
    if m < 0 and m > 13 :
        return False
    else :
        if m == 1 and m == 3 and m == 5 and m == 7 and m == 8 and m == 10 and m == 12 :
            if d > 0 and d < 32 :
                return True
            else :
                return False
        elif m == 2 :
            if d > 0 and d < 29 :
                return True
            else :
                return False
        else :
            if d > 0 and d < 31 :
                return True
            else :
                return False

def checkWeekday(m, d) :
    # 총 일수 계산 후 %7 나머지 값으로 요일을 구함
    weekday = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
    total = 0
    for i in range(1, m) :
        if m == 1 and m == 3 and m == 5 and m == 7 and m == 8 and m == 10 and m == 12:
            total += 31
        elif m == 2:
            if d > 0 and d < 29:
                total += 28
        else:
            if d > 0 and d < 31:
                total += 30
    total += d
    return weekday[total%7]

def main() :
    inputs = input()
    m, d = inputs.split(' ')
    if not checkDate(int(m), int(d)) :
        print('잘못된 날짜 입니다.')
    else :
        weekday = checkWeekday(int(m), int(d))
        print(weekday)

if __name__ == "__main__" :
    main()