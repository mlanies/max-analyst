package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class yc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dd1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(dd1 dd1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = dd1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((yc1) n((y71) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yc1 yc1Var = new yc1(this.Y, continuation);
        yc1Var.X = obj;
        return yc1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        SpannableStringBuilder spannableStringBuilder;
        Object value2;
        h7b h7bVar;
        uc0 uc0VarB;
        eqe eqeVar;
        od2.a0(obj);
        y71 y71Var = (y71) this.X;
        boolean z = y71Var instanceof w71;
        e5f e5fVar = e5f.a;
        if (z) {
            Long l = this.Y.s0;
            w71 w71Var = (w71) y71Var;
            long j = w71Var.a.b;
            if (l == null || l.longValue() != j) {
                return e5fVar;
            }
            this.Y.s0 = null;
            dd1 dd1Var = this.Y;
            String str = w71Var.a.X;
            q0e q0eVar = dd1Var.t0;
            do {
                value2 = q0eVar.getValue();
                h7bVar = dd1Var.c;
                uc0VarB = h7bVar.b(null, Long.MIN_VALUE);
                eqeVar = new eqe(t7a.k);
            } while (!q0eVar.c(value2, rc1.a((rc1) value2, uc0VarB, c37.D(str), new pc1(h7bVar.c(str)), eqeVar, rc1.j, kc1.a, true, null, 1)));
        } else {
            if (!(y71Var instanceof x71)) {
                throw new NoWhenBranchMatchedException();
            }
            Long l2 = this.Y.s0;
            long j2 = ((x71) y71Var).a;
            if (l2 == null || l2.longValue() != j2) {
                return e5fVar;
            }
            this.Y.s0 = null;
            dd1 dd1Var2 = this.Y;
            q0e q0eVar2 = dd1Var2.t0;
            do {
                value = q0eVar2.getValue();
                h7b h7bVar2 = dd1Var2.c;
                h7bVar2.getClass();
                int i = t7a.g;
                Context context = (Context) h7bVar2.b;
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i));
                spannableStringBuilder.setSpan(new mse(qp4.u0.b(context).i(), new ma1(h7bVar2, 0)), 0, spannableStringBuilder.length(), 17);
            } while (!q0eVar2.c(value, rc1.a((rc1) value, null, null, new nc1(new iqe(spannableStringBuilder)), null, nz4.a, lc1.a, false, null, HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED)));
        }
        return e5fVar;
    }
}
