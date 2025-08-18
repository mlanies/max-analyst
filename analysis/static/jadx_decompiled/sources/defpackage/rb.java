package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* loaded from: classes2.dex */
public final class rb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminsFromContactsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.Y = adminsFromContactsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rb rbVar = (rb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rb rbVar = new rb(continuation, this.Y);
        rbVar.X = obj;
        return rbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = AdminsFromContactsScreen.u0;
        AdminsFromContactsScreen adminsFromContactsScreen = this.Y;
        boolean zQ = ((bc) adminsFromContactsScreen.c.getValue()).q();
        if (zQ) {
            RecyclerView recyclerViewN0 = adminsFromContactsScreen.n0();
            h8e h8eVar = adminsFromContactsScreen.Z;
            if (h8eVar != null) {
                recyclerViewN0.p0(h8eVar);
            }
            adminsFromContactsScreen.Z = null;
        } else {
            RecyclerView recyclerViewN02 = adminsFromContactsScreen.n0();
            h8e h8eVar2 = adminsFromContactsScreen.Z;
            if (h8eVar2 != null) {
                recyclerViewN02.p0(h8eVar2);
            }
            adminsFromContactsScreen.Z = null;
            adminsFromContactsScreen.m0(adminsFromContactsScreen.n0());
        }
        boolean z = zQ && list.isEmpty();
        ((EmptySearchView) adminsFromContactsScreen.X.T0(adminsFromContactsScreen, AdminsFromContactsScreen.u0[2])).setVisibility(z ? 0 : 8);
        adminsFromContactsScreen.n0().setVisibility(z ^ true ? 0 : 8);
        adminsFromContactsScreen.t0.E(list);
        return e5f.a;
    }
}
