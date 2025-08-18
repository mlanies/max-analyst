package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dz6 extends ffe implements a66 {
    public final /* synthetic */ a86 X;
    public final /* synthetic */ fz6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz6(a86 a86Var, fz6 fz6Var, Continuation continuation) {
        super(2, continuation);
        this.X = a86Var;
        this.Y = fz6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((dz6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new dz6(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int count;
        od2.a0(obj);
        x76 x76Var = x76.a;
        a86 a86Var = this.X;
        if (tpa.f(a86Var, x76Var)) {
            return new Integer(-1);
        }
        int i = 0;
        for (u76 u76Var : a86Var.d()) {
            Cursor cursorQuery = this.Y.o.query(u76Var.i(), new String[]{u76Var.f()}, a86Var.e(u76Var), a86Var.a(u76Var), null);
            if (cursorQuery != null) {
                try {
                    count = cursorQuery.getCount();
                    v3c.i(cursorQuery, null);
                } finally {
                }
            } else {
                count = 0;
            }
            i += count;
        }
        return new Integer(i);
    }
}
