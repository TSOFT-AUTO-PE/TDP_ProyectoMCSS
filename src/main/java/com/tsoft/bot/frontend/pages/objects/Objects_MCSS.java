package com.tsoft.bot.frontend.pages.objects;

import org.openqa.selenium.By;
import org.sikuli.script.Pattern;

public class Objects_MCSS {
    public static By BTN_CONFIGAVANZADA = By.id("details-button");
    public static By LNK_CONTINUAR = By.id("proceed-link");
    public static By RBTN_DEALER_USER = By.id("rbDealer");
    public static By LNK_DEALER_LOGIN = By.xpath("//*[@id=\"dearLoginLink\"]/td[2]/a");
    public static By TXT_USUARIO = By.id("dlUserName");
    public static By TXT_PASSWORD = By.id("dlPass");
    public static By TXT_SCORE = By.xpath("//*[@id=\"j_idt70_content\"]/div/div[1]");
    // public static By TXT_IMEI = By.id("ownDeviceImei");
    public static final Pattern TXT_IMEI = new Pattern("C:\\Users\\Dalma.Saldarriaga\\Desktop\\SCRIPT INTELIJ\\PROYECTO_MCSS\\web-automation-framework_Telefonica\\src\\main\\resources\\img_Sikuli\\IMEI.PNG");
    public static By TXT_ERROR_WIC = By.xpath("//*[@id=\"messages\"]/div/ul/li/span[2]");
    public static By BTN_INGRESAR = By.id("loginDealerButton");
    public static By BTN_COMBO_POSTPAGO = By.id("comboPost");
    public static By BTN_COMBO_PREPAGO = By.id("comboPre");
    public static By BTN_SIGUIENTE = By.id("//*[@id=\"customerIdentificationForm\"]/div[6]/input");
    public static final Pattern BTN_SGT = new Pattern("C:\\Users\\Dalma.Saldarriaga\\Desktop\\SCRIPT INTELIJ\\PROYECTO_MCSS\\web-automation-framework\\src\\main\\resources\\img_Sikuli\\SIGUIENTE.PNG");

