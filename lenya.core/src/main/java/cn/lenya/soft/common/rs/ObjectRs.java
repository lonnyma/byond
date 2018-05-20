package cn.lenya.soft.common.rs;

public class ObjectRs<T> extends BaseRs {
	private T object = null;
	
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}

}
