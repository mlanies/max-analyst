package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class dp8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MembersListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp8(Continuation continuation, MembersListWidget membersListWidget, View view) {
        super(2, continuation);
        this.Y = membersListWidget;
        this.Z = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dp8 dp8Var = (dp8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dp8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dp8 dp8Var = new dp8(continuation, this.Y, this.Z);
        dp8Var.X = obj;
        return dp8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        so8 so8Var = (so8) this.X;
        boolean z = so8Var.d;
        List listSingletonList = nz4.a;
        MembersListWidget membersListWidget = this.Y;
        List list = so8Var.a;
        if (z) {
            membersListWidget.u0.E(listSingletonList);
            membersListWidget.v0.E(listSingletonList);
            y51 y51Var = membersListWidget.x0;
            if (list.isEmpty()) {
                listSingletonList = Collections.singletonList(tz4.a);
            }
            y51Var.E(listSingletonList);
        } else {
            membersListWidget.u0.E(so8Var.b);
            membersListWidget.x0.E(listSingletonList);
            membersListWidget.v0.E(so8Var.c);
        }
        bc7[] bc7VarArr = MembersListWidget.D0;
        membersListWidget.n0().setOverScrollMode(membersListWidget.o != null ? 2 : 1);
        membersListWidget.t0.E(list);
        if (this.Z != null) {
            membersListWidget.n0().setRefreshingNext(so8Var.e);
        }
        return e5f.a;
    }
}
