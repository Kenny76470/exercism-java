class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();

        boolean isAfterDash = false;

        for(char ch : identifier.toCharArray()){
            if(ch == '-'){
                isAfterDash = true;
            }
            else if (Character.isWhitespace(ch)){
                sb.append("_");
                isAfterDash = false;
            }
            else if(ch == '4' || ch == '3' || ch =='0' || ch == '1' || ch == '7'){
                char convent = ' ';
                if(ch == '4') convent = 'a';
                if(ch == '3') convent = 'e';
                if(ch == '0') convent = 'o';
                if(ch == '1') convent = 'l';
                if(ch == '7') convent = 't';

                if(isAfterDash){
                    sb.append(Character.toUpperCase(convent));
                    isAfterDash = false;
                }
                else{
                    sb.append(convent);
                }
            }
            else if(Character.isLetter(ch)){
                if(isAfterDash){
                    sb.append(Character.toUpperCase(ch));
                    isAfterDash = false;
                }else{
                    sb.append(ch);

                }
            }
        }
        return sb.toString();


    }
}
