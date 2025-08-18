package defpackage;

import android.database.Cursor;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class eoe {
    public static final List d = Arrays.asList(goe.o, goe.c);
    public final rm4 a;
    public final o45 b;
    public final xpb c = new xpb();

    public eoe(rm4 rm4Var, o45 o45Var) {
        this.a = rm4Var;
        this.b = o45Var;
    }

    public final db3 a(List list) {
        int i = 7;
        int i2 = 2;
        hm9.m("eoe", "awaitNoTasksByTypes: types=%s", list);
        return new qa3(new rqd(new q1a(2, new u24(this, i, list)), new z72(28, list), i2).h(new hme(5)), i2, new doe(this, list)).f(new ic5(i, list));
    }

    public final long b(List list) {
        hoe hoeVarB = ((k24) ((c34) this.a.get())).f.b();
        hoeVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks where type in (");
        int size = list.size();
        a14.c(sb, size);
        sb.append(")");
        xlc xlcVarA = xlc.a(size, sb.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            iua iuaVar = (iua) it.next();
            hoeVarB.c.getClass();
            xlcVarA.j(i, iuaVar.a);
            i++;
        }
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final void c(long j) {
        hoe hoeVarB = ((k24) ((c34) this.a.get())).f.b();
        ilc ilcVar = hoeVarB.a;
        ilcVar.c();
        try {
            hoe.a(hoeVarB, j);
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    public final void d(long j) {
        hm9.n("eoe", "remove task = " + j);
        ((k24) ((c34) this.a.get())).f.a(j);
        this.c.e(Boolean.TRUE);
    }

    public final void e(AbstractCollection abstractCollection) {
        hm9.m("eoe", "remove tasks %d", Integer.valueOf(abstractCollection.size()));
        if (nd7.D(abstractCollection)) {
            return;
        }
        ilc ilcVar = ((k24) ((c34) this.a.get())).f.b().a;
        ilcVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM tasks WHERE id in (");
        a14.c(sb, abstractCollection.size());
        sb.append(")");
        q36 q36VarD = ilcVar.d(sb.toString());
        Iterator it = abstractCollection.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                q36VarD.W(i);
            } else {
                q36VarD.j(i, l.longValue());
            }
            i++;
        }
        ilcVar.c();
        try {
            q36VarD.n();
            ilcVar.r();
            ilcVar.l();
            this.c.e(Boolean.TRUE);
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }

    public final void f() {
        hm9.m("eoe", "remove tasks by type = %d", iua.y0);
        hoe hoeVarB = ((k24) ((c34) this.a.get())).f.b();
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        zkc zkcVar = hoeVarB.i;
        q36 q36VarF = zkcVar.f();
        hoeVarB.c.getClass();
        q36VarF.j(1, 12);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                zkcVar.t(q36VarF);
                this.c.e(Boolean.TRUE);
            } finally {
                ilcVar.l();
            }
        } catch (Throwable th) {
            zkcVar.t(q36VarF);
            throw th;
        }
    }

    public final void g(hua huaVar, long j, int i) {
        hm9.n("eoe", "save task = " + huaVar);
        hoe hoeVarB = ((k24) ((c34) this.a.get())).f.b();
        vne vneVar = new vne(huaVar.getId(), huaVar.getType(), goe.c, 0, j, i, huaVar.f(), System.currentTimeMillis());
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        ilcVar.c();
        try {
            hoeVarB.b.D(vneVar);
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    public final List h(long j, iua iuaVar) {
        jmc jmcVar = ((k24) ((c34) this.a.get())).f;
        hoe hoeVarB = jmcVar.b();
        hoeVarB.getClass();
        xlc xlcVarA = xlc.a(2, "SELECT * FROM tasks WHERE id > ? AND type = ?");
        xlcVarA.j(1, j);
        hoeVarB.c.getClass();
        xlcVarA.j(2, iuaVar.a);
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
                arrayList.add(new vne(cursorO.getLong(iN), b46.t(cursorO.getInt(iN2)), b46.r(cursorO.getInt(iN3)), cursorO.getInt(iN4), cursorO.getLong(iN5), cursorO.getInt(iN6), cursorO.isNull(iN7) ? null : cursorO.getBlob(iN7), cursorO.getLong(iN8)));
            }
            cursorO.close();
            xlcVarA.n();
            return jmcVar.c(arrayList);
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    public final List i(Collection collection) {
        b46 b46Var;
        jmc jmcVar = ((k24) ((c34) this.a.get())).f;
        hoe hoeVarB = jmcVar.b();
        hoeVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tasks WHERE type in (");
        int size = collection.size();
        a14.c(sb, size);
        sb.append(") AND status in (");
        List<goe> list = d;
        int size2 = list.size();
        a14.c(sb, size2);
        sb.append(")");
        xlc xlcVarA = xlc.a(size2 + size, sb.toString());
        Iterator it = collection.iterator();
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
        int i2 = size + 1;
        for (goe goeVar : list) {
            b46Var.getClass();
            xlcVarA.j(i2, goeVar.a);
            i2++;
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
                int i3 = cursorO.getInt(iN2);
                b46Var.getClass();
                arrayList.add(new vne(j, b46.t(i3), b46.r(cursorO.getInt(iN3)), cursorO.getInt(iN4), cursorO.getLong(iN5), cursorO.getInt(iN6), cursorO.isNull(iN7) ? null : cursorO.getBlob(iN7), cursorO.getLong(iN8)));
            }
            cursorO.close();
            xlcVarA.n();
            return jmcVar.c(arrayList);
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    public final une j(long j) {
        iua iuaVarT;
        rm4 rm4Var = this.a;
        try {
            return ((k24) ((c34) rm4Var.get())).f.e(j);
        } catch (Exception e) {
            hoe hoeVarB = ((k24) ((c34) rm4Var.get())).f.b();
            hoeVarB.getClass();
            xlc xlcVarA = xlc.a(1, "SELECT type FROM tasks WHERE id = ?");
            xlcVarA.j(1, j);
            ilc ilcVar = hoeVarB.a;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                if (cursorO.moveToFirst()) {
                    int i = cursorO.getInt(0);
                    hoeVarB.c.getClass();
                    iuaVarT = b46.t(i);
                } else {
                    iuaVarT = null;
                }
                cursorO.close();
                xlcVarA.n();
                hm9.k0("eoe", null, "selectTask: id=%d; type=%d; exception=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), iuaVarT, e.getMessage()}, 3));
                ((cba) this.b).c(new HandledException("Can't select task with type=" + iuaVarT + "; exception= " + e.getMessage()), true);
                return null;
            } catch (Throwable th) {
                cursorO.close();
                xlcVarA.n();
                throw th;
            }
        }
    }

    public final int k() {
        hoe hoeVarB = ((k24) ((c34) this.a.get())).f.b();
        List<goe> listM = y53.M(goe.c, goe.X);
        hoeVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM tasks WHERE status in (");
        int size = listM.size();
        a14.c(sb, size);
        sb.append(")");
        xlc xlcVarA = xlc.a(size, sb.toString());
        int i = 1;
        for (goe goeVar : listM) {
            hoeVarB.c.getClass();
            xlcVarA.j(i, goeVar.a);
            i++;
        }
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final ArrayList l() {
        return ((k24) ((c34) this.a.get())).f.b().b(Integer.MAX_VALUE, y53.M(goe.c, goe.X));
    }

    public final ArrayList m() {
        b46 b46Var;
        hoe hoeVarB = ((k24) ((c34) this.a.get())).f.b();
        List listM = y53.M(goe.c, goe.X);
        hoeVarB.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT type, COUNT(*) as count FROM tasks WHERE status in (");
        int size = listM.size();
        a14.c(sb, size);
        sb.append(") GROUP BY type");
        xlc xlcVarA = xlc.a(size, sb.toString());
        Iterator it = listM.iterator();
        int i = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            b46Var = hoeVarB.c;
            if (!zHasNext) {
                break;
            }
            goe goeVar = (goe) it.next();
            b46Var.getClass();
            xlcVarA.j(i, goeVar.a);
            i++;
        }
        ilc ilcVar = hoeVarB.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                int i2 = cursorO.getInt(0);
                b46Var.getClass();
                arrayList.add(new tne(b46.t(i2), cursorO.getInt(1)));
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final void n(long j, goe goeVar) {
        ((k24) ((c34) this.a.get())).f.b().c(j, goeVar);
    }
}
