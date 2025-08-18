# MAX Messenger Security Analysis

Comprehensive security and privacy analysis of the MAX messenger application (ru.oneme.app).

## Overview

This repository contains the complete analysis framework and results for investigating the privacy and security implications of the MAX messenger application. The analysis includes both static code review and dynamic runtime monitoring.

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
