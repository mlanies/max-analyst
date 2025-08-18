package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public final class lza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lza(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lza lzaVar = (lza) n((String) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lzaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lza lzaVar = new lza(this.Y, continuation);
        lzaVar.X = obj;
        return lzaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        PickerMembersListWidget pickerMembersListWidget = this.Y;
        if (str == null || w9e.C0(str)) {
            bc7[] bc7VarArr = PickerMembersListWidget.x0;
            hdc adapter = pickerMembersListWidget.p0().getAdapter();
            nxa nxaVar = pickerMembersListWidget.Y;
            if (!tpa.f(adapter, nxaVar)) {
                dle dleVar = pickerMembersListWidget.u0;
                if (dleVar != null) {
                    dleVar.B(pickerMembersListWidget.p0());
                }
                pickerMembersListWidget.p0().M0(nxaVar, false);
                pickerMembersListWidget.u0 = z7.m(pickerMembersListWidget.p0());
                if (pickerMembersListWidget.n0()) {
                    EndlessRecyclerView2 endlessRecyclerView2P0 = pickerMembersListWidget.p0();
                    bo6 bo6Var = pickerMembersListWidget.v0;
                    if (bo6Var != null) {
                        endlessRecyclerView2P0.p0(bo6Var);
                    }
                    pickerMembersListWidget.v0 = null;
                    h8e h8eVar = pickerMembersListWidget.w0;
                    if (h8eVar != null) {
                        endlessRecyclerView2P0.p0(h8eVar);
                    }
                    pickerMembersListWidget.w0 = null;
                    pickerMembersListWidget.m0(pickerMembersListWidget.p0());
                }
            }
        } else {
            bc7[] bc7VarArr2 = PickerMembersListWidget.x0;
            hdc adapter2 = pickerMembersListWidget.p0().getAdapter();
            nxa nxaVar2 = pickerMembersListWidget.Z;
            if (!tpa.f(adapter2, nxaVar2)) {
                dle dleVar2 = pickerMembersListWidget.u0;
                if (dleVar2 != null) {
                    dleVar2.B(pickerMembersListWidget.p0());
                }
                pickerMembersListWidget.p0().M0(nxaVar2, false);
                pickerMembersListWidget.u0 = z7.m(pickerMembersListWidget.p0());
                if (pickerMembersListWidget.n0()) {
                    EndlessRecyclerView2 endlessRecyclerView2P02 = pickerMembersListWidget.p0();
                    bo6 bo6Var2 = pickerMembersListWidget.v0;
                    if (bo6Var2 != null) {
                        endlessRecyclerView2P02.p0(bo6Var2);
                    }
                    pickerMembersListWidget.v0 = null;
                    h8e h8eVar2 = pickerMembersListWidget.w0;
                    if (h8eVar2 != null) {
                        endlessRecyclerView2P02.p0(h8eVar2);
                    }
                    pickerMembersListWidget.w0 = null;
                }
            }
        }
        return e5f.a;
    }
}
