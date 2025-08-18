package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ue3 extends ffe implements a66 {
    public final /* synthetic */ ve3 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue3(ve3 ve3Var, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ve3Var;
        this.Y = z;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ue3 ue3Var = (ue3) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ue3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ue3(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ve3 ve3Var = this.X;
        t33 t33Var = (t33) ((q33) ve3Var.c.getValue());
        t33Var.getClass();
        t33Var.j("app.call.add.dontshowconfirmation", this.Y);
        je1.c.getClass();
        pnf.o(ve3Var.Y, new c64(":profile/add-members?chat_id=" + this.Z));
        return e5f.a;
    }
}
