package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class jxc {
    public static final jxc c;
    public final wk a;
    public final eqd b;

    static {
        jxc jxcVar = new jxc(eqd.d, wk.f);
        c = jxcVar;
        jxcVar.d(Uri.parse("https://api.odnoklassniki.ru"));
    }

    public jxc(eqd eqdVar, wk wkVar) {
        this.b = eqdVar;
        this.a = wkVar;
    }

    public final Uri a() {
        eqd eqdVar = this.b;
        int iBinarySearch = Arrays.binarySearch(eqdVar.a, "api");
        return (Uri) (iBinarySearch < 0 ? null : eqdVar.b[iBinarySearch]);
    }

    public final jxc b(String str) {
        wk wkVar = this.a;
        if (Objects.equals(str, wkVar.a)) {
            return this;
        }
        String str2 = wkVar.d;
        if (str2 != null) {
            throw new IllegalStateException("Some session key");
        }
        if (wkVar.c != null) {
            throw new IllegalStateException("Some auth token");
        }
        if (!str.equals(wkVar.a)) {
            wkVar = new wk(str, str2, wkVar.e);
        }
        return new jxc(this.b, wkVar);
    }

    public final jxc c(String str, String str2) {
        wk wkVar = this.a;
        boolean zEquals = Objects.equals(str, wkVar.d);
        String str3 = wkVar.e;
        if (zEquals && Objects.equals(str2, str3)) {
            return this;
        }
        String str4 = wkVar.a;
        if (str4 == null) {
            throw new IllegalStateException("No app key");
        }
        if (!str.equals(wkVar.d) || !str2.equals(str3)) {
            wkVar = new wk(str4, str, str2);
        }
        return new jxc(this.b, wkVar);
    }

    public final jxc d(Uri uri) {
        eqd eqdVar;
        eqd eqdVar2 = this.b;
        Comparable[] comparableArr = eqdVar2.a;
        int iBinarySearch = Arrays.binarySearch(comparableArr, "api");
        Object[] objArr = eqdVar2.b;
        if (iBinarySearch < 0) {
            int i = -iBinarySearch;
            int i2 = i - 1;
            Class<?> componentType = comparableArr.getClass().getComponentType();
            int i3 = eqdVar2.c + 1;
            Comparable[] comparableArr2 = (Comparable[]) Array.newInstance(componentType, i3);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
            System.arraycopy(comparableArr, 0, comparableArr2, 0, i2);
            comparableArr2[i2] = "api";
            System.arraycopy(comparableArr, i2, comparableArr2, i, comparableArr.length - i2);
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            objArr2[i2] = uri;
            System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
            eqdVar = new eqd(comparableArr2, objArr2);
        } else if (Objects.equals(objArr[iBinarySearch], uri)) {
            eqdVar = eqdVar2;
        } else {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iBinarySearch] = uri;
            eqdVar = new eqd(comparableArr, objArrCopyOf);
        }
        return eqdVar == eqdVar2 ? this : new jxc(eqdVar, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jxc.class != obj.getClass()) {
            return false;
        }
        jxc jxcVar = (jxc) obj;
        return this.a.equals(jxcVar.a) && this.b.equals(jxcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkApiConfig{apiConfig=" + this.a + ", uris=" + this.b + '}';
    }
}
