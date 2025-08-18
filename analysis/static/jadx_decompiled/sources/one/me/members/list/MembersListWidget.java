package one.me.members.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a3g;
import defpackage.ac;
import defpackage.ar0;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.bp8;
import defpackage.c03;
import defpackage.cp8;
import defpackage.dp8;
import defpackage.dy7;
import defpackage.eda;
import defpackage.ek2;
import defpackage.ep8;
import defpackage.fg7;
import defpackage.fo8;
import defpackage.fp8;
import defpackage.fs;
import defpackage.gn8;
import defpackage.go8;
import defpackage.gp8;
import defpackage.hob;
import defpackage.j81;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jv5;
import defpackage.ko8;
import defpackage.kpa;
import defpackage.lo8;
import defpackage.lp8;
import defpackage.lq0;
import defpackage.md3;
import defpackage.mqd;
import defpackage.nd3;
import defpackage.nec;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.rh4;
import defpackage.ro8;
import defpackage.suc;
import defpackage.tu0;
import defpackage.w4d;
import defpackage.w54;
import defpackage.x27;
import defpackage.x77;
import defpackage.xt3;
import defpackage.y51;
import defpackage.z7;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/members/list/MembersListWidget;", "Lone/me/sdk/arch/Widget;", "Lfo8;", "Lgn8;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lgo8;", "(Ljava/lang/String;Lgo8;Lz84;)V", "members-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MembersListWidget extends Widget implements fo8, gn8, xt3 {
    public static final /* synthetic */ bc7[] D0 = {new hob(MembersListWidget.class, "membersListArgs", "getMembersListArgs()Lone/me/members/list/MembersListArgs;", 0), rh4.g(nec.a, MembersListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new oi9(MembersListWidget.class, "selectedMemberIdForAction", "getSelectedMemberIdForAction()Ljava/lang/Long;"), new hob(MembersListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final q7c A0;
    public c03 B0;
    public w54 C0;
    public final w4d X;
    public final je7 Y;
    public final fs Z;
    public final fs a;
    public final long b;
    public final ek2 c;
    public final Integer o;
    public final x27 s0;
    public final a3g t0;
    public final jv5 u0;
    public final jv5 v0;
    public final y51 w0;
    public final y51 x0;
    public final je7 y0;
    public final nd3 z0;

    public MembersListWidget(String str, go8 go8Var, z84 z84Var) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str)), new kpa("memberslist:args", go8Var)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getS0() {
        return this.s0;
    }

    public final go8 m0() {
        bc7 bc7Var = D0[0];
        return (go8) this.a.a(this);
    }

    public final EndlessRecyclerView2 n0() {
        return (EndlessRecyclerView2) this.A0.T0(this, D0[3]);
    }

    public final ro8 o0() {
        return (ro8) this.Y.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        ((lp8) p0().s0.getValue()).e();
        od2.L(new zn5(o0().s0, new fp8(2, null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().Y, new gp8(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().u0, new lq0(2, p0(), bp8.class, "searchMembers", "searchMembers(Ljava/lang/String;)V", 4, 21), 5), getViewLifecycleScope());
        ac acVar = p0().y0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(acVar, getViewLifecycleOwner().Q(), fg7Var), new dp8(null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(o0().s0, getViewLifecycleOwner().Q(), fg7Var), new ep8(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), null, 6);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setId(eda.c);
        endlessRecyclerView2.setItemAnimator(null);
        nd3 nd3Var = this.z0;
        endlessRecyclerView2.setAdapter(nd3Var);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        z7.m(endlessRecyclerView2);
        endlessRecyclerView2.setPager(new j81(this, 5));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setThreshold(10);
        endlessRecyclerView2.setDelegate(new ar0(this.w0));
        if (nd3Var.j() > 0) {
            endlessRecyclerView2.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2.getContext().getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        }
        return endlessRecyclerView2;
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        bc7[] bc7VarArr = D0;
        bc7 bc7Var = bc7VarArr[2];
        this.Z.b(this, null);
        x77 x77Var = (x77) this.X.T0(this, bc7VarArr[1]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
    }

    public final bp8 p0() {
        return (bp8) this.y0.getValue();
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        bc7[] bc7VarArr = D0;
        bc7 bc7Var = bc7VarArr[2];
        fs fsVar = this.Z;
        Long l = (Long) fsVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            ro8 ro8VarO0 = o0();
            ro8VarO0.getClass();
            pnf.o(ro8VarO0.X, new lo8(i, jLongValue));
        }
        bc7 bc7Var2 = bc7VarArr[2];
        fsVar.b(this, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembersListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        int i = 1;
        int i2 = 8;
        int i3 = 0;
        int i4 = 2;
        this.a = new fs(go8.class, "memberslist:args");
        this.b = m0().a;
        this.c = m0().b;
        this.o = m0().o;
        this.X = mqd.D();
        Object objV = ay7.v(bundle, "arg_scope_id", suc.class);
        if (objV != null) {
            this.Y = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, ro8.class, null);
            this.Z = new fs(Long.class, null, "selected_member_id_for_action");
            this.s0 = x27.c;
            ko8 ko8Var = ko8.a;
            a3g a3gVar = new a3g(this, ko8Var.b(), i2);
            this.t0 = a3gVar;
            jv5 jv5Var = new jv5(this, ko8Var.b(), i2);
            this.u0 = jv5Var;
            jv5 jv5Var2 = new jv5(this, ko8Var.b(), i2);
            this.v0 = jv5Var2;
            y51 y51Var = new y51(ko8Var.b(), 6);
            this.w0 = y51Var;
            y51 y51Var2 = new y51(ko8Var.b(), i4);
            this.x0 = y51Var2;
            this.y0 = createViewModelLazy(bp8.class, new jp8(i3, new cp8(this, i)));
            this.z0 = new nd3(new md3(false, 1), jv5Var, a3gVar, jv5Var2, y51Var, y51Var2);
            this.A0 = viewBinding(eda.c);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }
}
