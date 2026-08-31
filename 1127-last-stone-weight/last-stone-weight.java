class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<stones.length;i++)
        {
            list.add(stones[i]);
        }
        while(list.size() > 1)
        {
            Collections.sort(list);
            int x = list.remove(list.size()-1);
            int y = list.remove(list.size()-1);
            if(x != y)
            {
                list.add(x-y);

            }
        }

        if(list.size() == 0)
        {
            return 0;
        }
        else
        {
            return list.get(0);
        }

        
    }
}