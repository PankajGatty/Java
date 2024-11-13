
public class SmartHelmetRunner {
	public static void main(String[] args) {
	SmartHelmet helmet=new SmartHelmet("TechGear","TG-X200","Matte Black",1.5,"Polycarbonate",true,true,true,12,90,9000,24,"Medium",
			5,true,true,true,true,true,"DOT, ECE");
	
	 //helmet.setBrandName("AGV");
	 System.out.println("BRAND NAME: " +helmet.getBrandName());
	 System.out.println("MODEL: " +helmet.getmodel());
	 System.out.println("COLOR: " +helmet.getcolor());
	 
	 //helmet.setweight(3.0);
	 System.out.println("WEIGHT: " +helmet.getweight());
	 
	 System.out.println("MATERIAL: " +helmet.getmaterial());
	 System.out.println("IS BLUETOOTH ENABLED: " +helmet.getisBluetoothEnabled());
	 System.out.println("IS GPS ENAMBLED: " +helmet.getisGpsEnabled());
	 System.out.println("HAS VOICE ASSISTANT: " +helmet.gethasVoiceAssistant());
	 System.out.println("BATTERY LIFE: " +helmet.getbatteryLife());
	 System.out.println("CHARGING TIME: " +helmet.getchargingTime());
	 
	 //helmet.setprice(8000);
	 System.out.println("PRICE: " +helmet.getprice());
	 
	 System.out.println("WARRANTY PERIOD: " +helmet.getwarrantyPeriod());
	 System.out.println("SIZE: " +helmet.getsize());
	 System.out.println("VISOR TINT LEVEL: " +helmet.getvisorTintLevel());
	 System.out.println("IS WATERPROOF: " +helmet.getisWaterproof());
	 System.out.println("IS IMPACT RESISTANT: " +helmet.getisImpactResistant());
	 System.out.println("HAS REAR CAMERA: " +helmet.gethasRearCamera());
	 System.out.println("HAS FRONT LIGHT: " +helmet.gethasFrontLight());
	 System.out.println("HAS TURN SIGNAL: " +helmet.gethasTurnSignals());
	 System.out.println("SAFETY CERTIFICATION: " +helmet.getsafetyCertifications());
	 
	  
	}
}
