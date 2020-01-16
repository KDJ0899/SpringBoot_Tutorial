package com.example.demo.dto;

public class T_listDTO {
	
	public int SEQ;
	public String ITEMID;
	
	public T_listDTO() {
		
	}
	public T_listDTO(int sEQ, String iTEMID) {
		super();
		SEQ = sEQ;
		ITEMID = iTEMID;
	}
	
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public String getITEMID() {
		return ITEMID;
	}
	public void setITEMID(String iTEMID) {
		ITEMID = iTEMID;
	}
	
	
}
