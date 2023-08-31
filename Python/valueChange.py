# 파이썬 값 교환
#* 배열 디스트럭처링(destructuring)
a = 1
b = 2

print('변경 전 a = ' , a)
print('변경 전 b = ' , b)

[a, b] = [b, a]

print('변경 후 a = ' , a)
print('변경 후 b = ' , b)

#* 임시변수
x = 10
y = 20

print('변경 전 x = ' , x)
print('변경 후 y = ' , y)

z = x
x = y
y= z

print('변경 후 x = ' , x)
print('변경 후 y = ' , y)
