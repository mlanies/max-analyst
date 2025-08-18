package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class uj4 {
    public static final l7d f;
    public final a4c a;
    public final rsa b;
    public List c = Collections.emptyList();
    public Map d = Collections.emptyMap();
    public boolean e = false;

    static {
        l7d l7dVar = new l7d();
        f = l7dVar;
        l7dVar.a = true;
    }

    public uj4(a4c a4cVar, d5f d5fVar) {
        this.a = a4cVar;
        this.b = d5fVar;
    }

    public final void a(List list) {
        List<u41> listEmptyList = this.e ? Collections.emptyList() : this.c;
        HashMap map = new HashMap();
        for (u41 u41Var : listEmptyList) {
            map.put(u41Var.a, u41Var);
        }
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u41 u41Var2 = (u41) it.next();
            map2.put(u41Var2.a, u41Var2);
        }
        ArrayList arrayList = new ArrayList();
        for (fp1 fp1Var : map2.keySet()) {
            u41 u41Var3 = (u41) map.get(fp1Var);
            u41 u41Var4 = (u41) map2.get(fp1Var);
            if (u41Var4 != null && (u41Var3 == null || !u41Var3.b.equals(u41Var4.b))) {
                fp1 fp1Var2 = u41Var4.a;
                bff bffVar = u41Var4.b;
                l7d l7dVar = new l7d();
                l7dVar.d = bffVar.c != 1 ? 2 : 1;
                l7dVar.b = bffVar.a;
                l7dVar.c = bffVar.b;
                l7dVar.a = false;
                arrayList.add(new m7d(fp1Var2, l7dVar));
            }
        }
        for (fp1 fp1Var3 : map.keySet()) {
            u41 u41Var5 = (u41) map.get(fp1Var3);
            if (u41Var5 != null && !map2.containsKey(fp1Var3)) {
                arrayList.add(new m7d(u41Var5.a, f));
            }
        }
        boolean z = this.e;
        if (!arrayList.isEmpty()) {
            d6f d6fVar = new d6f(arrayList, z);
            koc kocVarB = ((d5f) this.b).B0.B();
            tj4 tj4Var = new tj4(this, 0);
            tj4 tj4Var2 = new tj4(this, 1);
            ioc iocVar = new ioc(d6fVar);
            iocVar.c = tj4Var;
            iocVar.d = tj4Var2;
            kocVarB.d(new ioc(iocVar));
        }
        this.c = list;
        HashMap map3 = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            u41 u41Var6 = (u41) it2.next();
            bg1 bg1Var = u41Var6.a.b;
            Set hashSet = (Set) map3.get(bg1Var);
            if (hashSet == null) {
                hashSet = new HashSet();
                map3.put(bg1Var, hashSet);
            }
            hashSet.add(u41Var6.a);
        }
        this.d = map3;
        this.e = false;
    }
}
