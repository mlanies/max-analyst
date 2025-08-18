package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.as3;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.c5;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.hob;
import defpackage.j0e;
import defpackage.je7;
import defpackage.jy2;
import defpackage.kke;
import defpackage.kpa;
import defpackage.kr0;
import defpackage.lka;
import defpackage.md1;
import defpackage.nec;
import defpackage.o9;
import defpackage.od2;
import defpackage.p8a;
import defpackage.q33;
import defpackage.qn3;
import defpackage.qza;
import defpackage.r0e;
import defpackage.r8a;
import defpackage.sya;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.va8;
import defpackage.vm9;
import defpackage.vr3;
import defpackage.wr3;
import defpackage.wuc;
import defpackage.wz4;
import defpackage.x3c;
import defpackage.xr3;
import defpackage.ys2;
import defpackage.z6a;
import defpackage.zn5;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/contacts/ContactsPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Las3;", "Lvm9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "requestCode", "(I)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ContactsPickerScreen extends AbstractPickerScreen<as3> implements vm9 {
    public static final /* synthetic */ bc7[] v0;
    public final fs t0;
    public final x3c u0;

    static {
        hob hobVar = new hob(ContactsPickerScreen.class, "requestCode", "getRequestCode()I", 0);
        nec.a.getClass();
        v0 = new bc7[]{hobVar};
    }

    public ContactsPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new fs(Integer.class, 0, "contacts.picker.request_code.key");
        kr0 kr0Var = new kr0(this, new md1(28, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 1));
        }
        ys2 ys2Var = ys2.a;
        this.u0 = new x3c(ys2Var.getAccessor().d(q33.class), ys2Var.getAccessor().d(kke.class), (je7) null, 12);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(r8a.I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams.setMargins(iG, iG, iG, iG);
        oneMeButton.setLayoutParams(layoutParams);
        tu0.K(oneMeButton, 300L, new c5(23, this));
        od2.L(new zn5(v0().Z, new vr3(oneMeButton, null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        return new va8(ys2.a.getAccessor().d(qn3.class), this.u0, false, 13);
    }

    @Override // defpackage.vm9
    public final wuc o() {
        return wuc.CHAT_SHARE_CONTACT;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        return new PickerContactsListWidget(str, null);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        v3c.y(new xr3(3, null, 0), view);
        od2.L(new zn5(tu0.g(((as3) v0().c).g, getViewLifecycleOwner().Q(), fg7.o), new wr3(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        cla claVar = new cla(context, 6);
        claVar.setId(p8a.Z);
        claVar.setTitle(r8a.J);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new lka(new jy2(5, this)));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() {
        ys2 ys2Var = ys2.a;
        return new as3(ys2Var.getAccessor().d(qn3.class), ys2Var.getAccessor().d(kke.class), this.u0);
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final j0e s0() {
        return r0e.a(new eqe(r8a.H));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set w0(Bundle bundle) {
        return wz4.a;
    }

    public ContactsPickerScreen(int i) {
        this(dy7.g(new kpa("contacts.picker.request_code.key", Integer.valueOf(i))));
    }
}
