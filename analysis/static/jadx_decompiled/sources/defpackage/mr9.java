package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class mr9 extends gle {
    public int X;
    public yt Y;
    public int Z;
    public long c;
    public ArrayList o;
    public long s0;
    public ArrayList t0;
    public List u0;

    public mr9(gy8 gy8Var) {
        super(gy8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int i;
        ArrayList arrayList;
        int i2;
        ?? EmptyList;
        yt ytVar;
        i = 1;
        str.getClass();
        arrayList = null;
        i2 = 0;
        switch (str) {
            case "recentsList":
                if (gy8Var.n().a() == 7) {
                    arrayList = new ArrayList();
                    int iS0 = gy8Var.s0();
                    while (i2 < iS0) {
                        arrayList.add(i9c.a(gy8Var));
                        i2++;
                    }
                } else {
                    gy8Var.z();
                }
                this.t0 = arrayList;
                break;
            case "recentEmojiList":
                if (gy8Var.n().a() == 7) {
                    EmptyList = new ArrayList();
                    int iS02 = gy8Var.s0();
                    while (i2 < iS02) {
                        g9c g9cVarA = g9c.a(gy8Var);
                        if (g9cVarA != null) {
                            EmptyList.add(g9cVarA);
                        }
                        i2++;
                    }
                } else {
                    gy8Var.z();
                    EmptyList = Collections.emptyList();
                }
                this.u0 = EmptyList;
                break;
            case "updateType":
                String strP = lz7.P(gy8Var);
                yt[] ytVarArr = yt.o;
                int length = ytVarArr.length;
                while (true) {
                    if (i2 < length) {
                        ytVar = ytVarArr[i2];
                        if (!ytVar.a.equalsIgnoreCase(strP)) {
                            i2++;
                        }
                    } else {
                        ytVar = yt.UNKNOWN;
                    }
                }
                this.Y = ytVar;
                break;
            case "id":
                this.c = lz7.M(gy8Var, 0L);
                break;
            case "ids":
                if (gy8Var.n().a() == 7) {
                    arrayList = new ArrayList();
                    int iS03 = gy8Var.s0();
                    while (i2 < iS03) {
                        arrayList.add(Long.valueOf(lz7.M(gy8Var, 0L)));
                        i2++;
                    }
                } else {
                    gy8Var.z();
                }
                this.o = arrayList;
                break;
            case "sync":
                this.s0 = lz7.M(gy8Var, 0L);
                break;
            case "type":
                String strP2 = lz7.P(gy8Var);
                int[] iArrV = au1.v(10);
                int length2 = iArrV.length;
                while (true) {
                    if (i2 < length2) {
                        int i3 = iArrV[i2];
                        if (au1.d(i3).equals(strP2)) {
                            i = i3;
                        } else {
                            i2++;
                        }
                    }
                }
                this.X = i;
                break;
            case "setId":
                lz7.M(gy8Var, 0L);
                break;
            case "position":
                this.Z = lz7.L(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        long j = this.c;
        int i = this.X;
        yt ytVar = this.Y;
        int i2 = this.Z;
        int iO = s5c.o(this.u0);
        int iO2 = s5c.o(this.t0);
        StringBuilder sbK = au1.k(j, "Response{id=", ", assetType=");
        sbK.append(au1.t(i));
        sbK.append(", updateType=");
        sbK.append(ytVar);
        sbK.append(", position=");
        ms2.k(sbK, i2, ", recentEmojiList=", iO, ", recentsList=");
        return zr6.j(sbK, iO2, "}");
    }
}
