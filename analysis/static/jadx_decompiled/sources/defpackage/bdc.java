package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class bdc implements kdf {
    public final sqb b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [pl8] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kad] */
    public bdc(int i, yw1 yw1Var) {
        c54.j("Not a supported video capabilities source: " + i, i == 0 || i == 1);
        e15 e15VarO = yw1Var.o();
        bj6 bj6Var = xi4.a;
        djb djbVar = new djb(yw1Var, e15VarO, bj6Var);
        if (i == 1) {
            mb0 mb0Var = mb0.d;
            djbVar = new kad(djbVar, new ArrayList(mb0.l), Collections.singleton(eu4.d), yw1Var.q(34));
        }
        adb adbVar = new adb();
        adbVar.c = new HashMap();
        adbVar.a = djbVar;
        adbVar.b = bj6Var;
        Iterator it = yw1Var.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            eu4 eu4Var = (eu4) it.next();
            if (Integer.valueOf(eu4Var.a).equals(3) && eu4Var.b == 10) {
                adbVar = new pl8(adbVar);
                break;
            }
        }
        this.b = new sqb(yw1Var, adbVar, bj6Var);
        for (eu4 eu4Var2 : yw1Var.a()) {
            fz1 fz1Var = new fz1(new pl8(this.b, eu4Var2));
            if (!new ArrayList(fz1Var.a.keySet()).isEmpty()) {
                this.c.put(eu4Var2, fz1Var);
            }
        }
        yw1Var.c();
    }

    @Override // defpackage.kdf
    public final nc0 a(Size size, eu4 eu4Var) {
        fz1 fz1VarD = d(eu4Var);
        if (fz1VarD == null) {
            return null;
        }
        return fz1VarD.a(size);
    }

    @Override // defpackage.kdf
    public final nc0 b(mb0 mb0Var, eu4 eu4Var) {
        fz1 fz1VarD = d(eu4Var);
        if (fz1VarD == null) {
            return null;
        }
        return fz1VarD.b(mb0Var);
    }

    @Override // defpackage.kdf
    public final ArrayList c(eu4 eu4Var) {
        fz1 fz1VarD = d(eu4Var);
        return fz1VarD == null ? new ArrayList() : new ArrayList(fz1VarD.a.keySet());
    }

    public final fz1 d(eu4 eu4Var) {
        Object next;
        boolean zContains;
        boolean zB = eu4Var.b();
        HashMap map = this.c;
        if (zB) {
            return (fz1) map.get(eu4Var);
        }
        HashMap map2 = this.d;
        if (map2.containsKey(eu4Var)) {
            return (fz1) map2.get(eu4Var);
        }
        Set setKeySet = map.keySet();
        if (eu4Var.b()) {
            zContains = setKeySet.contains(eu4Var);
        } else {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                eu4 eu4Var2 = (eu4) next;
                c54.p("Fully specified range is not actually fully specified.", eu4Var2.b());
                int i = eu4Var.b;
                if (i == 0 || i == eu4Var2.b) {
                    c54.p("Fully specified range is not actually fully specified.", eu4Var2.b());
                    int i2 = eu4Var.a;
                    if (i2 != 0) {
                        int i3 = eu4Var2.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            zContains = next != null;
        }
        fz1 fz1Var = zContains ? new fz1(new pl8(this.b, eu4Var)) : null;
        map2.put(eu4Var, fz1Var);
        return fz1Var;
    }
}
