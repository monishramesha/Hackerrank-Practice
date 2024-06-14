class Solution:
    def setZeroes(self, matrix: list[list[int]]) -> None:
    
        def markRow(arr,l, m, i):
            for j in range(m):
                if arr[i][j] != 0:
                    arr[i][j] = -1
        def markCol(arr, l, m, j):
            for i in range(l):
                if arr[i][j] != 0:
                    arr[i][j] = -1
        l = len(matrix)
        m = len(matrix[0])
        for i in range(0, l):
            for j in range(0, m):
                if matrix[i][j] == 0:
                    markRow(matrix, l, m, i)
                    markCol(matrix, l, m, j)

        for i in range(l):
            for j in range(m):
                if matrix[i][j] == -1:
                    matrix[i][j] = 0

        return matrix
