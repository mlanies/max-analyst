package one.me.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.review.ReviewException;
import defpackage.a14;
import defpackage.aab;
import defpackage.afg;
import defpackage.ax7;
import defpackage.ay6;
import defpackage.bcf;
import defpackage.br;
import defpackage.bta;
import defpackage.buc;
import defpackage.bva;
import defpackage.by6;
import defpackage.c37;
import defpackage.coc;
import defpackage.cta;
import defpackage.eia;
import defpackage.f46;
import defpackage.fg7;
import defpackage.g1e;
import defpackage.g91;
import defpackage.gh7;
import defpackage.gjg;
import defpackage.h91;
import defpackage.hb3;
import defpackage.hm9;
import defpackage.hp;
import defpackage.ir6;
import defpackage.j1e;
import defpackage.j31;
import defpackage.j8;
import defpackage.jva;
import defpackage.kia;
import defpackage.kr1;
import defpackage.kvb;
import defpackage.kxc;
import defpackage.l91;
import defpackage.lx4;
import defpackage.mig;
import defpackage.mkg;
import defpackage.mr0;
import defpackage.nmc;
import defpackage.od2;
import defpackage.ps1;
import defpackage.pw7;
import defpackage.q5;
import defpackage.q71;
import defpackage.qm4;
import defpackage.qne;
import defpackage.qu4;
import defpackage.qw7;
import defpackage.ri9;
import defpackage.rw7;
import defpackage.s36;
import defpackage.sw7;
import defpackage.t03;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.tw7;
import defpackage.uhg;
import defpackage.uia;
import defpackage.ukg;
import defpackage.ul9;
import defpackage.us7;
import defpackage.uu3;
import defpackage.uw7;
import defpackage.v3c;
import defpackage.vt7;
import defpackage.vw7;
import defpackage.w12;
import defpackage.w7c;
import defpackage.woc;
import defpackage.wr1;
import defpackage.x53;
import defpackage.x77;
import defpackage.xh0;
import defpackage.xi1;
import defpackage.xx6;
import defpackage.y27;
import defpackage.y8a;
import defpackage.y98;
import defpackage.yzb;
import defpackage.z7;
import defpackage.zja;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zx6;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.main.MainScreen;
import ru.ok.tamtam.logout.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/android/MainActivity;", "Lq5;", "Lnmc;", "Lj8;", "<init>", "()V", "hx9", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MainActivity extends q5 implements nmc, j8 {
    public static final /* synthetic */ int a1 = 0;
    public znc U0;
    public final boolean V0 = true;
    public l91 W0;
    public final lx4 X0;
    public final ax7 Y0;
    public x77 Z0;

    public MainActivity() {
        y8a y8aVar = y8a.a;
        this.X0 = (lx4) y8aVar.getAccessor().c(lx4.class);
        ax7 ax7Var = (ax7) y8aVar.getAccessor().c(ax7.class);
        this.Y0 = ax7Var;
        ax7Var.getClass();
        cta ctaVar = cta.MAIN_ACTIVITY_INIT_TO_RENDER;
        ax7Var.e.k(ctaVar, new bta(ctaVar, SystemClock.elapsedRealtime()));
        ax7Var.h = true;
    }

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.q5
    public final void c0(int i, int i2, Intent intent) {
        if (i != 102 || i2 == 0) {
            return;
        }
        ((jva) ((bva) y8a.a.getAccessor().c(bva.class))).c();
        a14.L(this, new uia(new kia(woc.n), z7.B(this, yzb.oneme_contact_saved_snackbar_title), null, new eia(0, 0, 0, 7)));
    }

    @Override // defpackage.q5
    public final void d0() {
    }

    @Override // defpackage.nmc
    public final znc g() {
        znc zncVar = this.U0;
        if (zncVar != null) {
            return zncVar;
        }
        return null;
    }

    @Override // defpackage.nmc
    /* renamed from: h, reason: from getter */
    public final boolean getV0() {
        return this.V0;
    }

    public final void j0() {
        ukg ukgVarQ;
        String str;
        ((by6) y8a.a.getAccessor().c(by6.class)).getClass();
        ay6 ay6Var = by6.b;
        if (ay6Var != null) {
            buc bucVar = new buc();
            ay6Var.a = this;
            ay6Var.d = bucVar;
            Context applicationContext = getApplicationContext();
            if (applicationContext != null) {
                this = applicationContext;
            }
            mig migVar = new mig(this);
            aab aabVar = new aab();
            aabVar.b = new Handler(Looper.getMainLooper());
            aabVar.a = migVar;
            ay6Var.b = aabVar;
            mig migVar2 = (mig) aabVar.a;
            Object[] objArr = {migVar2.b};
            qm4 qm4Var = mig.c;
            qm4Var.b("requestInAppReview (%s)", objArr);
            mkg mkgVar = migVar2.a;
            if (mkgVar == null) {
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 6)) {
                    qm4.d(qm4Var.a, "Play Store app is either not installed or not the official version", objArr2);
                }
                Locale locale = Locale.getDefault();
                HashMap map = afg.a;
                if (map.containsKey(-1)) {
                    str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) afg.b.get(-1)) + ")";
                } else {
                    str = "";
                }
                ukgVarQ = j1e.q(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
            } else {
                qne qneVar = new qne();
                mkgVar.a().post(new gjg(mkgVar, qneVar, qneVar, new uhg(migVar2, qneVar, qneVar)));
                ukgVarQ = qneVar.a;
            }
            if (ukgVarQ != null) {
                ukgVarQ.i(new zx6(ay6Var, 0));
            }
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String name = MainActivity.class.getName();
        ir6 ir6Var = hm9.m;
        Continuation continuation = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "@deep_link: onCreate: intent.data = " + getIntent().getData(), null);
        }
        this.Y0.d(getIntent());
        w12 w12VarB = s36.b(this);
        w12VarB.setId(kvb.root);
        v3c.y(new br(this, continuation, 9), w12VarB);
        getWindow().setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        setContentView(w12VarB);
        qu4.a(this);
        super.onCreate(bundle);
        znc zncVarC = mr0.c(this, w12VarB, bundle);
        zncVarC.e = 1;
        zncVarC.Q(false);
        this.U0 = zncVarC;
        RootController rootControllerS = a14.s(this);
        y8a y8aVar = y8a.a;
        y8aVar.o().g(new zja(this, 14, rootControllerS));
        a14.M(this, null);
        bcf bcfVar = bcf.a;
        bcfVar.b().getClass();
        bcfVar.b().getClass();
        l91 l91Var = (l91) y8aVar.getAccessor().c(l91.class);
        E().a(this, l91Var.y0);
        hm9.n("PipAppController", "CallIndicatorAppController attached");
        l91Var.Z = this;
        l91.c().a((h91) l91Var.x0.getValue());
        l91Var.g(true);
        ((wr1) l91Var.a).d((g91) l91Var.w0.getValue());
        l91Var.o.d(l91Var);
        this.W0 = l91Var;
        od2.L(new zn5(((vt7) y8aVar.getAccessor().c(vt7.class)).stream(), new rw7(this, null), 5), f46.J(this));
        w7c w7cVarC = ((a) y8aVar.getAccessor().c(a.class)).c(f46.J(this));
        gh7 gh7Var = this.a;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVarC, gh7Var, fg7Var), new sw7(this, null), 5), f46.J(this));
        od2.L(new zn5(this.X0.a(), new tw7(this, null), 5), f46.J(this));
        setIntent(null);
        od2.L(new zn5(od2.x(tu0.g(((kxc) ((hp) y8aVar.getAccessor().c(hp.class))).l, this.a, fg7Var)), new uw7(this, null), 5), f46.J(this));
        int i = 3;
        t03 t03Var = new t03(od2.D(new t03(new j31(c37.c(new hb3(2, new y98(y8aVar.n().a.u()))), new t03(ul9.d, 11), new xh0(i, continuation, 18), 4), 11), new pw7(this, null)), 27);
        MainScreen.Z.getClass();
        this.Z0 = od2.L(new zn5(new t03(tu0.g(new j31(t03Var, MainScreen.t0, new xi1(i, continuation, 2), 4), this.a, fg7.X), 11), new qw7(this, null), 5), f46.J(this));
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        l91 l91Var = this.W0;
        if (l91Var != null) {
            hm9.n("PipAppController", "CallIndicatorAppController dettached");
            l91Var.Z = null;
            l91.c().K((h91) l91Var.x0.getValue());
            ((wr1) l91Var.a).G.remove((g91) l91Var.w0.getValue());
            l91Var.o.c(l91Var);
        }
    }

    @Override // defpackage.q5, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        q71 q71Var = (q71) ((l91) y8a.a.getAccessor().c(l91.class)).X.getValue();
        boolean zR = ((wr1) ((kr1) q71Var.a.getValue())).r();
        boolean z = keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25);
        if (z && zR) {
            q71Var.a();
        } else {
            hm9.n("HandleSilenceMode", "skip handle buttons, isIncoming=" + zR + " isNeededAction=" + z);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String name = MainActivity.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "@deep_link: onNewIntent: intent.data = " + intent.getData(), null);
        }
        this.Y0.d(intent);
        super.onNewIntent(intent);
        a14.e(a14.s(this), intent);
        y8a.a.o().g(new zja(this, 13, intent));
        a14.M(this, intent);
        setIntent(null);
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        ri9 ri9Var = y27.a;
        Object[] objArr = ri9Var.b;
        long[] jArr = ri9Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((g1e) objArr[(i << 3) + i3]).g = true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.yb3, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        l91 l91Var;
        Activity activity;
        super.onPictureInPictureModeChanged(z, configuration);
        if (z || (l91Var = this.W0) == null || (activity = l91Var.Z) == null) {
            return;
        }
        hm9.n("PipAppController", "hide global pip");
        l91Var.i(false);
        znc zncVarC = l91.c();
        coc cocVar = (coc) x53.q0(zncVarC.e());
        if (!tpa.f(cocVar != null ? cocVar.b : null, ":call-pip")) {
            hm9.n("PipAppController", "last screen wasn't pip, skip navigation to call.");
        } else if (((wr1) l91Var.a).q() && !ps1.a(zncVarC)) {
            hm9.n("PipAppController", "open active call after pip mode.");
            vw7.c.P1().b(":call-active", null);
        }
        uu3 uu3VarG = zncVarC.g(":call-pip");
        if (uu3VarG != null) {
            zncVarC.B(uu3VarG);
            if (zncVarC.n()) {
                return;
            }
            activity.finish();
        }
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        xx6 xx6VarI;
        super.onResume();
        y8a y8aVar = y8a.a;
        ((by6) y8aVar.getAccessor().c(by6.class)).getClass();
        ay6 ay6Var = by6.b;
        if (ay6Var != null && (xx6VarI = y8aVar.i()) != null) {
            xx6VarI.k = ay6Var.e;
        }
        y27.a();
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onStart() {
        super.onStart();
        j0();
    }

    @Override // defpackage.q5, defpackage.im, androidx.fragment.app.b, android.app.Activity
    public final void onStop() {
        xx6 xx6VarI;
        super.onStop();
        y8a y8aVar = y8a.a;
        ((by6) y8aVar.getAccessor().c(by6.class)).getClass();
        if (by6.b == null || (xx6VarI = y8aVar.i()) == null) {
            return;
        }
        xx6VarI.k = null;
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        l91 l91Var = this.W0;
        if (l91Var != null) {
            l91Var.h();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            y27.a();
        }
    }
}
