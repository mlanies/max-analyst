package defpackage;

import android.content.res.Resources;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final /* synthetic */ class u15 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndlessRecyclerView2 b;

    public /* synthetic */ u15(EndlessRecyclerView2 endlessRecyclerView2, int i) {
        this.a = i;
        this.b = endlessRecyclerView2;
    }

    @Override // defpackage.k56
    public final Object invoke() throws Resources.NotFoundException {
        EndlessRecyclerView2 endlessRecyclerView2 = this.b;
        switch (this.a) {
            case 0:
                int i = EndlessRecyclerView2.i2;
                return eae.n0(EndlessRecyclerView2.class.getName() + "-" + endlessRecyclerView2.getResources().getResourceName(endlessRecyclerView2.getId()), ".", "_");
            default:
                bc7[] bc7VarArr = PickerMembersListWidget.x0;
                return a14.m(endlessRecyclerView2.getContext());
        }
    }
}
