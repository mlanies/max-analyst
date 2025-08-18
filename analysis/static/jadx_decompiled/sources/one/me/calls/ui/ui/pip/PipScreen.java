package one.me.calls.ui.ui.pip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a2b;
import defpackage.bc7;
import defpackage.hob;
import defpackage.iq9;
import defpackage.je7;
import defpackage.nec;
import defpackage.od2;
import defpackage.qm0;
import defpackage.s4a;
import defpackage.t1b;
import defpackage.tnd;
import defpackage.tu0;
import defpackage.ugf;
import defpackage.xg1;
import defpackage.y7a;
import defpackage.z1b;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/pip/PipScreen;", "Lone/me/sdk/arch/Widget;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class PipScreen extends Widget implements iq9 {
    public static final /* synthetic */ bc7[] o;
    public final qm0 a;
    public final je7 b;
    public final je7 c;

    static {
        hob hobVar = new hob(PipScreen.class, "fakePipView", "getFakePipView()Lone/me/calls/ui/view/pip/CallPipView;", 0);
        nec.a.getClass();
        o = new bc7[]{hobVar};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PipScreen() {
        int i = 0;
        super(null, i, 3, 0 == true ? 1 : 0);
        this.a = binding(new z1b(this, i));
        this.b = tu0.r(3, new z1b(this, 1));
        this.c = tu0.r(3, new s4a(26));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((tnd) this.c.getValue()).getClass();
        tnd.a();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(y7a.q0);
        bc7 bc7Var = o[0];
        frameLayout.addView((xg1) this.a.getValue());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroy() {
        super.onDestroy();
        t1b t1bVar = (t1b) this.b.getValue();
        t1bVar.a.c(t1bVar);
        t1bVar.c = null;
        ((ugf) t1bVar.Y.getValue()).b();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7Var = this.b;
        t1b t1bVar = (t1b) je7Var.getValue();
        bc7 bc7Var = o[0];
        t1bVar.c = (xg1) this.a.getValue();
        od2.L(new zn5(((t1b) je7Var.getValue()).X, new a2b(this, null), 5), getViewLifecycleScope());
    }
}
