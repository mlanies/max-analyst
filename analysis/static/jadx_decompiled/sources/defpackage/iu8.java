package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class iu8 {
    public static final iu8 X;
    public static final iu8 Y;
    public static final iu8 Z;
    public static final oz7 b;
    public static final List c;
    public static final iu8 o;
    public static final iu8 s0;
    public static final /* synthetic */ iu8[] t0;
    public final int a;

    static {
        iu8 iu8Var = new iu8("UNKNOWN", 0, 0);
        o = iu8Var;
        iu8 iu8Var2 = new iu8("SENDING", 1, 10);
        X = iu8Var2;
        iu8 iu8Var3 = new iu8("SENT", 2, 20);
        Y = iu8Var3;
        iu8 iu8Var4 = new iu8("READ", 3, 30);
        Z = iu8Var4;
        iu8 iu8Var5 = new iu8("ERROR", 4, 40);
        s0 = iu8Var5;
        iu8[] iu8VarArr = {iu8Var, iu8Var2, iu8Var3, iu8Var4, iu8Var5};
        t0 = iu8VarArr;
        v25 v25Var = new v25(iu8VarArr);
        b = new oz7();
        c = x53.D0(v25Var);
    }

    public iu8(String str, int i, int i2) {
        this.a = i2;
    }

    public static iu8 valueOf(String str) {
        return (iu8) Enum.valueOf(iu8.class, str);
    }

    public static iu8[] values() {
        return (iu8[]) t0.clone();
    }
}
