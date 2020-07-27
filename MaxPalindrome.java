class MaxPalindrome{
    public String getPalindrome(String str){
        int end = 0, start = 0;
        for(int i = 0; i<str.length(); i++){
            int len = Math.max(maxPal(str, i, i), maxPal(str, i, i + 1));
            System.out.println(len+" "+i);
            if((end - start) < len){
                end =  i + (len/2);
                start = i - ((len-1)/2);
            }
        }
        return str.substring(start, end + 1);
    }

    public int maxPal(String str, int l, int r){
        int L = l, R = r;
        while(L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
