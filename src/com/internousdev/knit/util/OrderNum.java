package com.internousdev.knit.util;

import java.util.Random;

public class OrderNum {


	public String previewOrderNum(){
		Random rand=new Random();
		int[] orderIntArray= new int[8];
		String[] orderStringArray = new String[8];
		String orderNumPreview="";
		for(int i=0 ; orderStringArray.length>i;i++){
			orderIntArray[i]=rand.nextInt(10);
			orderStringArray[i]=String.valueOf(orderIntArray[i]);
			orderNumPreview=orderNumPreview+orderStringArray[i];
		}
		return orderNumPreview;
	}

}
