class Solution {
    public int totalNumbers(int[] digits) {
     int count=0;
     int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        for (int first = 1; first <= 9; first++) {
            for (int middle = 0; middle <= 9; middle++) {
                for (int last = 0; last <= 8; last += 2) {
                    int[] need = new int[10];
                    need[first]++;
                    need[middle]++;
                    need[last]++;
                    boolean possible = true;
                    for (int d = 0; d <= 9; d++) {
                        if (need[d] > freq[d]) {
                            possible = false;
                            break;
                        }
                    }
                    if (possible) {
                        count++;
                    }
                }
            }
        }
   return count;
    }
}