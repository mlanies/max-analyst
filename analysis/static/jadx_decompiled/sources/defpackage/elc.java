package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class elc {
    public static final ye4 g = new ye4(16);
    public final jlc a;
    public final khe b;
    public final khe c;
    public final khe d;
    public final je7 e;
    public final khe f = new khe(bv3.v0);

    public elc(jlc jlcVar, je7 je7Var) {
        this.a = jlcVar;
        final int i = 0;
        this.b = new khe(new k56(this) { // from class: blc
            public final /* synthetic */ elc b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.a.m()).w();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.a.m()).O();
                    default:
                        return ((OneMeRoomDatabase) this.b.a.m()).F();
                }
            }
        });
        final int i2 = 1;
        this.c = new khe(new k56(this) { // from class: blc
            public final /* synthetic */ elc b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.a.m()).w();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.a.m()).O();
                    default:
                        return ((OneMeRoomDatabase) this.b.a.m()).F();
                }
            }
        });
        final int i3 = 2;
        this.d = new khe(new k56(this) { // from class: blc
            public final /* synthetic */ elc b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.a.m()).w();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.a.m()).O();
                    default:
                        return ((OneMeRoomDatabase) this.b.a.m()).F();
                }
            }
        });
        this.e = je7Var;
    }

    public final l92 a(la2 la2Var) {
        ConcurrentHashMap concurrentHashMap = ((d56) this.f.getValue()).a;
        long j = la2Var.a;
        k92 k92Var = la2Var.c;
        String str = k92Var.g;
        if (str != null) {
            concurrentHashMap.put(Long.valueOf(j), str);
        }
        return new l92(la2Var.a, k92Var);
    }

    public final void b() {
        dt2 dt2VarC = c();
        ilc ilcVar = dt2VarC.a;
        ilcVar.c();
        try {
            dt2.b(dt2VarC);
            ilcVar.r();
            ilcVar.l();
            ((d56) this.f.getValue()).a.clear();
            xrc xrcVarD = d();
            ilc ilcVar2 = xrcVarD.a;
            ilcVar2.b();
            zkc zkcVar = xrcVarD.d;
            q36 q36VarF = zkcVar.f();
            try {
                ilcVar2.c();
                try {
                    q36VarF.n();
                    ilcVar2.r();
                } finally {
                    ilcVar2.l();
                }
            } finally {
                zkcVar.t(q36VarF);
            }
        } catch (Throwable th) {
            ilcVar.l();
            throw th;
        }
    }

    public final dt2 c() {
        return (dt2) this.b.getValue();
    }

    public final xrc d() {
        return (xrc) this.c.getValue();
    }

    public final long e(k92 k92Var) {
        return ((Number) ((OneMeRoomDatabase) this.a.m()).p(new dlc(0, new zja(this, 12, k92Var)))).longValue();
    }

    public final l92 f(long j) {
        la2 la2Var;
        dt2 dt2VarC = c();
        dt2VarC.getClass();
        xlc xlcVarA = xlc.a(1, "SELECT * FROM chats WHERE server_id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = dt2VarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "data");
            int iN4 = tfg.n(cursorO, "favourite_index");
            int iN5 = tfg.n(cursorO, "sort_time");
            int iN6 = tfg.n(cursorO, "cid");
            if (cursorO.moveToFirst()) {
                la2Var = new la2(cursorO.getLong(iN), cursorO.getLong(iN2), dt2VarC.a().a(cursorO.isNull(iN3) ? null : cursorO.getBlob(iN3)), cursorO.getLong(iN4), cursorO.getLong(iN5), cursorO.getLong(iN6));
            } else {
                la2Var = null;
            }
            if (la2Var != null) {
                return a(la2Var);
            }
            return null;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final l92 g(long j) {
        Object next;
        dt2 dt2VarC = c();
        dt2VarC.getClass();
        xlc xlcVarA = xlc.a(1, "SELECT * FROM chats WHERE cid = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = dt2VarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "data");
            int iN4 = tfg.n(cursorO, "favourite_index");
            int iN5 = tfg.n(cursorO, "sort_time");
            int iN6 = tfg.n(cursorO, "cid");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(new la2(cursorO.getLong(iN), cursorO.getLong(iN2), dt2VarC.a().a(cursorO.isNull(iN3) ? null : cursorO.getBlob(iN3)), cursorO.getLong(iN4), cursorO.getLong(iN5), cursorO.getLong(iN6)));
            }
            cursorO.close();
            xlcVarA.n();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((la2) next).c.b == j92.a) {
                    break;
                }
            }
            la2 la2Var = (la2) next;
            if (la2Var != null) {
                return a(la2Var);
            }
            return null;
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    public final void h(long j, k92 k92Var) {
        long jD = c().d(new la2(j, k92Var.a, k92Var, k92Var.a().e, lz7.k(((t19) this.d.getValue()).k(k92Var.j), k92Var), k92Var.l), ((d56) this.f.getValue()).a);
        je7 je7Var = this.e;
        if (k92Var.f(((wxc) je7Var.getValue()).a())) {
            d().b(((wxc) je7Var.getValue()).a(), jD);
        }
    }
}
