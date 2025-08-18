package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ef4 {
    public final String a;
    public final wd6 b;

    public ef4(Set set, wd6 wd6Var) {
        this.a = b(set);
        this.b = wd6Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            va0 va0Var = (va0) it.next();
            sb.append(va0Var.a);
            sb.append('/');
            sb.append(va0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        wd6 wd6Var = this.b;
        synchronized (((HashSet) wd6Var.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) wd6Var.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) wd6Var.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) wd6Var.b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
