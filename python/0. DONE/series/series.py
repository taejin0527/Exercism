from typing import List


def slices(series: str, length: int) -> List[str]:
    n = len(series)

    if n < length or length < 1:
        raise ValueError('value error')

    sub_strings = []
    for i in range(n - length + 1):
        sub_strings.append(series[i:i+length])

    return sub_strings
