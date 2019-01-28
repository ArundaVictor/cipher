public class Encoding {

    private String minput;
    private int mkey;
    Boolean resencrypt = false;
    private String moutput;
    private String result;

    public Encoding (String input, String output, int key, String mresult) {
        minput = input;
        moutput = output;
        mkey = key;
        result = mresult;
    }

    public boolean textInput(String input){

        for (int i = 0; i < input.length(); i++)
            if (Character.isDigit(input.charAt(i)) == false){
                resencrypt = true;
            }else {
                resencrypt = false;
            }
        return resencrypt;
    }


    public boolean textOutput(String output){
        return true;
    }

    public String getMinput() {
        return minput;
    }

    public void setMinput(String minput) {
        this.minput = minput;
    }

    public int getMkey() {
        return mkey;
    }

    public void setMkey(int mkey) {
        this.mkey = mkey;
    }

    public String getMoutput() {
        return moutput;
    }

    public void setMoutput(String moutput) {
        this.moutput = moutput;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }



    public String encrypt(String input, int key){

        int textLength = input.length();

        for (int i = 0; i < textLength; i++){


            char newChar = input.charAt(i);

            if (Character.isLetter(newChar)){


                if (Character.isLowerCase(newChar)){
                    char n = (char)(newChar+key);


                    if (n>'z'){
                        result += (char)(newChar - (25-key));

                    }else{

                       result += n;
                    }

                }else if (Character.isUpperCase(newChar)){

                    char n = (char)(newChar+key);

                    if (n>'Z'){

                        result += (char)(newChar - (25-key));
                    }else{

                        result += n;
                    }
                }

            }else{

                result += newChar;
            }

        }

        return "true";

    }

}
