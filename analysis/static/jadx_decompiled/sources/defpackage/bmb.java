package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x99 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmb(x99 x99Var, Continuation continuation) {
        super(2, continuation);
        this.Y = x99Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bmb bmbVar = (bmb) n((uj3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bmbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bmb bmbVar = new bmb(this.Y, continuation);
        bmbVar.X = obj;
        return bmbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object h2bVar;
        od2.a0(obj);
        uj3 uj3Var = (uj3) this.X;
        String str = uj3Var != null ? uj3Var.a.c.c : null;
        CharSequence charSequenceM = uj3Var != null ? uj3Var.m() : null;
        long jN = uj3Var != null ? uj3Var.n() : 0L;
        if (!(!(str == null || str.length() == 0))) {
            if (!(!(charSequenceM == null || ((String) charSequenceM).length() == 0))) {
                h2bVar = i2b.a;
            } else {
                if (charSequenceM == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                h2bVar = new h2b(charSequenceM, jN);
            }
        } else {
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            h2bVar = new k2b(str);
        }
        ((q0e) this.Y.X).m(null, h2bVar);
        return e5f.a;
    }
}
