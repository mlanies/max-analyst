package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ps1 {
    public static final je7 a = tu0.r(3, new dk1(21));

    public static final boolean a(znc zncVar) {
        Object next;
        Object next2;
        je7 je7Var = a;
        Iterator it = ((List) je7Var.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (zncVar.g((String) next) != null) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            Iterator it2 = zncVar.e().iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                coc cocVar = (coc) next2;
                List<String> list = (List) je7Var.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str2 : list) {
                        String str3 = cocVar.b;
                        if (str3 != null && w9e.p0(str3, str2, false)) {
                            break loop1;
                        }
                    }
                }
            }
            coc cocVar2 = (coc) next2;
            str = cocVar2 != null ? cocVar2.b : null;
        }
        if (str != null) {
            zncVar.D(str);
        }
        return str != null;
    }
}
