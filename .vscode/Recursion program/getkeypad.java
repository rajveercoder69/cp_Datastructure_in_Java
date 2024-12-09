class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // If input string is empty, return empty list
        if (digits.length() == 0) {
            return result;
        }

        // Mapping of digits to corresponding letters
        String[] digitToLetters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // Generate letter combinations using recursion
        generateCombinations(digits, 0, "", digitToLetters, result);

        return result;
    }
    
    private void generateCombinations(String digits, int index, String combination, String[] digitToLetters, List<String> result) {
        // If we've processed all digits, add current combination to result list and return
        if (index == digits.length()) {
            result.add(combination);
            return;
        }

        // Get the possible letters for the current digit
        String letters = digitToLetters[digits.charAt(index) - '0'];

        // Recursively generate combinations for each possible letter of the current digit
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, combination + letters.charAt(i), digitToLetters, result);
        }
    }
}