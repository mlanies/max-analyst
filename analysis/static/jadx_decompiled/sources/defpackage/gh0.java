package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gh0 extends ffe implements a66 {
    public final /* synthetic */ jh0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(jh0 jh0Var, Continuation continuation) {
        super(2, continuation);
        this.X = jh0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gh0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gh0(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rva rvaVarC = ((wlc) ((xc4) this.X.c.getValue()).a.getValue()).c();
        rvaVarC.getClass();
        xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM phones");
        ilc ilcVar = rvaVarC.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
            cursorO.close();
            xlcVarA.n();
            return Boolean.valueOf(j == 0);
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }
}
