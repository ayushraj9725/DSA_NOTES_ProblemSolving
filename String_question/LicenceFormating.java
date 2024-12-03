public class LicenceFormating {
    public String licenseKeyFormatting(String s, int k) {
        // 1 step we ae removing all the - from string and convert into uppercase
        // so are spliting it 
        StringBuilder str = new StringBuilder(s.replaceAll("-","").toUpperCase());
        StringBuilder result = new StringBuilder();
        str.reverse() ; // reversing the str 
        for(int i = 0 ; i < str.length() ; i=i+k){
            if(i+k <= str.length()){
                result.append(str.substring(i,i+k));
            }
            else{
                result.append(str.substring(i));
            } 
            if(i+k < str.length()){
                result.append('-');
            }
        }
        return result.reverse().toString();
        // it takin for solving o(n) replacing and converting case + 
        // 2*O(n) for reversing and O(n/i+k) so over all O(n) taken
        // and space is taking O(n)  
    }
}
