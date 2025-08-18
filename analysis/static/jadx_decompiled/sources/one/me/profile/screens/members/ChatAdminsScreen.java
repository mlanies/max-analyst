package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bc7;
import defpackage.bha;
import defpackage.bvc;
import defpackage.cla;
import defpackage.dk1;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.ey8;
import defpackage.fg7;
import defpackage.fs;
import defpackage.gh7;
import defpackage.gjb;
import defpackage.glc;
import defpackage.hob;
import defpackage.j03;
import defpackage.je7;
import defpackage.kka;
import defpackage.kpa;
import defpackage.l;
import defpackage.l52;
import defpackage.lq0;
import defpackage.m52;
import defpackage.mr0;
import defpackage.n52;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nz4;
import defpackage.od2;
import defpackage.oec;
import defpackage.pka;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.ro8;
import defpackage.s;
import defpackage.s35;
import defpackage.tu0;
import defpackage.u52;
import defpackage.vha;
import defpackage.w12;
import defpackage.wea;
import defpackage.x27;
import defpackage.xka;
import defpackage.yea;
import defpackage.ys;
import defpackage.zn5;
import defpackage.zr6;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/profile/screens/members/ChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lbha;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatAdminsScreen extends Widget implements ng3, bha {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final String o;
    public final je7 s0;
    public final q7c t0;
    public vha u0;
    public final q7c v0;

    static {
        hob hobVar = new hob(ChatAdminsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        w0 = new bc7[]{hobVar, zr6.e(oecVar, ChatAdminsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(ChatAdminsScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar)};
    }

    public ChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new dk1(28), null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "id");
        this.o = ey8.i(n0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(u52.class, new s(25, new l52(this, 1)));
        this.Y = createViewModelLazy(ro8.class, new s(26, new l52(this, 2)));
        this.Z = tu0.r(3, new dk1(29));
        this.s0 = tu0.r(3, new m52(0));
        this.t0 = viewBinding(wea.G0);
        s35 s35Var = o0().X;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, gh7VarQ, fg7Var), new n52(this, null), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(m0().w0, this.lifecycleOwner.Q(), fg7Var), new lq0(2, this, ChatAdminsScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 5), 5), getLifecycleScope());
        this.v0 = childSlotRouter(wea.x0);
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        o0().u(String.valueOf(charSequence));
    }

    @Override // defpackage.bha
    public final void U() {
        o0().u(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getY() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getB() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        long[] longArray;
        if (i == wea.y0) {
            List listL0 = (bundle == null || (longArray = bundle.getLongArray("profile:adminslist:ids_to_delete")) == null) ? null : ys.l0(longArray);
            if (listL0 == null) {
                listL0 = nz4.a;
            }
            o0().s(listL0);
            u52 u52VarM0 = m0();
            u52VarM0.v0.addAll(listL0);
            pnf.o(u52VarM0.w0, new gjb(new eqe(yea.d2)));
        }
    }

    public final u52 m0() {
        return (u52) this.X.getValue();
    }

    public final long n0() {
        bc7 bc7Var = w0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final ro8 o0() {
        return (ro8) this.Y.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(wea.G0);
        claVar.setTitle(yea.u2);
        claVar.setLeftActions(new kka(new l(24, this)));
        claVar.setRightActions(new pka(null, new xka(this)));
        linearLayout.addView(claVar);
        w12 w12Var = new w12(linearLayout.getContext());
        w12Var.setId(wea.x0);
        w12Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(w12Var);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        mr0.I((cla) this.t0.T0(this, w0[1]));
        vha vhaVar = this.u0;
        if (vhaVar != null) {
            vhaVar.a();
        }
        this.u0 = null;
        m0().r();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((j03) this.v0.T0(this, w0[2])).d("admins_list_widget", new l52(this, 0));
    }

    @Override // defpackage.bha
    public final void p() {
        o0().u(null);
    }

    public ChatAdminsScreen(long j) {
        this(dy7.g(new kpa("id", Long.valueOf(j))));
    }
}
