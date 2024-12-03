class AddSpace {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        int spaceInd = 0;
        int n = s.length();
        while (count < n) {
            if (spaceInd < spaces.length && count == spaces[spaceInd]) {
                ans.append(' ');
                count--;
                spaceInd++;
            } else {
                ans.append(s.charAt(count));
            }
            count++;
        }
        return ans.toString();
    }
}