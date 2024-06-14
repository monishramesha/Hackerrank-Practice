class StockSpanner {
    private Stack<int[]> s1;  // Stack of arrays{price, span}
    public StockSpanner() {
        s1 = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!s1.isEmpty() && s1.peek()[0] <= price){
            System.out.println(s1.peek()[0]);
            span += s1.pop()[1];    
        }
        s1.push(new int[] {price, span});
        return span;
    }
}
