package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class th0 extends ol implements lme, hua {
    public final int o;

    public th0(long j, int i) {
        super(j);
        this.o = i;
    }

    @Override // defpackage.hua
    public final int c() {
        b46 b46Var;
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        eoe eoeVarE = plVar.e();
        List listM = y53.M(iua.S0, iua.U0, iua.V0, iua.T0);
        jmc jmcVar = ((k24) ((c34) eoeVarE.a.get())).f;
        hoe hoeVarB = jmcVar.b();
        hoeVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = listM.size();
        a14.c(sb, size);
        sb.append(")");
        xlc xlcVarA = xlc.a(size, sb.toString());
        Iterator it = listM.iterator();
        int i = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            b46Var = hoeVarB.c;
            if (!zHasNext) {
                break;
            }
            iua iuaVar = (iua) it.next();
            b46Var.getClass();
            xlcVarA.j(i, iuaVar.a);
            i++;
        }
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "type");
            int iN3 = tfg.n(cursorO, "status");
            int iN4 = tfg.n(cursorO, "fails_count");
            int iN5 = tfg.n(cursorO, "depends_request_id");
            int iN6 = tfg.n(cursorO, "dependency_type");
            int iN7 = tfg.n(cursorO, "data");
            int iN8 = tfg.n(cursorO, "created_time");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                long j = cursorO.getLong(iN);
                int i2 = cursorO.getInt(iN2);
                b46Var.getClass();
                arrayList.add(new vne(j, b46.t(i2), b46.r(cursorO.getInt(iN3)), cursorO.getInt(iN4), cursorO.getLong(iN5), cursorO.getInt(iN6), cursorO.isNull(iN7) ? null : cursorO.getBlob(iN7), cursorO.getLong(iN8)));
            }
            cursorO.close();
            xlcVarA.n();
            List listC = jmcVar.c(arrayList);
            Iterator it2 = listC.iterator();
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                long j2 = this.a;
                if (!zHasNext2) {
                    return ((une) listC.get(0)).a != j2 ? 2 : 1;
                }
                une uneVar = (une) it2.next();
                if (uneVar.a == j2 && (uneVar.f instanceof hu)) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    @Override // defpackage.hua
    public final void d() {
        int i = this.o;
        int iS = au1.s(i);
        if (iS == 3) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            ((md5) plVar.p.getValue()).c();
        } else if (iS != 4) {
            hm9.m0(getClass().getName(), "unsuspporeted type ".concat(au1.t(i)), new Object[0]);
        } else {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            ((sc5) plVar2.q.getValue()).f();
        }
        pl plVar3 = this.c;
        (plVar3 != null ? plVar3 : null).e().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        if (plVar.e().b(y53.M(iua.S0, iua.U0, iua.V0, iua.T0)) > 1) {
            pl plVar2 = this.c;
            r9d.y((s8g) (plVar2 != null ? plVar2 : null).g.getValue());
        }
        u(gleVar);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (f46.U(pkeVar.b)) {
            return;
        }
        d();
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final int h() {
        return 10;
    }

    public abstract void u(gle gleVar);

    public final void v(long j) {
        int i = this.o;
        if (i == 4) {
            pl plVar = this.c;
            ((md5) (plVar != null ? plVar : null).p.getValue()).f(j);
        } else if (i == 5) {
            pl plVar2 = this.c;
            ((sc5) (plVar2 != null ? plVar2 : null).q.getValue()).g(j);
        }
    }
}
