package com.company.singleton.challenge;

public class CaptainApp {

	public static void main(String[] args) {

		System.out.println("Trying to make a captain for our team");
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println("Trying to make another captain for our team");
		MakeACaptain c2 = MakeACaptain.getCaptain();
		if(c1 == c2) {
			System.out.println("c1 and c2 are the same");
		} else {
			System.out.println("c1 and c2 are different");
		}

	}

}
