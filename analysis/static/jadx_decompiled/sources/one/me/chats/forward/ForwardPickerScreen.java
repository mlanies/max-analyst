package one.me.chats.forward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a6;
import defpackage.ac;
import defpackage.bc7;
import defpackage.bc8;
import defpackage.br7;
import defpackage.bvc;
import defpackage.bz5;
import defpackage.c03;
import defpackage.cc8;
import defpackage.cla;
import defpackage.coc;
import defpackage.csb;
import defpackage.d06;
import defpackage.ds3;
import defpackage.dy7;
import defpackage.dz5;
import defpackage.eqe;
import defpackage.fg7;
import defpackage.fh5;
import defpackage.fk4;
import defpackage.foc;
import defpackage.fs;
import defpackage.g9a;
import defpackage.glc;
import defpackage.gta;
import defpackage.hc8;
import defpackage.hdc;
import defpackage.hob;
import defpackage.iy2;
import defpackage.iz5;
import defpackage.j0e;
import defpackage.je7;
import defpackage.k56;
import defpackage.kka;
import defpackage.kke;
import defpackage.kld;
import defpackage.kpa;
import defpackage.kr0;
import defpackage.kz5;
import defpackage.lg3;
import defpackage.lu0;
import defpackage.lz5;
import defpackage.m11;
import defpackage.m5d;
import defpackage.m8a;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.o9;
import defpackage.oa2;
import defpackage.od2;
import defpackage.oi9;
import defpackage.oz5;
import defpackage.p8a;
import defpackage.pg7;
import defpackage.pka;
import defpackage.pz5;
import defpackage.q33;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qz5;
import defpackage.qza;
import defpackage.r8a;
import defpackage.rh4;
import defpackage.rz5;
import defpackage.sv8;
import defpackage.sy5;
import defpackage.sya;
import defpackage.sz5;
import defpackage.t03;
import defpackage.tu0;
import defpackage.tz5;
import defpackage.uka;
import defpackage.uu3;
import defpackage.uy8;
import defpackage.v3c;
import defpackage.vc7;
import defpackage.vka;
import defpackage.w12;
import defpackage.w7c;
import defpackage.wg0;
import defpackage.wha;
import defpackage.woc;
import defpackage.wy5;
import defpackage.wz4;
import defpackage.wz5;
import defpackage.x27;
import defpackage.x3c;
import defpackage.x53;
import defpackage.xh0;
import defpackage.xka;
import defpackage.xoc;
import defpackage.xs2;
import defpackage.xt3;
import defpackage.y53;
import defpackage.y7d;
import defpackage.yf3;
import defpackage.yoc;
import defpackage.yq0;
import defpackage.ys;
import defpackage.ywe;
import defpackage.yz5;
import defpackage.z84;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zz5;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/chats/forward/ForwardPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Liz5;", "Lng3;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messagesIds", "", "attachId", "", "isForwardAttach", "showExternalSharing", "([JLjava/lang/Long;ZZ)V", "forward-message_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ForwardPickerScreen extends AbstractPickerScreen<iz5> implements ng3, xt3 {
    public static final /* synthetic */ bc7[] I0 = {new oi9(ForwardPickerScreen.class, "messagesIds", "getMessagesIds()[J"), rh4.g(nec.a, ForwardPickerScreen.class, "attachId", "getAttachId()J"), new oi9(ForwardPickerScreen.class, "isForwardAttach", "isForwardAttach()Z"), new hob(ForwardPickerScreen.class, "showExternalSharing", "getShowExternalSharing()Z", 0), new oi9(ForwardPickerScreen.class, "isInMultiSelect", "isInMultiSelect()Z"), new hob(ForwardPickerScreen.class, "inputView", "getInputView()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new hob(ForwardPickerScreen.class, "quoteView", "getQuoteView()Lone/me/sdk/uikit/common/chat/QuoteView;", 0)};
    public static final x27 J0 = new x27(4, new yq0(4, 3, false));
    public final qm0 A0;
    public final q7c B0;
    public final je7 C0;
    public w12 D0;
    public znc E0;
    public final tz5 F0;
    public hc8 G0;
    public ywe H0;
    public final glc t0;
    public final x27 u0;
    public final x3c v0;
    public final fs w0;
    public final fs x0;
    public k56 y0;
    public final AutoTransition z0;

    public ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2) {
        this(dy7.g(new kpa("messages_to_forward", jArr), new kpa("attach_to_forward", l), new kpa("is_forward_attach", Boolean.valueOf(z)), new kpa("show_external_sharing", Boolean.valueOf(z2))));
    }

    public static final void x0(ForwardPickerScreen forwardPickerScreen, View view, eqe eqeVar, boolean z) {
        forwardPickerScreen.getClass();
        float f = 6;
        Point point = new Point(tu0.G(fk4.d().getDisplayMetrics().density * f), rh4.q(f, fk4.d().getDisplayMetrics().density, forwardPickerScreen.requireView().getBottom() - forwardPickerScreen.z0().getTop()));
        ywe yweVar = forwardPickerScreen.H0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
        ywe yweVar2 = new ywe(forwardPickerScreen.getContext(), view, new pz5(forwardPickerScreen, 0), (k56) null, 0, 1, 56);
        yweVar2.d(eqeVar);
        yweVar2.e(point, 8388691, z ? 2500L : 800L);
        yweVar2.setOnDismissListener(new m11(4, forwardPickerScreen));
        forwardPickerScreen.H0 = yweVar2;
    }

    public final boolean A0() {
        bc7 bc7Var = I0[2];
        return ((Boolean) this.w0.a(this)).booleanValue();
    }

    public final boolean B0() {
        bc7 bc7Var = I0[4];
        return ((Boolean) this.x0.a(this)).booleanValue();
    }

    public final void C0(boolean z) {
        coc cocVar;
        bc7 bc7Var = I0[4];
        this.x0.b(this, Boolean.valueOf(z));
        coc cocVar2 = (coc) x53.i0(getChildRouter((ViewGroup) this.Z.T0(this, AbstractPickerScreen.s0[3])).e());
        uu3 uu3Var = cocVar2 != null ? cocVar2.a : null;
        Widget widget = uu3Var instanceof Widget ? (Widget) uu3Var : null;
        PickerChatsTabWidget pickerChatsTabWidget = widget instanceof PickerChatsTabWidget ? (PickerChatsTabWidget) widget : null;
        if (pickerChatsTabWidget != null) {
            bc7 bc7Var2 = PickerChatsTabWidget.y0[1];
            pickerChatsTabWidget.b.b(pickerChatsTabWidget, Boolean.valueOf(z));
            hdc adapter = pickerChatsTabWidget.n0().getAdapter();
            if (adapter != null) {
                int iJ = adapter.j();
                for (int i = 0; i < iJ; i++) {
                    znc zncVar = (znc) pickerChatsTabWidget.w0.s0.get(i);
                    uu3 uu3Var2 = (zncVar == null || (cocVar = (coc) x53.i0(zncVar.e())) == null) ? null : cocVar.a;
                    PickerChatsListWidget pickerChatsListWidget = uu3Var2 instanceof PickerChatsListWidget ? (PickerChatsListWidget) uu3Var2 : null;
                    if (pickerChatsListWidget != null) {
                        bc7[] bc7VarArr = PickerChatsListWidget.C0;
                        bc7 bc7Var3 = bc7VarArr[2];
                        Boolean boolValueOf = Boolean.valueOf(z);
                        fs fsVar = pickerChatsListWidget.X;
                        fsVar.b(pickerChatsListWidget, boolValueOf);
                        bc7 bc7Var4 = bc7VarArr[2];
                        boolean zBooleanValue = ((Boolean) fsVar.a(pickerChatsListWidget)).booleanValue();
                        je7 je7Var = pickerChatsListWidget.B0;
                        if (zBooleanValue) {
                            pickerChatsListWidget.p0().j((c03) je7Var.getValue());
                        } else {
                            pickerChatsListWidget.p0().p0((c03) je7Var.getValue());
                        }
                    }
                }
            }
        }
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.u0;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.t0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == xoc.r0) {
            dz5.c.P1().d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uu3
    public final boolean handleBack() {
        znc zncVar = this.E0;
        if (zncVar != null && zncVar.n()) {
            ((iz5) v0().c).r.z(1);
            return true;
        }
        if (!(!((Collection) v0().Z.a.getValue()).isEmpty())) {
            return super.handleBack();
        }
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        lg3 lg3VarE = wg0.e(yoc.m0, 6, null);
        lg3VarE.b(xoc.r0, new eqe(yoc.l0));
        lg3VarE.c(xoc.q0, new eqe(yoc.k0));
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
        confirmationBottomSheetE.setTargetController(this);
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        confirmationBottomSheetE.z0(this);
        if (zncVarT == null) {
            return true;
        }
        coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
        wg0.l(false, cocVar, true, "BottomSheetWidget");
        zncVarT.G(cocVar);
        return true;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Iterable m0() {
        csb csbVar = new csb(getContext());
        csbVar.setId(m8a.c);
        v3c.y(new xh0(3, (Continuation) null, 14), csbVar);
        csbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(52 * fk4.d().getDisplayMetrics().density)));
        od2.L(new zn5(((iz5) v0().c).n, new qz5(csbVar, this, null), 5), getViewLifecycleScope());
        return y53.M(csbVar, y0());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final sya n0() {
        wy5 wy5Var = wy5.a;
        return new m5d(this.v0, new xs2(wy5Var.getAccessor().d(iy2.class)), wy5Var.getAccessor().d(ds3.class), wy5Var.getAccessor().d(q33.class));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Widget o0(String str) {
        return new PickerChatsTabWidget(str, B0(), new oz5(this, 0), oa2.b, null);
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.D0 = null;
        this.E0 = null;
        hc8 hc8Var = this.G0;
        if (hc8Var != null) {
            hc8Var.a();
        }
        this.G0 = null;
        ywe yweVar = this.H0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
        this.H0 = null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen, one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i = 1;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        br7.d(t0(), J0, null);
        w12 w12Var = new w12(viewGroup.getContext());
        w12Var.setId(m8a.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        w12Var.setLayoutParams(layoutParams);
        int i2 = vc7.a;
        w12Var.setTranslationY(vc7.a(w12Var.getContext()));
        br7.d(w12Var, new x27(0, new yq0(5, 1, false), 1), null);
        this.D0 = w12Var;
        this.E0 = getChildRouter(w12Var);
        viewGroup.addView(w12Var);
        od2.L(new zn5(v0().Z, new yz5(this, view, null), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new ac(((iz5) v0().c).t, 24, this), getViewLifecycleOwner().Q(), fg7.o), new wz5(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(((iz5) v0().c).q, new zz5(null, this), 5), getViewLifecycleScope());
        ViewGroup viewGroupT0 = t0();
        znc zncVar = this.E0;
        w12 w12Var2 = this.D0;
        if (zncVar == null || w12Var2 == null) {
            return;
        }
        pz5 pz5Var = new pz5(this, i);
        boolean z = ((gta) wy5.a.getAccessor().c(gta.class)).b && Build.VERSION.SDK_INT >= 30;
        pg7 viewLifecycleScope = getViewLifecycleScope();
        uy8 uy8Var = (uy8) ((w7c) ((iz5) v0().c).r.c).a.getValue();
        this.G0 = new hc8(zncVar, w12Var2, viewGroupT0, pz5Var, z, viewLifecycleScope, (uy8Var != null ? uy8Var.a : 0) == 2, new yf3(this, 12, viewGroupT0));
        new bc8((cc8) this.C0.getValue(), y0()).a(getViewLifecycleScope());
        od2.L(new zn5(new t03((w7c) ((iz5) v0().c).r.c, 11), new sz5(this, viewGroupT0, null), 5), getViewLifecycleScope());
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final cla p0(Context context) {
        cla claVar = new cla(context, 6);
        claVar.setId(m8a.d);
        claVar.setTransitionName(context.getString(r8a.q));
        claVar.setTitle(r8a.U);
        float f = 4;
        claVar.setActionsHorizontalPadding(new kpa(Integer.valueOf(tu0.G(fk4.d().getDisplayMetrics().density * f)), Integer.valueOf(tu0.G(f * fk4.d().getDisplayMetrics().density))));
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new oz5(this, 1)));
        claVar.setRightActions(new pka(new xka(new rz5(this, 0)), new vka(woc.t0, new oz5(this, 2))));
        return claVar;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final qza q0() {
        Long lValueOf = getArgs().getLong("attach_to_forward") == 0 ? null : Long.valueOf(getArgs().getLong("attach_to_forward"));
        long[] longArray = getArgs().getLongArray("messages_to_forward");
        Set setN0 = longArray != null ? ys.n0(longArray) : null;
        Set set = setN0 == null ? wz4.a : setN0;
        wy5 wy5Var = wy5.a;
        return new iz5(set, (d06) wy5Var.getAccessor().c(d06.class), this.v0, lValueOf, A0(), (Context) wy5Var.getAccessor().c(Context.class), wy5Var.getAccessor().d(kke.class), wy5Var.getAccessor().d(lu0.class), wy5Var.getAccessor().d(sy5.class), wy5Var.getAccessor().d(bz5.class), wy5Var.getAccessor().d(wha.class), wy5Var.getAccessor().d(q33.class));
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final g9a r0() {
        return null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final j0e s0() {
        return null;
    }

    @Override // one.me.chats.picker.AbstractPickerScreen
    public final Set w0(Bundle bundle) {
        return wz4.a;
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        iz5 iz5Var = (iz5) v0().c;
        iz5Var.getClass();
        int i2 = m8a.f;
        kld kldVar = iz5Var.p;
        if (i == i2) {
            kldVar.g(new lz5());
        } else if (i == m8a.e) {
            kldVar.g(kz5.a);
        }
    }

    public final sv8 y0() {
        bc7 bc7Var = I0[5];
        return (sv8) this.A0.getValue();
    }

    public final csb z0() {
        return (csb) this.B0.T0(this, I0[6]);
    }

    public ForwardPickerScreen(Bundle bundle) {
        super(bundle);
        this.t0 = new glc(new fh5(7), null, 6);
        this.u0 = x27.c;
        wy5 wy5Var = wy5.a;
        this.v0 = new x3c(wy5Var.getAccessor().d(q33.class), wy5Var.getAccessor().d(kke.class), wy5Var.getAccessor().d(iy2.class), 8);
        Boolean bool = Boolean.FALSE;
        this.w0 = new fs(Boolean.class, bool, "is_forward_attach");
        this.x0 = new fs(Boolean.class, bool, "is_in_multiselect");
        this.y0 = new fh5(8);
        AutoTransition autoTransition = new AutoTransition();
        int i = m8a.c;
        autoTransition.addTarget(i);
        autoTransition.addTarget(p8a.c0);
        autoTransition.addTarget(m8a.a);
        autoTransition.setOrdering(0);
        autoTransition.setDuration(100L);
        autoTransition.addListener((Transition.TransitionListener) new a6(1, this));
        this.z0 = autoTransition;
        this.A0 = binding(new pz5(this, 2));
        this.B0 = viewBinding(i);
        this.C0 = createViewModelLazy(cc8.class, new nj4(7, new fh5(9)));
        this.F0 = new tz5(this, 0);
        wy5Var.getAccessor().d(y7d.class);
        kr0 kr0Var = new kr0(this, new pz5(this, 3));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 6));
        }
    }

    public /* synthetic */ ForwardPickerScreen(long[] jArr, Long l, boolean z, boolean z2, int i, z84 z84Var) {
        this(jArr, (i & 2) != 0 ? null : l, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
