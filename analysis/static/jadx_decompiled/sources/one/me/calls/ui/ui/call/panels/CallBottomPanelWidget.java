package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a51;
import defpackage.ac;
import defpackage.bc7;
import defpackage.dy7;
import defpackage.el1;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fs;
import defpackage.h21;
import defpackage.hl1;
import defpackage.hob;
import defpackage.im;
import defpackage.j21;
import defpackage.je7;
import defpackage.k21;
import defpackage.kpa;
import defpackage.l21;
import defpackage.m21;
import defpackage.m38;
import defpackage.mqd;
import defpackage.n21;
import defpackage.n31;
import defpackage.nec;
import defpackage.od2;
import defpackage.q7c;
import defpackage.r11;
import defpackage.rh4;
import defpackage.rt3;
import defpackage.rvb;
import defpackage.s;
import defpackage.suc;
import defpackage.sy4;
import defpackage.tu0;
import defpackage.w4d;
import defpackage.x5;
import defpackage.xt3;
import defpackage.z84;
import defpackage.zn5;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallBottomPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallBottomPanelWidget extends Widget implements xt3 {
    public static final /* synthetic */ bc7[] s0 = {new hob(CallBottomPanelWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), rh4.g(nec.a, CallBottomPanelWidget.class, "audioLevelJob", "getAudioLevelJob()Lkotlinx/coroutines/Job;"), new hob(CallBottomPanelWidget.class, "callBottomPanel", "getCallBottomPanel()Lone/me/calls/ui/view/controls/CallBottomControlViewWrapper;", 0)};
    public final w4d X;
    public rt3 Y;
    public final q7c Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;

    public CallBottomPanelWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final r11 m0() {
        return (r11) this.Z.T0(this, s0[2]);
    }

    public final h21 n0() {
        return (h21) this.o.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        ac acVar = n0().Z;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7Var), new j21(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().s0, getViewLifecycleOwner().Q(), fg7Var), new k21(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().u0, getViewLifecycleOwner().Q(), fg7Var), new l21(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().w0, getViewLifecycleOwner().Q(), fg7Var), new m21(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().v0, getViewLifecycleOwner().Q(), fg7Var), new n21(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r11 r11Var = new r11(getContext());
        r11Var.setId(rvb.call_bottom_control);
        r11Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return r11Var;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.X.o1(this, s0[1], null);
        m0().a();
        rt3 rt3Var = this.Y;
        if (rt3Var != null) {
            rt3Var.dismiss();
        }
        this.Y = null;
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        this.Y = null;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        je7 je7Var = this.a;
        boolean z = false;
        boolean z2 = i == 159 && ((eua) je7Var.getValue()).b(eua.l);
        if (i == 160 && ((eua) je7Var.getValue()).b(eua.h)) {
            z = true;
        }
        m38 m38Var = m38.b;
        if (z2) {
            n0().u(m38Var);
        } else if (z) {
            n0().s(m38Var);
        }
        if (z2 || z) {
            hl1 hl1Var = (hl1) this.b.getValue();
            im imVarRequireActivity = requireActivity();
            hl1Var.getClass();
            hl1.d(imVarRequireActivity);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        m0().setClickListener(new sy4(5, this));
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        Object next;
        CallsAudioDeviceInfo callsAudioDeviceInfoB;
        h21 h21VarN0 = n0();
        Iterator it = h21VarN0.q().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((a51) next).getId() == i) {
                    break;
                }
            }
        }
        a51 a51Var = (a51) next;
        if (a51Var == null || (callsAudioDeviceInfoB = a51Var.b()) == null) {
            return;
        }
        h21VarN0.r().l(callsAudioDeviceInfoB);
    }

    public CallBottomPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        n31 n31Var = n31.a;
        this.a = n31Var.getAccessor().d(eua.class);
        this.b = n31Var.getAccessor().d(hl1.class);
        bc7 bc7Var = s0[0];
        this.c = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, null);
        this.o = createViewModelLazy(h21.class, new s(9, new x5(20, this)));
        this.X = mqd.D();
        this.Z = viewBinding(rvb.call_bottom_control);
    }
}
