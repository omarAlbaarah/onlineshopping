package edu.miu.waa.onlineShopping.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Buyer extends User {

	private int points;

	@Valid
	@OneToOne(cascade =	CascadeType.ALL)
	@JoinColumn(name = "cardPayment_id")
	private CardPayment cardPayment;

	@Valid
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(cascade = CascadeType.ALL)
	@Fetch(FetchMode.JOIN)
	private Set<Seller> followingSellers;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "billing_address_id")
	private BillingAddress billingAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shipping_address_id")
	private ShippingAddress shippingAddress;
	
	public Buyer() {
	}

<<<<<<< HEAD


	public BillingAddress getBillingAddress() {
		return billingAddress;
	}



	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}



	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}



	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}



	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

=======
>>>>>>> omar_branch
	public CardPayment getCardPayment() {
		return cardPayment;
	}

	public void setCardPayment(CardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Set<Seller> getFollowingSellers() {
		return followingSellers;
	}

	public void setFollowingSellers(Set<Seller> followingSellers) {
		this.followingSellers = followingSellers;
	}
}
