package defpackage;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class z7b {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "HUAWEI";
        }
        if (i == 2) {
            return "GCM";
        }
        if (i == 3) {
            return "RUSTORE";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "context_menu";
        }
        if (i == 2) {
            return "reactions_bubble";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "message";
        }
        if (i == 2) {
            return "image";
        }
        if (i == 3) {
            return "contact";
        }
        if (i == 4) {
            return "location";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "message";
        }
        if (i == 2) {
            return "image";
        }
        if (i == 3) {
            return "contact";
        }
        if (i == 4) {
            return "location";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static float f(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static hob g(oec oecVar, Class cls, String str, String str2, int i) {
        oecVar.getClass();
        return new hob(cls, str, str2, i);
    }

    public static String h(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String i(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder j(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MESSAGE" : "GLOBAL_CONTACT" : "CONTACT" : "GLOBAL_CHAT" : "CHAT";
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GLOBAL" : "CONTACT" : "MESSAGE" : "CHANNEL" : "CHAT";
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SOLO" : "LAST" : "MIDDLE" : "FIRST";
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int o(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("CRASH")) {
            return 1;
        }
        if (str.equals("NON_FATAL")) {
            return 2;
        }
        if (str.equals("FATAL")) {
            return 3;
        }
        if (str.equals("ERROR")) {
            return 4;
        }
        if (str.equals("WARNING")) {
            return 5;
        }
        if (str.equals("NOTICE")) {
            return 6;
        }
        if (str.equals("INFO")) {
            return 7;
        }
        if (str.equals("DEBUG")) {
            return 8;
        }
        if (str.equals("MINIDUMP")) {
            return 9;
        }
        if (str.equals("ANR")) {
            return 10;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tracer.crash.report.ReportType.".concat(str));
    }
}
