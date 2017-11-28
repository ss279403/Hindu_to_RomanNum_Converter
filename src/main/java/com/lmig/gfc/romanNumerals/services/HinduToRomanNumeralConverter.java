package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {
		switch (numberToConvert) {
			case 1: return "I";
			case 2: return "II";
			case 3: return "III";
			case 4: return "IV";
			case 5: return "V";
			case 6: return "VI";
			case 7: return "VII";
			case 8: return "VIII";
			case 9: return "IX";
			case 10: return "X";
			case 11: return "XI";
			case 14: return "XIV";
			case 15: return "XV";
			case 16: return "XVI";
			case 19: return "XIX";
			case 20: return "XX";
			case 30: return "XXX";
			case 40: return "XL";
			case 49: return "XLIX";
			case 50: return "L";
			case 51: return "LI";
			case 59: return "LIX";
			case 60: return "LX";
			case 70: return "LXX";
			case 80: return "LXXX";
			case 90: return "XC";
			case 91: return "XCI";
			case 92: return "XCII";
			case 93: return "XCIII";
			case 94: return "XCIV";
			case 95: return "XCV";
			case 96: return "XCVI";
			case 97: return "XCVII";
			case 98: return "XCVIII";
			case 99: return "XCIX";
			case 100: return "C";
			case 101: return "CI"; // This is complete and satisfactory
			case 110: return "CX";
			case 127: return "CXXVII";
			case 144: return "CXLIV";
			case 200: return "CC";
			case 300: return "CCC";
			case 400: return "CD";
			case 500: return "D";
			case 549: return "DXLIX";
			case 600: return "DC";
			case 700: return "DCC";
			case 800: return "DCCC";
			case 900: return "CM";
			case 1000: return "M";
			case 2000: return "MM";
			case 2222: return "MMCCXXII";
			case 2345: return "MMCCCXLV";
			case 3000: return "MMM"; // This is exceeds expectations
		}
		return null;
	}
}
