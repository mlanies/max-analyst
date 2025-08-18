package one.me.messages.list.ui.contextmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ay7;
import defpackage.b9b;
import defpackage.bc7;
import defpackage.br7;
import defpackage.c3;
import defpackage.cd6;
import defpackage.cla;
import defpackage.coc;
import defpackage.cq8;
import defpackage.em2;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fk6;
import defpackage.foc;
import defpackage.fs;
import defpackage.ga;
import defpackage.h8e;
import defpackage.hob;
import defpackage.iba;
import defpackage.iq8;
import defpackage.j47;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jq8;
import defpackage.k56;
import defpackage.kl7;
import defpackage.kr0;
import defpackage.l29;
import defpackage.lka;
import defpackage.mda;
import defpackage.n59;
import defpackage.n7c;
import defpackage.nec;
import defpackage.nz4;
import defpackage.o19;
import defpackage.o9;
import defpackage.od2;
import defpackage.oda;
import defpackage.oi9;
import defpackage.om8;
import defpackage.pt8;
import defpackage.q7c;
import defpackage.qb;
import defpackage.qp4;
import defpackage.qt8;
import defpackage.rh4;
import defpackage.rt3;
import defpackage.rv5;
import defpackage.suc;
import defpackage.t6c;
import defpackage.t9;
import defpackage.tt8;
import defpackage.tu0;
import defpackage.u6c;
import defpackage.ufa;
import defpackage.uka;
import defpackage.un8;
import defpackage.ut8;
import defpackage.uu3;
import defpackage.v3c;
import defpackage.v7c;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wg0;
import defpackage.x27;
import defpackage.xq0;
import defpackage.xt3;
import defpackage.xx5;
import defpackage.xxc;
import defpackage.yq0;
import defpackage.z5b;
import defpackage.z7b;
import defpackage.z84;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zwc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.onechat.reactions.ReactionsViewModel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/messages/list/ui/contextmenu/MessageContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lrt3;", "Lt6c;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "st8", "message-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MessageContextMenuBottomSheet extends BottomSheetWidget implements rt3, t6c {
    public static final /* synthetic */ bc7[] Z0 = {new hob(MessageContextMenuBottomSheet.class, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), z7b.g(nec.a, MessageContextMenuBottomSheet.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new hob(MessageContextMenuBottomSheet.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new hob(MessageContextMenuBottomSheet.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new hob(MessageContextMenuBottomSheet.class, "parentId", "getParentId()Ljava/lang/Integer;", 0), new hob(MessageContextMenuBottomSheet.class, "showReactionsSelector", "getShowReactionsSelector()Z", 0), new hob(MessageContextMenuBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new hob(MessageContextMenuBottomSheet.class, "messageId", "getMessageId()J", 0), new hob(MessageContextMenuBottomSheet.class, "messageServerId", "getMessageServerId()J", 0), new oi9(MessageContextMenuBottomSheet.class, "isCallbackSent", "isCallbackSent()Z"), new hob(MessageContextMenuBottomSheet.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)};
    public final x27 A0;
    public final fs B0;
    public final fs C0;
    public final fs D0;
    public final fs E0;
    public final fs F0;
    public final fs G0;
    public final fs H0;
    public final fs I0;
    public final fs J0;
    public final fs K0;
    public final ColorDrawable L0;
    public final q7c M0;
    public ViewGroup N0;
    public RecyclerView O0;
    public u6c P0;
    public final je7 Q0;
    public final je7 R0;
    public final je7 S0;
    public final je7 T0;
    public final xxc U0;
    public k56 V0;
    public final rv5 W0;
    public final xq0 X0;
    public final int Y0;
    public final x27 y0;
    public final x27 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageContextMenuBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void A0(int i) {
        bc7[] bc7VarArr = Z0;
        bc7 bc7Var = bc7VarArr[9];
        fs fsVar = this.K0;
        if (!((Boolean) fsVar.a(this)).booleanValue()) {
            bc7 bc7Var2 = bc7VarArr[9];
            fsVar.b(this, Boolean.TRUE);
            Object targetController = getTargetController();
            xt3 xt3Var = targetController instanceof xt3 ? (xt3) targetController : null;
            if (xt3Var != null) {
                xt3Var.y(i, null);
            }
        }
        s0(true);
    }

    public final ViewGroup B0() {
        return (ViewGroup) this.M0.T0(this, Z0[10]);
    }

    public final MessageModel C0() {
        l29 l29Var = (l29) ((n59) this.R0.getValue()).q1.a.getValue();
        bc7 bc7Var = Z0[7];
        return l29Var.d(((Number) this.I0.a(this)).longValue());
    }

    public final boolean D0() {
        return ((Boolean) this.T0.getValue()).booleanValue();
    }

    public final jq8 E0() {
        return (jq8) this.S0.getValue();
    }

    @Override // defpackage.rt3
    public final void dismiss() {
        s0(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final FrameLayout m0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(ufa.b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClipToPadding(false);
        tu0.K(frameLayout, 300L, new xx5(16, this));
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(mda.I);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = 10;
        layoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        frameLayout2.setLayoutParams(layoutParams);
        ReactionsViewModel reactionsViewModelQ = ((n7c) this.Q0.getValue()).q();
        MessageModel messageModelC0 = C0();
        Continuation continuation = null;
        kl7 kl7VarJ = reactionsViewModelQ.j(messageModelC0 != null ? messageModelC0.B0 : null, true);
        bc7 bc7Var = Z0[5];
        if (((Boolean) this.G0.a(this)).booleanValue() && (!kl7VarJ.isEmpty())) {
            u6c u6cVar = new u6c(frameLayout2.getContext(), ((iba) o19.a.getAccessor().c(iba.class)).a());
            u6cVar.a(kl7VarJ, 0);
            u6cVar.b = this;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            float f2 = 6;
            layoutParams2.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f2);
            layoutParams2.rightMargin = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
            MessageModel messageModelC02 = C0();
            layoutParams2.gravity = (messageModelC02 == null || !messageModelC02.D0) ? 21 : 19;
            frameLayout2.addView(u6cVar.d, layoutParams2);
            frameLayout2.setVisibility(0);
            this.P0 = u6cVar;
        }
        frameLayout.addView(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(mda.E);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = this.Y0;
        frameLayout3.setLayoutParams(layoutParams3);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setOutlineProvider(this.X0);
        w0(frameLayout3, layoutInflater, bundle);
        if (D0()) {
            frameLayout3.setPadding(0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0, 0);
        } else {
            br7.d(frameLayout3, this.z0, null);
        }
        v3c.y(new c3(this, continuation, 18), frameLayout3);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final z5b n0() {
        return new t9(this, 3);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: o0, reason: from getter */
    public final x27 getA0() {
        return this.A0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        kr0 kr0Var = new kr0(this, new qt8(this, 0));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 8));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        this.O0 = null;
        this.N0 = null;
        this.P0 = null;
        this.V0 = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7VarArr = Z0;
        bc7 bc7Var = bc7VarArr[0];
        Integer num = (Integer) this.B0.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            bc7 bc7Var2 = bc7VarArr[1];
            Class cls = (Class) this.C0.a(this);
            if (cls == null) {
                return;
            }
            cd6 cd6Var = new cd6(cls, iIntValue);
            this.V0 = cd6Var.g(this);
            ((ArrayList) cd6Var.c).add(new zwc(new b9b(cd6Var, p0()), new Rect(), new Rect(), new Rect(), tu0.G(12 * fk4.d().getDisplayMetrics().density)));
            cd6 cd6Var2 = new cd6(cls, iIntValue);
            cd6Var2.g(this);
            fk6 fk6Var = new fk6(cd6Var2);
            bc7 bc7Var3 = bc7VarArr[2];
            Rect rect = (Rect) this.D0.a(this);
            bc7 bc7Var4 = bc7VarArr[3];
            Float f = (Float) this.E0.a(this);
            bc7 bc7Var5 = bc7VarArr[4];
            fk6Var.a(view, rect, f, (Integer) this.F0.a(this));
            if (D0()) {
                jq8 jq8VarE0 = E0();
                je7 je7Var = this.Q0;
                jq8VarE0.B0.o1(jq8VarE0, jq8.K0[0], j47.T(jq8VarE0.a, ((w9a) jq8VarE0.Z).a(), null, new cq8(jq8VarE0, ((n7c) je7Var.getValue()).q().h(), null), 2));
                jq8 jq8VarE02 = E0();
                od2.L(new zn5(new v7c(jq8VarE02.A0.d), new iq8(jq8VarE02, ((n7c) je7Var.getValue()).q().h(), null), 5), jq8VarE02.a);
                w7c w7cVar = E0().G0;
                fg7 fg7Var = fg7.o;
                od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new tt8(null, this), 5), getViewLifecycleScope());
                od2.L(new zn5(tu0.g(E0().H0, getViewLifecycleOwner().Q(), fg7Var), new ut8(null, this), 5), getViewLifecycleScope());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rt3
    public final void q(Widget widget) {
        setTargetController(widget);
        uu3 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        z0(widget);
        if (zncVarT != null) {
            coc cocVar = new coc(this, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "BottomSheetWidget");
            zncVarT.G(cocVar);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void u0() {
        k56 k56Var = this.V0;
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayoutI;
        boolean z = false;
        if (D0()) {
            ?? frameLayout2 = new FrameLayout(getContext());
            cla claVar = new cla(frameLayout2.getContext(), 6);
            claVar.setId(ufa.c);
            claVar.setForm(uka.a);
            claVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            claVar.setAlpha(0.0f);
            claVar.setTitle(oda.K);
            claVar.setLeftActions(new lka(new pt8(this, 0)));
            br7.d(claVar, this.y0, null);
            frameLayout2.addView(claVar);
            RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext(), null);
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            recyclerView.setClipToPadding(false);
            rv5 rv5Var = this.W0;
            recyclerView.setAdapter(rv5Var);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setItemAnimator(null);
            int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
            recyclerView.setPadding(iG, recyclerView.getPaddingTop(), iG, recyclerView.getPaddingBottom());
            h8e h8eVar = new h8e(recyclerView, rv5Var, new em2(5, new ga(this, 20, recyclerView)));
            recyclerView.j(h8eVar);
            recyclerView.j(new un8(0, qp4.u0.j(recyclerView)));
            br7.d(recyclerView, this.z0, null);
            v3c.y(new qb(h8eVar, z ? 1 : 0, 1), recyclerView);
            frameLayout2.addView(recyclerView);
            this.O0 = recyclerView;
            linearLayoutI = frameLayout2;
        } else {
            Context context = layoutInflater.getContext();
            Bundle bundle = getArgs().getBundle("actions");
            List listF = bundle != null ? ay7.f(bundle) : null;
            if (listF == null) {
                listF = nz4.a;
            }
            pt8 pt8Var = new pt8(this, 1);
            this.U0.getClass();
            linearLayoutI = xxc.i(context, listF, pt8Var);
        }
        this.N0 = linearLayoutI;
        return linearLayoutI;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* renamed from: y0 */
    public final boolean getS0() {
        return false;
    }

    public /* synthetic */ MessageContextMenuBottomSheet(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public MessageContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = new x27(4, null, 2);
        this.z0 = new x27(0, new yq0(3, 3, false), 1);
        this.A0 = x27.c;
        Class<Integer> cls = Integer.class;
        this.B0 = new fs(cls, "anchor_id");
        this.C0 = new fs(Class.class, "anchor_class");
        this.D0 = new fs(Rect.class, "highlight_padding");
        this.E0 = new fs(Float.class, "highlight_radius");
        this.F0 = new fs(cls, "parent_id");
        Boolean bool = Boolean.FALSE;
        fs fsVar = new fs(Boolean.class, bool, "show_reactions_selector");
        this.G0 = fsVar;
        this.H0 = new fs(Long.class, 0L, "chat_id");
        this.I0 = new fs(Long.class, 0L, "message_id");
        this.J0 = new fs(Long.class, 0L, "message_server_id");
        this.K0 = new fs(Boolean.class, bool, "callback_sent");
        this.L0 = new ColorDrawable();
        this.M0 = viewBinding(mda.E);
        suc sucVar = (suc) ((Parcelable) ay7.v(getArgs(), Widget.ARG_SCOPE_ID, suc.class));
        String str = sucVar != null ? sucVar.a : null;
        this.Q0 = m41getSharedViewModelcp94BC8(str == null ? getO() : str, n7c.class, null);
        suc sucVar2 = (suc) ((Parcelable) ay7.v(getArgs(), Widget.ARG_SCOPE_ID, suc.class));
        String str2 = sucVar2 != null ? sucVar2.a : null;
        this.R0 = m41getSharedViewModelcp94BC8(str2 == null ? getO() : str2, n59.class, null);
        this.S0 = createViewModelLazy(jq8.class, new jp8(1, new qt8(this, 1)));
        this.T0 = tu0.r(3, new qt8(this, 2));
        xxc xxcVar = new xxc();
        this.U0 = xxcVar;
        this.W0 = new rv5(((iba) o19.a.getAccessor().c(iba.class)).a(), xxcVar, new om8(1, E0(), jq8.class, "onMemberClicked", "onMemberClicked$message_list_release(J)V", 0, 3), new pt8(this, 2));
        this.X0 = new xq0(1, fk4.d().getDisplayMetrics().density * 20.0f);
        bc7 bc7Var = Z0[5];
        this.Y0 = ((Boolean) fsVar.a(this)).booleanValue() ? rh4.c(10, fk4.d().getDisplayMetrics().density, rh4.c(32, fk4.d().getDisplayMetrics().density, tu0.G(12 * fk4.d().getDisplayMetrics().density) * 2)) : 0;
        v0(false);
    }
}
