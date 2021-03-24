package day09.javase.base;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
	String str = "215,335,340,343,374,379,383,396,568,570" +
			",594,601," +
			"602,768,807,845,846,908,909,931,951,953,955,956," +
			"961,962,975,1075,1126,1167,1184,1272,1277,1297,1302,1318,1325,1363,1369,1380,1427" +
			",1912,1914,1958,1974,1997,2016,2070,2075,2081,\n";
		String[] split = str.split(",");
		for(String s : split) {
			System.out.println(s);
		}
	}
}
