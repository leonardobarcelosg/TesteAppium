package page;

import org.openqa.selenium.By;

import Appium.core.BasePage;

public class AlertaPage extends BasePage {

	public void clicarAlertaConfirm() {
		clickByText("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {
		clickByText("ALERTA SIMPLES");
	}
	
	public void confirmar() {
		clickByText("CONFIRMAR");
	}
	
	public void sair() {
		clickByText("SAIR");
	}
	
	public void clicarForaCaixa() {
		tap(100, 150);
	}
}

