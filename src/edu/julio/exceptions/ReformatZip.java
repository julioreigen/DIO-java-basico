package edu.julio.exceptions;

public class ReformatZip {
    public static void main(String[] args) throws ZipCodeInvalidException {
        try {
            String myZipCode = reformatZip("4896700");
            System.out.println(myZipCode);
        } catch (ZipCodeInvalidException e) {
            System.out.println("Invalid zip code (must be 8 digits)");
        }
    }
    static String reformatZip(String zip) throws ZipCodeInvalidException{
        if (zip.length() != 8) {
            throw new ZipCodeInvalidException();
        }
        // Return formatted zip
        String firstDigits = zip.substring(0, 5);
        String lastDigits = zip.substring(5, 8);
        return firstDigits + "-" + lastDigits;
    }
}
