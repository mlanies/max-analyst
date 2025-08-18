package one.me.startconversation.channel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.aja;
import defpackage.bc7;
import defpackage.cla;
import defpackage.dxa;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.fs;
import defpackage.fxa;
import defpackage.gh3;
import defpackage.gxa;
import defpackage.hob;
import defpackage.ixa;
import defpackage.iy2;
import defpackage.j0e;
import defpackage.jxa;
import defpackage.k56;
import defpackage.khe;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.kr0;
import defpackage.nec;
import defpackage.nyd;
import defpackage.o9;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pk;
import defpackage.q0e;
import defpackage.qm0;
import defpackage.qza;
import defpackage.r0e;
import defpackage.s4a;
import defpackage.sya;
import defpackage.tn8;
import defpackage.uka;
import defpackage.vha;
import defpackage.wz4;
import defpackage.xwa;
import defpackage.ys;
import defpackage.z7b;
import defpackage.zia;
import defpackage.zn5;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.channel.PickSubscribersScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/channel/PickSubscribersScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lxwa;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickSubscribersScreen extends AbstractPickerScreen<xwa> {
    public static final /* synthetic */ bc7[] z0 = {new oi9(PickSubscribersScreen.class, "selectedIds", "getSelectedIds()[J"), z7b.g(nec.a, PickSubscribersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new hob(PickSubscribersScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final fs t0;
    public final fs u0;
    public final khe v0;
    public vha w0;
    public final q0e x0;
    public final qm0 y0;

    public PickSubscribersScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new fs(long[].class, "selected_ids");
        this.u0 = new fs(Long.class, "id");
        this.v0 = new khe(new s4a(14));
        this.x0 = r0e.a(new eqe(aja.w));
        final int i = 0;
        this.y0 = binding(new k56(this) { // from class: exa
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = PickSubscribersScreen.z0;
                        OneMeButton oneMeButton = new OneMeButton(pickSubscribersScreen.getContext(), null);
                        oneMeButton.setId(zia.l);
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setAppearance(z6a.o);
                        oneMeButton.setMode(b7a.a);
                        oneMeButton.setText(r8a.Q);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iG, iG, iG, iG);
                        oneMeButton.setLayoutParams(layoutParams);
                        return oneMeButton;
                    default:
                        bc7[] bc7VarArr2 = PickSubscribersScreen.z0;
                        int i2 = vc7.a;
                        if (vc7.b(vc7.c)) {
                            mr0.G(pickSubscribersScreen);
                        }
                        return e5f.a;
                }
            }
        });
        od2.L(new zn5(v0().Z, new gxa(this, null), 5), getLifecycleScope());
        final int i2 = 1;
        kr0 kr0Var = new kr0(this, new k56(this) { // from class: exa
            public final /* synthetic */ PickSubscribersScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                PickSubscribersScreen pickSubscribersScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = PickSubscribersScreen.z0;
                        OneMeButton oneMeButton = new OneMeButton(pickSubscribersScreen.getContext(), null);
                        oneMeButton.setId(zia.l);
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setAppearance(z6a.o);
                        oneMeButton.setMode(b7a.a);
                        oneMeButton.setText(r8a.Q);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                        layoutParams.setMargins(iG, iG, iG, iG);
                        oneMeButton.setLayoutParams(layoutParams);
                        return oneMeButton;
                    default:
                        bc7[] bc7VarArr2 = PickSubscribersScreen.z0;
                        int i22 = vc7.a;
                        if (vc7.b(vc7.c)) {
                            mr0.G(pickSubscribersScreen);
                        }
                        return e5f.a;
                }
            }
        });
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 11));
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        od2.L(new zn5(v0().Z, new ixa(this, null), 5), getViewLifecycleScope());
        return Collections.singletonList(x0());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        return (tn8) nyd.a.getAccessor().c(tn8.class);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        return new PickerMembersListWidget(str, 0L, false, 6, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(((xwa) v0().c).h, new jxa(this, null), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        cla claVar = new cla(context, 6);
        claVar.setId(zia.p);
        claVar.setTitle(aja.e);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new fxa(this, 0)));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() {
        bc7 bc7Var = z0[1];
        long jLongValue = ((Number) this.u0.a(this)).longValue();
        nyd nydVar = nyd.a;
        return new xwa(jLongValue, nydVar.getAccessor().d(pk.class), nydVar.getAccessor().d(kke.class), nydVar.getAccessor().d(iy2.class), nydVar.getAccessor().d(dxa.class), nydVar.getAccessor().d(gh3.class));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final j0e s0() {
        return this.x0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set w0(Bundle bundle) {
        long[] longArray = bundle.getLongArray("selected_ids");
        Set setN0 = longArray != null ? ys.n0(longArray) : null;
        return setN0 == null ? wz4.a : setN0;
    }

    public final OneMeButton x0() {
        bc7 bc7Var = z0[2];
        return (OneMeButton) this.y0.getValue();
    }

    public PickSubscribersScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
