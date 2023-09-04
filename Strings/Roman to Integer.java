class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char prev=s.charAt(0);
        int num=map.get(prev);

        for(int i=1;i<s.length();i++)
        {
            if(map.get(prev) < map.get(s.charAt(i)))
            {
                num=num-(2*map.get(prev));
            }
            num=num+map.get(s.charAt(i));
            prev=s.charAt(i);
        }
        return num;
    }
}
