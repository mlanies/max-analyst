package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yma extends a9e {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean g(wpa wpaVar, byte[] bArr) {
        if (wpaVar.a() < bArr.length) {
            return false;
        }
        int i = wpaVar.b;
        byte[] bArr2 = new byte[bArr.length];
        wpaVar.e(0, bArr2, bArr.length);
        wpaVar.G(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.a9e
    public final long b(wpa wpaVar) {
        byte[] bArr = wpaVar.a;
        return (this.f * wmd.q(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.a9e
    public final boolean d(wpa wpaVar, long j, djb djbVar) {
        if (g(wpaVar, p)) {
            byte[] bArrCopyOf = Arrays.copyOf(wpaVar.a, wpaVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListD = wmd.d(bArrCopyOf);
            if (((qy5) djbVar.b) != null) {
                return true;
            }
            ny5 ny5Var = new ny5();
            ny5Var.m = ia9.l("audio/opus");
            ny5Var.A = i;
            ny5Var.B = 48000;
            ny5Var.p = arrayListD;
            djbVar.b = new qy5(ny5Var);
            return true;
        }
        if (!g(wpaVar, q)) {
            fm9.l((qy5) djbVar.b);
            return false;
        }
        fm9.l((qy5) djbVar.b);
        if (this.o) {
            return true;
        }
        this.o = true;
        wpaVar.H(8);
        f99 f99VarB = m6d.B(zw6.k((String[]) m6d.J(wpaVar, false, false).a));
        if (f99VarB == null) {
            return true;
        }
        ny5 ny5VarA = ((qy5) djbVar.b).a();
        ny5VarA.j = f99VarB.b(((qy5) djbVar.b).k);
        djbVar.b = new qy5(ny5VarA);
        return true;
    }

    @Override // defpackage.a9e
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = false;
        }
    }
}
