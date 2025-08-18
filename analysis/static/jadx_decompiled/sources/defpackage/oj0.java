package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class oj0 implements eab {
    public static final kx6 x0;
    public static final Object y0;
    public final vv6 X;
    public final HashMap Y;
    public boolean Z;
    public final wv6 a;
    public final String b;
    public final hab c;
    public final Object o;
    public a9b s0;
    public boolean t0;
    public boolean u0;
    public final ArrayList v0;
    public final kv6 w0;

    static {
        String[] strArr = {"id", HasExtraData.KEY_URI_SOURCE};
        int i = kx6.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        x0 = new kx6(hashSet);
        y0 = new Object();
    }

    public oj0(wv6 wv6Var, String str, String str2, b47 b47Var, Object obj, vv6 vv6Var, boolean z, boolean z2, a9b a9bVar, kv6 kv6Var) {
        this.a = wv6Var;
        this.b = str;
        HashMap map = new HashMap();
        this.Y = map;
        map.put("id", str);
        map.put(HasExtraData.KEY_URI_SOURCE, wv6Var == null ? "null-request" : wv6Var.b);
        this.c = b47Var;
        this.o = obj == null ? y0 : obj;
        this.X = vv6Var;
        this.Z = z;
        this.s0 = a9bVar;
        this.t0 = z2;
        this.u0 = false;
        this.v0 = new ArrayList();
        this.w0 = kv6Var;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pj0) it.next()).b();
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pj0) it.next()).c();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pj0) it.next()).d();
        }
    }

    public final void a(pj0 pj0Var) {
        boolean z;
        synchronized (this) {
            this.v0.add(pj0Var);
            z = this.u0;
        }
        if (z) {
            pj0Var.a();
        }
    }

    public final void e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.u0) {
                arrayList = null;
            } else {
                this.u0 = true;
                arrayList = new ArrayList(this.v0);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pj0) it.next()).a();
        }
    }

    public final synchronized boolean f() {
        return this.t0;
    }

    public final synchronized boolean g() {
        return this.Z;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return this.Y.get(str);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.Y;
    }

    public final void h(String str, String str2) {
        HashMap map = this.Y;
        map.put(HasExtraData.KEY_ORIGIN, str);
        map.put(HasExtraData.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    public final synchronized ArrayList i(a9b a9bVar) {
        if (a9bVar == this.s0) {
            return null;
        }
        this.s0 = a9bVar;
        return new ArrayList(this.v0);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (x0.contains(str)) {
            return;
        }
        this.Y.put(str, obj);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            putExtra((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.Y.get(str);
        return obj2 == null ? obj : obj2;
    }
}
