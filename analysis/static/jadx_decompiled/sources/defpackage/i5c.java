package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class i5c implements ka5 {
    public final oy5 a;
    public xze c;
    public int e;
    public long f;
    public int g;
    public int h;
    public final yaf b = new yaf(9);
    public int d = 0;

    public i5c(oy5 oy5Var) {
        this.a = oy5Var;
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.d = 0;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        oa5Var.M(new pm5(-9223372036854775807L));
        xze xzeVarB = oa5Var.B(0, 3);
        this.c = xzeVarB;
        xzeVarB.d(this.a);
        oa5Var.w();
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        yaf yafVar = this.b;
        yafVar.E(8);
        ((ra4) ma5Var).q(yafVar.a, 0, 8, false);
        return yafVar.h() == 1380139777;
    }

    @Override // defpackage.ka5
    public final int i(ma5 ma5Var, lh4 lh4Var) throws IOException {
        np8.g(this.c);
        while (true) {
            int i = this.d;
            yaf yafVar = this.b;
            if (i == 0) {
                yafVar.E(8);
                if (!((ra4) ma5Var).h(yafVar.a, 0, 8, true)) {
                    return -1;
                }
                if (yafVar.h() != 1380139777) {
                    throw new IOException("Input not RawCC");
                }
                this.e = yafVar.v();
                this.d = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    while (this.g > 0) {
                        yafVar.E(3);
                        ((ra4) ma5Var).h(yafVar.a, 0, 3, false);
                        this.c.c(3, yafVar);
                        this.h += 3;
                        this.g--;
                    }
                    int i2 = this.h;
                    if (i2 > 0) {
                        this.c.b(this.f, 1, i2, 0, null);
                    }
                    this.d = 1;
                    return 0;
                }
                int i3 = this.e;
                if (i3 == 0) {
                    yafVar.E(5);
                    if (!((ra4) ma5Var).h(yafVar.a, 0, 5, true)) {
                        break;
                    }
                    this.f = (yafVar.w() * 1000) / 45;
                    this.g = yafVar.v();
                    this.h = 0;
                    this.d = 2;
                } else {
                    if (i3 != 1) {
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unsupported version number: ");
                        sb.append(i3);
                        throw ParserException.a(null, sb.toString());
                    }
                    yafVar.E(9);
                    if (!((ra4) ma5Var).h(yafVar.a, 0, 9, true)) {
                        break;
                    }
                    this.f = yafVar.p();
                    this.g = yafVar.v();
                    this.h = 0;
                    this.d = 2;
                }
            }
        }
        this.d = 0;
        return -1;
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
