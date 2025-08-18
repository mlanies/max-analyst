package one.me.startconversation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.aja;
import defpackage.au1;
import defpackage.azd;
import defpackage.b57;
import defpackage.bc7;
import defpackage.bh0;
import defpackage.bvc;
import defpackage.bw5;
import defpackage.bzd;
import defpackage.cla;
import defpackage.czd;
import defpackage.eha;
import defpackage.em2;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fn3;
import defpackage.fs;
import defpackage.fua;
import defpackage.glc;
import defpackage.gzd;
import defpackage.h8e;
import defpackage.hob;
import defpackage.i3a;
import defpackage.iba;
import defpackage.in3;
import defpackage.j31;
import defpackage.j47;
import defpackage.je7;
import defpackage.jn3;
import defpackage.jpc;
import defpackage.jv5;
import defpackage.jzd;
import defpackage.khe;
import defpackage.kka;
import defpackage.kke;
import defpackage.kq;
import defpackage.l5g;
import defpackage.l67;
import defpackage.lwa;
import defpackage.m1d;
import defpackage.m56;
import defpackage.md3;
import defpackage.mr0;
import defpackage.nd3;
import defpackage.nec;
import defpackage.nhd;
import defpackage.nr3;
import defpackage.nyd;
import defpackage.o50;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pka;
import defpackage.pnf;
import defpackage.pq9;
import defpackage.pz4;
import defpackage.q7c;
import defpackage.qb;
import defpackage.qd6;
import defpackage.qp4;
import defpackage.rd6;
import defpackage.rh4;
import defpackage.ru3;
import defpackage.syd;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.w9a;
import defpackage.wq3;
import defpackage.wy3;
import defpackage.wyd;
import defpackage.x27;
import defpackage.x47;
import defpackage.xid;
import defpackage.xka;
import defpackage.xyd;
import defpackage.yyd;
import defpackage.z7;
import defpackage.zia;
import defpackage.zn5;
import defpackage.zyd;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.startconversation.StartConversationScreen;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/StartConversationScreen;", "Lone/me/sdk/arch/Widget;", "Lfn3;", "Lqd6;", "Lwq3;", "Lnr3;", "Lwy3;", "Lb57;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StartConversationScreen extends Widget implements fn3, qd6, wq3, nr3, wy3, b57 {
    public static final /* synthetic */ bc7[] I0 = {new oi9(StartConversationScreen.class, "isNeedScrollToTop", "isNeedScrollToTop()Z"), rh4.g(nec.a, StartConversationScreen.class, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new oi9(StartConversationScreen.class, "isInSearch", "isInSearch()Z"), new hob(StartConversationScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new hob(StartConversationScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final a3g A0;
    public final a3g B0;
    public final a3g C0;
    public final a3g D0;
    public final jv5 E0;
    public final nd3 F0;
    public final pz4 G0;
    public final ru3 H0;
    public final fs X;
    public final je7 Y;
    public final khe Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final q7c v0;
    public final je7 w0;
    public final ExecutorService x0;
    public final a3g y0;
    public final a3g z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartConversationScreen() {
        super(null, 0, 3, null);
        int i = 4;
        int i2 = 7;
        int i3 = 3;
        this.a = new glc(new xid(7), null, 6);
        this.b = x27.d;
        Boolean bool = Boolean.FALSE;
        this.c = new fs(Boolean.class, bool, "start_conversations_widget_is_need_scroll_to_top");
        this.o = new fs(CharSequence.class, null, "start_conversations_widget_search_query");
        fs fsVar = new fs(Boolean.class, bool, "contact_list_widget_is_in_search");
        this.X = fsVar;
        nyd nydVar = nyd.a;
        this.Y = nydVar.getAccessor().d(l67.class);
        this.Z = new khe(new xid(9));
        this.s0 = createViewModelLazy(jzd.class, new nhd(i, new xid(10)));
        this.t0 = createViewModelLazy(bh0.class, new nhd(5, new xid(11)));
        this.u0 = viewBinding(zia.o);
        this.v0 = viewBinding(zia.q);
        this.w0 = fua.a.b();
        ExecutorService executorServiceA = ((iba) nydVar.getAccessor().c(iba.class)).a();
        this.x0 = executorServiceA;
        a3g a3gVar = new a3g(this, executorServiceA, i);
        this.y0 = a3gVar;
        a3g a3gVar2 = new a3g(this, executorServiceA, 2);
        this.z0 = a3gVar2;
        a3g a3gVar3 = new a3g(this, executorServiceA, i3);
        this.A0 = a3gVar3;
        a3g a3gVar4 = new a3g(this, executorServiceA, 6);
        this.B0 = a3gVar4;
        a3g a3gVar5 = new a3g(this, executorServiceA, i3);
        this.C0 = a3gVar5;
        a3g a3gVar6 = new a3g(this, executorServiceA, i2);
        this.D0 = a3gVar6;
        jv5 jv5Var = new jv5(this, executorServiceA, i);
        this.E0 = jv5Var;
        this.F0 = new nd3(new md3(false, 1), a3gVar, a3gVar6, a3gVar2, a3gVar3, a3gVar4, a3gVar5, jv5Var);
        this.G0 = new pz4(i2, new lwa(29, this));
        bc7 bc7Var = I0[2];
        this.H0 = new ru3(this, ((Boolean) fsVar.a(this)).booleanValue());
        od2.L(new zn5(n0().v0.i, new wyd(null, this), 5), getLifecycleScope());
        od2.L(new zn5(n0().x0, new xyd(null, this), 5), getLifecycleScope());
    }

    @Override // defpackage.b57
    public final void A(x47 x47Var) {
        int iOrdinal = x47Var.ordinal();
        if (iOrdinal == 0) {
            syd.c.P1().b(":invite/phone", null);
            return;
        }
        je7 je7Var = this.Y;
        if (iOrdinal == 1) {
            ((l67) je7Var.getValue()).a("click_qr", "main", "invite_friends");
            syd.c.P1().b(":invite/qr", null);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((l67) je7Var.getValue()).a("click_link", "main", "invite_friends");
            n0().q();
        }
    }

    @Override // defpackage.qd6
    public final void J(rd6 rd6Var) {
        mr0.G(this);
        j47.T(getViewLifecycleScope(), null, null, new azd(this, rd6Var, null), 3);
    }

    @Override // defpackage.nr3
    public final void Q() {
        t();
    }

    @Override // defpackage.fn3
    public final void d(long j) {
        n0().q();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    public final CharSequence m0() {
        bc7 bc7Var = I0[1];
        return (CharSequence) this.o.a(this);
    }

    public final jzd n0() {
        return (jzd) this.s0.getValue();
    }

    @Override // defpackage.uu3
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        i3a onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(this.lifecycleOwner, this.H0);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [vyd] */
    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(zia.m);
        cla claVar = new cla(constraintLayout.getContext(), 6);
        claVar.setId(zia.q);
        claVar.setForm(uka.a);
        claVar.setTitle(aja.f);
        final int i = 0;
        claVar.setLeftActions(new kka(new m56(this) { // from class: uyd
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                StartConversationScreen startConversationScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = StartConversationScreen.I0;
                        i3a onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return e5f.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        int iJ = startConversationScreen.D0.j() + startConversationScreen.y0.j();
                        int iJ2 = startConversationScreen.z0.j() + iJ;
                        a3g a3gVar = startConversationScreen.A0;
                        int iJ3 = a3gVar.j() + iJ2;
                        int iJ4 = startConversationScreen.E0.j();
                        CharSequence charSequenceM0 = startConversationScreen.m0();
                        if (!(!(charSequenceM0 == null || charSequenceM0.length() == 0)) && iIntValue >= iJ && iIntValue >= iJ2 && iIntValue >= iJ4 && iIntValue < iJ3) {
                            return ((nn3) ((ol7) a3gVar.C(iIntValue - iJ2))).b;
                        }
                        return null;
                }
            }
        }));
        Continuation continuation = null;
        claVar.setRightActions(new pka(null, new xka(new zyd(this))));
        eha searchView = claVar.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(z7.B(claVar.getContext(), aja.y));
            bc7 bc7Var = I0[2];
            if (((Boolean) this.X.a(this)).booleanValue()) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
                searchView.setExpandWithAnimation(true);
                searchView.setSearchText(m0());
            }
        }
        ti3 ti3Var = new ti3(-1, -2);
        ti3Var.i = 0;
        ti3Var.e = 0;
        ti3Var.h = 0;
        constraintLayout.addView(claVar, ti3Var);
        final RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext(), null);
        recyclerView.setId(zia.o);
        recyclerView.setItemAnimator(null);
        nd3 nd3Var = this.F0;
        recyclerView.setAdapter(nd3Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setClipToPadding(false);
        recyclerView.addOnAttachStateChangeListener(new o50(10, recyclerView));
        final int i2 = 1;
        em2 em2Var = new em2(4, new m56(this) { // from class: uyd
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                StartConversationScreen startConversationScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = StartConversationScreen.I0;
                        i3a onBackPressedDispatcher = startConversationScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return e5f.a;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        int iJ = startConversationScreen.D0.j() + startConversationScreen.y0.j();
                        int iJ2 = startConversationScreen.z0.j() + iJ;
                        a3g a3gVar = startConversationScreen.A0;
                        int iJ3 = a3gVar.j() + iJ2;
                        int iJ4 = startConversationScreen.E0.j();
                        CharSequence charSequenceM0 = startConversationScreen.m0();
                        if (!(!(charSequenceM0 == null || charSequenceM0.length() == 0)) && iIntValue >= iJ && iIntValue >= iJ2 && iIntValue >= iJ4 && iIntValue < iJ3) {
                            return ((nn3) ((ol7) a3gVar.C(iIntValue - iJ2))).b;
                        }
                        return null;
                }
            }
        });
        h8e h8eVar = new h8e(recyclerView, nd3Var, em2Var);
        recyclerView.j(h8eVar);
        pq9 pq9Var = qp4.u0;
        final int i3 = 0;
        recyclerView.j(new jn3(em2Var, pq9Var.j(recyclerView), new in3(this) { // from class: vyd
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.in3
            public final boolean c(int i4) {
                StartConversationScreen startConversationScreen = this.b;
                switch (i3) {
                    case 0:
                        if (i4 != startConversationScreen.z0.j() + startConversationScreen.D0.j() + startConversationScreen.y0.j()) {
                            if (i4 != startConversationScreen.F0.j()) {
                                return false;
                            }
                            CharSequence charSequenceM0 = startConversationScreen.m0();
                            if (charSequenceM0 != null && charSequenceM0.length() != 0) {
                                return false;
                            }
                        }
                        return true;
                    default:
                        bc7[] bc7VarArr = StartConversationScreen.I0;
                        CharSequence charSequenceM02 = startConversationScreen.m0();
                        return !(charSequenceM02 == null || charSequenceM02.length() == 0);
                }
            }
        }));
        recyclerView.j(new kq(5));
        final int i4 = 1;
        recyclerView.j(new h8e(recyclerView, nd3Var, new em2(3, new m56(this) { // from class: tyd
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                RecyclerView recyclerView2 = recyclerView;
                StartConversationScreen startConversationScreen = this.b;
                Integer num = (Integer) obj;
                switch (i4) {
                    case 0:
                        int iIntValue = num.intValue();
                        bc7[] bc7VarArr = StartConversationScreen.I0;
                        CharSequence charSequenceM0 = startConversationScreen.m0();
                        if (charSequenceM0 == null || charSequenceM0.length() == 0) {
                            return null;
                        }
                        int iL = startConversationScreen.F0.l(iIntValue);
                        if (iL == z8a.m) {
                            return recyclerView2.getResources().getString(yoc.z0);
                        }
                        if (iL == z8a.p) {
                            return recyclerView2.getResources().getString(yoc.B0);
                        }
                        if (iL == z8a.s) {
                            return recyclerView2.getResources().getString(yoc.C0);
                        }
                        return null;
                    default:
                        int iIntValue2 = num.intValue();
                        bc7[] bc7VarArr2 = StartConversationScreen.I0;
                        CharSequence charSequenceM02 = startConversationScreen.m0();
                        if (!(!(charSequenceM02 == null || charSequenceM02.length() == 0)) && startConversationScreen.F0.l(iIntValue2) == z8a.s) {
                            return recyclerView2.getResources().getString(aja.x);
                        }
                        return null;
                }
            }
        })));
        final int i5 = 1;
        recyclerView.j(new bw5(pq9Var.j(recyclerView), new in3(this) { // from class: vyd
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.in3
            public final boolean c(int i42) {
                StartConversationScreen startConversationScreen = this.b;
                switch (i5) {
                    case 0:
                        if (i42 != startConversationScreen.z0.j() + startConversationScreen.D0.j() + startConversationScreen.y0.j()) {
                            if (i42 != startConversationScreen.F0.j()) {
                                return false;
                            }
                            CharSequence charSequenceM0 = startConversationScreen.m0();
                            if (charSequenceM0 != null && charSequenceM0.length() != 0) {
                                return false;
                            }
                        }
                        return true;
                    default:
                        bc7[] bc7VarArr = StartConversationScreen.I0;
                        CharSequence charSequenceM02 = startConversationScreen.m0();
                        return !(charSequenceM02 == null || charSequenceM02.length() == 0);
                }
            }
        }));
        final int i6 = 0;
        recyclerView.j(new h8e(recyclerView, nd3Var, new em2(2, new m56(this) { // from class: tyd
            public final /* synthetic */ StartConversationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                RecyclerView recyclerView2 = recyclerView;
                StartConversationScreen startConversationScreen = this.b;
                Integer num = (Integer) obj;
                switch (i6) {
                    case 0:
                        int iIntValue = num.intValue();
                        bc7[] bc7VarArr = StartConversationScreen.I0;
                        CharSequence charSequenceM0 = startConversationScreen.m0();
                        if (charSequenceM0 == null || charSequenceM0.length() == 0) {
                            return null;
                        }
                        int iL = startConversationScreen.F0.l(iIntValue);
                        if (iL == z8a.m) {
                            return recyclerView2.getResources().getString(yoc.z0);
                        }
                        if (iL == z8a.p) {
                            return recyclerView2.getResources().getString(yoc.B0);
                        }
                        if (iL == z8a.s) {
                            return recyclerView2.getResources().getString(yoc.C0);
                        }
                        return null;
                    default:
                        int iIntValue2 = num.intValue();
                        bc7[] bc7VarArr2 = StartConversationScreen.I0;
                        CharSequence charSequenceM02 = startConversationScreen.m0();
                        if (!(!(charSequenceM02 == null || charSequenceM02.length() == 0)) && startConversationScreen.F0.l(iIntValue2) == z8a.s) {
                            return recyclerView2.getResources().getString(aja.x);
                        }
                        return null;
                }
            }
        })));
        v3c.y(new qb(h8eVar, continuation, 4), recyclerView);
        ti3 ti3Var2 = new ti3(-1, 0);
        ti3Var2.j = claVar.getId();
        ti3Var2.e = 0;
        ti3Var2.h = 0;
        ti3Var2.l = 0;
        constraintLayout.addView(recyclerView, ti3Var2);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.F0.B(this.G0);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eua euaVar = (eua) this.w0.getValue();
            l5g l5gVar = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            euaVar.getClass();
            eua.k(l5gVar, strArr, iArr, strArr2, i2, i3);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(n0().y0, new czd(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().z0, getViewLifecycleOwner().Q(), fg7.o), new bzd(null, this), 5), getViewLifecycleScope());
        od2.L(new j31(n0().u0, ((bh0) this.t0.getValue()).s0, new m1d(this, (Continuation) null, 3), 4), getViewLifecycleScope());
        this.F0.z(this.G0);
    }

    @Override // defpackage.wq3
    public final void t() {
        ((eua) this.w0.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    @Override // defpackage.fn3
    public final void v(long j) {
        jzd jzdVarN0 = n0();
        pnf.n(jzdVarN0, ((w9a) ((kke) jzdVarN0.o.getValue())).a(), null, new gzd(jzdVarN0, j, null), 2);
        mr0.H(requireActivity());
    }

    @Override // defpackage.wq3
    public final void w(int i) {
        if (yyd.$EnumSwitchMapping$0[au1.s(i)] != 1) {
            t();
        } else if (Build.VERSION.SDK_INT >= 33) {
            ((eua) this.w0.getValue()).f(new l5g(this, 1), eua.k, 177);
        }
    }
}
