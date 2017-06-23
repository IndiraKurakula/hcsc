package bean;

public class AppDetails {

	private int sno;
	private String appid;
	private String appname;
	private String upstream;
	private String downstream;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public String getUpstream() {
		return upstream;
	}
	public void setUpstream(String upstream) {
		this.upstream = upstream;
	}
	public String getDownstream() {
		return downstream;
	}
	public void setDownstream(String downstream) {
		this.downstream = downstream;
	}
	public AppDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppDetails(int sno, String appid, String appname, String upstream, String downstream) {
		super();
		this.sno = sno;
		this.appid = appid;
		this.appname = appname;
		this.upstream = upstream;
		this.downstream = downstream;
	}
	
	
	
}
