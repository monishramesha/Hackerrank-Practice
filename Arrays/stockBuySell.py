class Solution:
    def maxProfit(self, arr: List[int]) -> int:
        maxPro = 0
        minPrice = float('inf')
        for i in range(len(arr)):
            minPrice = min(minPrice, arr[i])
            maxPro = max(maxPro, arr[i] - minPrice)
        return maxPro

    """def maxProfit(self, prices: List[int]) -> int:
        minP = prices[0]
        l = len(prices)
        indMin = 0
        for i in range(0,l):
            if minP > prices[i]:
                minP = prices[i]
                indMin = i
        maxP = minP
        indMax = indMin
        for i in range(indMin,l):
            if maxP < prices[i] and indMax >= indMin:
                maxP = prices[i]
                indMax = i
        
        profit = maxP - minP
        print(maxP, minP, indMin, indMax)
        return profit"""
