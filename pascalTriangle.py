class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        def nCr(n, r):
            res = 1
            for i in range(r):
                res = res * (n - i)
                res = res // (i + 1)
            return int(res)
        arrPascal=[]
        for i in range(1,numRows+1):
            arrRow=[]
            for j in range(1, i+1):
                arrRow.append(nCr(i - 1, j - 1))
            arrPascal.append(arrRow)
        return arrPascal

        
