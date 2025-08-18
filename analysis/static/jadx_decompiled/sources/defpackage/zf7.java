package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zf7 extends ffe implements a66 {
    public final /* synthetic */ bg7 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf7(bg7 bg7Var, Continuation continuation) {
        super(2, continuation);
        this.X = bg7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zf7 zf7Var = (zf7) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        zf7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zf7(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        el3 el3Var = (el3) ((je7) this.X.j).getValue();
        ir3 ir3VarH = ((k24) ((c34) el3Var.f.get())).d.h();
        ir3VarH.getClass();
        xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM contact_title");
        ilc ilcVar = ir3VarH.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int i = cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
            cursorO.close();
            xlcVarA.n();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "ContactController", "ContactController contacts.size=" + el3Var.a.size() + " titlesCount=" + i, null);
            }
            if (i < el3Var.a.size()) {
                try {
                    ((k24) ((c34) el3Var.f.get())).a();
                    el3Var.a.forEach(new s33(1, el3Var));
                    ((k24) ((c34) el3Var.f.get())).c();
                } finally {
                    ((k24) ((c34) el3Var.f.get())).b();
                }
            }
            return e5f.a;
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }
}
