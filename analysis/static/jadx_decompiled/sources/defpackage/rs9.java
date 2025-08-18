package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class rs9 {
    public final av0 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;

    public rs9(av0 av0Var, rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3) {
        this.a = av0Var;
        this.b = rm4Var;
        this.c = rm4Var2;
        this.d = rm4Var3;
    }

    public static void a(e52 e52Var, cea ceaVar) {
        k92 k92Var = e52Var.b;
        int i = k92Var.m;
        long j = k92Var.a;
        if (i > 0) {
            ceaVar.f(j);
        } else {
            ceaVar.a(j);
        }
    }

    public final void b(e52 e52Var, Collection collection, mg4 mg4Var) {
        RuntimeException runtimeException;
        hm9.m("rs9", "onNotifMsgDelete, %s", mg4Var.name());
        if (e52Var == null) {
            return;
        }
        boolean zA = mg4Var.a();
        av0 av0Var = this.a;
        rm4 rm4Var = this.c;
        long j = e52Var.a;
        if (zA) {
            ArrayList arrayListK = ((au8) rm4Var.get()).k(j, collection);
            ArrayList arrayList = new ArrayList(arrayListK.size());
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(Long.valueOf(((cu8) it.next()).b));
                } finally {
                }
            }
            au8 au8Var = (au8) rm4Var.get();
            ((k24) au8Var.a).c.d().o(j, arrayList, vx8.DELETED);
            av0Var.c(new re9(j, arrayList, mg4Var));
            return;
        }
        ArrayList arrayListK2 = ((au8) rm4Var.get()).k(j, collection);
        ArrayList arrayList2 = new ArrayList(arrayListK2.size());
        Iterator it2 = arrayListK2.iterator();
        while (it2.hasNext()) {
            try {
                arrayList2.add(Long.valueOf(((cu8) it2.next()).b));
            } finally {
            }
        }
        ((au8) rm4Var.get()).c(j, arrayList2);
        if (mg4Var.b()) {
            ((p82) this.b.get()).w(j);
        }
        av0Var.c(new re9(j, arrayList2, mg4Var));
        if (mg4Var.b()) {
            a(e52Var, (cea) this.d.get());
        }
    }
}
