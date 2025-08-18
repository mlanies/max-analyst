package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class if1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if1(of1 of1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        if1 if1Var = (if1) n((y21) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        if1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        if1 if1Var = new if1(this.Y, continuation);
        if1Var.X = obj;
        return if1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        wf1 wf1Var;
        CharSequence charSequence;
        od2.a0(obj);
        y21 y21Var = (y21) this.X;
        q0e q0eVar = this.Y.z0;
        do {
            value = q0eVar.getValue();
            wf1Var = (wf1) value;
            charSequence = y21Var.c;
            if (charSequence == null) {
                charSequence = "";
            }
        } while (!q0eVar.c(value, wf1.a(wf1Var, null, null, null, false, charSequence, false, 47)));
        return e5f.a;
    }
}
