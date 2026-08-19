class Solution {
    public int repeatedStringMatch(String a, String b) {
        int output = 0;
        String s = "";
        while (s.length() < b.length()) {
            s += a;
            output++;
        
    }

        if (s.contains(b)) {
            return output;
        }

        s += a;
        output++;

    if (s.contains(b)) {
            return output;
        }

        return -1;
    }
}
// 