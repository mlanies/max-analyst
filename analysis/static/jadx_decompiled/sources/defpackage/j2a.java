package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class j2a implements ka5 {
    public oa5 a;
    public a9e b;
    public boolean c;

    public final boolean a(ra4 ra4Var) {
        boolean zF;
        n2a n2aVar = new n2a(0);
        if (n2aVar.a(ra4Var, true) && (n2aVar.a & 2) == 2) {
            int iMin = Math.min(n2aVar.e, 8);
            yaf yafVar = new yaf(iMin);
            ra4Var.q(yafVar.a, 0, iMin, false);
            yafVar.H(0);
            if (yafVar.c() >= 5 && yafVar.v() == 127 && yafVar.w() == 1179402563) {
                this.b = new nm5(0);
            } else {
                yafVar.H(0);
                try {
                    zF = f8.F(1, yafVar, true);
                } catch (ParserException unused) {
                    zF = false;
                }
                if (zF) {
                    this.b = new arf(0);
                } else {
                    yafVar.H(0);
                    if (xma.g(yafVar, xma.o)) {
                        this.b = new xma(0);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ka5
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
            ((yaf) m2aVar.f).E(0);
            m2aVar.b = -1;
            m2aVar.d = false;
            if (j == 0) {
                a9eVar.f(!a9eVar.h);
                return;
            }
            if (a9eVar.e != 0) {
                long j3 = (a9eVar.f * j2) / 1000000;
                a9eVar.b = j3;
                o2a o2aVar = (o2a) a9eVar.m;
                int i = maf.a;
                o2aVar.i(j3);
                a9eVar.e = 2;
            }
        }
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.a = oa5Var;
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        try {
            return a((ra4) ma5Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r19, defpackage.lh4 r20) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j2a.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
