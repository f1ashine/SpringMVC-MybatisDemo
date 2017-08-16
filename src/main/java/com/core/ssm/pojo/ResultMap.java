package com.core.ssm.pojo;

import java.io.Serializable;

public class ResultMap implements Serializable{

	private static final long serialVersionUID = -1066355812650162792L;
	/**
	 * �ɹ���־����
	 */
	public static final String SUCCESS = "success";
	/**
	 * ʧ�ܱ�־����
	 */
	public static final String FAILED = "failed";
	/**
	 * ���ص�¼ҳ�˳�������Ψһ��¼����
	 */
	public static final String EXIT = "exit";
	/**
	 * ״̬��
	 */
	private String resultCode;
	private String resultMsg;
	private Object resultTO;
	private Long totalPage;
	private Long totalNum;
	private Long orderCount;
	private String allAmount;
	
	public ResultMap() {
		super();
	}

	public ResultMap(String resultCode, String resultMsg) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
	}

	public ResultMap(String resultCode, String resultMsg, Object resultTO) {
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.resultTO = resultTO;
	}

	public ResultMap(String resultCode ,String resultMsg,Object resultTO,long totalPage){
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.resultTO = resultTO;
		this.totalPage = totalPage;
	}
	
	public ResultMap(String resultCode ,String resultMsg,Object resultTO,long totalPage,long totalNum){
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.resultTO = resultTO;
		this.totalPage = totalPage;
		this.totalNum = totalNum;
	}
	public ResultMap(String resultCode ,String resultMsg,Object resultTO,long orderCount,String allAmount,long totalPage)
	{
		super();
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.resultTO = resultTO;
		this.orderCount=orderCount;
		this.allAmount=allAmount;
		this.totalPage=totalPage;
	}
	
	public Object getResultTO() {
		return resultTO;
	}
	
	public void setResultTO(Object resultTO) {
		this.resultTO = resultTO;
	}

	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(long orderCount) {
		this.orderCount = orderCount;
	}

	public String getAllAmount() {
		return allAmount;
	}

	public void setAllAmount(String allAmount) {
		this.allAmount = allAmount;
	}
	
}
