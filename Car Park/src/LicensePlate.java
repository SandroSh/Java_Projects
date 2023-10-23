public class LicensePlate {
    private final String regionalCode;
    private final String letters;
    private final int digits;

    public LicensePlate(String regionalCode, String letters, int digits) {
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    public boolean isEqual(LicensePlate otherLicensePlate){
        if (this.digits == otherLicensePlate.digits && this.letters.equals(otherLicensePlate.letters) && this.regionalCode.equals(otherLicensePlate.regionalCode)) {
            return true;
        }else{
            return false;
        }
    }
    public String getDifLpFormat(){
        return this.regionalCode + "\n" + this.letters.substring(0,2) +"-"+String.valueOf(this.digits)+ "-" + this.letters.substring(2);

    }

    @Override
    public String toString() {
        return "<" + this.regionalCode + ">: " + this.letters + ", " +  String.valueOf(this.digits);
    }

    public String getLetters() {
        return letters;
    }

    public String getRegionalCode() {
        return regionalCode;
    }

    public int getDigits() {
        return digits;
    }
}
