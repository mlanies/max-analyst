# MAX Messenger Security Analysis

Comprehensive security and privacy analysis of the MAX messenger application (ru.oneme.app).

## Overview

This repository contains the complete analysis framework and results for investigating the privacy and security implications of the MAX messenger application. The analysis includes both static code review and dynamic runtime monitoring.

## About

This project was created to address widespread concerns about the MAX messenger application's privacy and security practices. Following claims circulating on the internet about alleged "total surveillance" capabilities, this analysis provides a comprehensive, evidence-based assessment of the application's actual behavior and data collection practices.

### Analysis Scope

The investigation covers:
- **Static Analysis**: APK decompilation, permission analysis, code review
- **Dynamic Analysis**: Runtime monitoring, network traffic analysis, permission usage
- **Privacy Assessment**: Data collection verification, third-party integration analysis
- **Security Evaluation**: Vulnerability assessment, risk analysis

### Methodology

The analysis follows standard security research practices:
1. **APK Decompilation**: Using apktool and jadx for source code extraction
2. **Permission Analysis**: Review of declared permissions and their usage
3. **Dynamic Monitoring**: Real-time observation of application behavior
4. **Network Analysis**: Traffic capture and endpoint identification
5. **Code Review**: Systematic examination of decompiled source code

### Key Objectives

- Verify or disprove claims about surveillance capabilities
- Identify actual data collection and transmission practices
- Assess privacy risks and security implications
- Provide transparent, reproducible analysis methodology
- Enable independent verification by other researchers

### Findings Summary

The analysis reveals that while MAX messenger does collect some telemetry data through AppTracer SDK, the claims of "total surveillance" are **not supported by evidence**. The application has standard messenger functionality with typical analytics integration, but does not implement the alleged comprehensive monitoring capabilities.

## Project Structure

```
max-analyst/
├── analysis/
│   ├── static/                    # Static analysis results
│   │   ├── decompiled/           # APK decompilation (apktool)
│   │   └── jadx_decompiled/      # Java source code (jadx)
│   ├── reports/                  # Analysis reports
│   ├── scripts/                  # Analysis scripts
│   ├── live_monitoring.sh        # Real-time app monitoring
│   ├── traffic_analysis.sh       # Network traffic analysis
│   ├── simple_traffic_analysis.sh # Basic traffic monitoring
│   └── start_professional_monitoring.sh # Comprehensive monitoring
├── ru.oneme.app_6392_rs.apk      # Target APK file
└── README.md                     # This file
```

## Key Findings

### Privacy Analysis Results

**Confirmed Capabilities:**
- AppTracer SDK integration for telemetry collection
- Potential contacts access (code present, permissions revoked)
- Standard network connectivity for messenger functionality
- Code obfuscation (standard practice)

**Disproven Claims:**
- Screen recording capabilities
- Audio recording without consent
- Monitoring of all installed applications
- Interception of unsent text messages
- "Total user tracking" functionality

### Technical Analysis

**Static Analysis:**
- APK decompilation using apktool and jadx
- Permission analysis and code review
- External server endpoint identification
- Tracker SDK detection

**Dynamic Analysis:**
- Real-time process monitoring
- Network traffic analysis
- Permission usage tracking via AppOps
- Logcat monitoring for security events

## Analysis Tools

### Core Scripts

1. **live_monitoring.sh** - Real-time application monitoring
   - Process information (PID, UID)
   - CPU and memory usage
   - Active services
   - Network connections
   - Application logs

2. **traffic_analysis.sh** - Network traffic analysis
   - TCP/UDP connection monitoring
   - DNS query analysis
   - HTTP/HTTPS traffic capture
   - External server identification

3. **simple_traffic_analysis.sh** - Basic traffic monitoring
   - Network connection status
   - Process network activity
   - Basic log analysis

### Prerequisites

- Android Debug Bridge (ADB)
- Android emulator or physical device
- Bash shell environment
- Network analysis tools (optional)

## Usage

### Basic Setup

1. Ensure ADB is installed and configured
2. Connect Android device or start emulator
3. Install target APK: `adb install ru.oneme.app_6392_rs.apk`

