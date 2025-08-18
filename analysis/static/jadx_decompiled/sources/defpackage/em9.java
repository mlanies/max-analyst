package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public enum em9 {
    ;

    public static boolean a = false;

    public static void a() {
        File[] fileArrListFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new dm9(0));
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e) {
                        System.err.println("Failed to delete old temp lib" + e.getMessage());
                    }
                }
            }
        }
    }

    public static int b() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return 2;
        }
        if (property.contains("Mac")) {
            return 3;
        }
        if (property.contains("Windows")) {
            return 1;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return 4;
        }
        throw new UnsupportedOperationException("Unsupported operating system: ".concat(property));
    }

    public static String c() {
        String str;
        int iB = b();
        StringBuilder sbM = au1.m("/", em9.class.getPackage().getName().replace('.', '/'), "/");
        if (iB == 1) {
            str = "win32";
        } else if (iB == 2) {
            str = "linux";
        } else if (iB == 3) {
            str = "darwin";
        } else {
            if (iB != 4) {
                throw null;
            }
            str = "solaris";
        }
        sbM.append(str);
        sbM.append("/");
        sbM.append(System.getProperty("os.arch"));
        sbM.append("/liblz4-java.");
        sbM.append(ey8.d(iB));
        return sbM.toString();
    }

    public static em9 valueOf(String str) {
        au1.r(Enum.valueOf(em9.class, str));
        throw null;
    }
}
