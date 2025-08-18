package one.me.messages.list.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a69;
import defpackage.ada;
import defpackage.af8;
import defpackage.ap8;
import defpackage.au1;
import defpackage.av3;
import defpackage.ax7;
import defpackage.b;
import defpackage.b0d;
import defpackage.b39;
import defpackage.b69;
import defpackage.bc7;
import defpackage.bse;
import defpackage.bta;
import defpackage.c05;
import defpackage.c39;
import defpackage.c69;
import defpackage.cj0;
import defpackage.cpc;
import defpackage.cta;
import defpackage.d69;
import defpackage.d8e;
import defpackage.dae;
import defpackage.dpc;
import defpackage.dxc;
import defpackage.dy7;
import defpackage.e39;
import defpackage.e52;
import defpackage.e69;
import defpackage.eg9;
import defpackage.eia;
import defpackage.eqe;
import defpackage.ey1;
import defpackage.f34;
import defpackage.f49;
import defpackage.f69;
import defpackage.f89;
import defpackage.f8e;
import defpackage.fg7;
import defpackage.fn5;
import defpackage.fnd;
import defpackage.fs;
import defpackage.fv0;
import defpackage.g39;
import defpackage.g69;
import defpackage.g89;
import defpackage.gdf;
import defpackage.go0;
import defpackage.gqe;
import defpackage.gw7;
import defpackage.h69;
import defpackage.h6c;
import defpackage.h8e;
import defpackage.hdc;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hs8;
import defpackage.i24;
import defpackage.i69;
import defpackage.iba;
import defpackage.it8;
import defpackage.j1e;
import defpackage.j47;
import defpackage.j69;
import defpackage.j7b;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jpb;
import defpackage.ju0;
import defpackage.k56;
import defpackage.k69;
import defpackage.k92;
import defpackage.kc8;
import defpackage.kg9;
import defpackage.khe;
import defpackage.kia;
import defpackage.kl7;
import defpackage.kpa;
import defpackage.kv0;
import defpackage.l29;
import defpackage.l69;
import defpackage.l89;
import defpackage.lg7;
import defpackage.lk7;
import defpackage.lq0;
import defpackage.m29;
import defpackage.m58;
import defpackage.m89;
import defpackage.mda;
import defpackage.mg3;
import defpackage.mk6;
import defpackage.mqd;
import defpackage.mwb;
import defpackage.n59;
import defpackage.n7c;
import defpackage.nec;
import defpackage.ng3;
import defpackage.ng7;
import defpackage.ni6;
import defpackage.nu8;
import defpackage.nz4;
import defpackage.o19;
import defpackage.o59;
import defpackage.od2;
import defpackage.oda;
import defpackage.oi9;
import defpackage.om8;
import defpackage.ou0;
import defpackage.p59;
import defpackage.p69;
import defpackage.pag;
import defpackage.pg7;
import defpackage.pla;
import defpackage.pnf;
import defpackage.q0e;
import defpackage.q33;
import defpackage.q69;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.r59;
import defpackage.r5f;
import defpackage.r60;
import defpackage.r69;
import defpackage.rg1;
import defpackage.rh4;
import defpackage.rwc;
import defpackage.s59;
import defpackage.s69;
import defpackage.suc;
import defpackage.t03;
import defpackage.t33;
import defpackage.t50;
import defpackage.t59;
import defpackage.t69;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.tx8;
import defpackage.ty2;
import defpackage.u59;
import defpackage.u69;
import defpackage.v29;
import defpackage.vge;
import defpackage.vq0;
import defpackage.vx3;
import defpackage.w4d;
import defpackage.w59;
import defpackage.w5f;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.w9e;
import defpackage.wha;
import defpackage.woc;
import defpackage.x77;
import defpackage.xt3;
import defpackage.xw7;
import defpackage.y6c;
import defpackage.ys;
import defpackage.yt8;
import defpackage.z3b;
import defpackage.z7;
import defpackage.z84;
import defpackage.zaa;
import defpackage.zj7;
import defpackage.zn5;
import defpackage.zof;
import defpackage.zsa;
import defpackage.zu3;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0015\u0016\u0017\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0014¨\u0006\u0019"}, d2 = {"Lone/me/messages/list/ui/MessagesListWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "parentScope", "", ApiProtocol.PARAM_CHAT_ID, "loadMark", "", "", "highlights", "loadMessageId", "", "shouldHighlightMessage", "shouldSkipUnreadDecoration", "(Ljava/lang/String;JJLjava/util/List;JZZLz84;)V", "kc8", "s59", "t59", "r59", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MessagesListWidget extends Widget implements ng3, xt3 {
    public static final /* synthetic */ bc7[] X0 = {new hob(MessagesListWidget.class, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), rh4.g(nec.a, MessagesListWidget.class, "selectedMessageIdsForAction", "getSelectedMessageIdsForAction()[J"), new oi9(MessagesListWidget.class, "currentReadMark", "getCurrentReadMark()J"), new oi9(MessagesListWidget.class, "isLastMsgCompletelyVisibleOnDetach", "isLastMsgCompletelyVisibleOnDetach()Z"), new oi9(MessagesListWidget.class, "shouldSkipUnreadDecoration", "getShouldSkipUnreadDecoration()Z"), new hob(MessagesListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hob(MessagesListWidget.class, "scrollButtonsContainer", "getScrollButtonsContainer()Lone/me/messages/list/ui/view/scroll/ScrollButtonsContainer;", 0), new oi9(MessagesListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new hob(MessagesListWidget.class, "messagesListRecyclerViewAnalyticsListener", "getMessagesListRecyclerViewAnalyticsListener()Lone/me/messages/list/ui/recycler/MessagesListRecyclerViewAnalyticsListener;", 0), new hob(MessagesListWidget.class, "prefetchReactionsScrollListener", "getPrefetchReactionsScrollListener()Lru/ok/onechat/reactions/PrefetchReactionsScrollListener;", 0), new hob(MessagesListWidget.class, "messagesLayoutManager", "getMessagesLayoutManager()Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", 0), new hob(MessagesListWidget.class, "messagesScroller", "getMessagesScroller()Lone/me/messages/list/ui/scroll/MessagesScroller;", 0), new hob(MessagesListWidget.class, "emptyStateContainer", "getEmptyStateContainer()Landroid/widget/FrameLayout;", 0), new hob(MessagesListWidget.class, "reactionEffectsView", "getReactionEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;", 0)};
    public final m29 A0;
    public final je7 B0;
    public dxc C0;
    public final q7c D0;
    public final q7c E0;
    public r5f F0;
    public f34 G0;
    public h8e H0;
    public gw7 I0;
    public final w4d J0;
    public final qm0 K0;
    public final qm0 L0;
    public final kc8 M0;
    public final s59 N0;
    public final t59 O0;
    public final je7 P0;
    public final je7 Q0;
    public final qm0 R0;
    public final qm0 S0;
    public final qm0 T0;
    public final qm0 U0;
    public c05 V0;
    public y6c W0;
    public final fs X;
    public final fs Y;
    public final je7 Z;
    public final String a;
    public final String b;
    public final fs c;
    public final fs o;
    public final z3b s0;
    public final je7 t0;
    public final khe u0;
    public final je7 v0;
    public final je7 w0;
    public final mk6 x0;
    public vge y0;
    public t69 z0;

    public MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("ARG_CHAT_ID", Long.valueOf(j)), new kpa("ARG_LOAD_MARK", Long.valueOf(j2)), new kpa("ARG_LOAD_MESSAGE_ID", Long.valueOf(j3)), new kpa("ARG_HIGHLIGHTS", list), new kpa("ARG_HIGHLIGHT_MESSAGE", Boolean.valueOf(z)), new kpa("ARG_SKIP_UNREAD_DECOR", Boolean.valueOf(z2))));
    }

    public static final void m0(MessagesListWidget messagesListWidget, String str, lk7 lk7Var, long j) {
        if (messagesListWidget.x0().A().d()) {
            messagesListWidget.x0().A().e(j);
            return;
        }
        int iOrdinal = lk7Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                g39 g39VarV0 = messagesListWidget.v0();
                g39VarV0.getClass();
                pnf.o(g39VarV0.t0, new c39(str));
                return;
            }
            if (iOrdinal == 4) {
                messagesListWidget.x0().F(str);
                return;
            } else if (iOrdinal != 6) {
                return;
            }
        }
        messagesListWidget.x0().E(str);
    }

    public static final void n0(MessagesListWidget messagesListWidget, nu8 nu8Var, long j) {
        if (messagesListWidget.x0().A().d()) {
            messagesListWidget.x0().A().e(j);
            return;
        }
        if (u59.$EnumSwitchMapping$2[nu8Var.c.ordinal()] == 1) {
            long j2 = nu8Var.a;
            if (j2 <= 0) {
                messagesListWidget.x0().F(nu8Var.b);
            } else {
                messagesListWidget.x0().G(j2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o0(one.me.messages.list.ui.MessagesListWidget r5, defpackage.bxc r6) {
        /*
            java.lang.String r0 = r5.a
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L7
            goto L21
        L7:
            boolean r2 = r1.c()
            if (r2 == 0) goto L21
            us7 r2 = defpackage.us7.X
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Got new scrollState="
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r1.d(r2, r0, r3, r4)
        L21:
            t59 r0 = r5.O0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r5.u0()
            boolean r2 = r0.c
            r3 = 0
            if (r2 == 0) goto L2d
            goto L30
        L2d:
            r0.b(r1, r3, r3)
        L30:
            rwc r0 = r5.w0()
            lwc r1 = defpackage.lwc.a
            int r2 = r6.a
            iwc r0 = r0.d(r1)
            r0.setCounter(r2)
            boolean r0 = r6.b
            if (r0 == 0) goto L4b
            rwc r0 = r5.w0()
            r0.c(r1)
            goto L52
        L4b:
            rwc r0 = r5.w0()
            r0.b(r1)
        L52:
            boolean r0 = r6.c
            lwc r1 = defpackage.lwc.b
            if (r0 == 0) goto L72
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r5.u0()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = defpackage.z7.l(r0, r2)
            boolean r0 = defpackage.z7.H(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L72
            rwc r0 = r5.w0()
            r0.c(r1)
            goto L79
        L72:
            rwc r0 = r5.w0()
            r0.b(r1)
        L79:
            axc r0 = r6.d
            lwc r1 = defpackage.lwc.c
            if (r0 != 0) goto L87
            rwc r5 = r5.w0()
            r5.b(r1)
            goto Laa
        L87:
            s59 r0 = r5.N0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = r5.u0()
            r4 = -1
            r0.a = r4
            r0.b = r4
            r0.b(r2, r3, r3)
            axc r6 = r6.d
            long r2 = r6.b
            m89 r6 = r5.s0()
            boolean r6 = r6.a(r2)
            if (r6 != 0) goto Laa
            rwc r5 = r5.w0()
            r5.c(r1)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.o0(one.me.messages.list.ui.MessagesListWidget, bxc):void");
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getA() {
        return this.b;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        long[] longArray;
        Serializable serializable;
        Serializable serializableD;
        if (((rg1) this.v0.getValue()).g(i) || bundle == null || (longArray = bundle.getLongArray("selected.messageIds.Action")) == null) {
            return;
        }
        if (i != mda.S) {
            x0().J(i, ys.l0(longArray));
            return;
        }
        Long lValueOf = longArray.length == 0 ? null : Long.valueOf(longArray[0]);
        String string = bundle.getString("bot.shareContact.confirm.keyboardId");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            serializable = ou0.d(bundle, "bot.shareContact.confirm.button", fv0.class);
        } else {
            serializable = bundle.getSerializable("bot.shareContact.confirm.button");
            if (!fv0.class.isInstance(serializable)) {
                serializable = null;
            }
        }
        fv0 fv0Var = (fv0) serializable;
        if (i2 >= 34) {
            serializableD = ou0.d(bundle, "bot.shareContact.confirm.buttonPosition", kv0.class);
        } else {
            Serializable serializable2 = bundle.getSerializable("bot.shareContact.confirm.buttonPosition");
            serializableD = kv0.class.isInstance(serializable2) ? serializable2 : null;
        }
        kv0 kv0Var = (kv0) serializableD;
        n59 n59VarX0 = x0();
        n59VarX0.getClass();
        if (lValueOf == null || string == null || fv0Var == null || kv0Var == null) {
            return;
        }
        n59VarX0.m1.o1(n59VarX0, n59.D1[4], j47.S(n59VarX0.a, ((w9a) n59VarX0.Y).b(), vx3.b, new f49(n59VarX0, lValueOf, string, kv0Var, fv0Var, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    @Override // defpackage.uu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttach(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.MessagesListWidget.onAttach(android.view.View):void");
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        if (av3Var.a || av3Var.b || getView() == null) {
            return;
        }
        int iL = z7.l(u0(), 0.3f);
        Integer numValueOf = Integer.valueOf(iL);
        if (iL == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            MessageModel messageModelL = this.A0.L(numValueOf.intValue());
            if (messageModelL != null) {
                x0().I(messageModelL);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        o59 o59Var = new o59(this, 1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        o59Var.invoke(frameLayout);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        af8 af8Var = (af8) this.P0.getValue();
        gdf gdfVarP0 = p0();
        cj0 cj0Var = (cj0) af8Var;
        if (gdfVarP0 != null) {
            cj0Var.g.remove(gdfVarP0);
        } else {
            cj0Var.getClass();
        }
        y6c y6cVar = this.W0;
        if (y6cVar != null) {
            y6cVar.f.clear();
            y6cVar.e.clear();
            y6cVar.b.b();
        }
        this.W0 = null;
        this.V0 = null;
        mk6 mk6Var = this.x0;
        mk6Var.c = false;
        mk6Var.d = null;
        mk6Var.b.clear();
        t0().q().f();
        vge vgeVar = this.y0;
        if (vgeVar == null) {
            vgeVar = null;
        }
        je7 je7Var = vgeVar.B0;
        if (je7Var.a()) {
            ((go0) vgeVar.u0.getValue()).e(je7Var.getValue());
        }
        t69 t69Var = this.z0;
        if (t69Var == null) {
            t69Var = null;
        }
        t69Var.i(null);
        EndlessRecyclerView2 endlessRecyclerView2U0 = u0();
        bc7 bc7Var = X0[8];
        endlessRecyclerView2U0.q0((v29) this.K0.getValue());
        r0().K.b();
        fn5 fn5Var = (fn5) this.B0.getValue();
        fn5Var.s0 = false;
        try {
            endlessRecyclerView2U0.p0(fn5Var);
        } catch (Throwable th) {
            hm9.l0(fn5.class.getName(), "fail to detach", th);
        }
        fn5Var.t0 = null;
        endlessRecyclerView2U0.setPager(null);
        r5f r5fVar = this.F0;
        if (r5fVar != null) {
            endlessRecyclerView2U0.p0(r5fVar);
        }
        this.F0 = null;
        h8e h8eVar = this.H0;
        if (h8eVar != null) {
            ty2 ty2Var = h8eVar.o;
            d8e d8eVar = (d8e) ty2Var.Z;
            if (d8eVar != null) {
                ((hdc) ty2Var.b).B(d8eVar);
            }
            ty2Var.Z = null;
            f8e f8eVar = h8eVar.u0;
            if (f8eVar != null) {
                h8eVar.b.B(f8eVar);
            }
            h8eVar.u0 = null;
        }
        h8e h8eVar2 = this.H0;
        if (h8eVar2 != null) {
            endlessRecyclerView2U0.p0(h8eVar2);
        }
        this.H0 = null;
        this.G0 = null;
        endlessRecyclerView2U0.setAdapter(null);
        endlessRecyclerView2U0.setDelegate(null);
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        k92 k92Var;
        bc7[] bc7VarArr = X0;
        bc7 bc7Var = bc7VarArr[4];
        this.Y.b(this, Boolean.FALSE);
        dxc dxcVar = this.C0;
        if (dxcVar != null) {
            dxcVar.B(u0());
        }
        gdf gdfVarP0 = p0();
        gdfVarP0.f = null;
        gdfVarP0.s.j(-1);
        t50 t50Var = this.s0.b;
        t50Var.Y = false;
        if (t50Var.X) {
            t50Var.X = false;
            jpb jpbVar = t50Var.b;
            jpbVar.b();
            jpbVar.h.remove(t50Var.Z);
        }
        EndlessRecyclerView2 endlessRecyclerView2U0 = u0();
        boolean zH = z7.H(endlessRecyclerView2U0, z7.l(endlessRecyclerView2U0, 1.0f));
        bc7 bc7Var2 = bc7VarArr[3];
        this.X.b(this, Boolean.valueOf(zH));
        n59 n59VarX0 = x0();
        e52 e52Var = (e52) n59VarX0.o1.a.getValue();
        if (e52Var == null || (k92Var = e52Var.b) == null || k92Var.m <= 0) {
            w5f w5fVarD = n59VarX0.D();
            bc7[] bc7VarArr2 = w5f.j;
            w5fVarD.b(true, new bse(4));
        }
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        bc7[] bc7VarArr = X0;
        x77 x77Var = (x77) this.J0.T0(this, bc7VarArr[7]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        bc7 bc7Var = bc7VarArr[1];
        this.c.b(this, null);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.v0.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        Long lF0;
        super.onUpdateArgs(bundle, bundle2);
        boolean z = bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR", false);
        bc7 bc7Var = X0[4];
        this.Y.b(this, Boolean.valueOf(z));
        Object obj = bundle.get("ARG_LOAD_MESSAGE_ID");
        Object obj2 = bundle2.get("ARG_LOAD_MESSAGE_ID");
        vx3 vx3Var = vx3.b;
        if (obj2 == null || obj2.equals(obj)) {
            Object obj3 = bundle.get("ARG_LOAD_MARK");
            Object obj4 = bundle2.get("ARG_LOAD_MARK");
            if (obj4 == null || tpa.f(obj3, obj4) || (lF0 = dae.f0(obj4.toString())) == null) {
                return;
            }
            long jLongValue = lF0.longValue();
            bundle2.remove("ARG_LOAD_MARK");
            l89 l89VarB = x0().B();
            bc7[] bc7VarArr = l89.p;
            l89VarB.getClass();
            l89VarB.f(j47.S(l89VarB.c, l89VarB.b, vx3Var, new g89(l89VarB, jLongValue, 4, null)));
            return;
        }
        Long lF02 = dae.f0(obj2.toString());
        if (lF02 != null) {
            long jLongValue2 = lF02.longValue();
            bundle2.remove("ARG_LOAD_MESSAGE_ID");
            l89 l89VarB2 = x0().B();
            l89VarB2.getClass();
            l89VarB2.f(j47.S(l89VarB2.c, l89VarB2.b, vx3Var, new f89(l89VarB2, jLongValue2, null)));
            View view = getView();
            if (view != null) {
                view.post(new r60(this, jLongValue2, 6));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = x0().r1;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new c69(null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 endlessRecyclerView2U0 = u0();
        bc7[] bc7VarArr = X0;
        bc7 bc7Var = bc7VarArr[13];
        this.W0 = new y6c(endlessRecyclerView2U0, (h6c) this.U0.getValue(), new zj7(9, view));
        od2.L(new zn5(tu0.g(x0().B1, getViewLifecycleOwner().Q(), fg7Var), new s69(null, this), 5), getViewLifecycleScope());
        m29 m29Var = this.A0;
        if (m29Var.j() > 0) {
            s0().b();
        }
        EndlessRecyclerView2 endlessRecyclerView2U02 = u0();
        bc7 bc7Var2 = bc7VarArr[8];
        endlessRecyclerView2U02.k((v29) this.K0.getValue());
        bc7 bc7Var3 = bc7VarArr[9];
        qm0 qm0Var = this.L0;
        j7b j7bVar = (j7b) qm0Var.getValue();
        EndlessRecyclerView2 endlessRecyclerView2U03 = u0();
        j7bVar.getClass();
        j7bVar.l.o1(j7bVar, j7b.m[0], endlessRecyclerView2U03);
        EndlessRecyclerView2 endlessRecyclerView2U04 = u0();
        bc7 bc7Var4 = bc7VarArr[9];
        endlessRecyclerView2U04.m((j7b) qm0Var.getValue());
        EndlessRecyclerView2 endlessRecyclerView2U05 = u0();
        pla.a(endlessRecyclerView2U05, new l69(endlessRecyclerView2U05, this, 0));
        u0().m(p0());
        r0().t1(new q69(this));
        zn5 zn5Var = new zn5(new m58(x0().z1, 9), new r69(null, this), 5);
        o19 o19Var = o19.a;
        i24.s(od2.F(zn5Var, ((w9a) o19Var.getDispatchers()).c()), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(x0().B().o, 11), getViewLifecycleOwner().Q(), fg7Var), new d69(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(x0().v1, new lq0(2, this, MessagesListWidget.class, "handleNavigationEvents", "handleNavigationEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 22), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(x0().B().n, getViewLifecycleOwner().Q(), fg7.X), new w59(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().c, getViewLifecycleOwner().Q(), fg7Var), new e69(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(v0().X, getViewLifecycleOwner().Q(), fg7Var), new f69(null, this), 5), getViewLifecycleScope());
        zn5 zn5Var2 = new zn5(v0().s0, new p69(null, this), 5);
        pg7 viewLifecycleScope = getViewLifecycleScope();
        j47.T(viewLifecycleScope, null, null, new ng7(viewLifecycleScope, new lg7(zn5Var2, null), null), 3);
        od2.L(new zn5(tu0.g(x0().u1, getViewLifecycleOwner().Q(), fg7Var), new g69(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new ap8(new t03(x0().D().f, 11), this, 1), getViewLifecycleOwner().Q(), fg7Var), new h69(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(t0().q().v, getViewLifecycleOwner().Q(), fg7Var), new i69(null, this), 5), getViewLifecycleScope());
        EndlessRecyclerView2 endlessRecyclerView2U06 = u0();
        eg9 eg9VarA = x0().A();
        kg9 kg9Var = new kg9(endlessRecyclerView2U06, m29Var, eg9VarA, v0());
        od2.L(new zn5(eg9VarA.g, new lq0(2, kg9Var, kg9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/messages/list/ui/multiselection/MultiSelectionLogic$Data;)V", 4, 25), 5), getViewLifecycleScope());
        r0().t1(new a69(this, 1));
        od2.L(new zn5(tu0.g(((zaa) o19Var.getAccessor().c(zaa.class)).a, getViewLifecycleOwner().Q(), fg7Var), new j69(null, this), 5), getViewLifecycleScope());
        af8 af8Var = (af8) this.P0.getValue();
        gdf gdfVarP0 = p0();
        ada adaVar = (ada) af8Var;
        if (gdfVarP0 != null) {
            adaVar.g.add(gdfVarP0);
        }
        if (adaVar.n.get() && gdfVarP0 != null) {
            adaVar.f.post(new b(15, gdfVarP0));
        }
        od2.L(new zn5(tu0.g(x0().g1, getViewLifecycleOwner().Q(), fg7Var), new k69(null, this), 5), getViewLifecycleScope());
    }

    public final gdf p0() {
        return (gdf) this.Q0.getValue();
    }

    public final FrameLayout q0() {
        bc7 bc7Var = X0[12];
        return (FrameLayout) this.T0.getValue();
    }

    public final MessagesLayoutManager r0() {
        bc7 bc7Var = X0[10];
        return (MessagesLayoutManager) this.R0.getValue();
    }

    public final m89 s0() {
        bc7 bc7Var = X0[11];
        return (m89) this.S0.getValue();
    }

    public final n7c t0() {
        return (n7c) this.u0.getValue();
    }

    public final EndlessRecyclerView2 u0() {
        return (EndlessRecyclerView2) this.D0.T0(this, X0[5]);
    }

    public final g39 v0() {
        return (g39) this.Z.getValue();
    }

    public final rwc w0() {
        return (rwc) this.E0.T0(this, X0[6]);
    }

    public final n59 x0() {
        return (n59) this.t0.getValue();
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        int i2;
        eqe eqeVar;
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("messages:context_menu:message_id")) : null;
        if (lValueOf == null) {
            bc7[] bc7VarArr = X0;
            bc7 bc7Var = bc7VarArr[1];
            fs fsVar = this.c;
            long[] jArr = (long[]) fsVar.a(this);
            if (jArr != null) {
                bc7 bc7Var2 = bc7VarArr[1];
                fsVar.b(this, null);
                if (i == mda.y) {
                    y0();
                    g39 g39VarV0 = v0();
                    if (jArr.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    long j = jArr[0];
                    g39VarV0.getClass();
                    pnf.o(g39VarV0.t0, new e39(j));
                    return;
                }
                if (i == mda.B || i == mda.u) {
                    y0();
                }
                n59 n59VarX0 = x0();
                if (jArr.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                long j2 = jArr[0];
                n59VarX0.getClass();
                n59VarX0.J(i, Collections.singletonList(Long.valueOf(j2)));
                return;
            }
            return;
        }
        String string = bundle.getString("messages:context_menu:link_url");
        if (string == null) {
            return;
        }
        int i3 = cpc.b;
        je7 je7Var = this.w0;
        if (i != i3) {
            if (i != cpc.f) {
                if (i == cpc.h) {
                    x0().F(string);
                    return;
                }
                return;
            }
            x0().E(string);
            tx8 tx8VarW = x0().w();
            long jLongValue = lValueOf.longValue();
            if (tx8VarW == null) {
                return;
            }
            int iS = au1.s(ju0.B(string) ? 3 : ju0.C(string) ? 2 : 1);
            if (iS == 0) {
                ((it8) je7Var.getValue()).a(jLongValue, 1, tx8VarW, 3);
                return;
            } else if (iS == 1) {
                ((it8) je7Var.getValue()).a(jLongValue, 3, tx8VarW, 5);
                return;
            } else {
                if (iS != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ((it8) je7Var.getValue()).a(jLongValue, 2, tx8VarW, 4);
                return;
            }
        }
        tpa.o(getContext(), ju0.B(string) ? w9e.K0(string, "mailto:") : ju0.C(string) ? w9e.K0(string, "tel:") : string);
        if (tpa.s()) {
            int iS2 = au1.s(ju0.B(string) ? 3 : ju0.C(string) ? 2 : 1);
            if (iS2 == 0) {
                eqeVar = new eqe(dpc.k);
            } else if (iS2 == 1) {
                eqeVar = new eqe(dpc.n);
            } else {
                if (iS2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eqeVar = new eqe(dpc.l);
            }
            wha whaVar = new wha(this);
            whaVar.g(eqeVar);
            whaVar.e(new kia(woc.n));
            Object parentController = getParentController();
            r59 r59Var = parentController instanceof r59 ? (r59) parentController : null;
            whaVar.c(new eia(0, 0, r59Var != null ? ((ChatScreen) r59Var).A0() : 0, 3));
            whaVar.i();
        }
        tx8 tx8VarW2 = x0().w();
        long jLongValue2 = lValueOf.longValue();
        if (tx8VarW2 == null) {
            return;
        }
        it8 it8Var = (it8) je7Var.getValue();
        int iS3 = au1.s(ju0.B(string) ? 3 : ju0.C(string) ? 2 : 1);
        if (iS3 == 0) {
            i2 = 1;
        } else if (iS3 == 1) {
            i2 = 3;
        } else {
            if (iS3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        it8Var.a(jLongValue2, i2, tx8VarW2, 2);
    }

    public final void y0() {
        if (((Boolean) v0().c.a.getValue()).booleanValue()) {
            g39 g39VarV0 = v0();
            pnf.o(g39VarV0.t0, b39.a);
        }
    }

    public final void z0(long j, View view) {
        x77 x77Var;
        n59 n59VarX0 = x0();
        q0e q0eVar = n59VarX0.p1;
        MessageModel messageModelD = ((l29) q0eVar.getValue()).d(j);
        if (n59VarX0.A().d()) {
            n59VarX0.A().e(j);
            return;
        }
        if ((messageModelD != null ? messageModelD.Z : null) == zof.Y) {
            int size = ((l29) q0eVar.getValue()).c().size();
            mg3 mg3Var = hs8.a;
            List listSingletonList = Collections.singletonList(Long.valueOf(j));
            eqe eqeVar = new eqe(oda.l0);
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new mg3(mda.c, new eqe(oda.k0), 3, false));
            if (size > 1) {
                kl7VarL.add(new mg3(mda.b, new gqe(oda.j0, ys.m0(new Object[]{Integer.valueOf(size)})), 3, false));
            }
            kl7VarL.add(new mg3(mda.a, new eqe(oda.i0), 1, false));
            pnf.o(n59VarX0.u1, new fnd(listSingletonList, eqeVar, null, j1e.d(kl7VarL)));
            return;
        }
        bc7[] bc7VarArr = X0;
        bc7 bc7Var = bc7VarArr[1];
        long[] jArr = (long[]) this.c.a(this);
        w4d w4dVar = this.J0;
        if (jArr == null || !((x77Var = (x77) w4dVar.T0(this, bc7VarArr[7])) == null || x77Var.isActive())) {
            pag.F(view, ni6.LONG_PRESS);
            w4dVar.o1(this, bc7VarArr[7], j47.T(getViewLifecycleScope(), null, vx3.b, new u69(this, j, view, null), 1));
        }
    }

    public MessagesListWidget(final Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = MessagesListWidget.class.getName();
        this.b = "MessagesList";
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        this.c = new fs(long[].class, null, "selected.messageIds.Action");
        this.o = new fs(Long.class, 0L, "messages:current.read.mark");
        Boolean bool = Boolean.FALSE;
        this.X = new fs(Boolean.class, bool, "is.last.message.completely.visible.on.detach");
        this.Y = new fs(Boolean.class, bool, "ARG_SKIP_UNREAD_DECOR");
        bc7 bc7Var = X0[0];
        this.Z = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, g39.class, null);
        o19 o19Var = o19.a;
        this.s0 = (z3b) o19Var.getAccessor().c(z3b.class);
        final int i = 1;
        this.t0 = createViewModelLazy(n59.class, new jp8(3, new k56() { // from class: q59
            @Override // defpackage.k56
            public final Object invoke() {
                ol6 ol6Var;
                MessagesListWidget messagesListWidget = this;
                int i2 = 2;
                int i3 = 4;
                Bundle bundle2 = bundle;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = MessagesListWidget.X0;
                        long j = bundle2.getLong("ARG_CHAT_ID");
                        o19 o19Var2 = o19.a;
                        khe kheVarD = o19Var2.getAccessor().d(f4b.class);
                        khe kheVarD2 = o19Var2.getAccessor().d(rff.class);
                        w80 w80Var = (w80) o19Var2.getAccessor().c(w80.class);
                        khe kheVarD3 = o19Var2.getAccessor().d(n4b.class);
                        khe kheVarD4 = o19Var2.getAccessor().d(vhf.class);
                        MessagesListWidget messagesListWidget2 = this;
                        return new gdf(kheVarD, kheVarD2, w80Var, kheVarD3, kheVarD4, j, messagesListWidget2.A0, new o59(messagesListWidget2, 4), new v59(2, messagesListWidget2, MessagesListWidget.class, "onMessageClick", "onMessageClick(JLandroid/view/View;)V", 0, 0), messagesListWidget2.getLifecycleScope());
                    case 1:
                        bc7[] bc7VarArr2 = MessagesListWidget.X0;
                        long j2 = bundle2.getLong("ARG_CHAT_ID");
                        long j3 = bundle2.getLong("ARG_LOAD_MARK");
                        long j4 = bundle2.getLong("ARG_LOAD_MESSAGE_ID");
                        Object obj = bundle2.get("ARG_HIGHLIGHTS");
                        List list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            list = nz4.a;
                        }
                        v69 v69Var = new v69(j2, j3, j4, list, bundle2.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                        o19 o19Var3 = o19.a;
                        n29 n29Var = (n29) o19Var3.getAccessor().c(n29.class);
                        mg4 mg4Var = mg4.REGULAR;
                        n29Var.getClass();
                        int iOrdinal = mg4Var.ordinal();
                        if (iOrdinal == 0) {
                            ol6Var = huc.s0;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ol6Var = buc.s0;
                        }
                        ol6 ol6Var2 = ol6Var;
                        v4 v4Var = n29Var.a;
                        Context context = (Context) v4Var.c(Context.class);
                        kke kkeVar = (kke) v4Var.c(kke.class);
                        khe kheVarD5 = v4Var.d(iy2.class);
                        khe kheVarD6 = v4Var.d(r79.class);
                        khe kheVarD7 = v4Var.d(t6b.class);
                        khe kheVarD8 = v4Var.d(u9a.class);
                        khe kheVarD9 = v4Var.d(ds3.class);
                        qi8 qi8Var = new qi8();
                        qi8Var.o = j2;
                        qi8Var.a = mg4Var;
                        qi8Var.b = ol6Var2;
                        qi8Var.c = new khe(new yf3(kheVarD5, 24, qi8Var));
                        qi8Var.X = new khe(new a81(kheVarD5, kheVarD6, qi8Var, 5));
                        yx4 yx4Var = new yx4(ey8.h(j2, "MessagesListLoader#"));
                        khe kheVar = new khe(new ud2(context, v4Var, 3));
                        khe kheVar2 = new khe(new ud2(context, v4Var, 2));
                        ix ixVar = new ix(j2, kkeVar, mg4Var, ol6Var2, kheVarD5, v4Var.d(o45.class), kheVarD8, kheVarD6, v4Var.d(ec6.class), (wxc) v4Var.c(wxc.class));
                        bx bxVar = new bx(kheVarD5, kheVarD6, kheVarD8, v4Var.d(gb6.class), j2, kkeVar, yx4Var, new v19(j2, (av0) v4Var.c(av0.class), kkeVar), kheVar, kheVar2, (ox3) v4Var.c(ox3.class), new m9a(kheVar, kheVar2, kheVarD7, kheVarD9), qi8Var, ixVar, new px(j2, mg4Var, (ome) v4Var.c(ome.class), new wmc(kheVarD5, false), (jc2) v4Var.c(jc2.class), (xb9) v4Var.c(xb9.class), ixVar, (wxc) v4Var.c(wxc.class)), (oe3) v4Var.c(oe3.class), 40, 15);
                        khe kheVarD10 = o19Var3.getAccessor().d(p7c.class);
                        khe kheVarD11 = o19Var3.getAccessor().d(iy2.class);
                        v07 v07Var = new v07((au8) o19Var3.getAccessor().c(au8.class));
                        khe kheVarD12 = o19Var3.getAccessor().d(cea.class);
                        pz7 pz7Var = new pz7();
                        pz7Var.a = j2;
                        pz7Var.b = pz7.class.getName();
                        pz7Var.c = kheVarD10;
                        pz7Var.d = kheVarD11;
                        pz7Var.e = v07Var;
                        pz7Var.f = kheVarD12;
                        return new n59(v69Var, (rg1) messagesListWidget.v0.getValue(), bxVar, pz7Var, new y7g(new p59(messagesListWidget, 6)));
                    default:
                        bc7[] bc7VarArr3 = MessagesListWidget.X0;
                        return (n7c) messagesListWidget.createViewModelLazy(n7c.class, new jp8(i2, new w21(bundle2.getLong("ARG_CHAT_ID"), i3))).getValue();
                }
            }
        }));
        final int i2 = 2;
        this.u0 = new khe(new k56() { // from class: q59
            @Override // defpackage.k56
            public final Object invoke() {
                ol6 ol6Var;
                MessagesListWidget messagesListWidget = this;
                int i22 = 2;
                int i3 = 4;
                Bundle bundle2 = bundle;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = MessagesListWidget.X0;
                        long j = bundle2.getLong("ARG_CHAT_ID");
                        o19 o19Var2 = o19.a;
                        khe kheVarD = o19Var2.getAccessor().d(f4b.class);
                        khe kheVarD2 = o19Var2.getAccessor().d(rff.class);
                        w80 w80Var = (w80) o19Var2.getAccessor().c(w80.class);
                        khe kheVarD3 = o19Var2.getAccessor().d(n4b.class);
                        khe kheVarD4 = o19Var2.getAccessor().d(vhf.class);
                        MessagesListWidget messagesListWidget2 = this;
                        return new gdf(kheVarD, kheVarD2, w80Var, kheVarD3, kheVarD4, j, messagesListWidget2.A0, new o59(messagesListWidget2, 4), new v59(2, messagesListWidget2, MessagesListWidget.class, "onMessageClick", "onMessageClick(JLandroid/view/View;)V", 0, 0), messagesListWidget2.getLifecycleScope());
                    case 1:
                        bc7[] bc7VarArr2 = MessagesListWidget.X0;
                        long j2 = bundle2.getLong("ARG_CHAT_ID");
                        long j3 = bundle2.getLong("ARG_LOAD_MARK");
                        long j4 = bundle2.getLong("ARG_LOAD_MESSAGE_ID");
                        Object obj = bundle2.get("ARG_HIGHLIGHTS");
                        List list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            list = nz4.a;
                        }
                        v69 v69Var = new v69(j2, j3, j4, list, bundle2.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                        o19 o19Var3 = o19.a;
                        n29 n29Var = (n29) o19Var3.getAccessor().c(n29.class);
                        mg4 mg4Var = mg4.REGULAR;
                        n29Var.getClass();
                        int iOrdinal = mg4Var.ordinal();
                        if (iOrdinal == 0) {
                            ol6Var = huc.s0;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ol6Var = buc.s0;
                        }
                        ol6 ol6Var2 = ol6Var;
                        v4 v4Var = n29Var.a;
                        Context context = (Context) v4Var.c(Context.class);
                        kke kkeVar = (kke) v4Var.c(kke.class);
                        khe kheVarD5 = v4Var.d(iy2.class);
                        khe kheVarD6 = v4Var.d(r79.class);
                        khe kheVarD7 = v4Var.d(t6b.class);
                        khe kheVarD8 = v4Var.d(u9a.class);
                        khe kheVarD9 = v4Var.d(ds3.class);
                        qi8 qi8Var = new qi8();
                        qi8Var.o = j2;
                        qi8Var.a = mg4Var;
                        qi8Var.b = ol6Var2;
                        qi8Var.c = new khe(new yf3(kheVarD5, 24, qi8Var));
                        qi8Var.X = new khe(new a81(kheVarD5, kheVarD6, qi8Var, 5));
                        yx4 yx4Var = new yx4(ey8.h(j2, "MessagesListLoader#"));
                        khe kheVar = new khe(new ud2(context, v4Var, 3));
                        khe kheVar2 = new khe(new ud2(context, v4Var, 2));
                        ix ixVar = new ix(j2, kkeVar, mg4Var, ol6Var2, kheVarD5, v4Var.d(o45.class), kheVarD8, kheVarD6, v4Var.d(ec6.class), (wxc) v4Var.c(wxc.class));
                        bx bxVar = new bx(kheVarD5, kheVarD6, kheVarD8, v4Var.d(gb6.class), j2, kkeVar, yx4Var, new v19(j2, (av0) v4Var.c(av0.class), kkeVar), kheVar, kheVar2, (ox3) v4Var.c(ox3.class), new m9a(kheVar, kheVar2, kheVarD7, kheVarD9), qi8Var, ixVar, new px(j2, mg4Var, (ome) v4Var.c(ome.class), new wmc(kheVarD5, false), (jc2) v4Var.c(jc2.class), (xb9) v4Var.c(xb9.class), ixVar, (wxc) v4Var.c(wxc.class)), (oe3) v4Var.c(oe3.class), 40, 15);
                        khe kheVarD10 = o19Var3.getAccessor().d(p7c.class);
                        khe kheVarD11 = o19Var3.getAccessor().d(iy2.class);
                        v07 v07Var = new v07((au8) o19Var3.getAccessor().c(au8.class));
                        khe kheVarD12 = o19Var3.getAccessor().d(cea.class);
                        pz7 pz7Var = new pz7();
                        pz7Var.a = j2;
                        pz7Var.b = pz7.class.getName();
                        pz7Var.c = kheVarD10;
                        pz7Var.d = kheVarD11;
                        pz7Var.e = v07Var;
                        pz7Var.f = kheVarD12;
                        return new n59(v69Var, (rg1) messagesListWidget.v0.getValue(), bxVar, pz7Var, new y7g(new p59(messagesListWidget, 6)));
                    default:
                        bc7[] bc7VarArr3 = MessagesListWidget.X0;
                        return (n7c) messagesListWidget.createViewModelLazy(n7c.class, new jp8(i22, new w21(bundle2.getLong("ARG_CHAT_ID"), i3))).getValue();
                }
            }
        });
        this.v0 = tu0.r(3, new p59(this, 13));
        this.w0 = o19Var.getAccessor().d(it8.class);
        mk6 mk6Var = new mk6(o19Var.getAccessor().d(b0d.class));
        this.x0 = mk6Var;
        ExecutorService executorServiceA = ((iba) o19Var.getAccessor().c(iba.class)).a();
        om8 om8Var = new om8(1, x0(), n59.class, "onAttachClickAction", "onAttachClickAction(Lone/me/messages/list/ui/view/MessagesAttachAction;)V", 0, 6);
        ey1 ey1Var = new ey1(22, this);
        this.A0 = new m29(executorServiceA, new b69(this), om8Var, mk6Var, ey1Var, new vq0(3, this), new yt8(5, this), new p59(this, 0));
        this.B0 = tu0.r(3, new p59(this, 1));
        this.D0 = viewBinding(mwb.messages_list_recycler_view);
        this.E0 = viewBinding(mwb.messages_list_scroll_btn);
        this.J0 = mqd.D();
        this.K0 = binding(new p59(this, 2));
        this.L0 = binding(new p59(this, 3));
        this.M0 = new kc8(this);
        this.N0 = new s59(this);
        this.O0 = new t59(this);
        this.P0 = o19Var.getAccessor().d(af8.class);
        final int i3 = 0;
        this.Q0 = tu0.r(3, new k56() { // from class: q59
            @Override // defpackage.k56
            public final Object invoke() {
                ol6 ol6Var;
                MessagesListWidget messagesListWidget = this;
                int i22 = 2;
                int i32 = 4;
                Bundle bundle2 = bundle;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = MessagesListWidget.X0;
                        long j = bundle2.getLong("ARG_CHAT_ID");
                        o19 o19Var2 = o19.a;
                        khe kheVarD = o19Var2.getAccessor().d(f4b.class);
                        khe kheVarD2 = o19Var2.getAccessor().d(rff.class);
                        w80 w80Var = (w80) o19Var2.getAccessor().c(w80.class);
                        khe kheVarD3 = o19Var2.getAccessor().d(n4b.class);
                        khe kheVarD4 = o19Var2.getAccessor().d(vhf.class);
                        MessagesListWidget messagesListWidget2 = this;
                        return new gdf(kheVarD, kheVarD2, w80Var, kheVarD3, kheVarD4, j, messagesListWidget2.A0, new o59(messagesListWidget2, 4), new v59(2, messagesListWidget2, MessagesListWidget.class, "onMessageClick", "onMessageClick(JLandroid/view/View;)V", 0, 0), messagesListWidget2.getLifecycleScope());
                    case 1:
                        bc7[] bc7VarArr2 = MessagesListWidget.X0;
                        long j2 = bundle2.getLong("ARG_CHAT_ID");
                        long j3 = bundle2.getLong("ARG_LOAD_MARK");
                        long j4 = bundle2.getLong("ARG_LOAD_MESSAGE_ID");
                        Object obj = bundle2.get("ARG_HIGHLIGHTS");
                        List list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            list = nz4.a;
                        }
                        v69 v69Var = new v69(j2, j3, j4, list, bundle2.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle2.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                        o19 o19Var3 = o19.a;
                        n29 n29Var = (n29) o19Var3.getAccessor().c(n29.class);
                        mg4 mg4Var = mg4.REGULAR;
                        n29Var.getClass();
                        int iOrdinal = mg4Var.ordinal();
                        if (iOrdinal == 0) {
                            ol6Var = huc.s0;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ol6Var = buc.s0;
                        }
                        ol6 ol6Var2 = ol6Var;
                        v4 v4Var = n29Var.a;
                        Context context = (Context) v4Var.c(Context.class);
                        kke kkeVar = (kke) v4Var.c(kke.class);
                        khe kheVarD5 = v4Var.d(iy2.class);
                        khe kheVarD6 = v4Var.d(r79.class);
                        khe kheVarD7 = v4Var.d(t6b.class);
                        khe kheVarD8 = v4Var.d(u9a.class);
                        khe kheVarD9 = v4Var.d(ds3.class);
                        qi8 qi8Var = new qi8();
                        qi8Var.o = j2;
                        qi8Var.a = mg4Var;
                        qi8Var.b = ol6Var2;
                        qi8Var.c = new khe(new yf3(kheVarD5, 24, qi8Var));
                        qi8Var.X = new khe(new a81(kheVarD5, kheVarD6, qi8Var, 5));
                        yx4 yx4Var = new yx4(ey8.h(j2, "MessagesListLoader#"));
                        khe kheVar = new khe(new ud2(context, v4Var, 3));
                        khe kheVar2 = new khe(new ud2(context, v4Var, 2));
                        ix ixVar = new ix(j2, kkeVar, mg4Var, ol6Var2, kheVarD5, v4Var.d(o45.class), kheVarD8, kheVarD6, v4Var.d(ec6.class), (wxc) v4Var.c(wxc.class));
                        bx bxVar = new bx(kheVarD5, kheVarD6, kheVarD8, v4Var.d(gb6.class), j2, kkeVar, yx4Var, new v19(j2, (av0) v4Var.c(av0.class), kkeVar), kheVar, kheVar2, (ox3) v4Var.c(ox3.class), new m9a(kheVar, kheVar2, kheVarD7, kheVarD9), qi8Var, ixVar, new px(j2, mg4Var, (ome) v4Var.c(ome.class), new wmc(kheVarD5, false), (jc2) v4Var.c(jc2.class), (xb9) v4Var.c(xb9.class), ixVar, (wxc) v4Var.c(wxc.class)), (oe3) v4Var.c(oe3.class), 40, 15);
                        khe kheVarD10 = o19Var3.getAccessor().d(p7c.class);
                        khe kheVarD11 = o19Var3.getAccessor().d(iy2.class);
                        v07 v07Var = new v07((au8) o19Var3.getAccessor().c(au8.class));
                        khe kheVarD12 = o19Var3.getAccessor().d(cea.class);
                        pz7 pz7Var = new pz7();
                        pz7Var.a = j2;
                        pz7Var.b = pz7.class.getName();
                        pz7Var.c = kheVarD10;
                        pz7Var.d = kheVarD11;
                        pz7Var.e = v07Var;
                        pz7Var.f = kheVarD12;
                        return new n59(v69Var, (rg1) messagesListWidget.v0.getValue(), bxVar, pz7Var, new y7g(new p59(messagesListWidget, 6)));
                    default:
                        bc7[] bc7VarArr3 = MessagesListWidget.X0;
                        return (n7c) messagesListWidget.createViewModelLazy(n7c.class, new jp8(i22, new w21(bundle2.getLong("ARG_CHAT_ID"), i32))).getValue();
                }
            }
        });
        this.R0 = binding(new p59(this, 8));
        this.S0 = binding(new p59(this, 10));
        this.T0 = binding(new p59(this, 11));
        this.U0 = binding(new p59(this, 12));
        ax7 ax7Var = (ax7) o19Var.getAccessor().c(ax7.class);
        if (((t33) ((q33) ax7Var.b.getValue())).F() != ax7Var.g || ax7Var.i) {
            cta ctaVar = cta.CHAT_INIT_TO_RENDER;
            ax7Var.e.k(ctaVar, new bta(ctaVar, SystemClock.elapsedRealtime()));
            ax7Var.f.put(zsa.EVENT_OPEN_CHAT, j47.T(ax7Var.d, null, null, new xw7(ax7Var, null), 3));
        }
    }

    public /* synthetic */ MessagesListWidget(String str, long j, long j2, List list, long j3, boolean z, boolean z2, int i, z84 z84Var) {
        this(str, j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? nz4.a : list, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, null);
    }
}
