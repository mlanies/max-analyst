package defpackage;

import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final class wo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ rd6 Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo3(ContactListWidget contactListWidget, rd6 rd6Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = rd6Var;
        this.s0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wo3(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        rd6 rd6Var = this.Z;
        ContactListWidget contactListWidget = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ContactListWidget.P0;
            oo3 oo3VarP0 = contactListWidget.p0();
            wm3 wm3Var = rd6Var.Y;
            this.X = 1;
            Object objT0 = j47.t0(((w9a) oo3VarP0.c).b(), new go3(oo3VarP0, wm3Var, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        contactListWidget.f(rd6Var.a, this.s0);
        return e5fVar;
    }
}
