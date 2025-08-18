package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tn3 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn3(Object obj, Continuation continuation, yn3 yn3Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = yn3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tn3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new tn3(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        CharSequence string;
        od2.a0(obj);
        uj3 uj3Var = (uj3) this.X;
        yn3 yn3Var = this.Y;
        r7b r7bVarB = ((u7b) yn3Var.e.getValue()).b(uj3Var.n());
        boolean zE = ((u7b) yn3Var.e.getValue()).e(uj3Var.n());
        String strP = uj3Var.p(kk0.b);
        if (uj3Var.k() != 0 || uj3Var.w()) {
            string = null;
        } else {
            boolean z = uj3Var.Y;
            Context context = yn3Var.c;
            string = z ? context.getString(dpc.F) : (uj3Var.t() && uj3Var.v()) ? context.getString(jpc.O2) : uj3Var.t() ? context.getString(jpc.p) : ((w7b) yn3Var.f.getValue()).b(uj3Var);
        }
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        if (strD != null) {
            return new nn3(jN, strD, bre.b(uj3Var.g()), Collections.singletonList(new Long(uj3Var.o())), string, null, strP != null ? Uri.parse(strP) : null, zE, uj3Var.u(), uj3Var.m(), uj3Var.Y, null, r7bVarB.b, uj3Var.t(), 14336);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
