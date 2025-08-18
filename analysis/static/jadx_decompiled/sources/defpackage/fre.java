package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import com.android.installreferrer.api.ReferrerDetails;
import com.my.tracker.obfuscated.a;
import com.my.tracker.obfuscated.a0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class fre implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fre(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 25;
        switch (this.a) {
            case 0:
                hre hreVar = (hre) this.b;
                see seeVar = hreVar.h;
                if (seeVar != null && seeVar == ((see) this.c)) {
                    hreVar.h = null;
                    hreVar.g = null;
                }
                u00 u00Var = hreVar.l;
                if (u00Var != null) {
                    u00Var.f();
                    hreVar.l = null;
                    return;
                }
                return;
            case 1:
                Runnable runnable = (Runnable) this.b;
                qm qmVar = (qm) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    qmVar.a();
                }
            case 2:
                l1f l1fVar = (l1f) this.b;
                l1fVar.getClass();
                ffc ffcVarJ = ((ww6) this.c).j();
                k8g k8gVar = l1fVar.d;
                String str = (String) k8gVar.b;
                String str2 = (String) k8gVar.c;
                h1f h1fVar = (h1f) l1fVar.e.a;
                h1fVar.q.a.e(ffcVarJ);
                t85 t85Var = h1fVar.q;
                if (str != null) {
                    t85Var.g = str;
                }
                if (str2 != null) {
                    t85Var.n = str2;
                }
                h1fVar.r = null;
                int i2 = h1fVar.v;
                if (i2 == 1) {
                    h1fVar.v = 2;
                    dd3 dd3Var = h1fVar.t;
                    dd3Var.getClass();
                    tpa.g(dd3Var, true, false);
                    h1fVar.s.getClass();
                    h1fVar.s.b();
                    throw null;
                }
                if (i2 == 2) {
                    h1fVar.s = null;
                    h1fVar.v = 3;
                    throw null;
                }
                if (i2 == 3) {
                    h1fVar.v = 4;
                    throw null;
                }
                if (i2 != 5) {
                    if (i2 != 6) {
                        h1f.b(h1fVar);
                        return;
                    }
                    h1fVar.w = null;
                    t85Var.p = 1;
                    h1f.b(h1fVar);
                    return;
                }
                h1fVar.v = 6;
                dd3 dd3Var2 = h1fVar.t;
                fm9.h(dd3Var2);
                lv4 lv4Var = (lv4) ((mv4) dd3Var2.a.get(0)).a.get(0);
                zd9 zd9Var = h1fVar.w;
                fm9.h(zd9Var);
                db8 db8Var = lv4Var.a.e;
                long j = db8Var.b;
                dd3 dd3VarH = tpa.h(h1fVar.t, zd9Var.b, db8Var.d, zd9Var.a, true, true);
                fm9.h(h1fVar.s);
                h1fVar.s.b();
                h1fVar.f(dd3VarH, h1fVar.s, h1fVar.p, zd9Var.b - j);
                return;
            case 3:
                ccd ccdVar = (ccd) this.b;
                bm7 bm7Var = (bm7) this.c;
                if (ccdVar.a instanceof q0) {
                    bm7Var.cancel(false);
                    return;
                }
                return;
            case 4:
                rdf rdfVar = (rdf) this.b;
                if (((xf4) this.c) == rdfVar.p) {
                    rdfVar.I();
                    return;
                }
                return;
            case 5:
                ndf ndfVar = (ndf) this.b;
                ndfVar.getClass();
                bad badVar = (bad) this.c;
                ((ArrayList) badVar.b.d).remove(ndfVar);
                badVar.e.remove(ndfVar);
                return;
            case 6:
                ((l05) ((zm4) this.b).j).a((Surface) this.c);
                return;
            case 7:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                return;
            case 8:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                return;
            case 9:
                xff xffVar = (xff) this.c;
                nx0 nx0Var = (nx0) this.b;
                nx0Var.getClass();
                try {
                    xffVar.run();
                    return;
                } catch (Exception e) {
                    nx0Var.d(e);
                    return;
                }
            case 10:
                sif sifVar = (sif) this.b;
                if (sifVar.v0) {
                    hm9.p(sifVar.a, "postToGl, GL is already RELEASED, skip action!", null);
                    return;
                } else {
                    ((k56) this.c).invoke();
                    return;
                }
            case 11:
                wva wvaVar = (wva) this.b;
                wvaVar.getClass();
                int i3 = maf.a;
                t75 t75Var = ((n75) wvaVar.c).a;
                t75Var.getClass();
                t75Var.x0.i(25, new f74((ilf) this.c));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                aab aabVar = (aab) this.b;
                aabVar.getClass();
                int i4 = oaf.a;
                u75 u75Var = ((o75) aabVar.b).a;
                jlf jlfVar = (jlf) this.c;
                u75Var.p1 = jlfVar;
                u75Var.x0.f(25, new q64(22, jlfVar));
                return;
            case 13:
                wva wvaVar2 = (wva) this.b;
                wvaVar2.getClass();
                int i5 = maf.a;
                h74 h74Var = ((n75) wvaVar2.c).a.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1019, new b74(edVarP, (String) this.c, 12));
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                wva wvaVar3 = (wva) this.b;
                wvaVar3.getClass();
                int i6 = maf.a;
                h74 h74Var2 = ((n75) wvaVar3.c).a.C0;
                ed edVarP2 = h74Var2.P();
                h74Var2.Q(edVarP2, 1030, new b74(edVarP2, (Exception) this.c, i));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                aab aabVar2 = (aab) this.b;
                aabVar2.getClass();
                int i7 = oaf.a;
                i74 i74Var = ((o75) aabVar2.b).a.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1030, new yv3(fdVarF, (Exception) this.c));
                return;
            case 16:
                aab aabVar3 = (aab) this.b;
                aabVar3.getClass();
                int i8 = oaf.a;
                i74 i74Var2 = ((o75) aabVar3.b).a.D0;
                fd fdVarF2 = i74Var2.F();
                i74Var2.I(fdVarF2, 1019, new r64(fdVarF2, (String) this.c, 1));
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
            case 18:
                WatchTogetherListenerManagerImpl.sendActualState$lambda$5((WatchTogetherListenerManagerImpl) this.b, (WatchTogetherListener) this.c);
                return;
            case 19:
                j7g j7gVar = (j7g) this.b;
                dcd dcdVar = (dcd) this.c;
                if (j7gVar.a.a instanceof r0) {
                    dcdVar.cancel(true);
                    return;
                } else {
                    dcdVar.l(j7gVar.o.getForegroundInfoAsync());
                    return;
                }
            case 20:
                ((v7g) this.b).i((p7g) this.c);
                return;
            case 21:
                ((v7g) this.b).a((q8g) this.c, false);
                return;
            case 22:
                v8g v8gVar = (v8g) this.b;
                bm7 bm7Var2 = (bm7) this.c;
                if (v8gVar.B0.a instanceof r0) {
                    bm7Var2.cancel(true);
                    return;
                }
                return;
            case 23:
                super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((ZoomableDraweeView) ((n5) this.b).c).o((ru6) this.c);
                return;
            case 25:
                ((ZoomableDraweeView) ((n5) this.b).c).n((Throwable) this.c);
                return;
            case 26:
                Object obj = this.c;
                uag uagVar = (uag) this.b;
                uagVar.getClass();
                try {
                    moc mocVar = uagVar.d.c;
                    if (mocVar != null) {
                        mocVar.a(uagVar.c, (roc) obj);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    uagVar.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th);
                    return;
                }
            case 27:
                Throwable th2 = (Throwable) this.c;
                uag uagVar2 = (uag) this.b;
                uagVar2.getClass();
                try {
                    tj4 tj4Var = uagVar2.d.d;
                    if (tj4Var != null) {
                        tj4Var.b(uagVar2.c, th2);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    uagVar2.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th3);
                    return;
                }
            case 28:
                ((a) this.b).a((Activity) this.c);
                return;
            default:
                ((a0) this.b).b((ReferrerDetails) this.c);
                return;
        }
    }
}
