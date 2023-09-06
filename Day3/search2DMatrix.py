class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l = len(matrix)
        b = len(matrix[0])
        for i in range(0, l):
            if matrix[i][0] >= target or matrix[i-1][-1] >= target:
                if matrix[i-1][0] <= target:
                    for j in range(b):
                        if matrix[i-1][j] == target:
                            return True
        return False
