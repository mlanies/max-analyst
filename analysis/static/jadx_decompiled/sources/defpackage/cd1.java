package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class cd1 extends ffe implements a66 {
    public dd1 X;
    public int Y;
    public final /* synthetic */ dd1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd1(dd1 dd1Var, Continuation continuation) {
        super(2, continuation);
        this.Z = dd1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cd1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cd1(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        dd1 dd1Var;
        Object value;
        uc0 uc0VarB;
        SpannableStringBuilder spannableStringBuilder;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            dd1 dd1Var2 = this.Z;
            m5d m5dVar = dd1Var2.o;
            this.X = dd1Var2;
            this.Y = 1;
            Object objT0 = j47.t0(((w9a) ((kke) ((je7) m5dVar.X).getValue())).b(), new ms1(m5dVar, null), this);
            if (objT0 == tx3Var) {
                return tx3Var;
            }
            dd1Var = dd1Var2;
            obj = objT0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd1Var = this.X;
            od2.a0(obj);
        }
        dd1Var.s0 = (Long) obj;
        dd1 dd1Var3 = this.Z;
        q0e q0eVar = dd1Var3.t0;
        do {
            value = q0eVar.getValue();
            h7b h7bVar = dd1Var3.c;
            uc0VarB = h7bVar.b(null, Long.MIN_VALUE);
            spannableStringBuilder = new SpannableStringBuilder(" ");
            spannableStringBuilder.setSpan(new yl5((oo7) ((je7) h7bVar.c).getValue(), (sl5) null, 6), 0, 1, 17);
        } while (!q0eVar.c(value, rc1.a((rc1) value, uc0VarB, null, new oc1(new iqe(spannableStringBuilder)), null, nz4.a, null, false, null, HttpStatus.SC_METHOD_NOT_ALLOWED)));
        return e5f.a;
    }
}
