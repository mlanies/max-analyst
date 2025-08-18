package one.me.notifications.settings.screens.dialog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.bc7;
import defpackage.cla;
import defpackage.dea;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.gd1;
import defpackage.hob;
import defpackage.je7;
import defpackage.k56;
import defpackage.lj4;
import defpackage.mfd;
import defpackage.nec;
import defpackage.nj4;
import defpackage.o;
import defpackage.od2;
import defpackage.pj4;
import defpackage.qm0;
import defpackage.sw9;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.x27;
import defpackage.zf3;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/notifications/settings/screens/dialog/DialogNotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class DialogNotificationsSettingsScreen extends Widget {
    public static final /* synthetic */ bc7[] Y = {new hob(DialogNotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.e(nec.a, DialogNotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final qm0 X;
    public final x27 a;
    public final je7 b;
    public final mfd c;
    public final qm0 o;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNotificationsSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = x27.d;
        this.b = createViewModelLazy(pj4.class, new nj4(0, new zf3(17)));
        this.c = new mfd(new gd1(8, this), sw9.a.getExecutors().a());
        final int i = 0;
        this.o = binding(new k56(this) { // from class: kj4
            public final /* synthetic */ DialogNotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = DialogNotificationsSettingsScreen.Y;
                        cla claVar = new cla(dialogNotificationsSettingsScreen.getContext(), 6);
                        claVar.setId(dea.l);
                        claVar.setForm(uka.a);
                        claVar.setTitle(eea.i);
                        claVar.setLeftActions(new kka(new pz2(14)));
                        return claVar;
                    default:
                        bc7[] bc7VarArr2 = DialogNotificationsSettingsScreen.Y;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(dialogNotificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(dea.j);
                        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.setAdapter(dialogNotificationsSettingsScreen.c);
                        endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new ta4(5), null, 12));
                        endlessRecyclerView2.j(new sc1(2));
                        return endlessRecyclerView2;
                }
            }
        });
        final int i2 = 1;
        this.X = binding(new k56(this) { // from class: kj4
            public final /* synthetic */ DialogNotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = DialogNotificationsSettingsScreen.Y;
                        cla claVar = new cla(dialogNotificationsSettingsScreen.getContext(), 6);
                        claVar.setId(dea.l);
                        claVar.setForm(uka.a);
                        claVar.setTitle(eea.i);
                        claVar.setLeftActions(new kka(new pz2(14)));
                        return claVar;
                    default:
                        bc7[] bc7VarArr2 = DialogNotificationsSettingsScreen.Y;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(dialogNotificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(dea.j);
                        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.setAdapter(dialogNotificationsSettingsScreen.c);
                        endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new ta4(5), null, 12));
                        endlessRecyclerView2.j(new sc1(2));
                        return endlessRecyclerView2;
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getC() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(dea.i);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        float f = 12;
        linearLayout.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        bc7[] bc7VarArr = Y;
        bc7 bc7Var = bc7VarArr[0];
        linearLayout.addView((cla) this.o.getValue());
        bc7 bc7Var2 = bc7VarArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.X.getValue());
        v3c.y(new o(3, null, 3), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(((pj4) this.b.getValue()).Y, getViewLifecycleOwner().Q(), fg7.o), new lj4(null, this), 5), getViewLifecycleScope());
    }
}
