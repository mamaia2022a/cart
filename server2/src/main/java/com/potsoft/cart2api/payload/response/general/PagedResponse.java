package com.potsoft.cart2api.payload.response.general;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class PagedResponse<T> {
	private List<T> content;
	private int page;
	private int size;
	private long totalElements;
	private int totalPages;
	private boolean last;

	public PagedResponse() {

	}

	public PagedResponse(List<T> content, int page, int size, long totalElements, int totalPages, boolean last) {
		setContent(content);
		this.page = page;
		this.size = size;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}

	public List<T> getContent() {
		return content == null ? null : new ArrayList<>(content);
	}

	public final void setContent(List<T> content) {
		if (content == null) {
			this.content = null;
		} else {
			this.content = Collections.unmodifiableList(content);
		}
	}



	public boolean isLast() {
		return last;
	}


  public int getPage() 
  {
		return this.page;
	}

	public void setPage(int page)
  {
    this.page = page;
	}


  public int getSize() 
  {
		return this.size;
	}

	public void setSize(int size)
  {
    this.size = size;
	}


  public long getTotalElements() 
  {
		return this.totalElements;
	}

	public void setTotalElements(long totalElements)
  {
    this.totalElements = totalElements;
	}


  public int getTotalPages() 
  {
		return this.totalPages;
	}

	public void setTotalPages(int totalPages)
  {
    this.totalPages = totalPages;
	}


}
