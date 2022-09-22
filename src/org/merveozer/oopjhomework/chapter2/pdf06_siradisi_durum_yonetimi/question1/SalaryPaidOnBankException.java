package org.merveozer.oopjhomework.chapter2.pdf06_siradisi_durum_yonetimi.question1;

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
        return "Endi�elenme! Maa��n 7000 TL'den y�ksek oldu�undan banka taraf�ndan �deniyor...";
    }
	
}
