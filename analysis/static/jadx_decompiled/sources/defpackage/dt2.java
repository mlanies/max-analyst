package defpackage;

import android.database.Cursor;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class dt2 {
    public final ilc a;
    public final ct2 b;
    public uz2 c;
    public final th d;
    public final th e;
    public final th f;
    public final th g;
    public final th h;

    public dt2(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ct2(this, oneMeRoomDatabase, 0);
        this.d = new th(oneMeRoomDatabase, 4);
        this.e = new th(oneMeRoomDatabase, 5);
        this.f = new th(oneMeRoomDatabase, 6);
        this.g = new th(oneMeRoomDatabase, 7);
        this.h = new th(oneMeRoomDatabase, 8);
    }

    public static void b(dt2 dt2Var) {
        ilc ilcVar = dt2Var.a;
        ilcVar.b();
        th thVar = dt2Var.e;
        q36 q36VarF = thVar.f();
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                thVar.t(q36VarF);
                ilcVar.b();
                th thVar2 = dt2Var.h;
                q36 q36VarF2 = thVar2.f();
                try {
                    ilcVar.c();
                    try {
                        q36VarF2.n();
                        ilcVar.r();
                    } finally {
                    }
                } finally {
                    thVar2.t(q36VarF2);
                }
            } finally {
            }
        } catch (Throwable th) {
            thVar.t(q36VarF);
            throw th;
        }
    }

    public static void c(dt2 dt2Var, long j) {
        ilc ilcVar = dt2Var.a;
        ilcVar.b();
        th thVar = dt2Var.d;
        q36 q36VarF = thVar.f();
        q36VarF.j(1, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                thVar.t(q36VarF);
                ilcVar.b();
                th thVar2 = dt2Var.g;
                q36 q36VarF2 = thVar2.f();
                q36VarF2.j(1, j);
                try {
                    ilcVar.c();
                    try {
                        q36VarF2.n();
                        ilcVar.r();
                    } finally {
                    }
                } finally {
                    thVar2.t(q36VarF2);
                }
            } finally {
            }
        } catch (Throwable th) {
            thVar.t(q36VarF);
            throw th;
        }
    }

    public final synchronized uz2 a() {
        try {
            if (this.c == null) {
                this.c = (uz2) this.a.l.get(uz2.class);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final long d(la2 la2Var, ConcurrentHashMap concurrentHashMap) {
        e56 e56VarA;
        ilc ilcVar = this.a;
        ilcVar.b();
        ilcVar.c();
        try {
            long jD = this.b.D(la2Var);
            ilcVar.r();
            ilcVar.l();
            Object obj = concurrentHashMap.get(Long.valueOf(jD));
            k92 k92Var = la2Var.c;
            if (!(obj == null ? false : obj.equals(k92Var.g))) {
                concurrentHashMap.remove(Long.valueOf(jD));
                String str = k92Var.g;
                if (str != null) {
                    if (str.length() == 0) {
                        str = null;
                    }
                    if (str != null && (e56VarA = g56.a(str)) != null) {
                        e56 e56Var = e56VarA.c;
                        String str2 = e56Var != null ? e56Var.a : null;
                        String str3 = e56Var != null ? e56Var.b : null;
                        ilcVar.b();
                        th thVar = this.f;
                        q36 q36VarF = thVar.f();
                        q36VarF.j(1, jD);
                        String str4 = e56VarA.a;
                        if (str4 == null) {
                            q36VarF.W(2);
                        } else {
                            q36VarF.f(2, str4);
                        }
                        String str5 = e56VarA.b;
                        if (str5 == null) {
                            q36VarF.W(3);
                        } else {
                            q36VarF.f(3, str5);
                        }
                        if (str2 == null) {
                            q36VarF.W(4);
                        } else {
                            q36VarF.f(4, str2);
                        }
                        if (str3 == null) {
                            q36VarF.W(5);
                        } else {
                            q36VarF.f(5, str3);
                        }
                        q36VarF.j(6, la2Var.e);
                        try {
                            ilcVar.c();
                            try {
                                q36VarF.m();
                                ilcVar.r();
                                thVar.t(q36VarF);
                                String str6 = k92Var.g;
                                if (str6 != null) {
                                    concurrentHashMap.put(Long.valueOf(jD), str6);
                                }
                                hm9.n(dt2.class.getName(), "update_fts_title_chat for #" + jD);
                            } finally {
                            }
                        } catch (Throwable th) {
                            thVar.t(q36VarF);
                            throw th;
                        }
                    }
                }
            }
            return jD;
        } finally {
        }
    }

    public final la2 e(long j) {
        xlc xlcVarA = xlc.a(1, "SELECT * FROM chats WHERE id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = this.a;
        ilcVar.b();
        la2 la2Var = null;
        byte[] blob = null;
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "data");
            int iN4 = tfg.n(cursorO, "favourite_index");
            int iN5 = tfg.n(cursorO, "sort_time");
            int iN6 = tfg.n(cursorO, "cid");
            if (cursorO.moveToFirst()) {
                long j2 = cursorO.getLong(iN);
                long j3 = cursorO.getLong(iN2);
                if (!cursorO.isNull(iN3)) {
                    blob = cursorO.getBlob(iN3);
                }
                la2Var = new la2(j2, j3, a().a(blob), cursorO.getLong(iN4), cursorO.getLong(iN5), cursorO.getLong(iN6));
            }
            return la2Var;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public final long f(long j) {
        xlc xlcVarA = xlc.a(1, "SELECT id FROM chats WHERE server_id = ?");
        xlcVarA.j(1, j);
        ilc ilcVar = this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            return cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }
}
