package defpackage;

import org.apache.http.util.VersionInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m38 {
    public static final m38 X;
    public static final /* synthetic */ m38[] Y;
    public static final m38 a;
    public static final m38 b;
    public static final m38 c;
    public static final m38 o;

    static {
        m38 m38Var = new m38("OFF", 0);
        a = m38Var;
        m38 m38Var2 = new m38("ON", 1);
        b = m38Var2;
        m38 m38Var3 = new m38("DISABLED", 2);
        c = m38Var3;
        m38 m38Var4 = new m38("HIDE", 3);
        o = m38Var4;
        m38 m38Var5 = new m38(VersionInfo.UNAVAILABLE, 4);
        X = m38Var5;
        Y = new m38[]{m38Var, m38Var2, m38Var3, m38Var4, m38Var5};
    }

    public static m38 valueOf(String str) {
        return (m38) Enum.valueOf(m38.class, str);
    }

    public static m38[] values() {
        return (m38[]) Y.clone();
    }
}
