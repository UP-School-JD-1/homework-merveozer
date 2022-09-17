package org.merveozer.oopjhomework.Object_Oriented_and_Functional_Programming_with_Java.Pdf06_Siradisi_Durum_Yonetimi.Q1;

public class SalaryPaidOnBankException extends Exception {

	public SalaryPaidOnBankException() {}

    public SalaryPaidOnBankException(String message) {
		super(message);
    }
    
    @Override
    public String getMessage() {
        return "Don't worry! Your salary is higher than 7000 TL so it is paid by bank...";
    }
    
    @Override
    public String getLocalizedMessage() {
        return "Endiþelenme! Maaþýn 7000 TL'den yüksek olduðundan banka tarafýndan ödeniyor...";
    }
	
}
