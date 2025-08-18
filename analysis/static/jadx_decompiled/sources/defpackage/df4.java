package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class df4 {
    public final /* synthetic */ int a;
    public int b;
    public final List c;

    public /* synthetic */ df4(List list, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = list;
    }

    public m3f a(int i, nw4 nw4Var) {
        if (i != 2) {
            String str = (String) nw4Var.b;
            if (i == 3 || i == 4) {
                return new lua(new ge9(str));
            }
            if (i == 21) {
                return new lua(new zt4(2));
            }
            if (i == 27) {
                if (f(4)) {
                    return null;
                }
                return new lua(new rh6(new wva(c(nw4Var)), f(1), f(8)));
            }
            if (i == 36) {
                return new lua(new th6(new wva(c(nw4Var))));
            }
            if (i == 89) {
                return new lua(new zt4(0, (List) nw4Var.c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new lua(new s3(str, 1));
                }
                if (i == 257) {
                    return new g1d(new cjg("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new g1d(new cjg("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            if (!f(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 130:
                                    if (!f(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new lua(new s3(str, 0));
            }
            return new lua(new rs4(str));
        }
        return new lua(new jh6(new djb(c(nw4Var))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.n3f b(int r6, defpackage.ho9 r7) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df4.b(int, ho9):n3f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List c(nw4 nw4Var) {
        String str;
        int i;
        boolean zF = f(32);
        List list = this.c;
        if (zF) {
            return list;
        }
        yaf yafVar = new yaf((byte[]) nw4Var.o);
        ArrayList arrayList = list;
        while (yafVar.c() > 0) {
            int iV = yafVar.v();
            int iV2 = yafVar.b + yafVar.v();
            if (iV == 134) {
                arrayList = new ArrayList();
                int iV3 = yafVar.v() & 31;
                for (int i2 = 0; i2 < iV3; i2++) {
                    String strT = yafVar.t(3, b52.c);
                    int iV4 = yafVar.v();
                    boolean z = (iV4 & 128) != 0;
                    if (z) {
                        i = iV4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bV = (byte) yafVar.v();
                    yafVar.I(1);
                    List listSingletonList = z ? Collections.singletonList((bV & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    my5 my5Var = new my5();
                    my5Var.k = str;
                    my5Var.c = strT;
                    my5Var.C = i;
                    my5Var.m = listSingletonList;
                    arrayList.add(new oy5(my5Var));
                }
            }
            yafVar.H(iV2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List d(ho9 ho9Var) {
        String str;
        int i;
        boolean zF = f(32);
        List list = this.c;
        if (zF) {
            return list;
        }
        wpa wpaVar = new wpa((byte[]) ho9Var.d);
        ArrayList arrayList = list;
        while (wpaVar.a() > 0) {
            int iU = wpaVar.u();
            int iU2 = wpaVar.b + wpaVar.u();
            if (iU == 134) {
                arrayList = new ArrayList();
                int iU3 = wpaVar.u() & 31;
                for (int i2 = 0; i2 < iU3; i2++) {
                    String strS = wpaVar.s(3, b52.c);
                    int iU4 = wpaVar.u();
                    boolean z = (iU4 & 128) != 0;
                    if (z) {
                        i = iU4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bU = (byte) wpaVar.u();
                    wpaVar.H(1);
                    List listSingletonList = z ? Collections.singletonList((bU & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    ny5 ny5Var = new ny5();
                    ny5Var.m = ia9.l(str);
                    ny5Var.d = strS;
                    ny5Var.F = i;
                    ny5Var.p = listSingletonList;
                    arrayList.add(new qy5(ny5Var));
                }
            }
            wpaVar.G(iU2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean e() {
        return this.b < this.c.size();
    }

    public boolean f(int i) {
        switch (this.a) {
            case 0:
                if ((this.b & i) != 0) {
                }
                break;
            default:
                if ((this.b & i) != 0) {
                }
                break;
        }
        return false;
    }

    public df4(ArrayList arrayList) {
        this.a = 2;
        this.c = arrayList;
    }
}
