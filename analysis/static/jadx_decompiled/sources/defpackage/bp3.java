package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final class bp3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ContactListWidget Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ View s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp3(ContactListWidget contactListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = contactListWidget;
        this.Z = j;
        this.s0 = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bp3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bp3(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        long j = this.Z;
        ContactListWidget contactListWidget = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ContactListWidget.P0;
            oo3 oo3VarP0 = contactListWidget.p0();
            this.X = 1;
            obj = j47.t0(((w9a) oo3VarP0.c).a(), new fo3(oo3VarP0, j, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        List list = (List) (((List) obj).isEmpty() ? null : obj);
        if (list != null) {
            Long l = new Long(j);
            bc7[] bc7VarArr2 = ContactListWidget.P0;
            contactListWidget.getClass();
            bc7 bc7Var = ContactListWidget.P0[4];
            contactListWidget.J0.b(contactListWidget, l);
            dy7.c(2).I(list).Y(this.s0).R(fk4.d().getDisplayMetrics().density * 12.0f).build().q(contactListWidget);
        }
        return e5f.a;
    }
}
