package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class rva {
    public final ilc a;
    public final sh b;
    public final ha4 c;
    public final p19 d;
    public final p19 e;
    public final p19 f;

    public rva(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 15);
        this.c = new ha4(oneMeRoomDatabase, 3);
        this.d = new p19(oneMeRoomDatabase, 19);
        this.e = new p19(oneMeRoomDatabase, 20);
        this.f = new p19(oneMeRoomDatabase, 21);
    }

    public static void a(rva rvaVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            ilc ilcVar = rvaVar.a;
            ilcVar.b();
            p19 p19Var = rvaVar.f;
            q36 q36VarF = p19Var.f();
            q36VarF.j(1, jLongValue);
            try {
                ilcVar.c();
                try {
                    q36VarF.n();
                    ilcVar.r();
                } finally {
                }
            } finally {
                p19Var.t(q36VarF);
            }
        }
    }
}
