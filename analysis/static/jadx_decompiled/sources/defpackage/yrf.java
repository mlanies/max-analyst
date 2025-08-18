package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class yrf implements wrf, xrf {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public int d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public yrf(oa5 oa5Var, xze xzeVar, bsf bsfVar, String str, int i) throws ParserException {
        this.f = oa5Var;
        this.g = xzeVar;
        this.h = bsfVar;
        int i2 = bsfVar.d;
        int i3 = bsfVar.a;
        int i4 = (i2 * i3) / 8;
        int i5 = bsfVar.c;
        if (i5 != i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i5);
            throw ParserException.a(null, sb.toString());
        }
        int i6 = bsfVar.b;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.b = iMax;
        my5 my5Var = new my5();
        my5Var.k = str;
        my5Var.f = i8;
        my5Var.g = i8;
        my5Var.l = iMax;
        my5Var.x = i3;
        my5Var.y = i6;
        my5Var.z = i;
        this.i = new oy5(my5Var);
    }

    @Override // defpackage.wrf, defpackage.xrf
    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.c = j;
                this.d = 0;
                this.e = 0L;
                break;
            default:
                this.c = j;
                this.d = 0;
                this.e = 0L;
                break;
        }
    }

    @Override // defpackage.wrf, defpackage.xrf
    public final void b(int i, long j) {
        switch (this.a) {
            case 0:
                ((oa5) this.f).M(new csf((bsf) this.h, 1, i, j));
                ((xze) this.g).d((oy5) this.i);
                break;
            default:
                ((pa5) this.f).J(new dsf((bsf) this.h, 1, i, j));
                ((yze) this.g).e((qy5) this.i);
                break;
        }
    }

    @Override // defpackage.xrf
    public boolean c(sa4 sa4Var, long j) {
        int i;
        int i2;
        Object obj = this.g;
        long j2 = j;
        while (j2 > 0 && (i = this.d) < (i2 = this.b)) {
            int iC = ((yze) obj).c(sa4Var, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.d += iC;
                j2 -= iC;
            }
        }
        bsf bsfVar = (bsf) this.h;
        int i3 = bsfVar.c;
        int i4 = this.d / i3;
        if (i4 > 0) {
            long j3 = this.c;
            long j4 = this.e;
            long j5 = bsfVar.b;
            int i5 = oaf.a;
            long jA0 = j3 + oaf.a0(j4, 1000000L, j5, RoundingMode.FLOOR);
            int i6 = i4 * i3;
            int i7 = this.d - i6;
            ((yze) obj).a(jA0, 1, i6, i7, null);
            this.e += i4;
            this.d = i7;
        }
        return j2 <= 0;
    }

    @Override // defpackage.wrf
    public boolean d(ra4 ra4Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.d) < (i2 = this.b)) {
            int iA = ((xze) this.g).a(ra4Var, (int) Math.min(i2 - i, j2), true);
            if (iA == -1) {
                j2 = 0;
            } else {
                this.d += iA;
                j2 -= iA;
            }
        }
        int i3 = ((bsf) this.h).c;
        int i4 = this.d / i3;
        if (i4 > 0) {
            long J = this.c + maf.J(this.e, 1000000L, r1.b);
            int i5 = i4 * i3;
            int i6 = this.d - i5;
            ((xze) this.g).b(J, 1, i5, i6, null);
            this.e += i4;
            this.d = i6;
        }
        return j2 <= 0;
    }

    public yrf(pa5 pa5Var, yze yzeVar, bsf bsfVar, String str, int i) throws androidx.media3.common.ParserException {
        this.f = pa5Var;
        this.g = yzeVar;
        this.h = bsfVar;
        int i2 = bsfVar.d;
        int i3 = bsfVar.a;
        int i4 = (i2 * i3) / 8;
        int i5 = bsfVar.c;
        if (i5 == i4) {
            int i6 = bsfVar.b;
            int i7 = i6 * i4;
            int i8 = i7 * 8;
            int iMax = Math.max(i4, i7 / 10);
            this.b = iMax;
            ny5 ny5Var = new ny5();
            ny5Var.m = ia9.l(str);
            ny5Var.g = i8;
            ny5Var.h = i8;
            ny5Var.n = iMax;
            ny5Var.A = i3;
            ny5Var.B = i6;
            ny5Var.C = i;
            this.i = new qy5(ny5Var);
            return;
        }
        throw androidx.media3.common.ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
    }
}
