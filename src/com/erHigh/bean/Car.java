package com.erHigh.bean;

public class Car {
	private int carId;
	private String carName;
	private String carRemark;
	private String carBrand;
	private int carBrandNum;
	private String carType;
	private int carTypeNum;
	private int carPrice;
	private int carLendPrice;
	private int carIsRent;
	private int carIsGrouding;
	public Car() {

	}
	public Car(int carId, String carName, String carRemark, String carBrand, int carBrandNum, String carType,
			int carTypeNum, int carPrice, int carLendPrice, int carIsRent, int carIsGrouding) {
		this.carId = carId;
		this.carName = carName;
		this.carRemark = carRemark;
		this.carBrand = carBrand;
		this.carBrandNum = carBrandNum;
		this.carType = carType;
		this.carTypeNum = carTypeNum;
		this.carPrice = carPrice;
		this.carLendPrice = carLendPrice;
		this.carIsRent = carIsRent;
		this.carIsGrouding = carIsGrouding;
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carRemark=" + carRemark + ", carBrand=" + carBrand
				+ ", carBrandNum=" + carBrandNum + ", carType=" + carType + ", carTypeNum=" + carTypeNum + ", carPrice="
				+ carPrice + ", carLendPrice=" + carLendPrice + ", carIsRent=1?'½è'£º'bukejie'" + carIsRent + ", carIsGrouding="
				+ carIsGrouding+ "]";
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarRemark() {
		return carRemark;
	}
	public void setCarRemark(String carRemark) {
		this.carRemark = carRemark;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public int getCarBrandNum() {
		return carBrandNum;
	}
	public void setCarBrandNum(int carBrandNum) {
		this.carBrandNum = carBrandNum;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarTypeNum() {
		return carTypeNum;
	}
	public void setCarTypeNum(int carTypeNum) {
		this.carTypeNum = carTypeNum;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getCarLendPrice() {
		return carLendPrice;
	}
	public void setCarLendPrice(int carLendPrice) {
		this.carLendPrice = carLendPrice;
	}
	public int getCarIsRent() {
		return carIsRent;
	}
	public void setCarIsRent(int carIsRent) {
		this.carIsRent = carIsRent;
	}
	public int getCarIsGrouding() {
		return carIsGrouding;
	}
	public void setCarIsGrouding(int carIsGrouding) {
		this.carIsGrouding = carIsGrouding;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