### Running Analysis

```bash
# Start comprehensive monitoring
./analysis/start_professional_monitoring.sh

# Monitor live application activity
./analysis/live_monitoring.sh

# Analyze network traffic
./analysis/traffic_analysis.sh

# Basic traffic monitoring
./analysis/simple_traffic_analysis.sh
```

### Custom Analysis

```bash
# Monitor specific package
APP_PACKAGE=ru.oneme.app ./analysis/live_monitoring.sh

# Analyze with custom parameters
./analysis/traffic_analysis.sh --duration 300 --output custom_report
```

## Reports

### Available Reports

- **privacy_verification_report.md** - Comprehensive privacy analysis
- **comprehensive_analysis_report.md** - Complete security assessment
- **trackers_analysis.md** - Third-party tracker analysis
- **external_servers_analysis.md** - Network endpoint analysis
- **critical_permissions_analysis.md** - Permission risk assessment
- **traffic_analysis_final_report.md** - Network traffic findings
- **security_vulnerabilities.md** - Security vulnerability assessment
- **network_endpoints_analysis.md** - Network endpoint analysis

### Report Structure

Each report includes:
- Executive summary
- Technical methodology
- Detailed findings
- Risk assessment
- Recommendations
- Evidence and code citations

## Research Logs and Results

### Analysis Timeline

**Phase 1: Initial Setup and Static Analysis**
- APK decompilation using apktool and jadx
- Permission manifest analysis
- Code structure examination
- External dependency identification

**Phase 2: Dynamic Analysis**
- Real-time application monitoring
- Network traffic capture and analysis
- Permission usage tracking via AppOps
- Logcat monitoring for security events

**Phase 3: Privacy Assessment**
- Data collection capability analysis
- Third-party integration review
- Network transmission monitoring
- User data handling verification

**Phase 4: Claims Verification**
- Internet claims fact-checking
- Evidence-based assessment
- Comparative analysis with findings
- Risk evaluation and recommendations

### Key Research Findings

#### 1. AppTracer SDK Integration
**Status:** CONFIRMED
- Found active integration with AppTracer SDK
- Endpoints: `https://sdk-api.apptracer.ru`
- Functions: `initUpload`, `upload`, `crash/trackSession`, `perf/upload`
- Purpose: Performance telemetry and crash reporting

#### 2. Contacts Access Capability
**Status:** CODE PRESENT, PERMISSIONS REVOKED
- ContactsContract API usage found in code
- Permissions: READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS
- Current status: All permissions revoked (ignore mode)
- Risk: Potential access if permissions restored

#### 3. Screen Recording Claims
**Status:** DISPROVEN
- No MediaProjection API usage found
- No SYSTEM_ALERT_WINDOW overlay implementation
- No background screen recording code
- Conclusion: Claims not supported by evidence

#### 4. Audio Recording Claims
**Status:** DISPROVEN
- Camera and microphone permissions: foreground only
- No background audio recording implementation
- Standard messenger functionality only
- Conclusion: Claims not supported by evidence

#### 5. Application Monitoring Claims
**Status:** DISPROVEN
- No QUERY_ALL_PACKAGES permission
- No UsageStatsManager implementation
- No PackageManager.getInstalledPackages() usage
- Conclusion: Claims not supported by evidence

#### 6. Text Interception Claims
**Status:** DISPROVEN
- No TextWatcher implementation for input monitoring
- No ClipboardManager access
- No unsent text capture mechanisms
- Conclusion: Claims not supported by evidence

### Network Analysis Results

#### External Servers Identified
1. **AppTracer Analytics**: `sdk-api.apptracer.ru`
2. **Firebase Services**: `firebase.google.com`
3. **Google Play Services**: `play.google.com`
4. **Messenger Infrastructure**: Various OK.ru endpoints

#### Traffic Patterns
- Regular telemetry uploads to AppTracer
- Standard Firebase analytics integration
- Normal messenger communication patterns
- No suspicious data exfiltration detected

### Permission Analysis Results

