package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class k8d extends d8d {
    public final boolean X;
    public final mg4 Y;
    public final String Z = k8d.class.getName();
    public final long b;
    public final List c;
    public final da3 o;

    public k8d(long j, List list, da3 da3Var, boolean z, mg4 mg4Var) {
        this.b = j;
        this.c = list;
        this.o = da3Var;
        this.X = z;
        this.Y = mg4Var;
    }

    @Override // defpackage.d8d
    public final void x() {
        String str;
        RuntimeException runtimeException;
        e52 e52VarC = g().C(this.b);
        if (e52VarC == null) {
            ((cba) j()).c(new HandledException("chat is null"), true);
            return;
        }
        if (this.c == null) {
            au8 au8VarO = o();
            long j = this.b;
            t19 t19VarD = ((k24) au8VarO.a).c.d();
            ilc ilcVar = t19VarD.a;
            ilcVar.b();
            p19 p19Var = t19VarD.t;
            q36 q36VarF = p19Var.f();
            q36VarF.j(1, j);
            q36VarF.j(2, 0L);
            q36VarF.j(3, 0L);
            try {
                ilcVar.c();
                try {
                    q36VarF.n();
                    ilcVar.r();
                    p19Var.t(q36VarF);
                    au8 au8VarO2 = o();
                    long j2 = this.b;
                    t19 t19VarD2 = ((k24) au8VarO2.a).c.d();
                    ilcVar = t19VarD2.a;
                    ilcVar.b();
                    p19 p19Var2 = t19VarD2.m;
                    q36 q36VarF2 = p19Var2.f();
                    t19VarD2.a().getClass();
                    q36VarF2.j(1, 10);
                    q36VarF2.j(2, j2);
                    q36VarF2.j(3, 0L);
                    q36VarF2.j(4, 0L);
                    try {
                        ilcVar.c();
                        try {
                            q36VarF2.n();
                            ilcVar.r();
                            p19Var2.t(q36VarF2);
                            if (this.Y == mg4.REGULAR) {
                                g().w(this.b);
                            }
                            pk pkVarA = a();
                            long j3 = this.b;
                            mg4 mg4Var = this.Y;
                            k4a k4aVar = (k4a) pkVarA;
                            if (k4aVar.o(j3)) {
                                k4a.w(k4aVar, new se9(((p7b) k4aVar.y()).a.o(), j3, 0L, 0L, mg4Var));
                            }
                            t().c(new re9(this.b, 0L, 0L, this.Y));
                            return;
                        } finally {
                        }
                    } catch (Throwable th) {
                        p19Var2.t(q36VarF2);
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                p19Var.t(q36VarF);
                throw th2;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            cu8 cu8VarQ = o().q(((Number) it.next()).longValue());
            if (cu8VarQ != null) {
                if (cu8VarQ.c == 0) {
                    arrayList2.add(cu8VarQ);
                    m().a(cu8VarQ);
                } else {
                    arrayList.add(cu8VarQ);
                }
            }
        }
        long j4 = e52VarC.b.a;
        boolean zIsEmpty = arrayList.isEmpty();
        vx8 vx8Var = vx8.DELETED;
        if (zIsEmpty) {
            str = ", messages.size() = ";
        } else {
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder("deleteServerMessages: chatId = ");
            long j5 = this.b;
            sb.append(j5);
            sb.append(", messages.size() = ");
            sb.append(size);
            hm9.n(this.Z, sb.toString());
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((cu8) it2.next()).b));
                } finally {
                }
            }
            ((k24) o().a).c.d().o(j5, arrayList3, vx8Var);
            pk pkVarA2 = a();
            ArrayList arrayList4 = new ArrayList(arrayList.size());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                try {
                    arrayList4.add(Long.valueOf(((cu8) it3.next()).c));
                } finally {
                }
            }
            str = ", messages.size() = ";
            ((k4a) pkVarA2).B(this.b, j4, arrayList3, arrayList4, this.o, this.X, this.Y);
            y(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            hm9.n(this.Z, "deleteLocalMessages: chatId = " + this.b + str + arrayList2.size());
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                cu8 cu8Var = (cu8) it4.next();
                e8d e8dVar = this.a;
                if (e8dVar == null) {
                    e8dVar = null;
                }
                jy8 jy8Var = (jy8) e8dVar.z.getValue();
                long j6 = cu8Var.b;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null) {
                    jy8Var.getClass();
                    if (ir6Var.c()) {
                        ir6Var.d(us7.X, "jy8", ey8.h(j6, "cancel: messageId="), null);
                    }
                }
                ((dg5) jy8Var.c.getValue()).a(j6);
            }
            au8 au8VarO3 = o();
            long j7 = this.b;
            ArrayList arrayList5 = new ArrayList(arrayList2.size());
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                try {
                    arrayList5.add(Long.valueOf(((cu8) it5.next()).b));
                } finally {
                }
            }
            ((k24) au8VarO3.a).c.d().o(j7, arrayList5, vx8Var);
            y(arrayList2);
        }
        if (this.c.contains(Long.valueOf(e52VarC.b.j))) {
            g().w(this.b);
        } else if (this.c.contains(Long.valueOf(e52VarC.b.x))) {
            g().v(this.b, null, 0L);
        }
        t().c(new re9(this.b, this.c, null));
    }

    public final void y(ArrayList arrayList) {
        e52 e52VarC;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cu8 cu8Var = (cu8) it.next();
            if (cu8Var != null && (e52VarC = g().C(cu8Var.t0)) != null) {
                e8d e8dVar = this.a;
                if (e8dVar == null) {
                    e8dVar = null;
                }
                sna snaVar = (sna) e8dVar.p.getValue();
                long j = e52VarC.b.a;
                snaVar.getClass();
                sna.b(j, cu8Var.b);
            }
        }
    }
}
