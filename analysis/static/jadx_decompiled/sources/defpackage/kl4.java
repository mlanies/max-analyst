package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglRenderer;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class kl4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kl4(rk5 rk5Var, Exception exc, long j) {
        this.a = 26;
        this.c = rk5Var;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o05 o05Var;
        Executor executor;
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        switch (this.a) {
            case 0:
                ll4 ll4Var = (ll4) this.c;
                ll4Var.g--;
                SparseIntArray sparseIntArray = ll4Var.b;
                il4 il4Var = (il4) this.b;
                int i = sparseIntArray.get(il4Var.o) - 1;
                int i2 = il4Var.o;
                if (i != 0) {
                    sparseIntArray.put(i2, i);
                    return;
                }
                sparseIntArray.delete(i2);
                ll4Var.c.remove(il4Var);
                ll4Var.a.add(il4Var);
                return;
            case 1:
                ml4 ml4Var = (ml4) this.c;
                ml4Var.g--;
                SparseIntArray sparseIntArray2 = ml4Var.b;
                il4 il4Var2 = (il4) this.b;
                int i3 = sparseIntArray2.get(il4Var2.o) - 1;
                int i4 = il4Var2.o;
                if (i3 != 0) {
                    sparseIntArray2.put(i4, i3);
                    return;
                }
                sparseIntArray2.delete(i4);
                ml4Var.c.remove(il4Var2);
                ml4Var.a.add(il4Var2);
                return;
            case 2:
                xo4.a((xo4) this.b, ((wo4) this.c).b.l);
                return;
            case 3:
                final vs4 vs4Var = (vs4) this.c;
                vs4Var.X++;
                see seeVar = (see) this.b;
                boolean z3 = seeVar.f;
                ts4 ts4Var = vs4Var.a;
                o76.d((AtomicBoolean) ts4Var.c, true);
                o76.c((Thread) ts4Var.e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(z3 ? ts4Var.o : ts4Var.p);
                Size size = seeVar.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                seeVar.b(surface, vs4Var.c, new tj3() { // from class: us4
                    @Override // defpackage.tj3
                    public final void accept(Object obj) {
                        vs4 vs4Var2 = vs4Var;
                        vs4Var2.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        vs4Var2.X--;
                        vs4Var2.d();
                    }
                });
                if (seeVar.f) {
                    vs4Var.t0 = surfaceTexture;
                    return;
                } else {
                    vs4Var.u0 = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(vs4Var, vs4Var.o);
                    return;
                }
            case 4:
                vs4 vs4Var2 = (vs4) this.c;
                zh6 zh6Var = vs4Var2.c;
                kee keeVar = (kee) this.b;
                Surface surfaceD = keeVar.d(zh6Var, new vx1(vs4Var2, 2, keeVar));
                vs4Var2.a.p(surfaceD);
                vs4Var2.s0.put(keeVar, surfaceD);
                return;
            case 5:
                ((EglRenderer) this.c).lambda$releaseEglSurface$3((Runnable) this.b);
                return;
            case 6:
                ((EglRenderer) this.c).lambda$release$0((CountDownLatch) this.b);
                return;
            case 7:
                ((d15) this.c).m.remove((f17) this.b);
                return;
            case 8:
                b15 b15Var = (b15) this.b;
                Objects.requireNonNull(b15Var);
                ((Executor) this.c).execute(new dd4(15, b15Var));
                return;
            case 9:
                ((d15) this.c).l.remove((lq1) this.b);
                return;
            case 10:
                ((py9) ((Map.Entry) this.c).getKey()).a((lt0) this.b);
                return;
            case 11:
                ((py9) this.c).a((lt0) this.b);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                LinkedHashMap linkedHashMap = ((z05) this.c).a;
                py9 py9Var = (py9) this.b;
                py9Var.getClass();
                linkedHashMap.remove(py9Var);
                return;
            case 13:
                d15 d15Var = ((b15) this.c).k;
                switch (au1.s(d15Var.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.b;
                        d15Var.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15Var.D)));
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                b15 b15Var2 = (b15) this.c;
                MediaFormat mediaFormat = (MediaFormat) this.b;
                if (b15Var2.j) {
                    String str = b15Var2.k.a;
                    return;
                }
                switch (au1.s(b15Var2.k.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (b15Var2.k.b) {
                            d15 d15Var2 = b15Var2.k;
                            o05Var = d15Var2.r;
                            executor = d15Var2.s;
                        }
                        try {
                            executor.execute(new kl4(o05Var, 15, mediaFormat));
                            return;
                        } catch (RejectedExecutionException unused) {
                            String str2 = b15Var2.k.a;
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(b15Var2.k.D)));
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((o05) this.c).n(new q64(12, (MediaFormat) this.b));
                return;
            case 16:
                ((o05) this.c).j((e05) this.b);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((l05) this.c).a((Surface) this.b);
                return;
            case 18:
                u75 u75Var = (u75) this.c;
                b85 b85Var = (b85) this.b;
                int i5 = u75Var.T0 - b85Var.b;
                u75Var.T0 = i5;
                boolean z4 = true;
                if (b85Var.e) {
                    u75Var.U0 = b85Var.c;
                    u75Var.V0 = true;
                }
                if (i5 == 0) {
                    mue mueVar = ((a3b) b85Var.f).a;
                    if (!u75Var.r1.a.q() && mueVar.q()) {
                        u75Var.s1 = -1;
                        u75Var.t1 = 0L;
                    }
                    if (!mueVar.q()) {
                        List listAsList = Arrays.asList(((b5b) mueVar).k);
                        fm9.k(listAsList.size() == u75Var.A0.size());
                        for (int i6 = 0; i6 < listAsList.size(); i6++) {
                            ((s75) u75Var.A0.get(i6)).c = (mue) listAsList.get(i6);
                        }
                    }
                    if (u75Var.V0) {
                        if (((a3b) b85Var.f).b.equals(u75Var.r1.b) && ((a3b) b85Var.f).d == u75Var.r1.s) {
                            z4 = false;
                        }
                        if (z4) {
                            if (mueVar.q() || ((a3b) b85Var.f).b.b()) {
                                j = ((a3b) b85Var.f).d;
                            } else {
                                a3b a3bVar = (a3b) b85Var.f;
                                yj8 yj8Var = a3bVar.b;
                                long j4 = a3bVar.d;
                                Object obj = yj8Var.a;
                                hue hueVar = u75Var.z0;
                                mueVar.h(obj, hueVar);
                                j = j4 + hueVar.e;
                            }
                            z = z4;
                            u75Var.V0 = false;
                            u75Var.t2((a3b) b85Var.f, 1, z, u75Var.U0, j, -1, false);
                            return;
                        }
                        z = z4;
                    } else {
                        z = false;
                    }
                    j = -9223372036854775807L;
                    u75Var.V0 = false;
                    u75Var.t2((a3b) b85Var.f, 1, z, u75Var.U0, j, -1, false);
                    return;
                }
                return;
            case 19:
                t75 t75Var = (t75) this.c;
                a85 a85Var = (a85) this.b;
                int i7 = t75Var.O0 - a85Var.c;
                t75Var.O0 = i7;
                boolean z5 = true;
                if (a85Var.d) {
                    t75Var.P0 = a85Var.e;
                    t75Var.Q0 = true;
                }
                if (a85Var.f) {
                    t75Var.R0 = a85Var.g;
                }
                if (i7 == 0) {
                    lue lueVar = a85Var.b.a;
                    if (!t75Var.k1.a.q() && lueVar.q()) {
                        t75Var.l1 = -1;
                        t75Var.m1 = 0L;
                    }
                    if (!lueVar.q()) {
                        List listAsList2 = Arrays.asList(((a5b) lueVar).s0);
                        np8.f(listAsList2.size() == t75Var.A0.size());
                        for (int i8 = 0; i8 < listAsList2.size(); i8++) {
                            ((r75) t75Var.A0.get(i8)).b = (lue) listAsList2.get(i8);
                        }
                    }
                    if (t75Var.Q0) {
                        if (a85Var.b.b.equals(t75Var.k1.b) && a85Var.b.d == t75Var.k1.s) {
                            z5 = false;
                        }
                        if (z5) {
                            if (lueVar.q() || a85Var.b.b.a()) {
                                j3 = a85Var.b.d;
                            } else {
                                z2b z2bVar = a85Var.b;
                                xj8 xj8Var = z2bVar.b;
                                long j5 = z2bVar.d;
                                Object obj2 = xj8Var.a;
                                gue gueVar = t75Var.z0;
                                lueVar.h(obj2, gueVar);
                                j3 = j5 + gueVar.X;
                            }
                            j2 = j3;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        z2 = z5;
                    } else {
                        j2 = -9223372036854775807L;
                        z2 = false;
                    }
                    t75Var.Q0 = false;
                    t75Var.q2(a85Var.b, 1, t75Var.R0, false, z2, t75Var.P0, j2, -1);
                    return;
                }
                return;
            case 20:
                r4b r4bVar = (r4b) this.b;
                ((f85) this.c).getClass();
                try {
                    synchronized (r4bVar) {
                    }
                    try {
                        r4bVar.a.a(r4bVar.d, r4bVar.e);
                        return;
                    } finally {
                        r4bVar.b(true);
                    }
                } catch (ExoPlaybackException e) {
                    fm9.c("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 21:
                s4b s4bVar = (s4b) this.b;
                ((g85) this.c).getClass();
                try {
                    synchronized (s4bVar) {
                    }
                    try {
                        s4bVar.a.a(s4bVar.d, s4bVar.e);
                        return;
                    } finally {
                        s4bVar.b(true);
                    }
                } catch (androidx.media3.exoplayer.ExoPlaybackException e2) {
                    z04.v("Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
            case 22:
                fa5 fa5Var = (fa5) this.c;
                fa5Var.getClass();
                ((nx0) fa5Var.a).v(new ea5(fa5Var, (CountDownLatch) this.b, 1));
                return;
            case 23:
                x99 x99Var = (x99) this.c;
                x99Var.getClass();
                ((pm7) x99Var.b).f(-1, new q64(x99Var, 24, (f1f) this.b));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((FeedbackListenerManagerImpl) this.c).notifyResolvedFeedbackItems((ArrayList) ((List) this.b));
                return;
            case 25:
                rk5 rk5Var = (rk5) this.c;
                rk5Var.getClass();
                rk5Var.k.c(VideoFrameProcessingException.a((InterruptedException) this.b));
                return;
            case 26:
                ((rk5) this.c).k.c(VideoFrameProcessingException.a((Exception) this.b));
                return;
            case 27:
                rk5 rk5Var2 = (rk5) this.c;
                rk5Var2.getClass();
                rk5Var2.k.c(VideoFrameProcessingException.a((GlUtil$GlException) this.b));
                return;
            case 28:
                rk5 rk5Var3 = (rk5) this.c;
                rk5Var3.getClass();
                lsd lsdVar = (lsd) this.b;
                rk5Var3.k.o(lsdVar.a, lsdVar.b);
                return;
            default:
                kp.x(((fn5) this.c).t0, ((en5) this.b).a);
                return;
        }
    }

    public /* synthetic */ kl4(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
