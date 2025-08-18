package one.me.filedownloadwarning;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.coc;
import defpackage.dy7;
import defpackage.eh2;
import defpackage.eqe;
import defpackage.foc;
import defpackage.ia3;
import defpackage.ih5;
import defpackage.je7;
import defpackage.jh5;
import defpackage.kke;
import defpackage.kpa;
import defpackage.lg3;
import defpackage.mg3;
import defpackage.naa;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.oaa;
import defpackage.pnf;
import defpackage.uu3;
import defpackage.vxd;
import defpackage.w9a;
import defpackage.wg0;
import defpackage.znc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B;\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/filedownloadwarning/FileDownloadWarningBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "messageId", "", "attachId", "fileId", "fileName", "fileUrl", "(JJLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "file-download-warning_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class FileDownloadWarningBottomSheet extends Widget implements ng3 {
    public static final /* synthetic */ int b = 0;
    public final je7 a;

    public FileDownloadWarningBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = createViewModelLazy(jh5.class, new nj4(3, new eh2(bundle, 4)));
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == naa.a) {
            jh5 jh5Var = (jh5) this.a.getValue();
            vxd vxdVarN = pnf.n(jh5Var, ((w9a) ((kke) jh5Var.c.getValue())).b(), null, new ih5(jh5Var, null), 2);
            jh5Var.Y.o1(jh5Var, jh5.Z[0], vxdVarN);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        lg3 lg3VarE = wg0.e(oaa.d, 6, null);
        lg3VarE.f(new eqe(oaa.c));
        lg3VarE.a(new mg3(naa.b, new eqe(oaa.b), 3, true), new mg3(naa.a, new eqe(oaa.a), 2, true));
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
        confirmationBottomSheetE.addLifecycleListener(new ia3(3, this));
        confirmationBottomSheetE.setTargetController(this);
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        confirmationBottomSheetE.z0(this);
        if (zncVarT != null) {
            coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "BottomSheetWidget");
            zncVarT.G(cocVar);
        }
    }

    public FileDownloadWarningBottomSheet(long j, long j2, String str, long j3, String str2, String str3) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j)), new kpa("message_id", Long.valueOf(j2)), new kpa("attach_id", str), new kpa("file_id", Long.valueOf(j3)), new kpa("file_name", str2), new kpa("file_url", str3)));
    }
}
