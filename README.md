# RSA
```Протокол ассиметричного шифрования
==================================


1) p и q - это два БОЛЬШИХ простых числа

2) вычисляем n = p*q

3) вычисляем e - нечётное (!) небольшое взаимно простое с
    phi(n) = (p-1)(q-1)

4) Вычисляем d = e^(-1) mod phi(n)

5) Пара  (e, n) - публичный ключ

6) Пара  (d, n) - секретный ключ

Шифрование: x = m^e mod n

m - блок исходного сообщение (число)

Дешифрование: m = x^d mod n

Часто RSA используют для передачи большого секретного ключа симметричной криптосистемы.
```
