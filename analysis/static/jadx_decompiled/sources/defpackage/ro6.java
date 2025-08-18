package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ro6 {
    public boolean b;
    public int f;
    public int g;
    public final bt0 i;
    public final boolean h = true;
    public int a = Integer.MAX_VALUE;
    public int c = 4096;
    public vi6[] d = new vi6[8];
    public int e = 7;

    public ro6(bt0 bt0Var) {
        this.i = bt0Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.d[length].a;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
                length--;
            }
            vi6[] vi6VarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(vi6VarArr, i5, vi6VarArr, i5 + i3, this.f);
            vi6[] vi6VarArr2 = this.d;
            int i6 = this.e + 1;
            Arrays.fill(vi6VarArr2, i6, i6 + i3, (Object) null);
            this.e += i3;
        }
    }

    public final void b(vi6 vi6Var) {
        int i = this.c;
        int i2 = vi6Var.a;
        if (i2 > i) {
            ys.c0(this.d, null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i2) - i);
        int i3 = this.f + 1;
        vi6[] vi6VarArr = this.d;
        if (i3 > vi6VarArr.length) {
            vi6[] vi6VarArr2 = new vi6[vi6VarArr.length * 2];
            System.arraycopy(vi6VarArr, 0, vi6VarArr2, vi6VarArr.length, vi6VarArr.length);
            this.e = this.d.length - 1;
            this.d = vi6VarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = vi6Var;
        this.f++;
        this.g += i2;
    }

    public final void c(aw0 aw0Var) throws EOFException {
        boolean z = this.h;
        bt0 bt0Var = this.i;
        if (z) {
            int[] iArr = cr6.a;
            int iC = aw0Var.c();
            long j = 0;
            for (int i = 0; i < iC; i++) {
                byte bF = aw0Var.f(i);
                byte[] bArr = naf.a;
                j += cr6.b[bF & 255];
            }
            if (((int) ((j + 7) >> 3)) < aw0Var.c()) {
                bt0 bt0Var2 = new bt0();
                int[] iArr2 = cr6.a;
                int iC2 = aw0Var.c();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < iC2; i3++) {
                    byte bF2 = aw0Var.f(i3);
                    byte[] bArr2 = naf.a;
                    int i4 = bF2 & 255;
                    int i5 = cr6.a[i4];
                    byte b = cr6.b[i4];
                    j2 = (j2 << b) | i5;
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        bt0Var2.u0((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    bt0Var2.u0((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                aw0 aw0VarE = bt0Var2.e(bt0Var2.b);
                e(aw0VarE.c(), 127, 128);
                bt0Var.getClass();
                aw0VarE.k(bt0Var, aw0VarE.c());
                return;
            }
        }
        e(aw0Var.c(), 127, 0);
        bt0Var.getClass();
        aw0Var.k(bt0Var, aw0Var.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro6.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i2, int i3) {
        bt0 bt0Var = this.i;
        if (i < i2) {
            bt0Var.u0(i | i3);
            return;
        }
        bt0Var.u0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            bt0Var.u0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        bt0Var.u0(i4);
    }
}