#### Granted Permissions
- `CAMERA`: foreground only
- `RECORD_AUDIO`: foreground only
- `INTERNET`: standard network access
- `ACCESS_NETWORK_STATE`: network monitoring

#### Revoked Permissions
- `READ_CONTACTS`: revoked (ignore mode)
- `WRITE_CONTACTS`: revoked (ignore mode)
- `GET_ACCOUNTS`: revoked (ignore mode)
- `SYSTEM_ALERT_WINDOW`: revoked (ignore mode)

### Code Obfuscation Analysis

#### Obfuscation Techniques
- Class and method renaming (a, b, c...)
- Debug information removal
- String encryption
- Control flow obfuscation

#### Impact Assessment
- Standard Android app protection
- Does not indicate malicious intent
- Common practice for commercial applications
- Analysis still possible with proper tools

### Risk Assessment Summary

#### Low Risk
- Standard messenger functionality
- Basic telemetry collection
- Code obfuscation (normal practice)

#### Medium Risk
- AppTracer SDK integration
- Potential contacts access (if permissions restored)
- Network data transmission

#### High Risk
- None identified in current analysis

### Evidence and Code Citations

#### AppTracer Integration Evidence
```java
// SampleUploadWorker.java
Uri.parse("https://sdk-api.apptracer.ru").buildUpon()
    .appendEncodedPath("api/sample/initUpload")

Uri.parse("https://sdk-api.apptracer.ru").buildUpon()
    .appendEncodedPath("api/sample/upload")
```

#### Contacts Access Evidence
```java
// ike.java
public final Uri c() { 
    return ContactsContract.RawContacts.CONTENT_URI.buildUpon()...
}

// jva.java
this.a.getContentResolver().registerContentObserver(
    ContactsContract.Contacts.CONTENT_URI, true, new f04(...))
```

### Research Conclusions

1. **Claims Verification**: Internet claims about "total surveillance" are **NOT SUPPORTED** by evidence
2. **Actual Capabilities**: Standard messenger with AppTracer telemetry integration
3. **Privacy Risks**: Moderate, primarily related to potential contacts access
4. **Security Status**: No critical vulnerabilities identified
5. **Recommendations**: Maintain revoked permissions, monitor network activity

### Research Methodology Validation

- **Reproducibility**: All analysis steps documented and repeatable
- **Transparency**: Full methodology and evidence provided
- **Objectivity**: Evidence-based conclusions without bias
- **Completeness**: Comprehensive coverage of claimed capabilities

## Methodology

### Static Analysis
1. APK decompilation using multiple tools
2. Permission manifest analysis
3. Code review for sensitive operations
4. External dependency identification
5. Obfuscation analysis

### Dynamic Analysis
1. Runtime permission monitoring
2. Network traffic capture
3. Process behavior analysis
4. System call monitoring
5. Log analysis

### Privacy Assessment
1. Data collection capability analysis
2. Network transmission monitoring
3. Permission usage tracking
4. Third-party integration review
5. User data handling verification

## Security Considerations

### Risk Assessment

**Low Risk:**
- Standard messenger functionality
- Basic telemetry collection
- Code obfuscation

**Medium Risk:**
- AppTracer SDK integration
- Potential contacts access
- Network data transmission

**High Risk:**
- None identified in current analysis

### Recommendations

1. Maintain revoked permissions (contacts, accounts)
2. Monitor network activity regularly
3. Use VPN for additional protection
4. Review app permissions periodically
5. Consider alternative messengers for sensitive communications

## Contributing

This analysis framework is designed for security researchers and privacy advocates. Contributions should focus on:

- Improving analysis methodologies
- Adding new detection capabilities
- Enhancing reporting accuracy
- Expanding tool functionality

## Legal Notice

This analysis is conducted for educational and research purposes only. All findings are based on publicly available information and standard security research methodologies. Users are responsible for compliance with applicable laws and regulations.

## License

This project is provided as-is for educational purposes. Use at your own risk and in compliance with applicable laws.

## Contact

For questions regarding this analysis or methodology, please refer to the technical documentation and reports included in this repository.
