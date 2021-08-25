import java.util.ArrayList;
import java.util.Date;

public class ReserveList {
	//객체변수
	private String title;
	private String rsvDate;
	private String theaterName;
	private int showRoomNum;
	private String startTime;
	ArrayList<Integer> seatNum; 
	
	//생성자
	ReserveList(){}

	
	public ReserveList(String title, String rsvDate, String theaterName, int showRoomNum, String startTime,
			ArrayList<Integer> seatNum) {
		super();
		this.title = title;
		this.rsvDate = rsvDate;
		this.theaterName = theaterName;
		this.showRoomNum = showRoomNum;
		this.startTime = startTime;
		this.seatNum = seatNum;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRsvDate() {
		return rsvDate;
	}

	public void setRsvDate(String rsvDate) {
		this.rsvDate = rsvDate;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public int getShowRoomNum() {
		return showRoomNum;
	}

	public void setShowRoomNum(int showRoomNum) {
		this.showRoomNum = showRoomNum;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public ArrayList<Integer> getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(ArrayList<Integer> seatNum) {
		this.seatNum = seatNum;
	}
	
	
}