    public static By BTN_CONFIGURACION = By.id("details-button");
    public static By BTN_PORTABILIDAD = By.id("j_idt29");
    public static By BTN_POSTPAGO = By.id("j_idt30");
    public static By BTN_PREPAGO = By.id("j_idt31");
    public static By BTN_CALCULAR = By.xpath("//*[@id=\"j_idt63\"]/span[2]");
    public static By BTN_VALIDACION_DATOS = By.id("j_idt88");
    public static By BTN_VALIDAR = By.xpath("//*[@id=\"j_idt142\"]/span[2]");
    public static By BTN_CONTINUAR = By.id("j_idt147");
    public static By BTN_CONTINUAR2 = By.xpath("//*[@id=\"ownDeviceForm\"]/div[2]/input");
    public static By BTN_COMPRAR = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/span/input");
    public static By BTN_BUSCAR = By.id("orderIdIcon");
    public static By TXT_DOCUMENTO = By.id("documentNo");
    public static By TXT_CORREO = By.id("inputCorreoElectronico");
    public static By TXT_PLAN = By.id("orderId");
    public static By TXT_RESI = By.xpath("//*[@id=\"customerIdentificationForm\"]/div[1]/label[1]/label");
    public static By TXT_CANTIDAD_PLANES = By.xpath("//*[@id=\"Maintable-tabs\"]/div[2]/div/div/div/div/div[3]/div/p/span[2]");
    public static By LST_TIPO_DOCUMENTO = By.xpath("//*[@id=\"customerIdentificationForm\"]/div[2]/div[2]/div/select");
    //public static By BTN_COMPRAR_PLAN = By.xpath("//*[@id=\"4442073\"]/td[8]/div/input");
    public static final Pattern BTN_COMPRAR_PLAN = new Pattern("C:\\Users\\Dalma.Saldarriaga\\Desktop\\SCRIPT INTELIJ\\PROYECTO_MCSS\\web-automation-framework\\src\\main\\resources\\img_Sikuli\\COMPRAR.PNG");
    public static By CARGA = By.id("mcss_loader");
    //public static By NUM_DOC = By.xpath("//*[@id=\"customerIdentificationForm\"]/div[3]/div[2]/input");
    public static final Pattern NUM_DOC = new Pattern("C:\\Users\\Dalma.Saldarriaga\\Desktop\\SCRIPT INTELIJ\\PROYECTO_MCSS\\web-automation-framework\\src\\main\\resources\\img_Sikuli\\CAJA_TEXTO.PNG");
    public static By LNK_PROCEDER = By.id("proceed-link");
    public static By CHECK_SI = By.id("idChecksConsentimientoDatos:0");
    public static By MENSAJE_ERROR = By.xpath("//*[@id=\"alertModal\"]/div");
    public static By BTN_CERRAR = By.xpath("//*[@id=\"okButton\"]/a");
    public static By BTN_SIGUIENTE3 = By.xpath("//*[@id=\"NumberAllocationForm\"]/div[3]/button");
    public static By RBTN_FACTURACION_EXISTENTE = By.xpath("//*[@id=\"billing-information\"]/form/div[1]/div/div[1]/label");
    public static By RBTN_FACTURACION_NO_EXISTENTE = By.xpath("//*[@id=\"billing-information\"]/form/div[3]/div/div/label/input");
    public static By TXT_NOMBRE_CALLE = By.id("street-name");
    public static By TXT_NUMERO_CALLE = By.id("street-number");
    public static By LST_DEPARTAMENTO = By.id("department");
    public static By LST_PROVINCIA = By.id("province");
    public static By LST_DISTRITO = By.id("district");
    public static By LST_TIPO_CALLE = By.id("street-type");
    public static By BTN_CONTINUAR3 = By.id("continueUpdateBar");
    public static By BTN_GENERAR_CONTRATO = By.xpath("//*[@id=\"orderSummaryWidget\"]/div/div[1]/div/div[5]/div[10]/a[11]");
    public static By BTN_VALIDAR_CONTRATO = By.xpath("//*[@id=\"orderSummaryWidget\"]/div/div[1]/div/div[5]/div[10]/a[10]");
    public static By RBTN_CUIDADANO_EXTRANJERO = By.xpath("//*[@id=\"idSelectOpciones\"]/div[3]/div/div/div[2]");
    public static By BTN_DESCARGAR_CONTRATO = By.id("btnDescargaContratos");
    public static By BTN_CONTINUAR_WIC2 = By.id("j_idt138");
    public static By TXT_DESCARGA_COMPLETA = By.xpath("//*[@id=\"idMsjAlertaDescarga\"]/div/div");
    public static By BTN_CONTINUAR_WIC2_2 = By.id("btnContinuar");
    public static By BTN_GENERAR_RECIBO_PAGO = By.xpath("//*[@id=\"orderSummaryWidget\"]/div/div[1]/div/div[5]/div[10]/a[8]");
    public static By BTN_CERRAR_TIQUETE = By.xpath("//*[@id=\"generating-ticket\"]/div/div/div[2]/div[2]/form/input[1]");
    public static By BTN_GUARDAR_COMPRA = By.xpath("//*[@id=\"orderSummaryWidget\"]/div/div[1]/div/div[5]/div[10]/a[5]");
    public static By TXT_SIMCARD = By.id("iccid");
    public static By TXT_NUM_CAJA = By.id("caseNumber");
    public static By TXT_NUM_TIQUETE = By.id("ticketNumber");
    public static By BTN_CONFIRMAR = By.xpath("//*[@id=\"orderSummaryWidget\"]/div/div[1]/div/div[5]/div[10]/a[4]");
    public static By TXT_ORDEN_GENERADA = By.xpath("//*[@id=\"orderConfirmationWidget\"]/div/div[1]/span[2]");
    public static By TXT_NUM_ORDEN = By.xpath("//*[@id=\"orderConfirmationWidget\"]/div/p[3]");
    public static By TXT_MENSAJE = By.xpath("//*[@id=\"alertModal\"]/div/h2");
    public static By TXT_MENSAJEWIC2 = By.id("j_idt32");

}
