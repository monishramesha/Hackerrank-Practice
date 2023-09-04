class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        l = len(intervals)
        intervals.sort()
        ansList=[]
        for i in range(l):
            if not ansList or intervals[i][0] > ansList[-1][1]:
                ansList.append(intervals[i])
            else:
                ansList[-1][1] = max(ansList[-1][1] ,intervals[i][1])
        return ansList
        
