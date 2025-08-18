package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.af2;
import defpackage.av;
import defpackage.bc7;
import defpackage.bv;
import defpackage.cv;
import defpackage.dy7;
import defpackage.e52;
import defpackage.es8;
import defpackage.ev;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.gi2;
import defpackage.hm9;
import defpackage.hob;
import defpackage.iba;
import defpackage.ih2;
import defpackage.iq1;
import defpackage.j47;
import defpackage.je7;
import defpackage.jpb;
import defpackage.jq9;
import defpackage.kpa;
import defpackage.lh2;
import defpackage.md1;
import defpackage.mf2;
import defpackage.mqd;
import defpackage.nec;
import defpackage.nf2;
import defpackage.ng3;
import defpackage.ni6;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pag;
import defpackage.pf2;
import defpackage.q7c;
import defpackage.qa3;
import defpackage.qf2;
import defpackage.qm0;
import defpackage.rf2;
import defpackage.s;
import defpackage.sa3;
import defpackage.sc1;
import defpackage.sf2;
import defpackage.t50;
import defpackage.tf2;
import defpackage.tu0;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w4d;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wea;
import defpackage.wh2;
import defpackage.x2;
import defpackage.x77;
import defpackage.xcb;
import defpackage.xm8;
import defpackage.xt3;
import defpackage.z3b;
import defpackage.z7b;
import defpackage.zn5;
import defpackage.zu;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/media/ChatMediaListWidget;", "Lone/me/sdk/arch/Widget;", "Lmf2;", "Lxt3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lih2;", "type", "(JLih2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMediaListWidget extends Widget implements mf2, xt3, ng3 {
    public static final /* synthetic */ bc7[] s0 = {new oi9(ChatMediaListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), z7b.g(nec.a, ChatMediaListWidget.class, "mediaType", "getMediaType()Lone/me/profile/screens/media/model/ChatMediaType;", 0), new hob(ChatMediaListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hob(ChatMediaListWidget.class, "emptyView", "getEmptyView()Lone/me/profile/screens/media/view/ChatMediaEmptyView;", 0)};
    public final je7 X;
    public final q7c Y;
    public final qm0 Z;
    public xm8 a;
    public final w4d b;
    public final fs c;
    public final je7 o;

    public ChatMediaListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = mqd.D();
        this.c = new fs(ih2.class, "media_type");
        this.o = createViewModelLazy(gi2.class, new s(28, new x2(bundle, this, 21)));
        this.X = xcb.a.getAccessor().d(z3b.class);
        this.Y = viewBinding(wea.k0);
        gi2 gi2VarN0 = n0();
        e52 e52VarV = gi2VarN0.v();
        es8 es8Var = e52VarV != null ? e52VarV.c : null;
        Long lValueOf = es8Var != null ? Long.valueOf(es8Var.getC()) : null;
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            tf2 tf2VarX = gi2VarN0.x();
            if (tf2VarX != null) {
                hm9.m(tf2VarX.a, "load: time = %d, loadOperation = %s", Long.valueOf(jLongValue), tf2VarX.s0);
                if (jLongValue != 0) {
                    synchronized (tf2VarX.s0) {
                        try {
                            synchronized (tf2VarX.s0) {
                            }
                            if (tf2VarX.s0.b == jLongValue) {
                                hm9.k0(tf2VarX.a, null, "load: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                tf2VarX.u0.a();
                                tf2VarX.t0.a();
                                tf2VarX.s0.a();
                                tf2VarX.s0.b = jLongValue;
                                ev evVar = tf2VarX.s0;
                                qa3 qa3Var = new qa3(new sa3(0, new cv(new zu(tf2VarX, jLongValue, 1))).k(tf2VarX.c).h(tf2VarX.o), 1, new av(tf2VarX, 2));
                                iq1 iq1Var = new iq1(new av(tf2VarX, 3), 0, new bv(tf2VarX, 1));
                                qa3Var.i(iq1Var);
                                evVar.o = iq1Var;
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        this.Z = binding(new md1(10, this));
    }

    public static final EndlessRecyclerView2 m0(ChatMediaListWidget chatMediaListWidget) {
        chatMediaListWidget.getClass();
        return (EndlessRecyclerView2) chatMediaListWidget.Y.T0(chatMediaListWidget, s0[2]);
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        Object next;
        if (bundle != null) {
            long j = bundle.getLong("selected_message_id");
            long j2 = bundle.getLong("selected_attach_id");
            gi2 gi2VarN0 = n0();
            Iterator it = ((lh2) gi2VarN0.O0.getValue()).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                xm8 xm8Var = (xm8) next;
                if (xm8Var.j() == j && xm8Var.i() == j2) {
                    break;
                }
            }
            xm8 xm8Var2 = (xm8) next;
            if (xm8Var2 == null) {
                return;
            }
            gi2VarN0.C(i, xm8Var2);
        }
    }

    public final gi2 n0() {
        return (gi2) this.o.getValue();
    }

    public final ih2 o0() {
        bc7 bc7Var = s0[1];
        return (ih2) this.c.a(this);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        if (o0() != ih2.b) {
            return;
        }
        t50 t50Var = ((z3b) this.X.getValue()).b;
        t50Var.Y = true;
        t50Var.d();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), null, 6);
        endlessRecyclerView2.setId(wea.k0);
        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        endlessRecyclerView2.setPager(n0().N0);
        endlessRecyclerView2.setThreshold(20);
        endlessRecyclerView2.setAdapter(new nf2(((iba) xcb.a.getAccessor().c(iba.class)).a(), this));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        jq9 jq9Var = new jq9();
        jq9Var.g = false;
        endlessRecyclerView2.setItemAnimator(jq9Var);
        endlessRecyclerView2.setOverScrollMode(2);
        bc7[] bc7VarArr = s0;
        int i = 3;
        bc7 bc7Var = bc7VarArr[3];
        qm0 qm0Var = this.Z;
        endlessRecyclerView2.setEmptyView((af2) qm0Var.getValue());
        endlessRecyclerView2.setHasFixedSize(true);
        if (pf2.$EnumSwitchMapping$0[o0().ordinal()] == 1) {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new GridLayoutManager(3));
            endlessRecyclerView2.j(new sc1(i, tu0.G(3 * fk4.d().getDisplayMetrics().density), 4));
        } else {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        frameLayout.addView(endlessRecyclerView2);
        bc7 bc7Var2 = bc7VarArr[3];
        frameLayout.addView((af2) qm0Var.getValue());
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        if (o0() != ih2.b) {
            return;
        }
        t50 t50Var = ((z3b) this.X.getValue()).b;
        t50Var.Y = false;
        if (t50Var.X) {
            t50Var.X = false;
            jpb jpbVar = t50Var.b;
            jpbVar.b();
            jpbVar.h.remove(t50Var.Z);
        }
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        x77 x77Var = (x77) this.b.T0(this, s0[0]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        this.a = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        w7c w7cVar = n0().P0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new qf2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().K0, getViewLifecycleOwner().Q(), fg7Var), new rf2(null, this), 5), getViewLifecycleScope());
    }

    public final void p0(xm8 xm8Var) {
        gi2 gi2VarN0 = n0();
        vxd vxdVarS = j47.S(gi2VarN0.a, ((w9a) gi2VarN0.w()).b(), vx3.b, new wh2(gi2VarN0, xm8Var, null));
        gi2VarN0.D0.o1(gi2VarN0, gi2.R0[0], vxdVarS);
    }

    public final void q0(xm8 xm8Var, View view) {
        pag.F(view, ni6.LONG_PRESS);
        if (this.a == null) {
            bc7[] bc7VarArr = s0;
            bc7 bc7Var = bc7VarArr[0];
            w4d w4dVar = this.b;
            x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
            if (x77Var == null || !x77Var.isActive()) {
                w4dVar.o1(this, bc7VarArr[0], j47.T(getViewLifecycleScope(), null, vx3.b, new sf2(this, xm8Var, view, null), 1));
            }
        }
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        xm8 xm8Var = this.a;
        if (xm8Var != null) {
            this.a = null;
            n0().C(i, xm8Var);
        }
    }

    public ChatMediaListWidget(long j, ih2 ih2Var) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("media_type", ih2Var)));
    }
}
