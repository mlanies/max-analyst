package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class rh3 {
    public static final rh3 e;
    public static final rh3 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        u13 u13Var = u13.q;
        u13 u13Var2 = u13.r;
        u13 u13Var3 = u13.s;
        u13 u13Var4 = u13.k;
        u13 u13Var5 = u13.m;
        u13 u13Var6 = u13.l;
        u13 u13Var7 = u13.n;
        u13 u13Var8 = u13.p;
        u13 u13Var9 = u13.o;
        u13[] u13VarArr = {u13Var, u13Var2, u13Var3, u13Var4, u13Var5, u13Var6, u13Var7, u13Var8, u13Var9, u13.i, u13.j, u13.g, u13.h, u13.e, u13.f, u13.d};
        qh3 qh3Var = new qh3(0);
        qh3Var.b((u13[]) Arrays.copyOf(new u13[]{u13Var, u13Var2, u13Var3, u13Var4, u13Var5, u13Var6, u13Var7, u13Var8, u13Var9}, 9));
        awe aweVar = awe.TLS_1_3;
        awe aweVar2 = awe.TLS_1_2;
        qh3Var.e(aweVar, aweVar2);
        qh3Var.d();
        qh3Var.a();
        qh3 qh3Var2 = new qh3(0);
        qh3Var2.b((u13[]) Arrays.copyOf(u13VarArr, 16));
        qh3Var2.e(aweVar, aweVar2);
        qh3Var2.d();
        e = qh3Var2.a();
        qh3 qh3Var3 = new qh3(0);
        qh3Var3.b((u13[]) Arrays.copyOf(u13VarArr, 16));
        qh3Var3.e(aweVar, aweVar2, awe.TLS_1_1, awe.TLS_1_0);
        qh3Var3.d();
        qh3Var3.a();
        f = new rh3(false, false, null, null);
    }

    public rh3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(u13.t.i(str));
        }
        return x53.D0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !naf.i(strArr, sSLSocket.getEnabledProtocols(), rm9.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || naf.i(strArr2, sSLSocket.getEnabledCipherSuites(), u13.b);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(z04.w(str));
        }
        return x53.D0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rh3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        rh3 rh3Var = (rh3) obj;
        boolean z = rh3Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, rh3Var.c) && Arrays.equals(this.d, rh3Var.d) && this.b == rh3Var.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
