package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class kq3 implements Serializable {
    public final List X;
    public final int Y;
    public final boolean Z;
    public final wm3 a;
    public final String b;
    public final String c;
    public final s7b o;

    public kq3(wm3 wm3Var, String str, String str2, s7b s7bVar, ArrayList arrayList, int i, boolean z) {
        this.a = wm3Var;
        this.b = str;
        this.c = str2;
        this.o = s7bVar;
        this.X = arrayList;
        this.Y = i;
        this.Z = z;
    }

    public static kq3 a(gy8 gy8Var) {
        int iN = lz7.N(gy8Var);
        ArrayList arrayList = null;
        int iV0 = 0;
        boolean zU0 = false;
        wm3 wm3VarE = null;
        String strZ0 = null;
        String strZ02 = null;
        s7b s7bVarA = null;
        for (int i = 0; i < iN; i++) {
            String strZ03 = gy8Var.z0();
            strZ03.getClass();
            switch (strZ03) {
                case "summary":
                    strZ0 = gy8Var.z0();
                    break;
                case "restricted":
                    zU0 = gy8Var.u0();
                    break;
                case "presence":
                    s7bVarA = s7b.a(gy8Var);
                    break;
                case "friends":
                    int iG = lz7.G(gy8Var);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < iG; i2++) {
                        arrayList2.add(Long.valueOf(gy8Var.w0()));
                    }
                    arrayList = arrayList2;
                    break;
                case "feedback":
                    strZ02 = gy8Var.z0();
                    break;
                case "friendsCount":
                    iV0 = gy8Var.v0();
                    break;
                case "contact":
                    wm3VarE = wm3.e(gy8Var);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new kq3(wm3VarE, strZ0, strZ02, s7bVarA, arrayList, iV0, zU0);
    }

    public final String toString() {
        return "{contact=" + this.a + ", summary='" + oag.x(this.b) + "', feedback='" + oag.x(this.c) + "', friends=" + s5c.o(this.X) + ", friendsCount=" + this.Y + ", restricted=" + this.Z + "}";
    }
}
