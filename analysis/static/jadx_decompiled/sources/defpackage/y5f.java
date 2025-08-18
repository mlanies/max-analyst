package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import scout.exception.IllegalOverridesException;
import scout.exception.ScopeInitializationException;

/* loaded from: classes2.dex */
public class y5f {
    public final String a;
    public final hx9 b = ema.c;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();

    public y5f(String str) {
        this.a = str;
    }

    public ruc a() {
        hx9 hx9Var = this.b;
        String str = this.a;
        if (hx9Var != null) {
            try {
                if (au1.b(2, 2) >= 0) {
                    hx9.j(hx9Var, "Start initialization of scope \"" + str + '\"');
                }
            } catch (Exception e) {
                throw new ScopeInitializationException(str, e);
            }
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            throw new IllegalOverridesException(str, arrayList);
        }
        ruc rucVar = new ruc(this.a, this.c, this.d, this.e, this.f, this.g);
        if (hx9Var != null) {
            if (au1.b(2, 2) >= 0) {
                hx9.j(hx9Var, "Finish initialization of \"" + str + '\"');
            }
        }
        return rucVar;
    }

    public /* bridge */ void b(Class cls, b37 b37Var) {
        c(cls, b37Var);
    }

    public void c(Class cls, b37 b37Var) {
        HashMap map = this.e;
        Object arrayList = map.get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(cls, arrayList);
        }
        ((List) arrayList).add(b37Var);
    }

    public /* bridge */ void d(Class cls, b37 b37Var) {
        e(cls, b37Var);
    }

    public void e(Class cls, b37 b37Var) {
        if (this.d.put(cls, b37Var) != null) {
            this.h.add(cls);
        }
    }
}
