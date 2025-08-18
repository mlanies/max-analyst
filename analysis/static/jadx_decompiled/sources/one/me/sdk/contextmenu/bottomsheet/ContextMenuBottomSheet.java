package one.me.sdk.contextmenu.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.cd6;
import defpackage.coc;
import defpackage.es3;
import defpackage.fk6;
import defpackage.foc;
import defpackage.fs;
import defpackage.hob;
import defpackage.jy2;
import defpackage.kr0;
import defpackage.nec;
import defpackage.nz4;
import defpackage.o9;
import defpackage.oi9;
import defpackage.rt3;
import defpackage.uu3;
import defpackage.wg0;
import defpackage.xxc;
import defpackage.z7b;
import defpackage.z84;
import defpackage.znc;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lrt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "wt3", "context-menu_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ContextMenuBottomSheet extends BottomSheetWidget implements rt3 {
    public static final /* synthetic */ bc7[] G0 = {new hob(ContextMenuBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), z7b.g(nec.a, ContextMenuBottomSheet.class, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), new hob(ContextMenuBottomSheet.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new hob(ContextMenuBottomSheet.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new hob(ContextMenuBottomSheet.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new hob(ContextMenuBottomSheet.class, "parentId", "getParentId()Ljava/lang/Integer;", 0), new oi9(ContextMenuBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final fs A0;
    public final fs B0;
    public final fs C0;
    public final fs D0;
    public final fs E0;
    public final xxc F0;
    public final fs y0;
    public final fs z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.rt3
    public final void dismiss() {
        s0(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        kr0 kr0Var = new kr0(this, new es3(1, this));
        if (getRouter() != null) {
            getRouter().a(kr0Var);
        } else {
            addLifecycleListener(new o9(this, kr0Var, 2));
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7VarArr = G0;
        bc7 bc7Var = bc7VarArr[1];
        Integer num = (Integer) this.z0.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            bc7 bc7Var2 = bc7VarArr[2];
            Class cls = (Class) this.A0.a(this);
            if (cls == null) {
                return;
            }
            cd6 cd6Var = new cd6(cls, iIntValue);
            cd6Var.g(this);
            fk6 fk6Var = new fk6(cd6Var);
            bc7 bc7Var3 = bc7VarArr[3];
            Rect rect = (Rect) this.B0.a(this);
            bc7 bc7Var4 = bc7VarArr[4];
            Float f = (Float) this.C0.a(this);
            bc7 bc7Var5 = bc7VarArr[5];
            fk6Var.a(view, rect, f, (Integer) this.D0.a(this));
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

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = layoutInflater.getContext();
        Bundle bundle = getArgs().getBundle("actions");
        List listF = bundle != null ? ay7.f(bundle) : null;
        if (listF == null) {
            listF = nz4.a;
        }
        jy2 jy2Var = new jy2(6, this);
        this.F0.getClass();
        return xxc.i(context, listF, jy2Var);
    }

    public ContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.y0 = new fs(Bundle.class, null, ApiProtocol.PARAM_PAYLOAD);
        this.z0 = new fs(Integer.class, "anchor_id");
        this.A0 = new fs(Class.class, "anchor_class");
        this.B0 = new fs(Rect.class, "highlight_padding");
        this.C0 = new fs(Float.class, "highlight_radius");
        this.D0 = new fs(Integer.class, "parent_id");
        this.E0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
        this.F0 = new xxc();
        boolean z = false;
        if (bundle != null) {
            BaseBottomSheetWidget.X.getClass();
            z = bundle.getBoolean(BaseBottomSheetWidget.Z, false);
        }
        v0(z);
    }

    public /* synthetic */ ContextMenuBottomSheet(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
