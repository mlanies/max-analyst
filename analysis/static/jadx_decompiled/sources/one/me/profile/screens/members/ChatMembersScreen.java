package one.me.profile.screens.members;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.bc7;
import defpackage.bha;
import defpackage.bl2;
import defpackage.bvc;
import defpackage.cla;
import defpackage.dy7;
import defpackage.ek2;
import defpackage.ey8;
import defpackage.fg7;
import defpackage.fs;
import defpackage.gh7;
import defpackage.glc;
import defpackage.hob;
import defpackage.i3a;
import defpackage.j03;
import defpackage.je7;
import defpackage.kka;
import defpackage.kpa;
import defpackage.lk2;
import defpackage.lq0;
import defpackage.m52;
import defpackage.mk2;
import defpackage.mn5;
import defpackage.mr0;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nk2;
import defpackage.nz4;
import defpackage.od2;
import defpackage.oec;
import defpackage.ok2;
import defpackage.pk2;
import defpackage.q7c;
import defpackage.ro8;
import defpackage.ru3;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.vha;
import defpackage.w12;
import defpackage.wea;
import defpackage.x27;
import defpackage.ys;
import defpackage.zn5;
import defpackage.zr6;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/members/ChatMembersScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lbha;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lek2;", "chatMemberType", "(JLek2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMembersScreen extends Widget implements ng3, bha {
    public static final /* synthetic */ bc7[] u0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final String o;
    public final q7c s0;
    public vha t0;

    static {
        hob hobVar = new hob(ChatMembersScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        u0 = new bc7[]{hobVar, zr6.e(oecVar, ChatMembersScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(ChatMembersScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar)};
    }

    public ChatMembersScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new m52(19), null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "profile:memberslist:id");
        this.o = ey8.i(m0(), "profile:chatMembersList:{", "}");
        this.X = createViewModelLazy(bl2.class, new ti2(3, new lk2(this, 0)));
        this.Y = createViewModelLazy(ro8.class, new ti2(4, new lk2(this, 1)));
        this.Z = viewBinding(wea.F0);
        mn5 mn5Var = n0().y0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(mn5Var, gh7VarQ, fg7Var), new nk2(null, this), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(o0().X, this.lifecycleOwner.Q(), fg7Var), new ok2(null, this), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(n0().x0, this.lifecycleOwner.Q(), fg7Var), new lq0(2, this, ChatMembersScreen.class, "processEvents", "processEvents(Lone/me/profile/screens/members/ProfileListMembersEvents;)V", 4, 7), 5), getLifecycleScope());
        this.s0 = childSlotRouter(wea.w0);
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
    public final x27 getA() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getX() {
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
        long[] longArray2;
        int i2 = wea.B0;
        List list = nz4.a;
        List listL0 = null;
        if (i == i2 || i == wea.A0) {
            if (bundle != null && (longArray = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listL0 = ys.l0(longArray);
            }
            if (listL0 != null) {
                list = listL0;
            }
            o0().q();
            o0().s(list);
            n0().u(list, false);
            return;
        }
        if (i == wea.D0) {
            if (bundle != null && (longArray2 = bundle.getLongArray("profile:memberslist:ids_to_delete")) != null) {
                listL0 = ys.l0(longArray2);
            }
            if (listL0 != null) {
                list = listL0;
            }
            o0().q();
            o0().s(list);
            n0().u(list, true);
        }
    }

    public final long m0() {
        bc7 bc7Var = u0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final bl2 n0() {
        return (bl2) this.X.getValue();
    }

    public final ro8 o0() {
        return (ro8) this.Y.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(wea.F0);
        claVar.setLeftActions(new kka(new mk2(this, 0)));
        linearLayout.addView(claVar);
        w12 w12Var = new w12(linearLayout.getContext());
        w12Var.setId(wea.w0);
        w12Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(w12Var);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        mr0.I(p0());
        o0().q();
        vha vhaVar = this.t0;
        if (vhaVar != null) {
            vhaVar.a();
        }
        this.t0 = null;
        n0().w();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.a(getViewLifecycleOwner(), new ru3(this, 4));
        }
        ((j03) this.s0.T0(this, u0[2])).d("members_list_widget", new lk2(this, 2));
        od2.L(new zn5(tu0.g(o0().s0, getViewLifecycleOwner().Q(), fg7.o), new pk2(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.bha
    public final void p() {
        o0().u(null);
    }

    public final cla p0() {
        return (cla) this.Z.T0(this, u0[1]);
    }

    public ChatMembersScreen(long j, ek2 ek2Var) {
        this(dy7.g(new kpa("profile:memberslist:id", Long.valueOf(j)), new kpa("profile:memberslist:type", ek2Var.a)));
    }
}
