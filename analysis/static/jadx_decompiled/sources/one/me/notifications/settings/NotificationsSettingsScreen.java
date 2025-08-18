package one.me.notifications.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a3g;
import defpackage.ax9;
import defpackage.bc7;
import defpackage.bh0;
import defpackage.bvc;
import defpackage.cla;
import defpackage.dea;
import defpackage.eua;
import defpackage.fg7;
import defpackage.gd1;
import defpackage.glc;
import defpackage.gx9;
import defpackage.hob;
import defpackage.j31;
import defpackage.j78;
import defpackage.je7;
import defpackage.jp8;
import defpackage.k56;
import defpackage.mfd;
import defpackage.nec;
import defpackage.nta;
import defpackage.o;
import defpackage.od2;
import defpackage.oec;
import defpackage.pnf;
import defpackage.qm0;
import defpackage.sw9;
import defpackage.tu0;
import defpackage.uw9;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.wq3;
import defpackage.x27;
import defpackage.xi1;
import defpackage.xw9;
import defpackage.yw9;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zw9;
import kotlin.Metadata;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/notifications/settings/NotificationsSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lwq3;", "Lnta;", "<init>", "()V", "notifications-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class NotificationsSettingsScreen extends Widget implements wq3, nta {
    public static final /* synthetic */ bc7[] v0;
    public final mfd X;
    public final je7 Y;
    public final a3g Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final je7 o;
    public final qm0 s0;
    public final qm0 t0;
    public final qm0 u0;

    static {
        hob hobVar = new hob(NotificationsSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oecVar = nec.a;
        v0 = new bc7[]{hobVar, zr6.e(oecVar, NotificationsSettingsScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.f(NotificationsSettingsScreen.class, "resetDefaultsButton", "getResetDefaultsButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new glc(new j78(16), null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(gx9.class, new jp8(6, new j78(17)));
        sw9 sw9Var = sw9.a;
        this.o = sw9Var.getAccessor().d(eua.class);
        this.X = new mfd(new gd1(17, this), sw9Var.getExecutors().a());
        this.Y = createViewModelLazy(bh0.class, new jp8(7, new j78(18)));
        this.Z = new a3g(this, sw9Var.getExecutors().a(), 2);
        final int i = 0;
        this.s0 = binding(new k56(this) { // from class: vw9
            public final /* synthetic */ NotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                NotificationsSettingsScreen notificationsSettingsScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = NotificationsSettingsScreen.v0;
                        cla claVar = new cla(notificationsSettingsScreen.getContext(), 6);
                        claVar.setId(dea.x);
                        claVar.setForm(uka.a);
                        claVar.setTitle(eea.r);
                        claVar.setLeftActions(new kka(new ww9(0)));
                        return claVar;
                    case 1:
                        bc7[] bc7VarArr2 = NotificationsSettingsScreen.v0;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(dea.u);
                        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setAdapter(new nd3(notificationsSettingsScreen.Z, notificationsSettingsScreen.X));
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new y98(endlessRecyclerView2, 17, notificationsSettingsScreen), null, 12));
                        endlessRecyclerView2.j(new ry0(3));
                        return endlessRecyclerView2;
                    default:
                        bc7[] bc7VarArr3 = NotificationsSettingsScreen.v0;
                        OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), null);
                        oneMeButton.setId(dea.v);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        float f = 12;
                        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                        layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.c);
                        oneMeButton.setText(eea.p);
                        tu0.K(oneMeButton, 300L, new xx5(19, notificationsSettingsScreen));
                        return oneMeButton;
                }
            }
        });
        final int i2 = 1;
        this.t0 = binding(new k56(this) { // from class: vw9
            public final /* synthetic */ NotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                NotificationsSettingsScreen notificationsSettingsScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = NotificationsSettingsScreen.v0;
                        cla claVar = new cla(notificationsSettingsScreen.getContext(), 6);
                        claVar.setId(dea.x);
                        claVar.setForm(uka.a);
                        claVar.setTitle(eea.r);
                        claVar.setLeftActions(new kka(new ww9(0)));
                        return claVar;
                    case 1:
                        bc7[] bc7VarArr2 = NotificationsSettingsScreen.v0;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(dea.u);
                        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setAdapter(new nd3(notificationsSettingsScreen.Z, notificationsSettingsScreen.X));
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new y98(endlessRecyclerView2, 17, notificationsSettingsScreen), null, 12));
                        endlessRecyclerView2.j(new ry0(3));
                        return endlessRecyclerView2;
                    default:
                        bc7[] bc7VarArr3 = NotificationsSettingsScreen.v0;
                        OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), null);
                        oneMeButton.setId(dea.v);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        float f = 12;
                        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                        layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.c);
                        oneMeButton.setText(eea.p);
                        tu0.K(oneMeButton, 300L, new xx5(19, notificationsSettingsScreen));
                        return oneMeButton;
                }
            }
        });
        final int i3 = 2;
        this.u0 = binding(new k56(this) { // from class: vw9
            public final /* synthetic */ NotificationsSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                NotificationsSettingsScreen notificationsSettingsScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = NotificationsSettingsScreen.v0;
                        cla claVar = new cla(notificationsSettingsScreen.getContext(), 6);
                        claVar.setId(dea.x);
                        claVar.setForm(uka.a);
                        claVar.setTitle(eea.r);
                        claVar.setLeftActions(new kka(new ww9(0)));
                        return claVar;
                    case 1:
                        bc7[] bc7VarArr2 = NotificationsSettingsScreen.v0;
                        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(notificationsSettingsScreen.getContext(), null, 6);
                        endlessRecyclerView2.setId(dea.u);
                        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        endlessRecyclerView2.getContext();
                        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                        endlessRecyclerView2.setAdapter(new nd3(notificationsSettingsScreen.Z, notificationsSettingsScreen.X));
                        endlessRecyclerView2.setOverScrollMode(2);
                        endlessRecyclerView2.j(new q1d(qp4.u0.j(endlessRecyclerView2), new y98(endlessRecyclerView2, 17, notificationsSettingsScreen), null, 12));
                        endlessRecyclerView2.j(new ry0(3));
                        return endlessRecyclerView2;
                    default:
                        bc7[] bc7VarArr3 = NotificationsSettingsScreen.v0;
                        OneMeButton oneMeButton = new OneMeButton(notificationsSettingsScreen.getContext(), null);
                        oneMeButton.setId(dea.v);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        float f = 12;
                        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                        layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setAppearance(z6a.b);
                        oneMeButton.setSize(c7a.b);
                        oneMeButton.setMode(b7a.c);
                        oneMeButton.setText(eea.p);
                        tu0.K(oneMeButton, 300L, new xx5(19, notificationsSettingsScreen));
                        return oneMeButton;
                }
            }
        });
    }

    @Override // defpackage.nta
    public final void Y(boolean z) {
        if (z) {
            return;
        }
        gx9 gx9VarM0 = m0();
        gx9VarM0.t0.m(null, Boolean.TRUE);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.a;
    }

    public final gx9 m0() {
        return (gx9) this.c.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        gx9 gx9VarM0 = m0();
        gx9VarM0.w0.m(null, Boolean.valueOf(gx9VarM0.b.b()));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(dea.n);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        bc7[] bc7VarArr = v0;
        bc7 bc7Var = bc7VarArr[0];
        linearLayout.addView((cla) this.s0.getValue());
        bc7 bc7Var2 = bc7VarArr[1];
        linearLayout.addView((EndlessRecyclerView2) this.t0.getValue());
        bc7 bc7Var3 = bc7VarArr[2];
        linearLayout.addView((OneMeButton) this.u0.getValue());
        v3c.y(new o(3, null, 7), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 177) {
            m0().t0.m(null, Boolean.valueOf(iArr[0] != 0));
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = m0().v0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new xw9(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new j31(((bh0) this.Y.getValue()).s0, m0().u0, new xi1(3, null, 4), 4), getViewLifecycleOwner().Q(), fg7Var), new yw9(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().s0, getViewLifecycleOwner().Q(), fg7Var), new zw9(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(m0().y0, getViewLifecycleOwner().Q(), fg7Var), new ax9(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.wq3
    public final void w(int i) {
        if (i != 5) {
            return;
        }
        gx9 gx9VarM0 = m0();
        gx9VarM0.getClass();
        pnf.o(gx9VarM0.y0, uw9.b);
    }
}
