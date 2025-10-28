# KioskLauncher

**Kiosk Launcher for Android Tablets**  
Automatic Device Owner + Kiosk Mode launcher for a specific app (`co.median.android.nmxzeyd`).  

---

## 📌 Description / Descrizione

**EN:**  
This Android project creates a kiosk launcher that:  
- Automatically starts your target app `co.median.android.nmxzeyd`.  
- Runs in **kiosk mode** (lock task) preventing users from exiting the app.  
- Allows access only to Wi-Fi settings and a secret exit button (for maintenance).  
- Can be set as **Device Owner** for full kiosk control.  
- Can be compiled online with **GitHub Actions**.  

**IT:**  
Questo progetto Android crea un launcher in modalità kiosk che:  
- Avvia automaticamente l’app target `co.median.android.nmxzeyd`.  
- Funziona in **modalità kiosk** (lock task), impedendo all’utente di uscire dall’app.  
- Consente solo l’accesso alle impostazioni Wi-Fi e a un pulsante segreto per uscire (manutenzione).  
- Può essere impostato come **Device Owner** per controllo completo.  
- Può essere compilato online con **GitHub Actions**.  

---

## ⚙️ Features / Funzionalità

- Auto-launch target app at boot / Avvio automatico dell’app target.  
- Kiosk mode lock / Blocco in modalità kiosk.  
- Wi-Fi access button / Pulsante per Wi-Fi.  
- Secret exit button (password protected) / Pulsante segreto per uscire (password).  
- Compatible Android 6+ / Compatibile Android 6+.  
- Build using GitHub Actions / Compilazione con GitHub Actions.  

---

## 🚀 Installation / Installazione

**EN:**  
1. Factory reset your tablet.  
2. Install APK via ADB:  
```bash
adb install path/to/KioskLauncher.apk

**Set Device Owner:

adb shell dpm set-device-owner com.kiosk.launcher/.AdminReceiver


Reboot device. The launcher will start automatically.

IT:

Eseguire un reset di fabbrica del tablet.

Installare l’APK via ADB:

adb install path/to/KioskLauncher.apk


Impostare Device Owner:

adb shell dpm set-device-owner com.kiosk.launcher/.AdminReceiver


Riavviare il tablet. Il launcher partirà automaticamente.

🛠️ Build with GitHub Actions / Compilazione con GitHub Actions

The workflow is located in .github/workflows/build.yml.

On push to main branch or manual trigger, the APK will be generated.

Download the APK from Actions → Artifacts → KioskLauncher-APK.

🔒 Security / Sicurezza

Kiosk mode prevents access to other apps / La modalità kiosk impedisce l’accesso ad altre app.

Wi-Fi settings are accessible for network configuration only / Le impostazioni Wi-Fi sono accessibili solo per configurare la rete.

Secret exit button requires a password for maintenance / Il pulsante segreto richiede una password per manutenzione.
