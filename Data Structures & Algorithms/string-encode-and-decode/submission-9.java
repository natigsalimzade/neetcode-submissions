class Solution {

    public String encode(List<String> strs) {

        String encoded_string = "";

        for (String str : strs) {
            encoded_string += str.length() + "#" + str;
        }

        return encoded_string;

    }

    public List<String> decode(String str) {
List<String> decoded_strs = new ArrayList<>();
        String text = str;
        
        while (!text.isEmpty()) {
                int index = text.indexOf('#');
                int length = Integer.parseInt(text.substring(0, index));
                String str1 = text.substring(index + 1, index+length+1);
                decoded_strs.add(str1);
                text = text.substring(index + length + 1);
        }
        
        return decoded_strs;
    }
}
