package one.me.profile.screens.invite;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.c64;
import defpackage.cib;
import defpackage.ckb;
import defpackage.dp3;
import defpackage.dy7;
import defpackage.ee1;
import defpackage.eh2;
import defpackage.eqe;
import defpackage.fg7;
import defpackage.gh7;
import defpackage.glc;
import defpackage.hdb;
import defpackage.hob;
import defpackage.iba;
import defpackage.j47;
import defpackage.je7;
import defpackage.jib;
import defpackage.jp8;
import defpackage.kke;
import defpackage.kpa;
import defpackage.lab;
import defpackage.mg3;
import defpackage.mhb;
import defpackage.mkd;
import defpackage.nec;
import defpackage.ng3;
import defpackage.od2;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.shb;
import defpackage.thb;
import defpackage.tu0;
import defpackage.uhb;
import defpackage.v3c;
import defpackage.vxd;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wea;
import defpackage.whb;
import defpackage.wz7;
import defpackage.x27;
import defpackage.xcb;
import defpackage.xhb;
import defpackage.xt3;
import defpackage.y53;
import defpackage.yea;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/invite/ProfileInviteScreen;", "Lone/me/sdk/arch/Widget;", "Lwhb;", "Lng3;", "Lmkd;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileInviteScreen extends Widget implements whb, ng3, mkd, xt3 {
    public static final /* synthetic */ bc7[] Y;
    public final q7c X;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final xhb o;

    static {
        hob hobVar = new hob(ProfileInviteScreen.class, "moreActionsButton", "getMoreActionsButton()Landroid/widget/ImageView;", 0);
        nec.a.getClass();
        Y = new bc7[]{hobVar};
    }

    public ProfileInviteScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new lab(19), null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(jib.class, new jp8(19, new eh2(bundle, 7)));
        xhb xhbVar = new xhb(((iba) xcb.a.getAccessor().c(iba.class)).a(), this);
        this.o = xhbVar;
        this.X = viewBinding(wea.J);
        w7c w7cVar = m0().A0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, gh7VarQ, fg7Var), new shb(2, xhbVar, xhb.class, "submitList", "submitList(Ljava/util/List;)V", 4, 0), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(m0().C0, this.lifecycleOwner.Q(), fg7Var), new thb(this, null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(m0().B0, this.lifecycleOwner.Q(), fg7Var), new uhb(this, null), 5), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getX() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        jib jibVarM0 = m0();
        jibVarM0.getClass();
        if (i == wea.N) {
            ckb ckbVar = ckb.c;
            dp3 dp3Var = hdb.b;
            ckbVar.getClass();
            pnf.o(jibVarM0.B0, new c64(zr6.k(new StringBuilder(":profile?id="), jibVarM0.b, "&type=local_chat")));
            jibVarM0.y0.set(false);
            return;
        }
        if (i == wea.G) {
            vxd vxdVarT = j47.T(jibVarM0.a, ((w9a) ((kke) jibVarM0.o.getValue())).b(), null, new cib(jibVarM0, null), 2);
            jibVarM0.v0.o1(jibVarM0, jib.D0[0], vxdVarT);
        }
    }

    public final jib m0() {
        return (jib) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        wz7 wz7Var = new wz7(25, this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        v3c.y(new ee1(3, null, 2), linearLayout);
        wz7Var.invoke(linearLayout);
        return linearLayout;
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        jib jibVarM0 = m0();
        jibVarM0.getClass();
        if (i == wea.K) {
            pnf.o(jibVarM0.C0, new mhb(new eqe(yea.a1), new eqe(yea.Z0), y53.M(new mg3(wea.G, new eqe(yea.W0), 3, false), new mg3(wea.y, new eqe(yea.X0), 2, false))));
        }
    }

    public ProfileInviteScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
