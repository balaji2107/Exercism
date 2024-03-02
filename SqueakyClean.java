class SqueakyClean {
    static String clean(String identifier) {
       if(identifier.length()==1)
           return identifier;
        String res="";
        for(int i=0;i<identifier.length();i++){
            if(identifier.charAt(i)=='¡' ||identifier.charAt(i)=='!' || identifier.charAt(i)=='$' ||identifier.charAt(i)=='#' ||identifier.charAt(i)=='.' ){
                continue;
            }
             if(identifier.charAt(i)=='1'){
                 res+="l";
                continue;
            }
            if(identifier.charAt(i)=='7'){
                 res+="t";
                continue;
            }
            if(identifier.charAt(i)=='4'){
                 res+="a";
                continue;
            }
            
            if(identifier.charAt(i)=='3'){
                res+="e";
                continue;
            }
            if(identifier.charAt(i)=='0'){
                res+="o";
                continue;
            }
            if(identifier.charAt(i)==' '){
                res+="_";
                continue;
            }
            if(i<identifier.length()-1 && identifier.charAt(i)=='-' && Character.isLetter(identifier.charAt(i+1))){
                res+=Character.toUpperCase(identifier.charAt(i+1));
                i++;
                }
            else
                res+=identifier.charAt(i);
            }
        return res;
    }
}