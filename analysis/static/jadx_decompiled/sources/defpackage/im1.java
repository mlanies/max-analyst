package defpackage;

import android.database.Cursor;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class im1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ im1(kw9 kw9Var, qv9 qv9Var) {
        this.a = 1;
        this.c = kw9Var;
        this.o = qv9Var;
        this.b = false;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                mm1.y(this.b, (mm1) this.c, (List) this.o);
                return e5f.a;
            default:
                kw9 kw9Var = (kw9) this.c;
                kw9Var.getClass();
                qv9 qv9Var = (qv9) this.o;
                long j = qv9Var.a;
                xlc xlcVarA = xlc.a(1, "SELECT * FROM notifications_read_marks WHERE chat_id = ?");
                xlcVarA.j(1, j);
                ilc ilcVar = kw9Var.a;
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, null);
                try {
                    qv9 qv9Var2 = cursorO.moveToFirst() ? new qv9(cursorO.getLong(tfg.n(cursorO, "chat_id")), cursorO.getLong(tfg.n(cursorO, "mark"))) : null;
                    if (qv9Var2 != null) {
                        long j2 = qv9Var2.b;
                        long j3 = qv9Var.b;
                        if (j2 == j3) {
                            return Boolean.FALSE;
                        }
                        if (j2 > j3 && !this.b) {
                            return Boolean.FALSE;
                        }
                    }
                    ilcVar.b();
                    ilcVar.c();
                    try {
                        kw9Var.b.C(qv9Var);
                        ilcVar.r();
                        ilcVar.l();
                        return Boolean.TRUE;
                    } catch (Throwable th) {
                        ilcVar.l();
                        throw th;
                    }
                } finally {
                    cursorO.close();
                    xlcVarA.n();
                }
        }
    }

    public /* synthetic */ im1(boolean z, mm1 mm1Var, List list) {
        this.a = 0;
        this.b = z;
        this.c = mm1Var;
        this.o = list;
    }
}
