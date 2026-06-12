class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();

        boolean isAferDash = false;

        for(char ch : identifier.toCharArray()){
            if(ch == '-'){
                isAferDash = true;
            }
            else if (Character.isWhitespace(ch)){
                sb.append("_");
                isAferDash = false;
            }
            else if(ch == '4' || ch == '3' || ch =='0' || ch == '1' || ch == '7'){
                char convent = ' ';
                if(ch == '4') convent = 'a';
                if(ch == '3') convent = 'e';
                if(ch == '0') convent = 'o';
                if(ch == '1') convent = 'l';
                if(ch == '7') convent = 't';

                if(isAferDash==true){
                    sb.append(Character.toUpperCase(convent));
                    isAferDash = false;
                }
                else{
                    sb.append(convent);
                }
            }
            else if(Character.isLetter(ch)){
                {
                    if(isAferDash == true){
                        sb.append(Character.toUpperCase(ch));
                        isAferDash = false;
                    }else{
                        sb.append(ch);
                        isAferDash = false;
                    }
                }
            }
        }
        return sb.toString();


    }
}
