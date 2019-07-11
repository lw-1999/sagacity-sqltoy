/**
 *@Generated by sagacity-quickvo 4.0
 */
package sqltoy.showcase.system.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.util.Date;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sys_staff_info_1,Remark:员工信息表   
 */
@Entity(tableName="sys_staff_info_1",pk_constraint="PRIMARY")
public abstract class AbstractStaffInfo1VO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //staffId,staffCode,organId,staffName,sexType,mobileTel,birthday,dutyDate,outDutyDate,post,nativePlace,email,operator,operateDate,status
	 
	 //not null properties
	 //staffId,staffCode,organId,staffName,operator,operateDate,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 2234752883301369737L;
	
	/**
	 * 员工ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugin.id.DefaultIdGenerator")
	@Column(name="STAFF_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffId;
	
	/**
	 * 员工工号
	 */
	@Column(name="STAFF_CODE",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffCode;
	
	/**
	 * 机构编号
	 */
	@Column(name="ORGAN_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organId;
	
	/**
	 * 员工姓名
	 */
	@Column(name="STAFF_NAME",length=60L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffName;
	
	/**
	 * DD性别
	 */
	@Column(name="SEX_TYPE",length=1L,type=java.sql.Types.CHAR,nullable=true)
	protected String sexType;
	
	/**
	 * 联系电话
	 */
	@Column(name="MOBILE_TEL",length=15L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String mobileTel;
	
	/**
	 * 出生日期
	 */
	@Column(name="BIRTHDAY",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected Date birthday;
	
	/**
	 * 入职日期
	 */
	@Column(name="DUTY_DATE",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected Date dutyDate;
	
	/**
	 * 离职日期
	 */
	@Column(name="OUT_DUTY_DATE",length=10L,type=java.sql.Types.DATE,nullable=true)
	protected Date outDutyDate;
	
	/**
	 * DD岗位
	 */
	@Column(name="POST",length=6L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String post;
	
	/**
	 * 籍贯
	 */
	@Column(name="NATIVE_PLACE",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String nativePlace;
	
	/**
	 * 邮箱地址
	 */
	@Column(name="EMAIL",length=100L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String email;
	
	/**
	 * 操作人
	 */
	@Column(name="OPERATOR",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String operator;
	
	/**
	 * 操作日期
	 */
	@Column(name="OPERATE_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected Date operateDate;
	
	/**
	 * 启用标志
	 */
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.CHAR,nullable=false)
	protected String status;
	


	/** default constructor */
	public AbstractStaffInfo1VO() {
	}
	
	/** pk constructor */
	public AbstractStaffInfo1VO(String staffId)
	{
		this.staffId=staffId;
	}

	/** minimal constructor */
	public AbstractStaffInfo1VO(String staffId,String staffCode,String organId,String staffName,String operator,Date operateDate,String status)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.organId=organId;
		this.staffName=staffName;
		this.operator=operator;
		this.operateDate=operateDate;
		this.status=status;
	}

	/** full constructor */
	public AbstractStaffInfo1VO(String staffId,String staffCode,String organId,String staffName,String sexType,String mobileTel,Date birthday,Date dutyDate,Date outDutyDate,String post,String nativePlace,String email,String operator,Date operateDate,String status)
	{
		this.staffId=staffId;
		this.staffCode=staffCode;
		this.organId=organId;
		this.staffName=staffName;
		this.sexType=sexType;
		this.mobileTel=mobileTel;
		this.birthday=birthday;
		this.dutyDate=dutyDate;
		this.outDutyDate=outDutyDate;
		this.post=post;
		this.nativePlace=nativePlace;
		this.email=email;
		this.operator=operator;
		this.operateDate=operateDate;
		this.status=status;
	}
	
	/**
	 *@param staffId the staffId to set
	 */
	public void setStaffId(String staffId) {
		this.staffId=staffId;
	}
		
	/**
	 *@return the StaffId
	 */
	public String getStaffId() {
	    return this.staffId;
	}
	
	/**
	 *@param staffCode the staffCode to set
	 */
	public void setStaffCode(String staffCode) {
		this.staffCode=staffCode;
	}
		
	/**
	 *@return the StaffCode
	 */
	public String getStaffCode() {
	    return this.staffCode;
	}
	
	/**
	 *@param organId the organId to set
	 */
	public void setOrganId(String organId) {
		this.organId=organId;
	}
		
	/**
	 *@return the OrganId
	 */
	public String getOrganId() {
	    return this.organId;
	}
	
	/**
	 *@param staffName the staffName to set
	 */
	public void setStaffName(String staffName) {
		this.staffName=staffName;
	}
		
	/**
	 *@return the StaffName
	 */
	public String getStaffName() {
	    return this.staffName;
	}
	
	/**
	 *@param sexType the sexType to set
	 */
	public void setSexType(String sexType) {
		this.sexType=sexType;
	}
		
	/**
	 *@return the SexType
	 */
	public String getSexType() {
	    return this.sexType;
	}
	
	/**
	 *@param mobileTel the mobileTel to set
	 */
	public void setMobileTel(String mobileTel) {
		this.mobileTel=mobileTel;
	}
		
	/**
	 *@return the MobileTel
	 */
	public String getMobileTel() {
	    return this.mobileTel;
	}
	
	/**
	 *@param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday=birthday;
	}
		
	/**
	 *@return the Birthday
	 */
	public Date getBirthday() {
	    return this.birthday;
	}
	
	/**
	 *@param dutyDate the dutyDate to set
	 */
	public void setDutyDate(Date dutyDate) {
		this.dutyDate=dutyDate;
	}
		
	/**
	 *@return the DutyDate
	 */
	public Date getDutyDate() {
	    return this.dutyDate;
	}
	
	/**
	 *@param outDutyDate the outDutyDate to set
	 */
	public void setOutDutyDate(Date outDutyDate) {
		this.outDutyDate=outDutyDate;
	}
		
	/**
	 *@return the OutDutyDate
	 */
	public Date getOutDutyDate() {
	    return this.outDutyDate;
	}
	
	/**
	 *@param post the post to set
	 */
	public void setPost(String post) {
		this.post=post;
	}
		
	/**
	 *@return the Post
	 */
	public String getPost() {
	    return this.post;
	}
	
	/**
	 *@param nativePlace the nativePlace to set
	 */
	public void setNativePlace(String nativePlace) {
		this.nativePlace=nativePlace;
	}
		
	/**
	 *@return the NativePlace
	 */
	public String getNativePlace() {
	    return this.nativePlace;
	}
	
	/**
	 *@param email the email to set
	 */
	public void setEmail(String email) {
		this.email=email;
	}
		
	/**
	 *@return the Email
	 */
	public String getEmail() {
	    return this.email;
	}
	
	/**
	 *@param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator=operator;
	}
		
	/**
	 *@return the Operator
	 */
	public String getOperator() {
	    return this.operator;
	}
	
	/**
	 *@param operateDate the operateDate to set
	 */
	public void setOperateDate(Date operateDate) {
		this.operateDate=operateDate;
	}
		
	/**
	 *@return the OperateDate
	 */
	public Date getOperateDate() {
	    return this.operateDate;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(String status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public String getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("staffId=").append(getStaffId()).append("\n");
		columnsBuffer.append("staffCode=").append(getStaffCode()).append("\n");
		columnsBuffer.append("organId=").append(getOrganId()).append("\n");
		columnsBuffer.append("staffName=").append(getStaffName()).append("\n");
		columnsBuffer.append("sexType=").append(getSexType()).append("\n");
		columnsBuffer.append("mobileTel=").append(getMobileTel()).append("\n");
		columnsBuffer.append("birthday=").append(getBirthday()).append("\n");
		columnsBuffer.append("dutyDate=").append(getDutyDate()).append("\n");
		columnsBuffer.append("outDutyDate=").append(getOutDutyDate()).append("\n");
		columnsBuffer.append("post=").append(getPost()).append("\n");
		columnsBuffer.append("nativePlace=").append(getNativePlace()).append("\n");
		columnsBuffer.append("email=").append(getEmail()).append("\n");
		columnsBuffer.append("operator=").append(getOperator()).append("\n");
		columnsBuffer.append("operateDate=").append(getOperateDate()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
