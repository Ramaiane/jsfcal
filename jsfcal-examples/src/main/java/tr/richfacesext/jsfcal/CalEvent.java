package tr.richfacesext.jsfcal;

import java.util.Date;

import tr.richfacesext.components.jsfcal.Event;

/**
 * 
 * @author mert
 * 
 */
@SuppressWarnings("serial")
public class CalEvent implements Event {

	private Long id;
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	private boolean isReadOnly;

	public CalEvent(int id, String title, String description, Date start,
			Date end, boolean readOnly) {
		this.id = new Long(id);
		this.title = title;
		this.description = description;
		this.startDate = start;
		this.endDate = end;
		this.isReadOnly = readOnly;
	}

	public Long getEventId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isReadOnly() {
		return isReadOnly;
	}

	public void setReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	@Override
	public String toString() {
		return id + " - " + title + " - " + " description: " + description
				+ " - " + " start:" + startDate + " end:" + endDate
				+ " readonly:" + isReadOnly;
	}
}