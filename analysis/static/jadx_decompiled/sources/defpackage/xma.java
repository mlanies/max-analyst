package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xma extends a9e {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean g(yaf yafVar, byte[] bArr) {
        if (yafVar.c() < bArr.length) {
            return false;
        }
        int i = yafVar.b;
        byte[] bArr2 = new byte[bArr.length];
        yafVar.g(0, bArr2, bArr.length);
        yafVar.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.a9e
    public final long c(yaf yafVar) {
        int i;
        byte[] bArr = yafVar.a;
        byte b = bArr[0];
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return (this.f * (i * (i4 >= 16 ? 2500 << r0 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // defpackage.a9e
    public final boolean e(yaf yafVar, long j, l7b l7bVar) {
        if (g(yafVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(yafVar.a, yafVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListJ = s5c.j(bArrCopyOf);
            np8.f(((oy5) l7bVar.b) == null);
            my5 my5Var = new my5();
            my5Var.k = "audio/opus";
            my5Var.x = i;
            my5Var.y = 48000;
            my5Var.m = arrayListJ;
            l7bVar.b = new oy5(my5Var);
            return true;
        }
        if (!g(yafVar, p)) {
            np8.g((oy5) l7bVar.b);
            return false;
        }
        np8.g((oy5) l7bVar.b);
        yafVar.I(8);
        e99 e99VarV = f8.v(zw6.k((String[]) f8.y(yafVar, false, false).a));
        if (e99VarV == null) {
            return true;
        }
        my5 my5VarA = ((oy5) l7bVar.b).a();
        e99 e99Var = ((oy5) l7bVar.b).u0;
        if (e99Var != null) {
            c99[] c99VarArr = e99Var.a;
            if (c99VarArr.length != 0) {
                int i2 = maf.a;
                c99[] c99VarArr2 = e99VarV.a;
                Object[] objArrCopyOf = Arrays.copyOf(c99VarArr2, c99VarArr2.length + c99VarArr.length);
                System.arraycopy(c99VarArr, 0, objArrCopyOf, c99VarArr2.length, c99VarArr.length);
                e99VarV = new e99((c99[]) objArrCopyOf);
            }
        }
        my5VarA.i = e99VarV;
        l7bVar.b = new oy5(my5VarA);
        return true;
    }
}
