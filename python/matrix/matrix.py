from typing import List


class Matrix:
    def __init__(self, matrix_string: str) -> None:
        self.matrix = [[int(col) for col in row.split()]
                       for row in matrix_string.splitlines()]

    def row(self, index: int) -> List[int]:
        return list(self.matrix[index-1])

    def column(self, index: int) -> List[int]:
        # return [row[index-1] for row in self.matrix]
        return list(reversed(list(zip(*self.matrix[::-1]))[index-1]))
