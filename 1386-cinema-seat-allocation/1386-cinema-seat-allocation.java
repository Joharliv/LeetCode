class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 2 * n;
        Arrays.sort(reservedSeats, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < reservedSeats.length; i++) {
            int curr = reservedSeats[i][0];
            boolean flag25 = true;
            boolean flag47 = true;
            boolean flag69 = true;

            while (i < reservedSeats.length && reservedSeats[i][0] == curr) {
                if (reservedSeats[i][1] >= 2 && reservedSeats[i][1] <= 5) {
                    flag25 = false;

                    if (reservedSeats[i][1] >= 4 && reservedSeats[i][1] <= 7) {
                        flag47 = false;
                    }
                } else if (reservedSeats[i][1] >= 6 && reservedSeats[i][1] <= 9) {
                    flag69 = false;
                    if (reservedSeats[i][1] >= 6 && reservedSeats[i][1] <= 7) {
                        flag47 = false;
                    }
                }
                i++;
            }
            if (!flag69 && !flag25 && !flag47) {
                ans -= 2;
            } else if (!flag69 || !flag25 || !flag47) {
                ans--;
            }
            i--;
        }
        return ans;
    }
}