package one.me.sdk.contextmenu.popup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bc7;
import defpackage.bu3;
import defpackage.cd6;
import defpackage.coc;
import defpackage.es3;
import defpackage.fk4;
import defpackage.fk6;
import defpackage.fka;
import defpackage.foc;
import defpackage.fs;
import defpackage.hob;
import defpackage.kr0;
import defpackage.n6b;
import defpackage.nec;
import defpackage.o9;
import defpackage.oi9;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rl4;
import defpackage.rt3;
import defpackage.tu0;
import defpackage.uu3;
import defpackage.wg0;
import defpackage.x27;
import defpackage.xwb;
import defpackage.z7b;
import defpackage.z84;
import defpackage.znc;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/popup/ContextMenuPopupWindow;", "Lone/me/sdk/arch/Widget;", "Lrt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "re6", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ContextMenuPopupWindow extends Widget implements rt3 {
    public static final /* synthetic */ bc7[] u0 = {new hob(ContextMenuPopupWindow.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), z7b.g(nec.a, ContextMenuPopupWindow.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new hob(ContextMenuPopupWindow.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new hob(ContextMenuPopupWindow.class, "anchorViewId", "getAnchorViewId()I", 0), new hob(ContextMenuPopupWindow.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new hob(ContextMenuPopupWindow.class, "parentViewId", "getParentViewId()Ljava/lang/Integer;", 0), new oi9(ContextMenuPopupWindow.class, "isCallbackSent", "isCallbackSent()Z"), new hob(ContextMenuPopupWindow.class, "cardView", "getCardView()Landroid/view/View;", 0), new hob(ContextMenuPopupWindow.class, "useDarkTheme", "getUseDarkTheme()Z", 0)};
    public static final int v0 = xwb.context_menu_card_id;
    public final fs X;
    public final fs Y;
    public final fs Z;
    public final fs a;
    public final fs b;
    public final fs c;
    public final fs o;
    public final q7c s0;
    public final fs t0;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuPopupWindow() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final fka m0(ContextMenuPopupWindow contextMenuPopupWindow) {
        boolean zN0 = contextMenuPopupWindow.n0();
        pq9 pq9Var = qp4.u0;
        Context context = contextMenuPopupWindow.getContext();
        return zN0 ? pq9Var.o(context).c : pq9Var.b(context).i();
    }

    @Override // defpackage.rt3
    public final void dismiss() {
        getRouter().B(this);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getB() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        dismiss();
        return true;
    }

    public final boolean n0() {
        bc7 bc7Var = u0[8];
        return ((Boolean) this.t0.a(this)).booleanValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        kr0 kr0Var = new kr0(this, new es3(2, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 3));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new bu3(this, layoutInflater, layoutInflater.getContext());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        int iG2 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        bc7[] bc7VarArr = u0;
        bc7 bc7Var = bc7VarArr[3];
        int iIntValue = ((Number) this.o.a(this)).intValue();
        if (iIntValue != -1) {
            bc7 bc7Var2 = bc7VarArr[4];
            cd6 cd6Var = new cd6((Class) this.X.a(this), iIntValue);
            cd6Var.g(this);
            fk6 fk6Var = new fk6(cd6Var);
            bc7 bc7Var3 = bc7VarArr[1];
            Rect rect = (Rect) this.b.a(this);
            bc7 bc7Var4 = bc7VarArr[2];
            Float f = (Float) this.c.a(this);
            bc7 bc7Var5 = bc7VarArr[5];
            fk6Var.a(view, rect, f, (Integer) this.Y.a(this));
            ((ArrayList) cd6Var.c).add(new rl4(new Rect(), (View) this.s0.T0(this, bc7VarArr[7]), view, new Rect(), iG, iG2));
        }
        float f2 = getArgs().getFloat("x", -1.0f);
        float f3 = getArgs().getFloat("y", -1.0f);
        View viewFindViewById = view.findViewById(v0);
        if (f2 <= 0.0f || f3 <= 0.0f) {
            return;
        }
        viewFindViewById.addOnLayoutChangeListener(new n6b(viewFindViewById, f2, f3));
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
        if (zncVarT == null) {
            return;
        }
        coc cocVar = new coc(this, null, null, null, false, -1);
        wg0.l(false, cocVar, true, "BottomSheetWidget");
        zncVarT.G(cocVar);
    }

    public ContextMenuPopupWindow(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Bundle.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.b = new fs(Rect.class, "highlight_padding");
        this.c = new fs(Float.class, "highlight_radius");
        this.o = new fs(Integer.class, -1, "anchor_id");
        this.X = new fs(Class.class, "anchor_class");
        this.Y = new fs(Integer.class, "parent_id");
        Boolean bool = Boolean.FALSE;
        this.Z = new fs(Boolean.class, bool, "callback_sent");
        this.s0 = viewBinding(v0);
        this.t0 = new fs(Boolean.class, bool, "dark_theme");
    }

    public /* synthetic */ ContextMenuPopupWindow(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
