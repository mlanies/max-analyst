package one.me.startconversation.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.aja;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.c7a;
import defpackage.cla;
import defpackage.eqe;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.glc;
import defpackage.j0e;
import defpackage.je7;
import defpackage.jpc;
import defpackage.kka;
import defpackage.kr0;
import defpackage.l5g;
import defpackage.lwa;
import defpackage.mwa;
import defpackage.nec;
import defpackage.nwa;
import defpackage.nyd;
import defpackage.o9;
import defpackage.od2;
import defpackage.oi9;
import defpackage.owa;
import defpackage.q0e;
import defpackage.qwa;
import defpackage.qza;
import defpackage.r0e;
import defpackage.r8a;
import defpackage.s4a;
import defpackage.sya;
import defpackage.tn8;
import defpackage.tu0;
import defpackage.uka;
import defpackage.wz4;
import defpackage.wz7;
import defpackage.xx5;
import defpackage.ys;
import defpackage.z6a;
import defpackage.zia;
import defpackage.zn5;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/startconversation/chat/PickChatMembers;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lqwa;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PickChatMembers extends AbstractPickerScreen<qwa> {
    public static final /* synthetic */ bc7[] x0;
    public final fs t0;
    public final je7 u0;
    public final glc v0;
    public final q0e w0;

    static {
        oi9 oi9Var = new oi9(PickChatMembers.class, "selectedIds", "getSelectedIds()[J");
        nec.a.getClass();
        x0 = new bc7[]{oi9Var};
    }

    public PickChatMembers() {
        super(new Bundle(0));
        this.t0 = new fs(long[].class, "selected_ids");
        this.u0 = nyd.a.getAccessor().d(eua.class);
        this.v0 = new glc(new s4a(13), null, 6);
        this.w0 = r0e.a(new eqe(aja.w));
        od2.L(new zn5(v0().Z, new mwa(null, this), 5), getLifecycleScope());
        kr0 kr0Var = new kr0(this, new lwa(0, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 10));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.v0;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(r8a.Q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams.setMargins(iG, iG, iG, iG);
        oneMeButton.setLayoutParams(layoutParams);
        tu0.K(oneMeButton, 300L, new xx5(25, this));
        od2.L(new zn5(v0().Z, new nwa(oneMeButton, null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        return (tn8) nyd.a.getAccessor().c(tn8.class);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        return new PickerMembersListWidget(str, 0L, false, 6, null);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eua euaVar = (eua) this.u0.getValue();
            l5g l5gVar = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            euaVar.getClass();
            eua.k(l5gVar, strArr, iArr, strArr2, i2, i3);
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((qwa) v0().c).e, getViewLifecycleOwner().Q(), fg7.o), new owa(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        cla claVar = new cla(context, 6);
        claVar.setId(zia.k);
        claVar.setTitle(aja.g);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new wz7(15, this)));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() {
        return new qwa();
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
}
