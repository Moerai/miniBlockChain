package core;

import util.Util;

public class BlockChainStarter {

	public static void main(String[] args) {
		
		//proof-of-work 작업증명
		int nonce = 0;
		while(true) {
			if(Util.getHash(nonce + "").substring(0, 6).equals("000000")) {
				System.out.println("정답 : " + nonce);
				System.out.println("헤시 값 : " + Util.getHash(nonce + ""));
				break;
			}
			nonce++;
		}
	}

}
