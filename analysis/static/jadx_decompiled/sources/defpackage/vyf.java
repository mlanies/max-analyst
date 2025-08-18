package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class vyf extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ WebAppRootScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyf(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.Y = webAppRootScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        vyf vyfVar = (vyf) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        vyfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        vyf vyfVar = new vyf(continuation, this.Y);
        vyfVar.X = obj;
        return vyfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        znc zncVarT;
        od2.a0(obj);
        kzf kzfVar = (kzf) this.X;
        bc7[] bc7VarArr = WebAppRootScreen.G0;
        WebAppRootScreen webAppRootScreen = this.Y;
        webAppRootScreen.getClass();
        if (kzfVar instanceof azf) {
            azf azfVar = (azf) kzfVar;
            webAppRootScreen.A0().loadUrl(azfVar.a);
            webAppRootScreen.getArgs().putString("web_root_screen:url", azfVar.a);
        } else {
            if (kzfVar instanceof ezf) {
                String str = ((ezf) kzfVar).a;
                Bundle bundleG = zr6.g(1, "dialog_id");
                String string = webAppRootScreen.getContext().getResources().getString(x1c.web_app_root_close_dialog_subtitle, str);
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                lg3 lg3VarE = wg0.e(x1c.web_app_root_close_dialog_title, 4, bundleG);
                lg3VarE.f(new iqe(string));
                lg3VarE.a(new mg3(1, new eqe(x1c.web_app_root_close_dialog_accept), 3, false));
                lg3VarE.a(new mg3(2, new eqe(x1c.web_app_root_close_dialog_decline), 2, false));
                ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                confirmationBottomSheetE.setTargetController(webAppRootScreen);
                ?? parentController = webAppRootScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                zncVarT = focVar != null ? focVar.T() : null;
                confirmationBottomSheetE.z0(webAppRootScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (kzfVar instanceof yyf) {
                webAppRootScreen.s0(true);
                webAppRootScreen.C0(((yyf) kzfVar).a);
            } else if (kzfVar instanceof dzf) {
                bc7 bc7Var = WebAppRootScreen.G0[8];
                t3g t3gVar = (t3g) webAppRootScreen.E0.getValue();
                dzf dzfVar = (dzf) kzfVar;
                String str2 = dzfVar.a;
                t3gVar.getClass();
                t3gVar.a.evaluateJavascript(String.format("\n            (() => {\n                WebApp.sendEvent(\"%s\", \"%s\");\n            })();\n        ", Arrays.copyOf(new Object[]{str2, eae.n0(dzfVar.b, "\"", "\\\"")}, 2)), null);
            } else if (kzfVar instanceof hzf) {
                String str3 = ((hzf) kzfVar).a;
                Bundle bundleG2 = zr6.g(2, "dialog_id");
                String string2 = webAppRootScreen.getContext().getResources().getString(x1c.web_app_root_phone_request_dialog_subtitle, str3);
                bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                lg3 lg3VarE2 = wg0.e(x1c.web_app_root_phone_request_dialog_title, 4, bundleG2);
                lg3VarE2.f(new iqe(string2));
                lg3VarE2.a(new mg3(1, new eqe(x1c.web_app_root_phone_request_dialog_accept), 3, false));
                lg3VarE2.a(new mg3(2, new eqe(x1c.web_app_root_phone_request_dialog_decline), 2, false));
                ConfirmationBottomSheet confirmationBottomSheetE2 = lg3VarE2.e();
                confirmationBottomSheetE2.setTargetController(webAppRootScreen);
                ?? parentController2 = webAppRootScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
                zncVarT = focVar2 != null ? focVar2.T() : null;
                confirmationBottomSheetE2.z0(webAppRootScreen);
                if (zncVarT != null) {
                    coc cocVar2 = new coc(confirmationBottomSheetE2, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT.G(cocVar2);
                }
            } else if (kzfVar instanceof bzf) {
                String str4 = ((bzf) kzfVar).a;
                if (str4.length() != 0) {
                    try {
                        webAppRootScreen.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                    } catch (ActivityNotFoundException e) {
                        e.getMessage();
                    }
                }
            } else if (kzfVar instanceof zyf) {
                webAppRootScreen.C0(true);
                webAppRootScreen.t0();
                zxf.c.P1().b(":link-intercept", dy7.g(new kpa("link", ((zyf) kzfVar).a)));
            } else if (kzfVar instanceof izf) {
                izf izfVar = (izf) kzfVar;
                webAppRootScreen.C0.o1(webAppRootScreen, WebAppRootScreen.G0[6], j47.T(webAppRootScreen.getViewLifecycleScope(), null, vx3.b, new xyf(izfVar.a, webAppRootScreen, izfVar.b, null), 1));
            } else if (kzfVar instanceof gzf) {
                webAppRootScreen.startActivityForResult(((gzf) kzfVar).a.createIntent(), 1013);
            } else if (kzfVar instanceof jzf) {
                String str5 = ((jzf) kzfVar).a;
                Uri[] uriArr = str5 != null ? new Uri[]{Uri.parse(str5)} : null;
                ValueCallback<Uri[]> filePathCallback = webAppRootScreen.A0().getFilePathCallback();
                if (filePathCallback != null) {
                    filePathCallback.onReceiveValue(uriArr);
                    webAppRootScreen.A0().setFilePathCallback(null);
                }
            } else if (kzfVar instanceof fzf) {
                String str6 = ((fzf) kzfVar).a;
                Bundle bundleG3 = zr6.g(3, "dialog_id");
                bc7[] bc7VarArr4 = BottomSheetWidget.x0;
                lg3 lg3VarE3 = wg0.e(x1c.web_app_root_download_file_bottomsheet_title, 4, bundleG3);
                lg3VarE3.f(new gqe(x1c.web_app_root_download_file_bottomsheet_subtitle, ys.m0(new Object[]{str6})));
                lg3VarE3.a(new mg3(1, new eqe(x1c.web_app_root_download_file_bottomsheet_accept), 4, false));
                lg3VarE3.a(new mg3(2, new eqe(x1c.web_app_root_download_file_bottomsheet_decline), 2, false));
                ConfirmationBottomSheet confirmationBottomSheetE3 = lg3VarE3.e();
                confirmationBottomSheetE3.setTargetController(webAppRootScreen);
                ?? parentController3 = webAppRootScreen;
                while (parentController3.getParentController() != null) {
                    parentController3 = parentController3.getParentController();
                }
                foc focVar3 = parentController3 instanceof foc ? (foc) parentController3 : null;
                zncVarT = focVar3 != null ? focVar3.T() : null;
                confirmationBottomSheetE3.z0(webAppRootScreen);
                if (zncVarT != null) {
                    coc cocVar3 = new coc(confirmationBottomSheetE3, null, null, null, false, -1);
                    wg0.l(false, cocVar3, true, "BottomSheetWidget");
                    zncVarT.G(cocVar3);
                }
            } else {
                if (!tpa.f(kzfVar, czf.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                webAppRootScreen.A0().reload();
            }
        }
        return e5f.a;
    }
}
