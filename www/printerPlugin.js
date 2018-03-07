// Empty constructor
function PrinterPlugin() {}

// The function that passes work along to native shells
// Message is a string, duration may be 'long' or 'short'
PrinterPlugin.prototype.show = function (message, duration, successCallback, errorCallback) {
    var options = {};
    options.message = message;
    options.duration = duration;
    cordova.exec(successCallback, errorCallback, 'PrinterPlugin', 'show', [options]);
}


cordova.addConstructor(PrinterPlugin.install);