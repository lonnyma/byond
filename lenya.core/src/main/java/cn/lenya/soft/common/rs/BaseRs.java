package cn.lenya.soft.common.rs;

/**
 * 作用：用于数据库结果集接收
 * @author lenya
 * @version v1.0
 * Date : 2014-12-12
 *
 */

public class BaseRs {
	
	
	private Integer resultCount=null;//定义结果记录条数
	private String resultMsg=null;//定义反回结果消息提示
	private Boolean result=null;//定义查询结果是否成功
	private Integer count=null;//辅助记录总数
	private String resultLevel=null;//定义结果等级
	private String reCode=null;
	private String resultSql=null; //获取结果的sql语句
	

	public Integer getResultCount() {
		return resultCount;
	}
	public void setResultCount(Integer resultCount) {
		this.resultCount = resultCount;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getResultLevel() {
		return resultLevel;
	}
	public void setResultLevel(String resultLevel) {
		this.resultLevel = resultLevel;
	}
	public String getResultSql() {
		return resultSql;
	}
	public void setResultSql(String resultSql) {
		this.resultSql = resultSql;
	}
	public String getReCode() {
		return reCode;
	}
	public void setReCode(String reCode) {
		this.reCode = reCode;
	}
	

	
}
