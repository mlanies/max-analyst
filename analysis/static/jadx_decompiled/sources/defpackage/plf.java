package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class plf extends gle {
    public ArrayList c;

    public plf(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        int iG;
        int i = 1;
        if (!tpa.f(str, "info")) {
            try {
                gy8Var.z();
                return;
            } catch (Throwable th) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                Iterator it = u7d.a.iterator();
                while (it.hasNext()) {
                    ((r4a) it.next()).getClass();
                    r4a.a(th);
                }
                int iS = au1.s(k7d.a);
                if (iS != 0) {
                    if (iS == 1) {
                        throw th;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        this.c = new ArrayList();
        try {
            iG = lz7.G(gy8Var);
        } catch (Throwable th2) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it2 = u7d.a.iterator();
            while (it2.hasNext()) {
                ((r4a) it2.next()).getClass();
                r4a.a(th2);
            }
            int iS2 = au1.s(k7d.a);
            if (iS2 != 0) {
                if (iS2 == 1) {
                    throw th2;
                }
                throw new NoWhenBranchMatchedException();
            }
            iG = 0;
        }
        for (int i2 = 0; i2 < iG; i2 += i) {
            try {
                ArrayList arrayList = this.c;
                if (arrayList != null) {
                    int iX0 = gy8Var.x0();
                    String strP = null;
                    String strP2 = null;
                    long jM = 0;
                    for (int i3 = 0; i3 < iX0; i3++) {
                        String strZ0 = gy8Var.z0();
                        strZ0.getClass();
                        switch (strZ0) {
                            case "url":
                                strP = lz7.P(gy8Var);
                                break;
                            case "token":
                                strP2 = lz7.P(gy8Var);
                                break;
                            case "videoId":
                                jM = lz7.M(gy8Var, 0L);
                                break;
                            default:
                                gy8Var.z();
                                break;
                        }
                    }
                    arrayList.add(new qlf(jM, strP, strP2));
                    i = 1;
                }
            } catch (Throwable th3) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it3 = u7d.a.iterator();
                while (it3.hasNext()) {
                    ((r4a) it3.next()).getClass();
                    r4a.a(th3);
                }
                int iS3 = au1.s(k7d.a);
                if (iS3 != 0) {
                    if (iS3 == 1) {
                        throw th3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        ArrayList arrayList = this.c;
        return zr6.i("{videoUploadInfo=[", x53.n0(arrayList != null ? x53.D0(arrayList) : nz4.a, null, null, null, new w8c(27), 31), "]}");
    }
}
