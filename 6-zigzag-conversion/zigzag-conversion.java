class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int currentRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()) {

            rows[currentRow].append(c);

            if(currentRow == 0 || currentRow == numRows - 1)
                goingDown = !goingDown;

            if(goingDown)
                currentRow++;
            else
                currentRow--;
        }

        String result = "";

        for(StringBuilder row : rows)
            result += row.toString();

        return result;
      
    }
}