package defpackage;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.apache.http.util.LangUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesListenerProxy;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class nn6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nn6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((wmc) this.b).p();
                return;
            case 1:
                tq6 tq6Var = (tq6) this.b;
                if (tq6Var.s0.get()) {
                    return;
                }
                hm9.p("uq6", "onUrlExpired", null);
                tq6Var.Z.onError(new HttpUrlExpiredException(null, null, null, 6));
                tq6Var.a(false);
                return;
            case 2:
                vt6 vt6Var = (vt6) this.b;
                synchronized (vt6Var.z0) {
                    try {
                        vt6Var.B0 = null;
                        ov6 ov6Var = vt6Var.A0;
                        if (ov6Var != null) {
                            vt6Var.A0 = null;
                            vt6Var.e(ov6Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                iu6 iu6Var = (iu6) this.b;
                iu6Var.getClass();
                hm9.m("iu6", "Clear fresco. BitmapMemoryCache size: %d bytes", Integer.valueOf(s36.o().f.getSizeInBytes()));
                ArrayList arrayList = new ArrayList();
                List listJ = ((el3) iu6Var.c.getValue()).j(el3.r, el3.t);
                int i2 = 0;
                while (true) {
                    int size = listJ.size();
                    kk0 kk0Var = kk0.c;
                    if (i2 >= size) {
                        List listUnmodifiableList = Collections.unmodifiableList(((p82) iu6Var.b.getValue()).D(p82.K, false, null));
                        while (i < listUnmodifiableList.size()) {
                            String strB = ((e52) listUnmodifiableList.get(i)).b.b(kk0Var, jk0.a);
                            if (!TextUtils.isEmpty(strB)) {
                                arrayList.add(iu6.a(Uri.parse(strB)));
                            }
                            i++;
                        }
                        s36.o().f.n(new d74(iu6Var, 15, arrayList));
                        return;
                    }
                    String strQ = ((uj3) listJ.get(i2)).q(iu6Var.a.a.q(), kk0Var);
                    if (!TextUtils.isEmpty(strQ)) {
                        arrayList.add(iu6.a(Uri.parse(strQ)));
                    }
                    i2++;
                }
            case 4:
                uu3 uu3Var = (InviteByPhoneScreen) this.b;
                uu3Var.getRouter().B(uu3Var);
                return;
            case 5:
                ((VideoFrame.I420Buffer) this.b).release();
                return;
            case 6:
                vf7 vf7Var = (vf7) this.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vf7Var, "translationY", -8.0f, 8.0f);
                objectAnimatorOfFloat.setDuration(2500L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setRepeatMode(2);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat.addUpdateListener(new z00(10, vf7Var));
                objectAnimatorOfFloat.start();
                return;
            case 7:
                cu7 cu7Var = (cu7) this.b;
                try {
                    ((t23) cu7Var.D.getValue()).a();
                    return;
                } catch (Throwable th2) {
                    hm9.p("cu7", "Can't clearCache", th2);
                    ((cba) ((o45) cu7Var.x.getValue())).c(new IllegalStateException("Can't clearCache"), false);
                    return;
                }
            case 8:
                ((imf) this.b).b.setOnClickListener(null);
                return;
            case 9:
                ((a98) this.b).release();
                return;
            case 10:
                w98 w98Var = (w98) this.b;
                v98 v98Var = w98Var.l;
                if (v98Var != null) {
                    w98Var.d.unbindService(v98Var);
                    w98Var.l = null;
                }
                w98Var.c.c.clear();
                return;
            case 11:
                bc7[] bc7VarArr = MediaKeyboardWidget.C0;
                ((MediaKeyboardWidget) this.b).m0();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((gf8) this.b).n = -1;
                return;
            case 13:
                ((bh8) this.b).a();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                synchronized (((bj8) this.b).a) {
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                jy8 jy8Var = (jy8) this.b;
                if (!((f5a) jy8Var.b.getValue()).d()) {
                    hm9.p("jy8", "restoreUploads: not authorized", null);
                    return;
                } else {
                    hm9.n("jy8", "restoreUploadsFromStorage");
                    ((py8) jy8Var.a.getValue()).a().a(new g28(new rxd(22, jy8Var), new o9g(21, jy8Var), new e5(12, jy8Var)));
                    return;
                }
            case 16:
                m1f m1fVar = (m1f) ((rxd) this.b).b;
                m1fVar.X.h(m1fVar.F0);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((xg9) this.b).e = false;
                return;
            case 18:
                uh9 uh9Var = (uh9) this.b;
                Handler handler = uh9Var.q;
                nn6 nn6Var = uh9Var.r;
                if (handler != null) {
                    handler.removeCallbacks(nn6Var);
                }
                a98 a98Var = uh9Var.m;
                long jK = a98Var != null ? a98Var.k() : 0L;
                a98 a98Var2 = uh9Var.m;
                long jE0 = a98Var2 != null ? a98Var2.e0() : 0L;
                uh9Var.s.m(null, Long.valueOf(jK));
                uh9Var.u.m(null, Long.valueOf(jE0));
                uh9Var.G.m(null, Float.valueOf(ote.d((float) (jK / uh9Var.E), 0.0f, 1.0f)));
                Handler handler2 = uh9Var.q;
                if (handler2 != null) {
                    handler2.postDelayed(nn6Var, 17L);
                    return;
                }
                return;
            case 19:
                hj9 hj9Var = (hj9) this.b;
                if (hj9Var.p) {
                    return;
                }
                hj9Var.p = true;
                ece eceVar = hj9Var.c;
                long j = hj9Var.h;
                LinkedHashMap linkedHashMap = d54.a;
                synchronized (d54.class) {
                }
                Locale locale = Locale.US;
                ExportException exportExceptionD = ExportException.d(new IllegalStateException(ey8.i(j, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002);
                l1f l1fVar = ((h1f) eceVar.a).r;
                l1fVar.getClass();
                l1fVar.g();
                l1fVar.j.b(exportExceptionD, 4, 2, 0).b();
                return;
            case 20:
                ((oj9) this.b).a2();
                return;
            case 21:
                t3a t3aVar = (t3a) this.b;
                boolean zIsAlive = t3aVar.o.isAlive();
                View view = t3aVar.a;
                if (zIsAlive) {
                    t3aVar.o.removeOnPreDrawListener(t3aVar);
                } else {
                    view.getViewTreeObserver().removeOnPreDrawListener(t3aVar);
                }
                view.removeOnAttachStateChangeListener(t3aVar);
                return;
            case 22:
                ((AtomicBoolean) this.b).set(true);
                return;
            case 23:
                ParticipantStatesListenerProxy.raiseRunnable$lambda$0((ParticipantStatesListenerProxy) this.b);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                kqa kqaVar = (kqa) this.b;
                synchronized (kqaVar) {
                    while (i < kqaVar.Y.size()) {
                        try {
                            ((VideoTrack) kqaVar.Y.get(i)).removeSink((VideoSink) kqaVar.Z.get(i));
                            ((VideoTrack) kqaVar.Y.get(i)).removeSink((VideoSink) kqaVar.s0.get(i));
                            i++;
                        } finally {
                            return;
                        }
                    }
                }
                return;
            case 25:
                throw ((RuntimeException) this.b);
            case 26:
                u0b u0bVar = (u0b) this.b;
                if (((f5a) u0bVar.c.getValue()).d() && ((ri4) u0bVar.b.getValue()).d()) {
                    hm9.n("u0b", "processScheduledPing: app is visible, ping and schedule");
                    ((k4a) ((pk) u0bVar.a.getValue())).G(true);
                    u0bVar.a();
                    r9d.y((s8g) u0bVar.d.getValue());
                    return;
                }
                return;
            case 27:
                hm9.n("ey1", "execute()");
                ((fz6) ((hq7) ((je7) ((ey1) this.b).b).getValue())).f();
                hm9.n("ey1", "repository prefetch ok");
                return;
            case 28:
                ((h8b) this.b).q();
                return;
            default:
                q9b q9bVar = (q9b) this.b;
                int i3 = q9bVar.b;
                gh7 gh7Var = q9bVar.Y;
                if (i3 == 0) {
                    q9bVar.c = true;
                    gh7Var.d(eg7.ON_PAUSE);
                }
                if (q9bVar.a == 0 && q9bVar.c) {
                    gh7Var.d(eg7.ON_STOP);
                    q9bVar.o = true;
                    return;
                }
                return;
        }
    }
}
