package com.mvc.easyui;

import java.util.List;

/**
 * easyui datagrid 分页
 * @author smallinsect
 *
 * @param <T>
 */
public class DataGrid<T> {
	private int total;
	private List<T> rows;
	public DataGrid(int total, List<T> rows) {
		this.total = total;
		this.rows = rows;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
