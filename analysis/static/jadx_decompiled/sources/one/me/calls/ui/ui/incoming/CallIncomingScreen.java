package one.me.calls.ui.ui.incoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b8a;
import defpackage.bc7;
import defpackage.crd;
import defpackage.dy7;
import defpackage.e91;
import defpackage.eua;
import defpackage.hob;
import defpackage.i3a;
import defpackage.iq9;
import defpackage.je7;
import defpackage.k11;
import defpackage.kr1;
import defpackage.l5g;
import defpackage.n31;
import defpackage.nec;
import defpackage.od2;
import defpackage.q7c;
import defpackage.ru3;
import defpackage.rvb;
import defpackage.s;
import defpackage.tu0;
import defpackage.x2;
import defpackage.x5;
import defpackage.y81;
import defpackage.yi1;
import defpackage.z81;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/calls/ui/ui/incoming/CallIncomingScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "crd", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallIncomingScreen extends Widget implements iq9 {
    public static final crd Z;
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final je7 Y;
    public final kr1 a;
    public final je7 b;
    public final q7c c;
    public final je7 o;

    static {
        hob hobVar = new hob(CallIncomingScreen.class, "avatarView", "getAvatarView()Lone/me/calls/ui/view/CallUserLargeView;", 0);
        nec.a.getClass();
        s0 = new bc7[]{hobVar};
        Z = new crd();
    }

    public CallIncomingScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = n31.a.d();
        this.b = createViewModelLazy(e91.class, new s(13, new x2(bundle, this, 9)));
        this.c = viewBinding(rvb.call_incoming_avatar);
        this.o = tu0.r(3, new k11(12));
        this.X = yi1.c();
        this.Y = tu0.r(3, new x5(26, this));
    }

    public final e91 m0() {
        return (e91) this.b.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new y81(this, getContext());
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 160 && eua.l((eua) this.o.getValue(), (l5g) this.Y.getValue(), strArr, iArr, eua.h, b8a.D, b8a.C)) {
            m0().q();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        dy7.D(requireActivity(), true);
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.a(getViewLifecycleOwner(), new ru3(this, 1));
        }
        od2.L(new zn5(m0().u0, new z81(this, null), 5), getViewLifecycleScope());
    }
}
