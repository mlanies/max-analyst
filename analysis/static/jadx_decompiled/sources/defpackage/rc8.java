package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ es8 Y;
    public final /* synthetic */ yc8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc8(Object obj, Continuation continuation, es8 es8Var, yc8 yc8Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = es8Var;
        this.Z = yc8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rc8(this.X, continuation, this.Y, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String string;
        od2.a0(obj);
        l20 l20Var = (l20) this.X;
        i10 i10Var = l20Var != null ? l20Var.e : null;
        if (i10Var == null) {
            return null;
        }
        long jHashCode = l20Var.r.hashCode();
        es8 es8Var = this.Y;
        boolean z = es8Var.b.Y;
        yc8 yc8Var = this.Z;
        if (z) {
            string = z7.B(yc8Var.a, oda.T);
        } else {
            u6b u6bVar = es8Var.X;
            u6bVar.c(u6bVar.a.g());
            string = u6bVar.h.toString();
        }
        String str = string;
        String strC = tfg.c(i10Var.c);
        Context context = yc8Var.a;
        Locale localeV = ((hyc) yc8Var.b).v();
        cu8 cu8Var = es8Var.a;
        return new qm8(jHashCode, cu8Var.b, i10Var.a, l20Var.r, i10Var.b, str, rh4.j(strC, " · ", ay7.s(context, localeV, cu8Var.o, true)), yc8Var.a.getString(oda.U), ((z3b) yc8Var.f.getValue()).e);
    }
}
