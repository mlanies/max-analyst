# Privacy Verification Report - MAX Messenger

**Analysis Date:** August 18, 2025  
**Application Version:** ru.oneme.app  
**Analysis Method:** Static + Dynamic APK Analysis

## Executive Summary

Based on comprehensive code analysis and dynamic monitoring, **claims of "total surveillance" are NOT CONFIRMED**. The application has limited data collection capabilities but does not implement the claimed "total" surveillance functions.

## Internet Claims Verification

### DISPROVEN: "Application records audio and screen"
**Status:** DISPROVEN

**Evidence:**
- NO MediaProjection API calls found in code for screen recording
- No SYSTEM_ALERT_WINDOW usage for overlay (set to "ignore")
- Camera and microphone available only with explicit user permission
- No background screen recording code

**Dynamic Verification:**
```
CAMERA: foreground (only during active use)
RECORD_AUDIO: foreground (only during active use)
SYSTEM_ALERT_WINDOW: ignore (denied)
```

### PARTIALLY DISPROVEN: "All personal data leaks to developers"
**Status:** PARTIALLY DISPROVEN

**Evidence:**
- **Contacts:** Permissions revoked (READ_CONTACTS: ignore, granted=false)
- **Accounts:** Permissions revoked (GET_ACCOUNTS: ignore, granted=false)
- **Geolocation:** Not requested in current version
- **System Information:** Standard telemetry via AppTracer

**What is actually collected:**
- Basic device information (via AppTracer)
- Application performance data
- Feature usage statistics

### DISPROVEN: "Analyzes absolutely all applications"
**Status:** DISPROVEN

**Evidence:**
- NO QUERY_ALL_PACKAGES permission
- NO UsageStatsManager usage
- NO code for getting installed applications list
- NO access to PackageManager.getInstalledPackages()

### DISPROVEN: "Leaks unsent text"
**Status:** DISPROVEN

**Evidence:**
- NO TextWatcher usage for input interception
- NO ClipboardManager access
- NO code for text field monitoring
- Network traffic contains no intercepted text

## Actually Discovered

### CONFIRMED: AppTracer SDK
**Status:** CONFIRMED

**Evidence:**
```java
// analysis/static/jadx_decompiled/sources/ru/ok/tracer/upload/SampleUploadWorker.java
Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/initUpload")
Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/sample/upload")

// analysis/static/jadx_decompiled/sources/defpackage/lbd.java
Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/crash/trackSession")

// analysis/static/jadx_decompiled/sources/defpackage/ule.java
Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/perf/upload")
```

**Risks:**
- Performance telemetry collection
- Crash report submission
- Usage analytics

### CONFIRMED: Potential contacts access
**Status:** CODE PRESENT, BUT PERMISSIONS REVOKED

**Evidence:**
```java
// analysis/static/jadx_decompiled/sources/defpackage/ike.java
public final Uri c() { 
    return ContactsContract.RawContacts.CONTENT_URI.buildUpon()...
}
arrayList.add(ContentProviderOperation.newInsert(b(ContactsContract.Settings.CONTENT_URI))...)
arrayList.add(ContentProviderOperation.newInsert(b(ContactsContract.Data.CONTENT_URI))...)

// analysis/static/jadx_decompiled/sources/defpackage/jva.java
this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new f04(...))
```

**Current Status:**
```
READ_CONTACTS: ignore (revoked)
WRITE_CONTACTS: ignore (revoked)
GET_ACCOUNTS: ignore (revoked)
```

### CONFIRMED: Network connections
**Status:** CONFIRMED

**Active Connections:**
- NetworkRequest id=200 for ru.oneme.app
- Internet access via mobile network
- Regular network requests

## Technical Details

### Code "encryption"
**Reality:** Standard code obfuscation
- Class and method renaming (a, b, c...)
- Debug information removal
- Protection against simple reverse engineering
- Does NOT mean "total surveillance"

### Missing surveillance mechanisms
1. **Accessibility Services** - NOT used
2. **Usage Stats** - NO permissions
3. **Screen Recording** - NO code
4. **Keylogging** - NO TextWatcher
5. **Clipboard Monitoring** - NO access

## Conclusions

### CONFIRMED:
- AppTracer usage for telemetry
- Potential contacts access (code present, permissions revoked)
- Standard code obfuscation
- Network connections for functionality

### DISPROVEN:
- Screen and audio recording
- All applications monitoring
- Unsent text interception
- "Total user surveillance"
- All personal data leakage

### RISKS:
- AppTracer collects telemetry
- If contacts permissions restored - access possible
- Standard messenger risks (messages, media)

## Recommendations

1. **Do not restore** contacts permissions
2. **Monitor** network activity
3. **Use** VPN for additional protection
4. **Regularly check** application permissions

## Conclusion

**MAX Messenger is NOT a "total spy"** as claimed on the internet. Claims of total surveillance are **NOT CONFIRMED** by evidence. The application has standard messenger capabilities and uses AppTracer for analytics, but does not implement the claimed total surveillance functions. Main risks are related to potential contacts access (if permissions restored) and standard telemetry.
