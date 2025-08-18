package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class p97 implements ka5 {
    public oa5 b;
    public int c;
    public int d;
    public int e;
    public uc9 g;
    public ma5 h;
    public g03 i;
    public vd9 j;
    public final yaf a = new yaf(6);
    public long f = -1;

    public final void a() {
        b(new c99[0]);
        oa5 oa5Var = this.b;
        oa5Var.getClass();
        oa5Var.w();
        this.b.M(new pm5(-9223372036854775807L));
        this.c = 6;
    }

    public final void b(c99... c99VarArr) {
        oa5 oa5Var = this.b;
        oa5Var.getClass();
        xze xzeVarB = oa5Var.B(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        my5 my5Var = new my5();
        my5Var.j = "image/jpeg";
        my5Var.i = new e99(c99VarArr);
        xzeVarB.d(new oy5(my5Var));
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            vd9 vd9Var = this.j;
            vd9Var.getClass();
            vd9Var.d(j, j2);
        }
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.b = oa5Var;
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        ra4 ra4Var = (ra4) ma5Var;
        yaf yafVar = this.a;
        yafVar.E(2);
        ra4Var.q(yafVar.a, 0, 2, false);
        if (yafVar.A() != 65496) {
            return false;
        }
        yafVar.E(2);
        ra4Var.q(yafVar.a, 0, 2, false);
        int iA = yafVar.A();
        this.d = iA;
        if (iA == 65504) {
            yafVar.E(2);
            ra4Var.q(yafVar.a, 0, 2, false);
            ra4Var.b(yafVar.A() - 2, false);
            yafVar.E(2);
            ra4Var.q(yafVar.a, 0, 2, false);
            this.d = yafVar.A();
        }
        if (this.d != 65505) {
            return false;
        }
        ra4Var.b(2, false);
        yafVar.E(6);
        ra4Var.q(yafVar.a, 0, 6, false);
        return yafVar.w() == 1165519206 && yafVar.A() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r26, defpackage.lh4 r27) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p97.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
        vd9 vd9Var = this.j;
        if (vd9Var != null) {
            vd9Var.getClass();
        }
    }
}
