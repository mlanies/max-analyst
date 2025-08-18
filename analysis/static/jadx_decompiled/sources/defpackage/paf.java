package defpackage;

import java.nio.ByteOrder;

/* loaded from: classes.dex */
public enum paf {
    ;

    public static final ByteOrder a = ByteOrder.nativeOrder();
    public static final boolean b;

    static {
        String property = System.getProperty("os.arch");
        b = property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le");
    }

    public static paf valueOf(String str) {
        au1.r(Enum.valueOf(paf.class, str));
        throw null;
    }
}
