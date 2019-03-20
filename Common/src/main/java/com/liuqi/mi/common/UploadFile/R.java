package com.liuqi.mi.common.UploadFile;

public class R {
	/**响应编码*/
	private int code;
	/**响应消息*/
	private String msg;
	/**数据总量*/
	private int count;
	/**数据*/
	private Object data;

	public String toJson(){
		return JsonUtils.toJson(this);
	}
	
	public R() {
	}
	
	public static R ok(){
		return ok(0,null);
	}
	public static R ok(int count, Object data){
		return new R(0, "操作成功!", count, data);
	}
	
	public static R ok(String msg){
		return new R(0,msg, 0,null);
	}
	
	public static R error(int count, Object data){
		return new R(1, "操作失败!", count, data);
	}
	public static R error(){
		return error(0,null);
	}
	public static R error(String msg){
		return new R(1, msg,0,null);
	}

	public R(int code, String msg, int count, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}

	@Override
	public String toString() {
		return "R [code=" + code + ", msg=" + msg + ", count=" + count + ", data=" + data + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
