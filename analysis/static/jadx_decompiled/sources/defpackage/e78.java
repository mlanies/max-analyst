package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e78 {
    public static final ArrayList X;
    public static final /* synthetic */ e78[] Y;
    public static final /* synthetic */ v25 Z;
    public static final dp3 o;
    public final int a;
    public final int b;
    public final int c;

    static {
        e78[] e78VarArr = {new e78(0, 0, nha.A, oha.d, "UNLIMITED"), new e78(1, 1, nha.y, oha.c, "SIX_MONTH"), new e78(2, 2, nha.w, oha.a, "ONE_MONTH"), new e78(3, 3, nha.x, oha.b, "ONE_WEEK")};
        Y = e78VarArr;
        v25 v25Var = new v25(e78VarArr);
        Z = v25Var;
        o = new dp3();
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            arrayList.add(Integer.valueOf(((e78) u1Var.next()).b));
        }
        X = arrayList;
    }

    public e78(int i, int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public static e78 valueOf(String str) {
        return (e78) Enum.valueOf(e78.class, str);
    }

    public static e78[] values() {
        return (e78[]) Y.clone();
    }
}
