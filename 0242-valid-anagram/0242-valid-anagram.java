class Solution {
    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        char tempArray2[] = t.toCharArray();
        Arrays.sort(tempArray2);
        return Arrays.equals(tempArray,tempArray2);
    }
}