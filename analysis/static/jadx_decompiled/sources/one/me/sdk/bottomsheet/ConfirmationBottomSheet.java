package one.me.sdk.bottomsheet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.fs;
import defpackage.hob;
import defpackage.jqe;
import defpackage.nec;
import defpackage.ng3;
import defpackage.og3;
import defpackage.oi9;
import defpackage.z7b;
import defpackage.z84;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0015\b\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lone/me/sdk/bottomsheet/ConfirmationBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "lg3", "mg3", "ng3", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ConfirmationBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0 = {new hob(ConfirmationBottomSheet.class, "icon", "getIcon()Ljava/lang/Integer;", 0), z7b.g(nec.a, ConfirmationBottomSheet.class, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), new hob(ConfirmationBottomSheet.class, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new hob(ConfirmationBottomSheet.class, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new hob(ConfirmationBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new oi9(ConfirmationBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final fs A0;
    public final fs B0;
    public final fs C0;
    public final boolean D0;
    public final fs E0;
    public final bvc F0;
    public final fs y0;
    public final fs z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmationBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.F0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void u0() {
        Object targetController = getTargetController();
        ng3 ng3Var = targetController instanceof ng3 ? (ng3) targetController : null;
        if (ng3Var != null) {
            ng3Var.G();
        }
        bc7[] bc7VarArr = G0;
        bc7 bc7Var = bc7VarArr[5];
        if (((Boolean) this.E0.a(this)).booleanValue()) {
            return;
        }
        Object targetController2 = getTargetController();
        ng3 ng3Var2 = targetController2 instanceof ng3 ? (ng3) targetController2 : null;
        if (ng3Var2 != null) {
            bc7 bc7Var2 = bc7VarArr[4];
            ng3Var2.E((Bundle) this.C0.a(this));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        bc7[] bc7VarArr = G0;
        bc7 bc7Var = bc7VarArr[1];
        CharSequence charSequenceB = ((jqe) this.z0.a(this)).b(getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        bc7 bc7Var2 = bc7VarArr[2];
        jqe jqeVar = (jqe) this.A0.a(this);
        CharSequence charSequenceB2 = jqeVar != null ? jqeVar.b(layoutInflater.getContext()) : null;
        bc7 bc7Var3 = bc7VarArr[3];
        return new og3(this, charSequenceB, charSequenceB2, (ArrayList) this.B0.a(this), layoutInflater.getContext());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* renamed from: y0, reason: from getter */
    public final boolean getS0() {
        return this.D0;
    }

    public /* synthetic */ ConfirmationBottomSheet(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConfirmationBottomSheet(android.os.Bundle r5) {
        /*
            r4 = this;
            r4.<init>(r5)
            fs r5 = new fs
            java.lang.String r0 = "icon"
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r2 = 0
            r5.<init>(r1, r2, r0)
            r4.y0 = r5
            fs r5 = new fs
            java.lang.String r0 = "title"
            java.lang.Class<jqe> r1 = defpackage.jqe.class
            r5.<init>(r1, r0)
            r4.z0 = r5
            fs r5 = new fs
            java.lang.String r0 = "description"
            r5.<init>(r1, r2, r0)
            r4.A0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            fs r0 = new fs
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            java.lang.String r3 = "buttons"
            r0.<init>(r1, r5, r3)
            r4.B0 = r0
            fs r5 = new fs
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r1 = "payload"
            r5.<init>(r0, r2, r1)
            r4.C0 = r5
            android.os.Bundle r5 = r4.getArgs()
            java.lang.String r0 = "memorize_keyboard"
            r1 = 1
            boolean r5 = r5.getBoolean(r0, r1)
            r4.D0 = r5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            fs r0 = new fs
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.lang.String r3 = "callback_sent"
            r0.<init>(r1, r5, r3)
            r4.E0 = r0
            android.os.Bundle r5 = r4.getArgs()
            java.lang.String r0 = "stat_screen"
            java.lang.String r5 = r5.getString(r0)
            if (r5 == 0) goto L80
            wuc r5 = defpackage.wuc.valueOf(r5)     // Catch: java.lang.Throwable -> L69
            goto L70
        L69:
            r5 = move-exception
            njc r0 = new njc
            r0.<init>(r5)
            r5 = r0
        L70:
            boolean r0 = r5 instanceof defpackage.njc
            if (r0 == 0) goto L75
            goto L76
        L75:
            r2 = r5
        L76:
            wuc r2 = (defpackage.wuc) r2
            if (r2 == 0) goto L80
            glc r5 = new glc
            r5.<init>(r2)
            goto L84
        L80:
            bvc r5 = super.getScreenDelegate()
        L84:
            r4.F0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.bottomsheet.ConfirmationBottomSheet.<init>(android.os.Bundle):void");
    }
}
