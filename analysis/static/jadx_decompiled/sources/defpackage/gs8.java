package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gs8 {
    public static final gs8 X;
    public static final gs8 Y;
    public static final gs8 Z;
    public static final gs8 a;
    public static final gs8 b;
    public static final gs8 c;
    public static final gs8 o;
    public static final gs8 s0;
    public static final gs8 t0;
    public static final gs8 u0;
    public static final gs8 v0;
    public static final gs8 w0;
    public static final gs8 x0;
    public static final gs8 y0;
    public static final /* synthetic */ gs8[] z0;

    static {
        gs8 gs8Var = new gs8("FORWARD", 0);
        a = gs8Var;
        gs8 gs8Var2 = new gs8("COPY", 1);
        b = gs8Var2;
        gs8 gs8Var3 = new gs8("REPORT", 2);
        c = gs8Var3;
        gs8 gs8Var4 = new gs8("MARK_AS_UNREAD", 3);
        o = gs8Var4;
        gs8 gs8Var5 = new gs8("REPLY", 4);
        X = gs8Var5;
        gs8 gs8Var6 = new gs8(HttpDelete.METHOD_NAME, 5);
        Y = gs8Var6;
        gs8 gs8Var7 = new gs8("DELETE_FOR_ALL", 6);
        Z = gs8Var7;
        gs8 gs8Var8 = new gs8("PIN", 7);
        s0 = gs8Var8;
        gs8 gs8Var9 = new gs8("UNPIN", 8);
        t0 = gs8Var9;
        gs8 gs8Var10 = new gs8("SELECT", 9);
        u0 = gs8Var10;
        gs8 gs8Var11 = new gs8("EDIT", 10);
        v0 = gs8Var11;
        gs8 gs8Var12 = new gs8("SAVE_TO_GALLERY", 11);
        w0 = gs8Var12;
        gs8 gs8Var13 = new gs8("COPY_PHOTO", 12);
        x0 = gs8Var13;
        gs8 gs8Var14 = new gs8("SHARE_EXTERNAL", 13);
        y0 = gs8Var14;
        z0 = new gs8[]{gs8Var, gs8Var2, gs8Var3, gs8Var4, gs8Var5, gs8Var6, gs8Var7, gs8Var8, gs8Var9, gs8Var10, gs8Var11, gs8Var12, gs8Var13, gs8Var14};
    }

    public static gs8 valueOf(String str) {
        return (gs8) Enum.valueOf(gs8.class, str);
    }

    public static gs8[] values() {
        return (gs8[]) z0.clone();
    }
}
