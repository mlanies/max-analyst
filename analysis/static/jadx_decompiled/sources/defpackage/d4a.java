package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d4a {
    public String a;
    public int b;
    public String c;
    public int d;
    public long e;
    public String f;
    public boolean g;
    public ArrayList h;
    public ArrayList i;

    public final e4a a() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        int i2 = this.d;
        long j = this.e;
        String str3 = this.g ? this.f : null;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = this.h;
        if (listEmptyList3 == null) {
            listEmptyList3 = Collections.emptyList();
        }
        List list = listEmptyList3;
        List listEmptyList4 = this.i;
        if (listEmptyList4 == null) {
            listEmptyList4 = Collections.emptyList();
        }
        List list2 = listEmptyList4;
        b();
        if (str == null) {
            throw new IllegalStateException("Collector not set");
        }
        if (str2 != null) {
            return new e4a(str, i, str2, i2, j, str3, listEmptyList, listEmptyList2, list, list2);
        }
        throw new IllegalStateException("Operation not set");
    }

    public final void b() {
        this.a = null;
        this.b = -1;
        this.c = null;
        this.d = 1;
        this.e = 0L;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = null;
    }

    public final void c(String str, String str2) {
        int iIndexOf;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.i;
        if (str2 == null) {
            if (arrayList == null || (iIndexOf = arrayList.indexOf(str)) < 0) {
                return;
            }
            arrayList.remove(iIndexOf);
            arrayList2.remove(iIndexOf);
            return;
        }
        if (arrayList != null) {
            int iIndexOf2 = arrayList.indexOf(str);
            if (iIndexOf2 >= 0) {
                arrayList2.set(iIndexOf2, str2);
                return;
            } else {
                arrayList.add(str);
                arrayList2.add(str2);
                return;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.add(str);
        arrayList4.add(str2);
        this.h = arrayList3;
        this.i = arrayList4;
    }

    public final void d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "Illegal time "));
        }
        this.e = j;
    }
}
