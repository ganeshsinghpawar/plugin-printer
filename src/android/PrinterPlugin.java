package com.stanleyidesis.cordova.plugin;
// The native Toast API
import android.widget.Toast;
// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class PrinterPlugin extends CordovaPlugin {
  @Override
  public boolean execute() {
      // Verify that the user sent a 'show' actio
    
     private static String internalClassName = "MainActivity";
    private String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        text=intent.getStringExtra(Intent.EXTRA_TEXT);
        System.out.println("******* GSP print first text ****** : " + text);

        final String dataToPrint = "$big$This is a printer test$intro$posprinterdriver.com$intro$a á à ä e é è ë i í ì ï o ó ò ö u ú ù ü $intro$$cut$$intro$";

        final String BtDevice = "10:00:E8:6B:E2:5A";

        final String printerIpAddress = "192.168.9.150";
        final String printerPort = "9100";

        final String usbDeviceID = "1002";
        final String usbProductID = "20497";
        final String usbVendorId = "1046";

        EditText btDeviceAddres = null;
        sendDataToUsbPrinter(text, usbProductID, usbVendorId, usbDeviceID);

    }

    public void sendDataToUsbPrinter(String textoToSend, String usbProductID, String usbVendorId, String usbDeviceID) {
        String dataToPrint = "$big$This is a printer test$intro$posprinterdriver.com$intro$$intro$$cut$$intro$";
        Intent intentPrint = new Intent();
        intentPrint.setAction(Intent.ACTION_SEND);
        intentPrint.putExtra(Intent.EXTRA_TEXT, textoToSend);
        intentPrint.putExtra("printer_type_id", "3");// For USB
        intentPrint.putExtra("printer_usb_product_id", usbProductID);
        intentPrint.putExtra("printer_usb_vendor_id", usbVendorId);
        intentPrint.putExtra("printer_usb_device_id", usbDeviceID);

        intentPrint.setType("text/plain");
        Log.i(internalClassName, "buttonPrintToDefaultPrinter Start Intent");
        this.startActivity(intentPrint);
        System.out.println("*********** USBDATAintentPrint : " + intentPrint);

    }


    System.out.println("PRINT")
      return true;
  }
}
