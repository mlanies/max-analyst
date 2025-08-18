package one.me.profile.screens.addmembers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.c5;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.glc;
import defpackage.hob;
import defpackage.j0e;
import defpackage.j47;
import defpackage.j9;
import defpackage.k9;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.kr0;
import defpackage.l;
import defpackage.l9;
import defpackage.m;
import defpackage.m9;
import defpackage.n9;
import defpackage.nec;
import defpackage.ng3;
import defpackage.o9;
import defpackage.od2;
import defpackage.q0e;
import defpackage.qza;
import defpackage.r0e;
import defpackage.rh4;
import defpackage.sx3;
import defpackage.sya;
import defpackage.tn8;
import defpackage.tu0;
import defpackage.uka;
import defpackage.vx3;
import defpackage.w9a;
import defpackage.wea;
import defpackage.wz4;
import defpackage.x5;
import defpackage.xcb;
import defpackage.yea;
import defpackage.ys;
import defpackage.z6a;
import defpackage.zn5;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/addmembers/AddChatMembersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lk9;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AddChatMembersScreen extends AbstractPickerScreen<k9> implements ng3 {
    public static final /* synthetic */ bc7[] x0 = {new hob(AddChatMembersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), rh4.g(nec.a, AddChatMembersScreen.class, "selectedIds", "getSelectedIds()[J")};
    public final fs t0;
    public final fs u0;
    public final glc v0;
    public final q0e w0;

    public AddChatMembersScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new fs(Long.class, 0L, "chat_id");
        this.u0 = new fs(long[].class, "selected_ids");
        this.v0 = new glc(new m(2), null, 6);
        this.w0 = r0e.a(new eqe(yea.d));
        od2.L(new zn5(v0().Z, new l9(null, this), 5), getLifecycleScope());
        kr0 kr0Var = new kr0(this, new x5(3, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 0));
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.v0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == wea.h) {
            return;
        }
        k9 k9Var = (k9) v0().c;
        Set set = (Set) v0().Z.a.getValue();
        sx3 sx3Var = k9Var.d;
        k9Var.g.o1(k9Var, k9.i[0], sx3Var != null ? j47.S(sx3Var, ((w9a) ((kke) k9Var.c.getValue())).b(), vx3.b, new j9(i, k9Var, set, null)) : null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(((k9) v0().c).h ? yea.c : yea.b);
        oneMeButton.c(1, false);
        oneMeButton.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams.setMargins(iG, iG, iG, iG);
        oneMeButton.setLayoutParams(layoutParams);
        tu0.K(oneMeButton, 300L, new c5(5, this));
        od2.L(new zn5(v0().Z, new m9(oneMeButton, null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        return (tn8) xcb.a.getAccessor().c(tn8.class);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        bc7 bc7Var = x0[0];
        return new PickerMembersListWidget(str, ((Number) this.t0.a(this)).longValue(), true, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((k9) v0().c).f, getViewLifecycleOwner().Q(), fg7.o), new n9(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        cla claVar = new cla(context, 6);
        claVar.setId(wea.k);
        claVar.setTitle(((k9) v0().c).h ? yea.f : yea.e);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new l(3, this)));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() {
        bc7 bc7Var = x0[0];
        long jLongValue = ((Number) this.t0.a(this)).longValue();
        xcb xcbVar = xcb.a;
        return new k9(jLongValue, xcbVar.c(), xcbVar.f());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final j0e s0() {
        return this.w0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setN0 = longArray != null ? ys.n0(longArray) : null;
        return setN0 == null ? wz4.a : setN0;
    }

    public AddChatMembersScreen(long j) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j))));
    }
}
