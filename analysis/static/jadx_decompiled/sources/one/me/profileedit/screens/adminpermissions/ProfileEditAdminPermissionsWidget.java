package one.me.profileedit.screens.adminpermissions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bc7;
import defpackage.bi9;
import defpackage.c32;
import defpackage.cla;
import defpackage.dy7;
import defpackage.e37;
import defpackage.e52;
import defpackage.eqe;
import defpackage.feb;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.g43;
import defpackage.gic;
import defpackage.h76;
import defpackage.heb;
import defpackage.hob;
import defpackage.i3a;
import defpackage.i76;
import defpackage.iba;
import defpackage.ieb;
import defpackage.je7;
import defpackage.jeb;
import defpackage.jp8;
import defpackage.jv5;
import defpackage.k37;
import defpackage.k4a;
import defpackage.k56;
import defpackage.kdb;
import defpackage.keb;
import defpackage.khe;
import defpackage.kpa;
import defpackage.lab;
import defpackage.leb;
import defpackage.lka;
import defpackage.mdb;
import defpackage.mka;
import defpackage.neb;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nu0;
import defpackage.nz7;
import defpackage.od2;
import defpackage.oec;
import defpackage.pk;
import defpackage.pla;
import defpackage.pnf;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qdb;
import defpackage.qp4;
import defpackage.rdb;
import defpackage.ro2;
import defpackage.ru3;
import defpackage.sea;
import defpackage.t03;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.vea;
import defpackage.vha;
import defpackage.woc;
import defpackage.x27;
import defpackage.y98;
import defpackage.yh9;
import defpackage.zn5;
import defpackage.zr6;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsWidget;", "Lone/me/sdk/arch/Widget;", "Lmdb;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "contactId", "Lrdb;", "type", "(JJLrdb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileEditAdminPermissionsWidget extends Widget implements mdb, ng3 {
    public static final /* synthetic */ bc7[] x0;
    public final khe X;
    public final je7 Y;
    public final jv5 Z;
    public final x27 a;
    public final fs b;
    public final fs c;
    public final fs o;
    public final q7c s0;
    public final q7c t0;
    public final gic u0;
    public final int v0;
    public vha w0;

    static {
        hob hobVar = new hob(ProfileEditAdminPermissionsWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        x0 = new bc7[]{hobVar, zr6.e(oecVar, ProfileEditAdminPermissionsWidget.class, "contactId", "getContactId()J", 0), zr6.f(ProfileEditAdminPermissionsWidget.class, "type", "getType()Lone/me/profileedit/screens/adminpermissions/ProfileEditAdminPermissionsType;", 0, oecVar), zr6.f(ProfileEditAdminPermissionsWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(ProfileEditAdminPermissionsWidget.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oecVar)};
    }

    public ProfileEditAdminPermissionsWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        Class<Long> cls = Long.class;
        this.b = new fs(cls, "chat_id");
        this.c = new fs(cls, "contact_id");
        this.o = new fs(rdb.class, "permissions_type");
        this.X = new khe(new lab(17));
        final int i = 0;
        this.Y = createViewModelLazy(feb.class, new jp8(17, new k56(this) { // from class: geb
            public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = ProfileEditAdminPermissionsWidget.x0;
                        bc7 bc7Var = bc7VarArr[0];
                        long jLongValue = ((Number) profileEditAdminPermissionsWidget.b.a(profileEditAdminPermissionsWidget)).longValue();
                        bc7 bc7Var2 = bc7VarArr[1];
                        long jLongValue2 = ((Number) profileEditAdminPermissionsWidget.c.a(profileEditAdminPermissionsWidget)).longValue();
                        rdb rdbVarN0 = profileEditAdminPermissionsWidget.n0();
                        boolean zM0 = profileEditAdminPermissionsWidget.m0();
                        neb nebVar = neb.a;
                        return new feb(jLongValue, jLongValue2, rdbVarN0, zM0, (iy2) ((khe) nebVar.c()).getValue(), (ds3) nebVar.getAccessor().d(ds3.class).getValue(), nebVar.getAccessor().d(qab.class), nebVar.b(), nebVar.d(), nebVar.getAccessor().d(qe5.class), nebVar.getAccessor().d(ea.class), nebVar.getAccessor().d(q33.class));
                    default:
                        bc7[] bc7VarArr2 = ProfileEditAdminPermissionsWidget.x0;
                        OneMeButton oneMeButton = new OneMeButton(profileEditAdminPermissionsWidget.getContext(), null);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        layoutParams.leftMargin = iG;
                        layoutParams.rightMargin = iG;
                        layoutParams.topMargin = iG;
                        layoutParams.bottomMargin = iG;
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setMode(b7a.a);
                        oneMeButton.setAppearance(z6a.c);
                        oneMeButton.setVisibility(profileEditAdminPermissionsWidget.n0() != rdb.c ? 8 : 0);
                        oneMeButton.setText(profileEditAdminPermissionsWidget.n0() == rdb.o ? vea.j1 : vea.L0);
                        tu0.K(oneMeButton, 300L, new xx5(29, profileEditAdminPermissionsWidget));
                        return oneMeButton;
                }
            }
        }));
        this.Z = new jv5(((iba) neb.a.getAccessor().c(iba.class)).a(), this, 10);
        this.s0 = viewBinding(sea.T);
        this.t0 = viewBinding(sea.Q);
        final int i2 = 1;
        this.u0 = nu0.L(new k56(this) { // from class: geb
            public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = ProfileEditAdminPermissionsWidget.x0;
                        bc7 bc7Var = bc7VarArr[0];
                        long jLongValue = ((Number) profileEditAdminPermissionsWidget.b.a(profileEditAdminPermissionsWidget)).longValue();
                        bc7 bc7Var2 = bc7VarArr[1];
                        long jLongValue2 = ((Number) profileEditAdminPermissionsWidget.c.a(profileEditAdminPermissionsWidget)).longValue();
                        rdb rdbVarN0 = profileEditAdminPermissionsWidget.n0();
                        boolean zM0 = profileEditAdminPermissionsWidget.m0();
                        neb nebVar = neb.a;
                        return new feb(jLongValue, jLongValue2, rdbVarN0, zM0, (iy2) ((khe) nebVar.c()).getValue(), (ds3) nebVar.getAccessor().d(ds3.class).getValue(), nebVar.getAccessor().d(qab.class), nebVar.b(), nebVar.d(), nebVar.getAccessor().d(qe5.class), nebVar.getAccessor().d(ea.class), nebVar.getAccessor().d(q33.class));
                    default:
                        bc7[] bc7VarArr2 = ProfileEditAdminPermissionsWidget.x0;
                        OneMeButton oneMeButton = new OneMeButton(profileEditAdminPermissionsWidget.getContext(), null);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        layoutParams.leftMargin = iG;
                        layoutParams.rightMargin = iG;
                        layoutParams.topMargin = iG;
                        layoutParams.bottomMargin = iG;
                        oneMeButton.setLayoutParams(layoutParams);
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setMode(b7a.a);
                        oneMeButton.setAppearance(z6a.c);
                        oneMeButton.setVisibility(profileEditAdminPermissionsWidget.n0() != rdb.c ? 8 : 0);
                        oneMeButton.setText(profileEditAdminPermissionsWidget.n0() == rdb.o ? vea.j1 : vea.L0);
                        tu0.K(oneMeButton, 300L, new xx5(29, profileEditAdminPermissionsWidget));
                        return oneMeButton;
                }
            }
        });
        this.v0 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        feb febVarO0;
        e52 e52VarS;
        if (i == sea.d0) {
            o0().r();
            return;
        }
        if (i == sea.c0) {
            feb febVarO02 = o0();
            febVarO02.getClass();
            pnf.o(febVarO02.B0, g43.b);
            return;
        }
        if (i == sea.H) {
            feb febVarO03 = o0();
            e52 e52VarS2 = febVarO03.s();
            if (e52VarS2 != null) {
                ((k4a) ((pk) febVarO03.u0.getValue())).h(febVarO03.b, e52VarS2.b.a, febVarO03.c);
                pnf.o(febVarO03.C0, new kdb(new eqe(vea.S0), Integer.valueOf(woc.z)));
                pnf.o(febVarO03.B0, new qdb(febVarO03.b));
                return;
            }
            return;
        }
        if (i != sea.K || (e52VarS = (febVarO0 = o0()).s()) == null) {
            return;
        }
        pk pkVar = (pk) febVarO0.u0.getValue();
        long j = e52VarS.b.a;
        long j2 = febVarO0.c;
        ((k4a) pkVar).I(e52VarS.a, j, Collections.singletonList(Long.valueOf(j2)), false, e52VarS.e(j2));
        pnf.o(febVarO0.B0, g43.b);
    }

    public final boolean m0() {
        return ((Boolean) this.X.getValue()).booleanValue();
    }

    public final rdb n0() {
        bc7 bc7Var = x0[2];
        return (rdb) this.o.a(this);
    }

    public final feb o0() {
        return (feb) this.Y.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yh9 yh9VarB;
        yh9 yh9VarB2;
        int i = 0;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int i2 = 3;
        Continuation continuation = null;
        v3c.y(new ro2(i2, continuation, 5), frameLayout);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(sea.Q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        float f = 24;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingRight(), this.v0);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.Z);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        bi9 bi9Var = k37.a;
        bi9 bi9Var2 = new bi9(3);
        bi9Var2.g(2048);
        bi9Var2.g(4096);
        bi9Var2.g(128);
        recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98(this, 21, bi9Var2), null, 12));
        if (m0()) {
            float f2 = 8;
            yh9VarB = e37.b(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, 32768, tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(20 * fk4.d().getDisplayMetrics().density));
        } else {
            float f3 = 6;
            yh9VarB = e37.b(0, tu0.G(fk4.d().getDisplayMetrics().density * f3), 32768, tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f));
        }
        if (m0()) {
            float f4 = 8;
            yh9VarB2 = e37.b(tu0.G(fk4.d().getDisplayMetrics().density * f4), 0, 4096, tu0.G(20 * fk4.d().getDisplayMetrics().density), 32768, tu0.G(f4 * fk4.d().getDisplayMetrics().density), tu0.G(12 * fk4.d().getDisplayMetrics().density));
        } else {
            float f5 = 12;
            yh9VarB2 = e37.b(0, tu0.G(6 * fk4.d().getDisplayMetrics().density), 4096, tu0.G(30 * fk4.d().getDisplayMetrics().density), 32768, tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        }
        float f6 = 12;
        recyclerView.j(new nz7(e37.b(tu0.G(fk4.d().getDisplayMetrics().density * f6), tu0.G(fk4.d().getDisplayMetrics().density * f), 4096, tu0.G(fk4.d().getDisplayMetrics().density * f), 32768, tu0.G(f6 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density)), yh9VarB, yh9VarB2, i));
        frameLayout.addView(recyclerView);
        cla claVar = new cla(frameLayout.getContext(), 6);
        claVar.setId(sea.T);
        claVar.setTitle(m0() ? vea.K0 : vea.n1);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new lka(new heb(this, 0)));
        if (!m0()) {
            claVar.setRightActions(new mka(new heb(this, 1)));
        }
        v3c.y(new ieb(i2, continuation, i), claVar);
        frameLayout.addView(claVar);
        if (m0()) {
            frameLayout.addView((View) this.u0.getValue());
        }
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.u0.b = c32.Y;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        cla claVar = (cla) this.s0.T0(this, x0[3]);
        pla.a(claVar, new h76(claVar, 18, this));
        p0();
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.a(this.lifecycleOwner, new ru3(this, 8));
        }
        t03 t03Var = new t03(o0().B0, 11);
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(t03Var, getViewLifecycleOwner().Q(), fg7Var), new jeb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(o0().C0, 11), getViewLifecycleOwner().Q(), fg7Var), new keb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(o0().F0, getViewLifecycleOwner().Q(), fg7Var), new leb(null, this), 5), getViewLifecycleScope());
    }

    public final void p0() {
        gic gicVar = this.u0;
        if (gicVar.a()) {
            OneMeButton oneMeButton = (OneMeButton) gicVar.getValue();
            if (oneMeButton.getVisibility() == 0) {
                pla.a(oneMeButton, new i76(oneMeButton, this, oneMeButton, 16));
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.t0.T0(this, x0[4]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), this.v0);
        }
    }

    public ProfileEditAdminPermissionsWidget(long j, long j2, rdb rdbVar) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("contact_id", Long.valueOf(j2)), new kpa("permissions_type", rdbVar)));
    }
}
