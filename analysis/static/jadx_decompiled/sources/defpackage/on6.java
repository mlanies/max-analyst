package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class on6 implements xze {
    public static final oy5 g;
    public static final oy5 h;
    public final wo a = new wo(1);
    public final xze b;
    public final oy5 c;
    public oy5 d;
    public byte[] e;
    public int f;

    static {
        my5 my5Var = new my5();
        my5Var.k = "application/id3";
        g = my5Var.a();
        my5 my5Var2 = new my5();
        my5Var2.k = "application/x-emsg";
        h = my5Var2.a();
    }

    public on6(xze xzeVar, int i) {
        this.b = xzeVar;
        if (i == 1) {
            this.c = g;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(z7b.h(33, i, "Unknown metadataType: "));
            }
            this.c = h;
        }
        this.e = new byte[0];
        this.f = 0;
    }

    @Override // defpackage.xze
    public final int a(l24 l24Var, int i, boolean z) throws EOFException {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = l24Var.read(this.e, this.f, i);
        if (i3 != -1) {
            this.f += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.xze
    public final void b(long j, int i, int i2, int i3, vze vzeVar) {
        this.d.getClass();
        int i4 = this.f - i3;
        yaf yafVar = new yaf(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.w0;
        oy5 oy5Var = this.c;
        if (!maf.a(str, oy5Var.w0)) {
            if (!"application/x-emsg".equals(this.d.w0)) {
                String strValueOf = String.valueOf(this.d.w0);
                if (strValueOf.length() != 0) {
                    "Ignoring sample for unsupported format: ".concat(strValueOf);
                    return;
                }
                return;
            }
            this.a.getClass();
            c45 c45VarU0 = wo.u0(yafVar);
            oy5 oy5VarK = c45VarU0.k();
            if (oy5VarK == null || !maf.a(oy5Var.w0, oy5VarK.w0)) {
                Objects.toString(c45VarU0.k());
                return;
            } else {
                byte[] bArrO = c45VarU0.o();
                bArrO.getClass();
                yafVar = new yaf(bArrO);
            }
        }
        int iC = yafVar.c();
        this.b.c(iC, yafVar);
        this.b.b(j, i, iC, i3, vzeVar);
    }

    @Override // defpackage.xze
    public final void c(int i, yaf yafVar) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        yafVar.g(this.f, this.e, i);
        this.f += i;
    }

    @Override // defpackage.xze
    public final void d(oy5 oy5Var) {
        this.d = oy5Var;
        this.b.d(this.c);
    }
}
