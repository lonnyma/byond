/* Copyright (c) 2018 白羊人工智能在线技术. All rights reserved.
 * http://www.byond.cn
 */
package cn.lenya.soft.common.bean;

import java.io.File;
import java.io.Serializable;
import java.sql.Date;

public class FileBean  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6233165411382016421L;
	//上传的文件
	private File file;
	//文件类型
	private String fileContentType;
	//文件名
	private String fileFileName;
	private String fileStuffix;//文件后缀
	private Date  fileUploadDate;	
	private String fileAliasName;
	private String saveURL;
	private String fileName;
	private String fileType;
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileStuffix() {
		return fileStuffix;
	}
	public void setFileStuffix(String fileStuffix) {
		this.fileStuffix = fileStuffix;
	}
	public Date getFileUploadDate() {
		return fileUploadDate;
	}
	public void setFileUploadDate(Date fileUploadDate) {
		this.fileUploadDate = fileUploadDate;
	}
	public String getFileAliasName() {
		return fileAliasName;
	}
	public void setFileAliasName(String fileAliasName) {
		this.fileAliasName = fileAliasName;
	}
	public String getSaveURL() {
		return saveURL;
	}
	public void setSaveURL(String saveURL) {
		this.saveURL = saveURL;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}