package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bj6 {
    public final ArrayList a;

    public bj6(List list) {
        this.a = new ArrayList(list);
    }

    public static void i(bj6 bj6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bj6Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((vrb) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public void a(String str, String str2) {
        ngg.l(str);
        ngg.n(str2, str);
        b(str, str2);
    }

    public void b(String str, String str2) {
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(w9e.b1(str2).toString());
    }

    public cj6 c() {
        Object[] array = this.a.toArray(new String[0]);
        if (array != null) {
            return new cj6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean d(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((vrb) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public vrb e(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vrb vrbVar = (vrb) it.next();
            if (vrbVar.getClass() == cls) {
                return vrbVar;
            }
        }
        return null;
    }

    public ArrayList f(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            vrb vrbVar = (vrb) it.next();
            if (cls.isAssignableFrom(vrbVar.getClass())) {
                arrayList.add(vrbVar);
            }
        }
        return arrayList;
    }

    public void g(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void h(String str, String str2) {
        ngg.l(str);
        ngg.n(str2, str);
        g(str);
        b(str, str2);
    }

    public bj6() {
        this.a = new ArrayList(20);
    }
}
