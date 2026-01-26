package interviewQuestions.stringquestions.medium;

public class StringCompression {

	public static void main(String[] args) {
		
		String ans = getCompressedString("xxaaabhcc");
		System.out.println(ans);
	}
	
	// Coding ninja wala
	public static String getCompressedString(String str) {

		if(str.length() == 1)
			return str;
		
		StringBuilder sb = new StringBuilder();
		
		char[] sArray = str.toCharArray();
		
		int characterCount = 1, size = str.length();
		char previousCharacter = sArray[0];
		int i = 1;
		
		while(i < size) {
			char currentChar = sArray[i];
			if( currentChar == previousCharacter) {
				characterCount++;
			}
			
			else {
				sb.append(previousCharacter);
				previousCharacter = currentChar;
				
				if(characterCount > 1) {
					sb.append(characterCount);
					characterCount = 1;
				}
				
			}
			
			i++;
		}

		sb.append(previousCharacter);
		if(characterCount > 1) {
			sb.append(characterCount);
			characterCount = 1;
		}
		return sb.toString();
	}
	
	// leet code wala
    public int compress(char[] chars) {
        int current = 0;
        int ansIndex = 0;
        int size = chars.length;
        
        while(current < size) {
        	int next = current+1;
        	while(next < size && chars[current] == chars[next]) {
        		next++;
        	}
        	
        	chars[ansIndex++] = chars[current];
        	
        	int count = next - current;
        	
        	if(count > 1) {
        		String cnt = Integer.toString(count);
        		
        		for(char c : cnt.toCharArray()) {
        			chars[ansIndex++] = c;
        		}
        	}
        	
        	current = next;
        }
        
        return ansIndex;
    }

}
