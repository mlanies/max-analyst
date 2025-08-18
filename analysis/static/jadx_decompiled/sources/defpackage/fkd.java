package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ csb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkd(csb csbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = csbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fkd fkdVar = (fkd) n((zjd) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fkdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fkd fkdVar = new fkd(this.Y, continuation);
        fkdVar.X = obj;
        return fkdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        zjd zjdVar = (zjd) this.X;
        csb csbVar = this.Y;
        if (zjdVar == null) {
            csbVar.setVisibility(8);
        } else {
            csbVar.setVisibility(0);
            CharSequence charSequenceB = zjdVar.a.b(csbVar.getContext());
            if (charSequenceB == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            csbVar.setTitle(charSequenceB);
            jqe jqeVar = zjdVar.b;
            csbVar.setBody(jqeVar != null ? jqeVar.b(csbVar.getContext()) : null);
            csbVar.a(null, zjdVar.c, null, false);
            csbVar.setCounter(zjdVar.d);
        }
        return e5f.a;
    }
}
