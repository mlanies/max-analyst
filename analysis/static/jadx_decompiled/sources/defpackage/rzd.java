package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class rzd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rzd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k56
    public final Object invoke() {
        njc njcVar;
        final byte b = 0;
        final int i = 1;
        switch (this.a) {
            case 0:
                return kt3.b(((uzd) this.b).getContext(), woc.U1);
            case 1:
                return new xzd((el1) ((StartRecordBottomSheet) this.b).y0.getValue());
            case 2:
                return (wuc) this.b;
            case 3:
                bc7[] bc7VarArr = StickerSetBottomSheet.A0;
                nfa nfaVar = new nfa(((StickerSetBottomSheet) this.b).getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                nfaVar.setLayoutParams(layoutParams);
                nfaVar.setAppearance(ffa.a);
                nfaVar.setSize(ifa.a);
                return nfaVar;
            case 4:
                a8e a8eVar = (a8e) this.b;
                return new dg9(a8eVar.a, a8eVar.X, new bk(20, a8eVar));
            case 5:
                pte pteVar = (pte) this.b;
                try {
                    njcVar = QrCodeGenerator.nativeRenderSvg(pteVar.a, pteVar.b, pteVar.c);
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                boolean z = njcVar instanceof njc;
                njc njcVar2 = njcVar;
                if (z) {
                    njcVar2 = null;
                }
                int[] iArr = (int[]) njcVar2;
                if (iArr == null) {
                    return null;
                }
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int i2 = pteVar.b;
                int i3 = pteVar.c;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, config);
                bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, i3);
                Paint paint = pteVar.g;
                Shader.TileMode tileMode = pteVar.i;
                paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                pteVar.j = true;
                return e5f.a;
            case 6:
                ViewConfiguration viewConfiguration = ViewConfiguration.get(((rge) this.b).b.getContext());
                int iMax = Math.max(viewConfiguration.getScaledTouchSlop(), viewConfiguration.getScaledPagingTouchSlop()) * 2;
                Integer numValueOf = iMax > 0 ? Integer.valueOf(iMax) : null;
                return Integer.valueOf(numValueOf != null ? numValueOf.intValue() : tu0.G(40 * fk4.d().getDisplayMetrics().density));
            case 7:
                int i4 = SwipeWidget.c;
                return Boolean.valueOf(((SwipeWidget) this.b).S());
            case 8:
                return ((iba) ((tle) this.b).u0.getValue()).g();
            case 9:
                return new cbf(((rre) this.b).a);
            case 10:
                bc7[] bc7VarArr2 = ThreadsStateViewerScreen.X;
                final ThreadsStateViewerScreen threadsStateViewerScreen = (ThreadsStateViewerScreen) this.b;
                cla claVar = new cla(threadsStateViewerScreen.getContext(), 6);
                claVar.setId(yvb.threads_state_toolbar);
                claVar.setTitle("Состояние потоков");
                claVar.setForm(uka.a);
                claVar.setLeftActions(new kka(new m56() { // from class: ete
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        e5f e5fVar = e5f.a;
                        ThreadsStateViewerScreen threadsStateViewerScreen2 = threadsStateViewerScreen;
                        switch (b) {
                            case 0:
                                bc7[] bc7VarArr3 = ThreadsStateViewerScreen.X;
                                i3a onBackPressedDispatcher = threadsStateViewerScreen2.getOnBackPressedDispatcher();
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.d();
                                    break;
                                }
                                break;
                            default:
                                bc7[] bc7VarArr4 = ThreadsStateViewerScreen.X;
                                cte cteVar = (cte) threadsStateViewerScreen2.c.getValue();
                                cteVar.getClass();
                                vxd vxdVarN = pnf.n(cteVar, null, vx3.b, new bte(cteVar, null), 1);
                                cteVar.c.o1(cteVar, cte.X[0], vxdVarN);
                                break;
                        }
                        return e5fVar;
                    }
                }));
                claVar.setRightActions(new pka(null, new wka(woc.O1, wfa.Q, new m56() { // from class: ete
                    @Override // defpackage.m56
                    public final Object invoke(Object obj) {
                        e5f e5fVar = e5f.a;
                        ThreadsStateViewerScreen threadsStateViewerScreen2 = threadsStateViewerScreen;
                        switch (i) {
                            case 0:
                                bc7[] bc7VarArr3 = ThreadsStateViewerScreen.X;
                                i3a onBackPressedDispatcher = threadsStateViewerScreen2.getOnBackPressedDispatcher();
                                if (onBackPressedDispatcher != null) {
                                    onBackPressedDispatcher.d();
                                    break;
                                }
                                break;
                            default:
                                bc7[] bc7VarArr4 = ThreadsStateViewerScreen.X;
                                cte cteVar = (cte) threadsStateViewerScreen2.c.getValue();
                                cteVar.getClass();
                                vxd vxdVarN = pnf.n(cteVar, null, vx3.b, new bte(cteVar, null), 1);
                                cteVar.c.o1(cteVar, cte.X[0], vxdVarN);
                                break;
                        }
                        return e5fVar;
                    }
                }, 6)));
                return claVar;
            case 11:
                float fIntValue = ((Number) ((xcf) this.b).c.getValue()).intValue();
                return Integer.valueOf((int) (fIntValue - (0.4f * fIntValue)));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                sif sifVar = (sif) this.b;
                sifVar.v0 = true;
                sifVar.f();
                return e5f.a;
            case 13:
                return new bkf((yjf) this.b);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr3 = VideoViewerWidget.u0;
                dmf dmfVarO0 = ((VideoViewerWidget) this.b).o0();
                if (dmfVarO0 != null) {
                    return ((ChatMediaViewerScreen) dmfVarO0).B0();
                }
                return null;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((zzf) this.b).s().k;
            case 16:
                bc7[] bc7VarArr4 = WelcomeScreen.s0;
                return new x37(((WelcomeScreen) this.b).getRouter());
            case LangUtils.HASH_SEED /* 17 */:
                return Widget.childWidgetContainer_delegate$lambda$13((Widget) this.b);
            case 18:
                return new l5g(((l5g) this.b).b, 1);
            case 19:
                ho9 ho9Var = new ho9();
                q7g q7gVar = (q7g) this.b;
                ho9Var.c = q7gVar.a;
                ho9Var.a = Math.min(100, 50);
                je7 je7Var = q7gVar.c;
                ho9Var.d = ((iba) je7Var.getValue()).c();
                ho9Var.b = ((iba) je7Var.getValue()).a();
                return new me3(ho9Var);
            default:
                hm9.n("v7g", "start init property workManager");
                v7g v7gVar = (v7g) this.b;
                s7g s7gVarD = s7g.d(new u7g(v7gVar, v7gVar.a));
                hm9.n("v7g", "workManager property inited!");
                et7 et7Var = new et7(i, b);
                synchronized (a14.e) {
                    a14.f = et7Var;
                }
                return s7gVarD;
        }
    }
}
