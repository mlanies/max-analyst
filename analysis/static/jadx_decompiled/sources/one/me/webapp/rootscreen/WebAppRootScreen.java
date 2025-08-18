package one.me.webapp.rootscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.system.ErrnoException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.au1;
import defpackage.bc7;
import defpackage.bse;
import defpackage.bvc;
import defpackage.bwf;
import defpackage.c1g;
import defpackage.c8d;
import defpackage.cla;
import defpackage.coc;
import defpackage.da7;
import defpackage.dy7;
import defpackage.e09;
import defpackage.fg7;
import defpackage.fs;
import defpackage.fxc;
import defpackage.glc;
import defpackage.gld;
import defpackage.hob;
import defpackage.hp;
import defpackage.j47;
import defpackage.je7;
import defpackage.jwf;
import defpackage.jzf;
import defpackage.k56;
import defpackage.ke2;
import defpackage.kk5;
import defpackage.kka;
import defpackage.kla;
import defpackage.kpa;
import defpackage.kxc;
import defpackage.lka;
import defpackage.mqd;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nhd;
import defpackage.njc;
import defpackage.od2;
import defpackage.oi9;
import defpackage.osf;
import defpackage.ouf;
import defpackage.pjc;
import defpackage.pnf;
import defpackage.pzf;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qq0;
import defpackage.qqe;
import defpackage.qwf;
import defpackage.qzf;
import defpackage.rh4;
import defpackage.s0;
import defpackage.s35;
import defpackage.sx3;
import defpackage.tu0;
import defpackage.tyf;
import defpackage.vsf;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.vyf;
import defpackage.w4d;
import defpackage.w97;
import defpackage.w9a;
import defpackage.wg0;
import defpackage.wsf;
import defpackage.wtf;
import defpackage.wyf;
import defpackage.x27;
import defpackage.x77;
import defpackage.xt3;
import defpackage.y16;
import defpackage.yyf;
import defpackage.z5b;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zy;
import defpackage.zzf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\b\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/webapp/rootscreen/WebAppRootScreen;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lng3;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Losf;", "entryPoint", ApiProtocol.PARAM_CHAT_ID, "", "startParam", "", "isFullscreen", "", "requestCode", "(JLosf;Ljava/lang/Long;Ljava/lang/String;ZI)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController", "SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public final class WebAppRootScreen extends BaseBottomSheetWidget implements ng3, xt3 {
    public static final /* synthetic */ bc7[] G0 = {new oi9(WebAppRootScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;"), rh4.g(nec.a, WebAppRootScreen.class, "botId", "getBotId()J"), new oi9(WebAppRootScreen.class, "entryPoint", "getEntryPoint()Lone/me/sdk/statistics/webapps/WebAppActionsStats$EntryPoint;"), new oi9(WebAppRootScreen.class, "startParam", "getStartParam()Ljava/lang/String;"), new oi9(WebAppRootScreen.class, "isFullscreen", "isFullscreen()Z"), new hob(WebAppRootScreen.class, "requestCode", "getRequestCode()I", 0), new oi9(WebAppRootScreen.class, "shareDialogJob", "getShareDialogJob()Lkotlinx/coroutines/Job;"), new hob(WebAppRootScreen.class, "webView", "getWebView()Lone/me/webapp/rootscreen/ScrollTrackingWebView;", 0), new hob(WebAppRootScreen.class, "webViewEventSender", "getWebViewEventSender()Lone/me/webapp/rootscreen/WebViewEventSender;", 0), new hob(WebAppRootScreen.class, "toolbarView", "getToolbarView()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final glc A0;
    public final je7 B0;
    public final w4d C0;
    public final q7c D0;
    public final qm0 E0;
    public final q7c F0;
    public final fs s0;
    public final fs t0;
    public final fs u0;
    public final fs v0;
    public final fs w0;
    public final fs x0;
    public final je7 y0;
    public bwf z0;

    /* JADX WARN: Multi-variable type inference failed */
    public WebAppRootScreen() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D0(defpackage.cla r4, boolean r5) {
        /*
            android.widget.TextView r0 = r4.getTitle()
            float r0 = defpackage.qqe.e(r0)
            int r0 = defpackage.i24.I(r0)
            r1 = 0
            if (r5 == 0) goto L20
            android.widget.TextView r2 = r4.getTitle()
            ecf r2 = defpackage.qqe.a(r2)
            if (r2 == 0) goto L1c
            int r2 = r2.a
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 != r0) goto L20
            return
        L20:
            if (r5 == 0) goto L41
            android.widget.TextView r5 = r4.getTitle()
            ecf r5 = defpackage.qqe.a(r5)
            if (r5 == 0) goto L2e
            int r1 = r5.a
        L2e:
            if (r1 == r0) goto L41
            ecf r5 = new ecf
            android.content.Context r1 = r4.getContext()
            w8c r2 = new w8c
            r3 = 28
            r2.<init>(r3)
            r5.<init>(r1, r0, r2)
            goto L42
        L41:
            r5 = 0
        L42:
            android.widget.TextView r4 = r4.getTitle()
            defpackage.qqe.d(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.webapp.rootscreen.WebAppRootScreen.D0(cla, boolean):void");
    }

    public static final void x0(WebAppRootScreen webAppRootScreen, Intent intent, c1g c1gVar) throws IOException, ErrnoException {
        je7 je7Var;
        Object njcVar;
        webAppRootScreen.getClass();
        byte[] bArr = c1gVar.a;
        String str = HTTP.PLAIN_TEXT_TYPE;
        if (bArr == null) {
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            return;
        }
        String str2 = c1gVar.b;
        String str3 = str2 == null ? "file" : str2;
        int i = 0;
        File fileI = null;
        while (true) {
            je7Var = webAppRootScreen.B0;
            if (fileI != null && !fileI.exists()) {
                break;
            }
            if (i == 100) {
                fileI = null;
                break;
            } else {
                fileI = ((kk5) je7Var.getValue()).i(au1.g(str3, i > 0 ? wg0.g(i, " (", ")") : ""));
                i++;
            }
        }
        if (fileI == null) {
            return;
        }
        zy zyVar = new zy(fileI, null);
        FileOutputStream fileOutputStreamF = zyVar.f();
        if (fileOutputStreamF != null) {
            try {
                fileOutputStreamF.write(bArr);
                zyVar.b(fileOutputStreamF);
            } catch (Throwable th) {
                zyVar.a(fileOutputStreamF);
                throw th;
            }
        }
        String str4 = c1gVar.c;
        if (str4 != null) {
            str = str4;
        }
        try {
            intent.setType(str);
            if (str2 != null) {
                intent.putExtra("android.intent.extra.TITLE", str2);
            }
            intent.putExtra("android.intent.extra.STREAM", ((kk5) je7Var.getValue()).f(webAppRootScreen.getContext(), fileI));
            njcVar = intent.addFlags(1);
        } catch (Throwable th2) {
            njcVar = new njc(th2);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            thA.toString();
        }
    }

    public final fxc A0() {
        return (fxc) this.D0.T0(this, G0[7]);
    }

    public final boolean B0() {
        bc7 bc7Var = G0[4];
        return ((Boolean) this.w0.a(this)).booleanValue();
    }

    public final void C0(boolean z) {
        Object objPrevious;
        ArrayList arrayListE = getRouter().e();
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((coc) objPrevious).a instanceof y16) {
                    break;
                }
            }
        }
        coc cocVar = (coc) objPrevious;
        Object obj = cocVar != null ? cocVar.a : null;
        y16 y16Var = obj instanceof y16 ? (y16) obj : null;
        if (y16Var != null) {
            bc7[] bc7VarArr = G0;
            bc7 bc7Var = bc7VarArr[5];
            fs fsVar = this.x0;
            if (((Number) fsVar.a(this)).intValue() == 0) {
                return;
            }
            int i = z ? -1 : 0;
            bc7 bc7Var2 = bc7VarArr[5];
            y16Var.R(((Number) fsVar.a(this)).intValue(), i, null);
        }
    }

    @Override // defpackage.ng3
    public final void E(Bundle bundle) {
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (numValueOf != null && numValueOf.intValue() == 5) {
            z0().t(false);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            z0().u(false);
        }
    }

    public final void E0(boolean z) {
        y0().setLeftActions(z ? new kka(new tyf(this, 2)) : new lka(new tyf(this, 3)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.A0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (i != 1) {
                return;
            }
            zzf zzfVarZ0 = z0();
            zzfVarZ0.getClass();
            pnf.o(zzfVarZ0.M0, new yyf(false));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (i == 1) {
                z0().v(true);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                z0().v(false);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            if (i == 1) {
                z0().u(true);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                z0().u(false);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            if (i == 1) {
                ouf oufVarS = z0().s();
                j47.T(oufVarS.c, ((w9a) oufVarS.e()).a(), null, new wtf(oufVarS, null, true), 2);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                ouf oufVarS2 = z0().s();
                j47.T(oufVarS2.c, ((w9a) oufVarS2.e()).a(), null, new wtf(oufVarS2, null, false), 2);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            if (i == 1) {
                z0().t(true);
            } else {
                if (i != 2) {
                    return;
                }
                z0().t(false);
            }
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final boolean handleBack() {
        zzf zzfVarZ0 = z0();
        if (!((Boolean) zzfVarZ0.F0.getValue()).booleanValue()) {
            pnf.n(zzfVarZ0, null, null, new pzf(zzfVarZ0, null), 3);
            return true;
        }
        c8d c8dVar = zzfVarZ0.D0;
        c8dVar.getClass();
        j47.T((sx3) c8dVar.a, null, null, new da7(c8dVar, null), 3);
        return true;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final z5b n0() {
        return new ke2(this, 1);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: o0 */
    public final x27 getA0() {
        if (!B0()) {
            return this.o;
        }
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1013 || A0().getFilePathCallback() == null) {
            return;
        }
        String dataString = null;
        if (i2 == -1) {
            if ((intent != null ? intent.getDataString() : null) != null) {
                dataString = intent.getDataString();
            }
        }
        zzf zzfVarZ0 = z0();
        zzfVarZ0.getClass();
        pnf.o(zzfVarZ0.M0, new jzf(dataString));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new qq0(15, this));
        } else if (qqe.c(y0().getTitle())) {
            D0(y0(), true);
        }
        zzf zzfVarZ0 = z0();
        if (zzfVarZ0.J0) {
            return;
        }
        je7 je7Var = zzfVarZ0.z0;
        if (((kxc) ((hp) je7Var.getValue())).d("app.pinLock.screenshotEnabled", true)) {
            ((kxc) ((hp) je7Var.getValue())).t(false);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.z0 = null;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        super.onDetach(view);
        zzf zzfVarZ0 = z0();
        if (zzfVarZ0.J0) {
            return;
        }
        je7 je7Var = zzfVarZ0.z0;
        if (((kxc) ((hp) je7Var.getValue())).d("app.pinLock.screenshotEnabled", true)) {
            return;
        }
        ((kxc) ((hp) je7Var.getValue())).t(true);
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        bc7[] bc7VarArr = G0;
        bc7 bc7Var = bc7VarArr[6];
        w4d w4dVar = this.C0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[6], null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        String string = getArgs().getString("web_root_screen:url");
        if (string != null) {
            A0().loadUrl(string);
        }
        this.z0 = new bwf(requireActivity(), new e09(0, z0(), zzf.class, "onBiometrySuccess", "onBiometrySuccess()V", 0, 15), new e09(0, z0(), zzf.class, "onBiometryFail", "onBiometryFail()V", 0, 16));
        s35 s35Var = z0().M0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new vyf(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g((gld) z0().O0.getValue(), getViewLifecycleOwner().Q(), fg7Var), new wyf(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final boolean r0() {
        zzf zzfVarZ0 = z0();
        if (!((Boolean) zzfVarZ0.G0.getValue()).booleanValue()) {
            return true;
        }
        pnf.n(zzfVarZ0, null, null, new pzf(zzfVarZ0, null), 3);
        return false;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void u0() {
        zzf zzfVarZ0 = z0();
        if (!zzfVarZ0.I0) {
            w97 w97Var = zzfVarZ0.P0;
            if (w97Var != null) {
                w97Var.b(new s0());
            }
            zzfVarZ0.P0 = null;
            zzfVarZ0.Q0 = null;
            ConcurrentHashMap concurrentHashMap = zzfVarZ0.R0;
            concurrentHashMap.size();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ((Number) entry.getKey()).longValue();
                ((w97) entry.getValue()).b(new qwf());
            }
            concurrentHashMap.clear();
            vxd vxdVar = zzfVarZ0.S0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            zzfVarZ0.S0 = null;
            bc7[] bc7VarArr = zzf.T0;
            bc7 bc7Var = bc7VarArr[0];
            w4d w4dVar = zzfVarZ0.C0;
            x77 x77Var = (x77) w4dVar.T0(zzfVarZ0, bc7Var);
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            w4dVar.o1(zzfVarZ0, bc7VarArr[0], null);
        }
        zzf zzfVarZ02 = z0();
        if (zzfVarZ02.I0) {
            return;
        }
        zzfVarZ02.I0 = true;
        vsf vsfVar = (vsf) zzfVarZ02.w0.getValue();
        wsf wsfVar = zzfVarZ02.B0;
        if (wsfVar != null) {
            vsfVar.a(2, wsfVar.a, wsfVar.b, wsfVar.c, wsfVar.d, null);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tyf tyfVar = new tyf(this, 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(kla.c);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tyfVar.invoke(linearLayout);
        frameLayout.addView(linearLayout);
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        if (i == 1) {
            zzf zzfVarZ0 = z0();
            zzfVarZ0.getClass();
            vxd vxdVarN = pnf.n(zzfVarZ0, null, vx3.b, new qzf(zzfVarZ0, null), 1);
            zzfVarZ0.C0.o1(zzfVarZ0, zzf.T0[0], vxdVarN);
        }
    }

    public final cla y0() {
        return (cla) this.F0.T0(this, G0[9]);
    }

    public final zzf z0() {
        return (zzf) this.y0.getValue();
    }

    public /* synthetic */ WebAppRootScreen(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public WebAppRootScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.s0 = new fs(cls, "web_root_screen:chat_id");
        this.t0 = new fs(cls, "web_root_screen:bot_id");
        this.u0 = new fs(osf.class, "web_root_screen:entry_point");
        this.v0 = new fs(String.class, "web_root_screen:start_param");
        this.w0 = new fs(Boolean.class, Boolean.FALSE, "web_root_screen:is_fullscreen");
        this.x0 = new fs(Integer.class, 0, "web_root_screen.request_code.key");
        final int i = 0;
        this.y0 = createViewModelLazy(zzf.class, new nhd(16, new k56(this) { // from class: syf
            public final /* synthetic */ WebAppRootScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                WebAppRootScreen webAppRootScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = WebAppRootScreen.G0;
                        webAppRootScreen.getClass();
                        bc7[] bc7VarArr2 = WebAppRootScreen.G0;
                        bc7 bc7Var = bc7VarArr2[1];
                        long jLongValue = ((Number) webAppRootScreen.t0.a(webAppRootScreen)).longValue();
                        bc7 bc7Var2 = bc7VarArr2[2];
                        osf osfVar = (osf) webAppRootScreen.u0.a(webAppRootScreen);
                        bc7 bc7Var3 = bc7VarArr2[0];
                        Long l = (Long) webAppRootScreen.s0.a(webAppRootScreen);
                        bc7 bc7Var4 = bc7VarArr2[3];
                        return new zzf(jLongValue, osfVar, l, (String) webAppRootScreen.v0.a(webAppRootScreen));
                    default:
                        bc7[] bc7VarArr3 = WebAppRootScreen.G0;
                        return new t3g(webAppRootScreen.A0());
                }
            }
        }));
        this.A0 = new glc(new bse(21), new e09(0, this, WebAppRootScreen.class, "buildScreenParams", "buildScreenParams()Lone/me/sdk/statistics/params/Params;", 0, 17), 4);
        this.B0 = jwf.a.getAccessor().d(kk5.class);
        this.C0 = mqd.D();
        this.D0 = viewBinding(kla.j);
        final int i2 = 1;
        this.E0 = binding(new k56(this) { // from class: syf
            public final /* synthetic */ WebAppRootScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                WebAppRootScreen webAppRootScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = WebAppRootScreen.G0;
                        webAppRootScreen.getClass();
                        bc7[] bc7VarArr2 = WebAppRootScreen.G0;
                        bc7 bc7Var = bc7VarArr2[1];
                        long jLongValue = ((Number) webAppRootScreen.t0.a(webAppRootScreen)).longValue();
                        bc7 bc7Var2 = bc7VarArr2[2];
                        osf osfVar = (osf) webAppRootScreen.u0.a(webAppRootScreen);
                        bc7 bc7Var3 = bc7VarArr2[0];
                        Long l = (Long) webAppRootScreen.s0.a(webAppRootScreen);
                        bc7 bc7Var4 = bc7VarArr2[3];
                        return new zzf(jLongValue, osfVar, l, (String) webAppRootScreen.v0.a(webAppRootScreen));
                    default:
                        bc7[] bc7VarArr3 = WebAppRootScreen.G0;
                        return new t3g(webAppRootScreen.A0());
                }
            }
        });
        this.F0 = viewBinding(kla.i);
    }

    public /* synthetic */ WebAppRootScreen(long j, osf osfVar, Long l, String str, boolean z, int i, int i2, z84 z84Var) {
        this(j, osfVar, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }

    public WebAppRootScreen(long j, osf osfVar, Long l, String str, boolean z, int i) {
        this(dy7.g(new kpa("web_root_screen:bot_id", Long.valueOf(j)), new kpa("web_root_screen:entry_point", osfVar), new kpa("web_root_screen:chat_id", l), new kpa("web_root_screen:start_param", str), new kpa("web_root_screen:is_fullscreen", Boolean.valueOf(z)), new kpa("web_root_screen.request_code.key", Integer.valueOf(i))));
    }
}
