package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class qi3 {
    public final ej3 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public Object d;
    public adb e;

    public qi3(ej3 ej3Var) {
        this.a = ej3Var;
    }

    public abstract boolean a(h8g h8gVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object obj : iterable) {
            if (a((h8g) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((h8g) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.n(this);
        } else {
            ej3 ej3Var = this.a;
            synchronized (ej3Var.c) {
                try {
                    if (((LinkedHashSet) ej3Var.X).add(this)) {
                        if (((LinkedHashSet) ej3Var.X).size() == 1) {
                            ej3Var.o = ej3Var.i();
                            a14.u().n(fj3.a, ej3Var.getClass().getSimpleName() + ": initial state = " + ej3Var.o);
                            ej3Var.r();
                        }
                        Object obj2 = ej3Var.o;
                        this.d = obj2;
                        d(this.e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(adb adbVar, Object obj) {
        if (this.b.isEmpty() || adbVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.b;
            synchronized (adbVar.c) {
                e7g e7gVar = (e7g) adbVar.a;
                if (e7gVar != null) {
                    e7gVar.a(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.b;
        synchronized (adbVar.c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (adbVar.b(((h8g) next).a)) {
                        arrayList3.add(next);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    h8g h8gVar = (h8g) it2.next();
                    a14.u().n(f7g.a, "Constraints met for " + h8gVar);
                }
                e7g e7gVar2 = (e7g) adbVar.a;
                if (e7gVar2 != null) {
                    e7gVar2.f(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
