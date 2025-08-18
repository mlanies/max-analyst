package defpackage;

import java.util.LinkedHashSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pa2 {
    public static final pa2 A0;
    public static final /* synthetic */ pa2[] B0;
    public static final pa2 X;
    public static final pa2 Y;
    public static final pa2 Z;
    public static final LinkedHashSet a;
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final pa2 o;
    public static final pa2 s0;
    public static final pa2 t0;
    public static final pa2 u0;
    public static final pa2 v0;
    public static final pa2 w0;
    public static final pa2 x0;
    public static final pa2 y0;
    public static final pa2 z0;

    static {
        pa2 pa2Var = new pa2("CHANNEL", 0);
        o = pa2Var;
        pa2 pa2Var2 = new pa2("CHAT", 1);
        X = pa2Var2;
        pa2 pa2Var3 = new pa2("DIALOG", 2);
        Y = pa2Var3;
        pa2 pa2Var4 = new pa2("CONTACT", 3);
        Z = pa2Var4;
        pa2 pa2Var5 = new pa2("NOT_CONTACT", 4);
        s0 = pa2Var5;
        pa2 pa2Var6 = new pa2("BOT", 5);
        t0 = pa2Var6;
        pa2 pa2Var7 = new pa2("OWNER", 6);
        u0 = pa2Var7;
        pa2 pa2Var8 = new pa2("ADMIN", 7);
        v0 = pa2Var8;
        pa2 pa2Var9 = new pa2("MUTED", 8);
        w0 = pa2Var9;
        pa2 pa2Var10 = new pa2("NOT_MUTED", 9);
        x0 = pa2Var10;
        pa2 pa2Var11 = new pa2("UNREAD", 10);
        y0 = pa2Var11;
        pa2 pa2Var12 = new pa2("MARKED_UNREAD", 11);
        z0 = pa2Var12;
        pa2 pa2Var13 = new pa2("ORG", 12);
        A0 = pa2Var13;
        B0 = new pa2[]{pa2Var, pa2Var2, pa2Var3, pa2Var4, pa2Var5, pa2Var6, pa2Var7, pa2Var8, pa2Var9, pa2Var10, pa2Var11, pa2Var12, pa2Var13};
        a = bcd.X(pa2Var11, pa2Var9, pa2Var10, pa2Var12);
        b = bcd.X(pa2Var8, pa2Var7);
        c = bcd.X(pa2Var4, pa2Var5, pa2Var2, pa2Var, pa2Var6, pa2Var13);
    }

    public static pa2 valueOf(String str) {
        return (pa2) Enum.valueOf(pa2.class, str);
    }

    public static pa2[] values() {
        return (pa2[]) B0.clone();
    }
}
