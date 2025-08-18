package defpackage;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vw0 {
    public static final qq9 Y;
    public static final ArrayList Z;
    public static final ArrayList s0;
    public static final vw0 t0;
    public static final vw0 u0;
    public static final /* synthetic */ vw0[] v0;
    public static final /* synthetic */ v25 w0;
    public final int X;
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    static {
        vw0 vw0Var = new vw0("IMAGES", 0, nha.u, nha.j, nha.i, oha.u, oha.n);
        vw0 vw0Var2 = new vw0("AUDIO", 1, nha.q, nha.d, nha.c, oha.e, oha.j);
        t0 = vw0Var2;
        vw0 vw0Var3 = new vw0("GIF", 2, nha.t, nha.h, nha.g, oha.t, oha.m);
        vw0 vw0Var4 = new vw0("STICKERS", 3, nha.z, nha.n, nha.m, oha.A, oha.p);
        vw0 vw0Var5 = new vw0("MUSIC", 4, nha.v, nha.l, nha.k, oha.v, oha.o);
        u0 = vw0Var5;
        vw0[] vw0VarArr = {vw0Var, vw0Var2, vw0Var3, vw0Var4, vw0Var5, new vw0("VIDEO", 5, nha.B, nha.p, nha.o, oha.B, oha.q), new vw0("OTHERS", 6, nha.s, nha.f, nha.e, oha.s, oha.l)};
        v0 = vw0VarArr;
        v25 v25Var = new v25(vw0VarArr);
        w0 = v25Var;
        Y = new qq9();
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            arrayList.add(Integer.valueOf(((vw0) u1Var.next()).a));
        }
        Z = arrayList;
        v25 v25Var2 = w0;
        ArrayList arrayList2 = new ArrayList(z53.S(v25Var2, 10));
        u1 u1Var2 = new u1(0, v25Var2);
        while (u1Var2.hasNext()) {
            arrayList2.add(Integer.valueOf(((vw0) u1Var2.next()).b));
        }
        s0 = arrayList2;
    }

    public vw0(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.o = i5;
        this.X = i6;
    }

    public static vw0 valueOf(String str) {
        return (vw0) Enum.valueOf(vw0.class, str);
    }

    public static vw0[] values() {
        return (vw0[]) v0.clone();
    }
}
