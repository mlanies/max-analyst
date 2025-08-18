package defpackage;

import android.animation.ValueAnimator;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.main.MainScreen;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import one.me.sdk.richvector.internal.element.PathElement;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class zj7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k56
    public final Object invoke() {
        sme smeVarR;
        boolean zB;
        char c = 1;
        switch (this.a) {
            case 0:
                vw7 vw7Var = vw7.c;
                String str = ((aj7) ((ej7) this.b)).a;
                f64 f64VarP1 = vw7Var.P1();
                y7g y7gVar = new y7g(13);
                y7gVar.b = ":call-join-preview";
                y7gVar.D(str, "link");
                f64VarP1.c(y7gVar.r(), null);
                return e5f.a;
            case 1:
                return LoadEmojiFontWorker.emojiFontLoadingNotifications_delegate$lambda$0((LoadEmojiFontWorker) this.b);
            case 2:
                bc7[] bc7VarArr = LogsViewerScreen.Y;
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) this.b;
                cla claVar = new cla(logsViewerScreen.getContext(), 6);
                claVar.setId(LogsViewerScreen.Z);
                claVar.setTitle("Логи");
                claVar.setForm(uka.a);
                claVar.setLeftActions(new kka(new jy2(29, logsViewerScreen)));
                return claVar;
            case 3:
                huc hucVar = MainScreen.Z;
                String string = ((MainScreen) this.b).getArgs().getString("main:arg:deep_link");
                if (string == null) {
                    string = "";
                }
                return new ox7(((p7b) jyc.a.q()).c, (uq0) bx7.a.getAccessor().c(uq0.class), string);
            case 4:
                return (pc4) ((bp8) this.b).X.invoke();
            case 5:
                qyc qycVar = (qyc) ((jq8) this.b).X;
                qycVar.getClass();
                return Integer.valueOf((int) qycVar.q(PmsKey.f73maxreadmarks, HttpStatus.SC_MULTIPLE_CHOICES));
            case 6:
                return new c17(((ht8) this.b).I0.getContext());
            case 7:
                dy8 dy8Var = (dy8) this.b;
                if (dy8Var.isInEditMode()) {
                    smeVarR = ee4.e0;
                } else {
                    Context context = dy8Var.getContext();
                    khe kheVar = sme.a0;
                    smeVarR = fm9.R(context);
                }
                return Integer.valueOf(smeVarR.g.d.b);
            case 8:
                ((MessagesLayoutManager) this.b).H = false;
                return e5f.a;
            case 9:
                bc7[] bc7VarArr2 = MessagesListWidget.X0;
                return (View) this.b;
            case 10:
                return ((t68) this.b).getClass().getName();
            case 11:
                ib9 ib9Var = (ib9) this.b;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ib9Var.getBounds().width() * 2.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(WorkRequest.MIN_BACKOFF_MILLIS);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(ib9Var);
                return valueAnimatorOfFloat;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return a14.m(((kg9) this.b).a.getContext());
            case 13:
                int iG = tu0.G(64 * fk4.d().getDisplayMetrics().density);
                no9 no9Var = new no9();
                oo9 oo9Var = (oo9) this.b;
                no9Var.setCallback(oo9Var);
                no9Var.b(oo9.q(qp4.u0.j(oo9Var)));
                no9Var.setBounds(0, 0, iG, iG);
                no9Var.i.o1(no9Var, no9.j[0], Float.valueOf(iG / 2.0f));
                return no9Var;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                int i = OneMeApplication.s0;
                jh0 jh0Var = (jh0) y8a.a.getAccessor().c(jh0.class);
                jh0Var.getClass();
                long jNanoTime = System.nanoTime();
                jh0Var.e = !((eua) jh0Var.a.getValue()).b(eua.f);
                eua euaVar = (eua) jh0Var.a.getValue();
                if (Build.VERSION.SDK_INT >= 33) {
                    zB = euaVar.b(eua.k);
                } else {
                    euaVar.getClass();
                    zB = true;
                }
                jh0Var.g = !zB;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    us7 us7Var = us7.X;
                    int i2 = ft4.o;
                    ir6Var.d(us7Var, "BannersInitialDataStorage", "checkMainBannerPermissions by ".concat(ft4.j(z7.S(System.nanoTime() - jNanoTime, kt4.NANOSECONDS))), null);
                }
                atomicBoolean.set((jh0Var.e || jh0Var.g || jh0Var.f) ? false : true);
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Collections.singletonList((String) ((d8a) this.b).b.getValue());
            case 16:
                caa caaVar = (caa) this.b;
                caaVar.s0 = 1.0f;
                caaVar.N0 = 4;
                caaVar.u0 = null;
                caaVar.w0 = null;
                caaVar.v0 = null;
                caaVar.G0.setAlpha(caaVar.M0);
                caaVar.C0.setAlpha(255);
                return e5f.a;
            case LangUtils.HASH_SEED /* 17 */:
                return (NotificationManager) ((kaa) this.b).a.getSystemService("notification");
            case 18:
                return new gl8(((qyc) ((y7d) this.b)).w(PmsKey.f79mediatransform, null));
            case 19:
                return ((b8c) this.b).f();
            case 20:
                GradientDrawable gradientDrawable = new GradientDrawable();
                xja xjaVar = ((wja) this.b).m1;
                float f = xjaVar.a;
                gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                gradientDrawable.setShape(0);
                gradientDrawable.setSize(0, xjaVar.b);
                return gradientDrawable;
            case 21:
                int i3 = woc.o0;
                cka ckaVar = (cka) this.b;
                Drawable drawableB = kt3.b(ckaVar.getContext(), i3);
                float f2 = 20;
                drawableB.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                drawableB.setTint(qp4.u0.j(ckaVar).getIcon().j);
                return drawableB;
            case 22:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (sba sbaVar : (Set) ((adb) this.b).a) {
                    concurrentHashMap.put(sbaVar.a, sbaVar);
                }
                return concurrentHashMap;
            case 23:
                return new ala((cla) this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new nz0((cra) this.b, c == true ? 1 : 0);
            case 25:
                return PathElement.path_delegate$lambda$0((PathElement) this.b);
            case 26:
                bc7[] bc7VarArr3 = PermissionBottomSheet.H0;
                bc7 bc7Var = bc7VarArr3[6];
                PermissionBottomSheet permissionBottomSheet = (PermissionBottomSheet) this.b;
                fs fsVar = permissionBottomSheet.F0;
                if (!((Boolean) fsVar.a(permissionBottomSheet)).booleanValue()) {
                    bc7 bc7Var2 = bc7VarArr3[6];
                    fsVar.b(permissionBottomSheet, Boolean.TRUE);
                    uu3 targetController = permissionBottomSheet.getTargetController();
                    nta ntaVar = targetController instanceof nta ? (nta) targetController : null;
                    if (ntaVar != null) {
                        ntaVar.Y(permissionBottomSheet.G0);
                    }
                    permissionBottomSheet.G0 = false;
                }
                return e5f.a;
            case 27:
                dua duaVar = (dua) this.b;
                return r0e.a(((eua) duaVar.b.getValue()).b(duaVar.a) ? bua.a : bua.b);
            case 28:
                return ((Context) ((imc) this.b).b).getSharedPreferences("permissions_prefs", 0);
            default:
                float fIntValue = ((Number) ((fwa) this.b).a.getValue()).intValue();
                return Integer.valueOf((int) (fIntValue - (0.4f * fIntValue)));
        }
    }
}
