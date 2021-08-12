package com.infosys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

    private long id;
    private String itemName;
    private String itemDetail;
    private String itemPrice;
 
    public Item() {
  
    }
 
    public Item(long id, String itemName, String itemDetail, String itemPrice) {
		this.itemName = itemName;
		this.itemDetail = itemDetail;
		this.itemPrice = itemPrice;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    
    
	@Column(name = "item_name", nullable = false) 
    public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    @Column(name = "item_detail", nullable = false)
	public String getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

    @Column(name = "item_price", nullable = false)
	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	

    @Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemDetail=" + itemDetail + ", itemPrice=" + itemPrice
				+ "]";
	}
 
}
