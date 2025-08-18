package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ir3 {
    public final ilc a;
    public final sh b;
    public final th c;
    public final th d;
    public final th e;
    public final th f;
    public final th g;
    public final th h;

    public ir3(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 3);
        this.c = new th(oneMeRoomDatabase, 9);
        this.d = new th(oneMeRoomDatabase, 10);
        this.e = new th(oneMeRoomDatabase, 11);
        this.f = new th(oneMeRoomDatabase, 12);
        this.g = new th(oneMeRoomDatabase, 13);
        this.h = new th(oneMeRoomDatabase, 14);
    }

    public static void a(ir3 ir3Var) {
        ilc ilcVar = ir3Var.a;
        ilcVar.b();
        th thVar = ir3Var.e;
        q36 q36VarF = thVar.f();
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                thVar.t(q36VarF);
                ilcVar.b();
                th thVar2 = ir3Var.h;
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

    public final void b(String str, String str2, String str3, String str4, String str5, long j) {
        ilc ilcVar = this.a;
        ilcVar.b();
        th thVar = this.f;
        q36 q36VarF = thVar.f();
        q36VarF.j(1, j);
        if (str == null) {
            q36VarF.W(2);
        } else {
            q36VarF.f(2, str);
        }
        if (str2 == null) {
            q36VarF.W(3);
        } else {
            q36VarF.f(3, str2);
        }
        if (str3 == null) {
            q36VarF.W(4);
        } else {
            q36VarF.f(4, str3);
        }
        if (str4 == null) {
            q36VarF.W(5);
        } else {
            q36VarF.f(5, str4);
        }
        if (str5 == null) {
            q36VarF.W(6);
        } else {
            q36VarF.f(6, str5);
        }
        try {
            ilcVar.c();
            try {
                q36VarF.m();
                ilcVar.r();
            } finally {
                ilcVar.l();
            }
        } finally {
            thVar.t(q36VarF);
        }
    }

    public final void c(pl3 pl3Var, ConcurrentHashMap concurrentHashMap) {
        long j = pl3Var.a;
        if (pl3Var.j != 0) {
            ilc ilcVar = this.a;
            ilcVar.b();
            th thVar = this.g;
            q36 q36VarF = thVar.f();
            q36VarF.j(1, j);
            try {
                ilcVar.c();
                try {
                    q36VarF.n();
                    ilcVar.r();
                    return;
                } finally {
                    ilcVar.l();
                }
            } finally {
                thVar.t(q36VarF);
            }
        }
        Object obj = concurrentHashMap.get(Long.valueOf(j));
        List list = pl3Var.f;
        if (obj == null ? false : obj.equals(Integer.valueOf(list.hashCode()))) {
            return;
        }
        concurrentHashMap.remove(Long.valueOf(j));
        qec qecVar = g56.a;
        e56 e56VarB = g56.b(list);
        if (e56VarB == null) {
            return;
        }
        String strC = bre.c(pl3Var.p);
        if (oag.t(strC)) {
            strC = "";
        }
        String strK = b0d.k(strC);
        e56 e56Var = e56VarB.c;
        b(strK, e56VarB.a, e56VarB.b, e56Var != null ? e56Var.a : null, e56Var != null ? e56Var.b : null, j);
        concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(list.hashCode()));
    }
}
