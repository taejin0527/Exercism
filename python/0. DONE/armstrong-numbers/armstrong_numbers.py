"""
@task
Determine whether a number is an "Armstrong number"

@def
Armstrong number == a number that is the sum of its own digits each raised to the power of the number of digits
"""


def is_armstrong_number(number) -> bool:
    e = len(str(number))
    sum = 0
    tmp = number

    while tmp > 0:
        digit = tmp % 10
        sum += digit ** e
        tmp //= 10

    return number == sum
