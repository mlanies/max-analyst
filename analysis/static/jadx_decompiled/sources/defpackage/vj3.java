package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vj3 {
    public static final vj3 X;
    public static final vj3 Y;
    public static final vj3 Z;
    public static final vj3 a;
    public static final vj3 b;
    public static final vj3 c;
    public static final vj3 o;
    public static final vj3 s0;
    public static final vj3 t0;
    public static final /* synthetic */ vj3[] u0;

    static {
        vj3 vj3Var = new vj3("OPEN_PROFILE", 0);
        a = vj3Var;
        vj3 vj3Var2 = new vj3("SHARE_CONTACT", 1);
        b = vj3Var2;
        vj3 vj3Var3 = new vj3("WRITE", 2);
        c = vj3Var3;
        vj3 vj3Var4 = new vj3("SELECT", 3);
        o = vj3Var4;
        vj3 vj3Var5 = new vj3("BLOCK", 4);
        X = vj3Var5;
        vj3 vj3Var6 = new vj3(HttpDelete.METHOD_NAME, 5);
        Y = vj3Var6;
        vj3 vj3Var7 = new vj3("AUDIO_CALL", 6);
        Z = vj3Var7;
        vj3 vj3Var8 = new vj3("VIDEO_CALL", 7);
        s0 = vj3Var8;
        vj3 vj3Var9 = new vj3("SUSPEND", 8);
        t0 = vj3Var9;
        u0 = new vj3[]{vj3Var, vj3Var2, vj3Var3, vj3Var4, vj3Var5, vj3Var6, vj3Var7, vj3Var8, vj3Var9};
    }

    public static vj3 valueOf(String str) {
        return (vj3) Enum.valueOf(vj3.class, str);
    }

    public static vj3[] values() {
        return (vj3[]) u0.clone();
    }
}
