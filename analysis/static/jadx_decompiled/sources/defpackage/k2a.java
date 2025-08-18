package defpackage;

import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public final class k2a implements la5 {
    public pa5 a;
    public a9e b;
    public boolean c;

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.a = pa5Var;
    }

    public final boolean a(sa4 sa4Var) {
        boolean zT;
        n2a n2aVar = new n2a(1);
        if (n2aVar.b(sa4Var, true) && (n2aVar.a & 2) == 2) {
            int iMin = Math.min(n2aVar.e, 8);
            wpa wpaVar = new wpa(iMin);
            sa4Var.q(wpaVar.a, 0, iMin, false);
            wpaVar.G(0);
            if (wpaVar.a() >= 5 && wpaVar.u() == 127 && wpaVar.w() == 1179402563) {
                this.b = new om5(1);
            } else {
                wpaVar.G(0);
                try {
                    zT = m6d.T(1, wpaVar, true);
                } catch (ParserException unused) {
                    zT = false;
                }
                if (zT) {
                    this.b = new brf(1);
                } else {
                    wpaVar.G(0);
                    if (yma.g(wpaVar, yma.p)) {
                        this.b = new yma(1);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        a9e a9eVar = this.b;
        if (a9eVar != null) {
            m2a m2aVar = (m2a) a9eVar.j;
            n2a n2aVar = (n2a) m2aVar.e;
            n2aVar.a = 0;
            n2aVar.b = 0L;
            n2aVar.c = 0;
            n2aVar.d = 0;
            n2aVar.e = 0;
            ((wpa) m2aVar.f).D(0);
            m2aVar.b = -1;
            m2aVar.d = false;
            if (j == 0) {
                a9eVar.f(!a9eVar.h);
                return;
            }
            if (a9eVar.e != 0) {
                long j3 = (a9eVar.f * j2) / 1000000;
                a9eVar.b = j3;
                p2a p2aVar = (p2a) a9eVar.m;
                int i = oaf.a;
                p2aVar.i(j3);
                a9eVar.e = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r19, defpackage.lh4 r20) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2a.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        try {
            return a((sa4) na5Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
