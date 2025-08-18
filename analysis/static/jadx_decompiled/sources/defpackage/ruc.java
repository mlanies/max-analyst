package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import scout.exception.ElementCreationFailedException;
import scout.exception.MissingObjectFactoryException;
import scout.exception.ObjectCreationFailedException;
import scout.exception.ObjectNullabilityException;

/* loaded from: classes2.dex */
public final class ruc {
    public final String a;
    public final List b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Set f;
    public final v4 g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    public final int l;

    public ruc(String str, List list, Map map, Map map2, Map map3, Set set) {
        List listUnmodifiableList;
        this.a = str;
        this.b = list;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = set;
        this.g = hm9.n ? new gk4(this, 0) : new gk4(this, 1);
        boolean zIsEmpty = list.isEmpty();
        List listUnmodifiableList2 = nz4.a;
        if (zIsEmpty) {
            listUnmodifiableList = listUnmodifiableList2;
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (int iL = y53.L(list); iL >= 0; iL--) {
                ruc rucVar = (ruc) list.get(iL);
                if (hashSet.add(rucVar)) {
                    arrayList.add(rucVar);
                }
                for (ruc rucVar2 : rucVar.h) {
                    if (hashSet.add(rucVar2)) {
                        arrayList.add(rucVar2);
                    }
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.h = listUnmodifiableList;
        List<ruc> list2 = this.b;
        if (!list2.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (ruc rucVar3 : list2) {
                for (ruc rucVar4 : rucVar3.i) {
                    if (hashSet2.add(rucVar4)) {
                        arrayList2.add(rucVar4);
                    }
                }
                if (hashSet2.add(rucVar3)) {
                    arrayList2.add(rucVar3);
                }
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        this.i = listUnmodifiableList2;
        List list3 = this.h;
        this.j = list3;
        this.k = listUnmodifiableList2;
        this.l = list3.size();
    }

    public static final void b(StringBuilder sb, ruc rucVar, int i) {
        sb.append('\n');
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("   ");
        }
        sb.append("⌞ " + rucVar + " (object factories: " + rucVar.c.size() + ", collection factories: " + rucVar.d.size() + ", association factories: " + rucVar.e.size() + ", allowed object overrides: " + rucVar.f.size() + ')');
        Iterator it = rucVar.j.iterator();
        while (it.hasNext()) {
            b(sb, (ruc) it.next(), i2);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTree of scopes:");
        b(sb, this, 0);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public final ArrayList c(Class cls) {
        nz4 nz4Var;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = this.l;
            nz4Var = nz4.a;
            if (i >= i2) {
                break;
            }
            ruc rucVar = (ruc) this.k.get(i);
            ?? r5 = (List) rucVar.d.get(cls);
            if (r5 != 0) {
                nz4Var = r5;
            }
            int size = nz4Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    arrayList.add(((b37) nz4Var.get(i3)).a(rucVar.g));
                } catch (Exception e) {
                    throw new ElementCreationFailedException(cls, this, e);
                }
            }
            i++;
        }
        ?? r2 = (List) this.d.get(cls);
        if (r2 != 0) {
            nz4Var = r2;
        }
        int size2 = nz4Var.size();
        for (int i4 = 0; i4 < size2; i4++) {
            try {
                arrayList.add(((b37) nz4Var.get(i4)).a(this.g));
            } catch (Exception e2) {
                throw new ElementCreationFailedException(cls, this, e2);
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    public final Object d(Class cls, boolean z) {
        b37 b37Var = (b37) this.c.get(cls);
        if (b37Var != null) {
            try {
                Object objA = b37Var.a(this.g);
                if (objA == null && z) {
                    throw new ObjectNullabilityException(cls, this);
                }
                return objA;
            } catch (Exception e) {
                throw new ObjectCreationFailedException(cls, this, e);
            }
        }
        for (int i = 0; i < this.l; i++) {
            ruc rucVar = (ruc) this.j.get(i);
            b37 b37Var2 = (b37) rucVar.c.get(cls);
            if (b37Var2 != null) {
                try {
                    Object objA2 = b37Var2.a(rucVar.g);
                    if (objA2 == null && z) {
                        throw new ObjectNullabilityException(cls, this);
                    }
                    return objA2;
                } catch (Exception e2) {
                    throw new ObjectCreationFailedException(cls, this, e2);
                }
            }
        }
        if (z) {
            throw new MissingObjectFactoryException(cls, this);
        }
        return null;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Scope(name=\""), this.a, "\")");
    }
}
