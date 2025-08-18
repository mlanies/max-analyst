package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qh3 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Serializable e;

    public qh3(String str, String str2, boolean z, boolean z2) {
        this.a = 1;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public rh3 a() {
        return new rh3(this.b, this.c, (String[]) this.d, (String[]) this.e);
    }

    public void b(u13... u13VarArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(u13VarArr.length);
        for (u13 u13Var : u13VarArr) {
            arrayList.add(u13Var.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.d = (String[]) objClone;
    }

    public void d() {
        if (!this.b) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.c = true;
    }

    public void e(awe... aweVarArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(aweVarArr.length);
        for (awe aweVar : aweVarArr) {
            arrayList.add(aweVar.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
    public void f(String... strArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.e = (String[]) objClone;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sbM = au1.m("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                sbM.append((String) this.d);
                sbM.append(", name=");
                return rh4.m(sbM, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public qh3(int i) {
        this.a = i;
        switch (i) {
            case 2:
                break;
            default:
                this.b = true;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.String[]] */
    public qh3(rh3 rh3Var) {
        this.a = 0;
        this.b = rh3Var.a;
        this.d = rh3Var.c;
        this.e = rh3Var.d;
        this.c = rh3Var.b;
    }
}
