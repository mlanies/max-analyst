package one.me.profile.screens.changeowner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a32;
import defpackage.bc7;
import defpackage.bha;
import defpackage.bvc;
import defpackage.cla;
import defpackage.coc;
import defpackage.dk1;
import defpackage.dy7;
import defpackage.e52;
import defpackage.ek2;
import defpackage.eqe;
import defpackage.ey8;
import defpackage.fg7;
import defpackage.fs;
import defpackage.glc;
import defpackage.go8;
import defpackage.hdb;
import defpackage.hob;
import defpackage.iy2;
import defpackage.j03;
import defpackage.je7;
import defpackage.jz2;
import defpackage.k4a;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.l;
import defpackage.md1;
import defpackage.mr0;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nkb;
import defpackage.od2;
import defpackage.oec;
import defpackage.pk;
import defpackage.pka;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.ro8;
import defpackage.s;
import defpackage.s35;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.u22;
import defpackage.v22;
import defpackage.w12;
import defpackage.w22;
import defpackage.w9a;
import defpackage.wea;
import defpackage.woc;
import defpackage.x22;
import defpackage.x27;
import defpackage.xka;
import defpackage.yea;
import defpackage.z22;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.members.list.MembersListWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/changeowner/ChangeOwnerScreen;", "Lone/me/sdk/arch/Widget;", "Lbha;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "leaveFromChat", "(JZ)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChangeOwnerScreen extends Widget implements bha, ng3 {
    public static final /* synthetic */ bc7[] u0;
    public final String X;
    public final je7 Y;
    public final je7 Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final fs o;
    public final q7c s0;
    public final q7c t0;

    static {
        hob hobVar = new hob(ChangeOwnerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        u0 = new bc7[]{hobVar, zr6.e(oecVar, ChangeOwnerScreen.class, "leaveFromChat", "getLeaveFromChat()Z", 0), zr6.f(ChangeOwnerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(ChangeOwnerScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar)};
    }

    public ChangeOwnerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new dk1(25), null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "chat_id");
        this.o = new fs(Boolean.class, "leave_chat");
        this.X = ey8.i(m0(), "profile:chatMembersList:{", "}");
        this.Y = createViewModelLazy(a32.class, new s(23, new md1(7, this)));
        this.Z = createViewModelLazy(ro8.class, new s(24, new dk1(26)));
        this.s0 = viewBinding(wea.t);
        this.t0 = childSlotRouter(wea.s);
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        ((ro8) this.Z.getValue()).u(String.valueOf(charSequence));
    }

    @Override // defpackage.bha
    public final void U() {
        ((ro8) this.Z.getValue()).u(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getC() {
        return this.X;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i != wea.q || bundle == null) {
            return;
        }
        long j = bundle.getLong("new_owner_id");
        a32 a32Var = (a32) this.Y.getValue();
        boolean zN0 = n0();
        jz2 jz2Var = (jz2) ((iy2) a32Var.o.getValue());
        long j2 = a32Var.b;
        e52 e52Var = (e52) jz2Var.m(j2).a.getValue();
        if (e52Var != null) {
            pk pkVar = (pk) a32Var.c.getValue();
            ((k4a) pkVar).h(a32Var.b, e52Var.b.a, j);
            s35 s35Var = a32Var.s0;
            if (zN0) {
                pnf.n(a32Var, ((w9a) ((kke) a32Var.Y.getValue())).b(), null, new z22(a32Var, null), 2);
                pnf.o(s35Var, new x22(new eqe(yea.d0), Integer.valueOf(woc.z)));
            } else {
                pnf.o(s35Var, new x22(new eqe(yea.k0), Integer.valueOf(woc.z)));
                pnf.o(a32Var.Z, new nkb(j2, hdb.c));
            }
        }
    }

    public final long m0() {
        bc7 bc7Var = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final boolean n0() {
        bc7 bc7Var = u0[1];
        return ((Boolean) this.o.a(this)).booleanValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(wea.t);
        claVar.setTitle(yea.m0);
        claVar.setLeftActions(new kka(new l(23, this)));
        claVar.setRightActions(new pka(null, new xka(this)));
        linearLayout.addView(claVar);
        w12 w12Var = new w12(linearLayout.getContext());
        w12Var.setId(wea.s);
        w12Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(w12Var);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        mr0.I((cla) this.s0.T0(this, u0[2]));
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        j03 j03Var = (j03) this.t0.T0(this, u0[3]);
        if (!tpa.f(j03Var.c(), "change_owner_widget")) {
            coc cocVar = new coc(new MembersListWidget(this.X, new go8(m0(), ek2.MEMBER, (Integer) null, 12), null), null, null, null, false, -1);
            cocVar.d("change_owner_widget");
            j03Var.a.R(cocVar);
        }
        s35 s35Var = ((ro8) this.Z.getValue()).X;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new u22(null, this), 5), getViewLifecycleScope());
        je7 je7Var = this.Y;
        od2.L(new zn5(tu0.g(((a32) je7Var.getValue()).Z, getViewLifecycleOwner().Q(), fg7Var), new v22(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((a32) je7Var.getValue()).s0, getViewLifecycleOwner().Q(), fg7Var), new w22(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.bha
    public final void p() {
        ((ro8) this.Z.getValue()).u(null);
    }

    public ChangeOwnerScreen(long j, boolean z) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("leave_chat", Boolean.valueOf(z))));
    }
}
