
public class SmartHelmet {
	private String BrandName;
    private String model;
    private String color;
    private double weight;
    private String material;
    private boolean isBluetoothEnabled;
    private boolean isGpsEnabled;
    private boolean hasVoiceAssistant;
    private int batteryLife; 
    private int chargingTime;
    private double price;
    private int warrantyPeriod; 
    private String size;
    private int visorTintLevel; 
    private boolean isWaterproof;
    private boolean isImpactResistant;
    private boolean hasRearCamera;
    private boolean hasFrontLight;
    private boolean hasTurnSignals;
    private String safetyCertifications;
    
    public SmartHelmet(String BrandName,String model,String color,double weight,String material,boolean isBluetoothEnabled,boolean isGpsEnabled,
    		boolean hasVoiceAssistant,int batteryLife,int chargingTime,double price,int warrantyPeriod,String size,int visorTintLevel,boolean isWaterproof,
    		boolean isImpactResistant,boolean hasRearCamera,boolean hasFrontLight,boolean hasTurnSignals,String safetyCertifications)
    {
    	this.BrandName=BrandName;
    	this.model=model;
    	this.color=color;
    	this.weight=weight;
    	this.material=material;
    	this.isBluetoothEnabled=isBluetoothEnabled;
    	this.isGpsEnabled=isGpsEnabled;
    	this.hasVoiceAssistant=hasVoiceAssistant;
    	this.batteryLife=batteryLife;
    	this.chargingTime=chargingTime;
    	this.price=price;
    	this.warrantyPeriod=warrantyPeriod;
    	this.size=size;
    	this.visorTintLevel=visorTintLevel;
    	this.isWaterproof=isWaterproof;
    	this.isImpactResistant=isImpactResistant;
    	this.hasRearCamera=hasRearCamera;
    	this.hasFrontLight=hasFrontLight;
    	this.hasTurnSignals=hasTurnSignals;
    	this.safetyCertifications=safetyCertifications;
    }
    //BRAND NAME
    public String getBrandName() {
    	return BrandName;
    }
    
    public void setBrandName(String BrandName) {
    	this.BrandName=BrandName;
    }
    
    //MODEL
    public String getmodel() {
    	return model;
    }
    public void setmodel(String model) {
    	this.model=model;
    }
    //COLOR
   public String getcolor() { 
	   return color;
   }
   public void setcolor(String color) {
	   this.color=color;
   }
    //WEIGHT
   public double getweight() {
	   if(weight<3) {
	   return weight;
	   }else {
		   return 1.5;
	   }
   }
   public void setweight(double weight) {
	   this.weight=weight;
   }
   //MATERIAL
   public String getmaterial() {
	   return material;
   }
   public void setmaterial(String material) {
	   this.material=material;
   }
   //ISBLUETOOTH ENABLED
   public boolean getisBluetoothEnabled() {
	   return isBluetoothEnabled;
   }
   public void setisBluetoothEnabled(boolean isBluetoothEnabled) {
	   this.isBluetoothEnabled=isBluetoothEnabled;
   }
   
   //ISGPSENAMBLED
   public boolean getisGpsEnabled() {
	   return isGpsEnabled;
   }
   public void setisGpsEnabled(boolean isGpsEnabled) {
	   this.isGpsEnabled=isGpsEnabled;
   }
   
   //hasVoiceAssistant
   public boolean gethasVoiceAssistant() {
	   return hasVoiceAssistant;
   }
   public void sethasVoiceAssistant(boolean hasVoiceAssistant) {
	   this.hasVoiceAssistant=hasVoiceAssistant;
   }
   
   //batteryLife 
   public int getbatteryLife() {
	   return batteryLife;
   }
   public void setbatteryLife(int batteryLife) {
	   this.batteryLife=batteryLife;
   }
   //chargingTime
   public int getchargingTime() {
	   return chargingTime;
   }
   public void setchargingTime(int chargingTime) {
	   this.chargingTime=chargingTime;
   }
   
   //price
   public double getprice() {
	   if(price>9000) {
	   return price;
	   }else {
		   return 9000;
	   }
   }
   public void setprice(double price) {
	   this.price=price;
   }
   
   //warrantyPeriod
   public int getwarrantyPeriod() {
	   return warrantyPeriod;
   }
   public void setwarrantyPeriod(int warrantyPeriod) {
	   this.warrantyPeriod=warrantyPeriod;
   }
   
   //size
   public String getsize() {
	   return size;
   }
   public void setsize(String size) {
	   this.size=size;
   }
   
   //visorTintLevel
   public int getvisorTintLevel() {
	   return visorTintLevel;
   }
   public void setvisorTintLevel(int visorTintLevel) {
	   this.visorTintLevel=visorTintLevel;
   }
   
   //isWaterproof
   public boolean getisWaterproof() {
	   return isWaterproof;
   }
   public void setisWaterproof(boolean isWaterproof) {
	   this.isWaterproof=isWaterproof;
   }
   
   //isImpactResistant
   public boolean getisImpactResistant() {
	   return isImpactResistant;
   }
   public void setisImpactResistant(boolean isImpactResistant) {
	   this.isImpactResistant=isImpactResistant;
   }
   
   //hasRearCamera
   public boolean gethasRearCamera() {
	   return hasRearCamera;
   }
   public void sethasRearCamera(boolean hasRearCamera) {
	   this.hasRearCamera=hasRearCamera;
   }
   
   //hasFrontLight
   public boolean gethasFrontLight() {
	   return hasFrontLight;
   }
   public void sethasFrontLight(boolean hasFrontLight) {
	   this.hasFrontLight=hasFrontLight;
   }
   //hasTurnSignals
   public boolean gethasTurnSignals() {
	   return hasTurnSignals;
   }
   public void sethasTurnSignals(boolean hasTurnSignals) {
	   this.hasTurnSignals=hasTurnSignals;
   }
   //safetyCertifications
   public String getsafetyCertifications() {
	   return safetyCertifications;
   }
   public void setsafetyCertifications(String  safetyCertifications) {
	   this.safetyCertifications=safetyCertifications;
   }
}	
