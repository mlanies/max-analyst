package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkRequest;
import defpackage.am6;
import defpackage.av1;
import defpackage.b46;
import defpackage.cb4;
import defpackage.en6;
import defpackage.fm9;
import defpackage.hb4;
import defpackage.huc;
import defpackage.hx9;
import defpackage.jn;
import defpackage.m14;
import defpackage.oq9;
import defpackage.pl8;
import defpackage.q24;
import defpackage.qz7;
import defpackage.sm6;
import defpackage.tb8;
import defpackage.tr4;
import defpackage.w4d;
import defpackage.wj8;
import defpackage.y14;
import defpackage.y7g;
import defpackage.zpa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class dkf implements n3b, gd, AudioManager.OnAudioFocusChangeListener, p40 {
    public final q40 X;
    public ckf Y;
    public gef Z;
    public final o45 a;
    public final n65 b;
    public final String c = dkf.class.getName();
    public final u75 o;

    public dkf(Context context, o45 o45Var, n65 n65Var, je7 je7Var, n4b n4bVar) throws MissingResourceException {
        Object fc4Var;
        this.a = o45Var;
        this.b = n65Var;
        this.X = new q40(context, this);
        if (n4bVar.b) {
            int i = n4bVar.g;
            if (i < 0) {
                throw new IllegalStateException("The playback_buffer must be greater than or equal to 0".toString());
            }
            int i2 = n4bVar.d;
            if (i2 < 0) {
                throw new IllegalStateException("The playback_buffer_after_rebuffer must be greater than or equal to 0".toString());
            }
            int i3 = n4bVar.e;
            if (i3 < i) {
                throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer".toString());
            }
            if (i3 < i2) {
                throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer_after_rebuffer".toString());
            }
            int i4 = n4bVar.f;
            if (i4 < i3) {
                throw new IllegalStateException("The max_buffer must be greater than or equal to min_buffer".toString());
            }
            int i5 = n4bVar.h;
            if (i5 <= 0) {
                throw new IllegalStateException("The format_max_input_size_scale_up_factor must be greater than 0".toString());
            }
            ve veVar = new ve();
            veVar.a = 5000;
            veVar.b = 13000;
            veVar.c = 500;
            veVar.d = 3000;
            veVar.e = 4;
            veVar.a = i3;
            veVar.b = i4;
            veVar.c = i;
            veVar.d = i2;
            veVar.e = i5;
            fc4Var = new ka9(veVar);
        } else {
            int i6 = n4bVar.g;
            fc4.l("bufferForPlaybackMs", i6, 0, "0");
            int i7 = n4bVar.d;
            fc4.l("bufferForPlaybackAfterRebufferMs", i7, 0, "0");
            int i8 = n4bVar.e;
            fc4.l("minBufferMs", i8, i6, "bufferForPlaybackMs");
            fc4.l("minBufferMs", i8, i7, "bufferForPlaybackAfterRebufferMs");
            int i9 = n4bVar.f;
            fc4.l("maxBufferMs", i9, i8, "minBufferMs");
            fc4Var = new fc4(new n64(1), i8, i9, i6, i7, n4bVar.c);
        }
        cf4 cf4Var = new cf4(context, new kj6(6));
        oe4 oe4VarF = cf4Var.f();
        oe4VarF.getClass();
        me4 me4Var = new me4(oe4VarF);
        String iSO3Language = ((hyc) ((q33) je7Var.getValue())).v().getISO3Language();
        if (iSO3Language == null) {
            me4Var.h(new String[0]);
        } else {
            me4Var.h(new String[]{iSO3Language});
        }
        x65 x65Var = new x65(context);
        fm9.k(!x65Var.v);
        x65Var.e = new lc4(3, cf4Var);
        fm9.k(!x65Var.v);
        x65Var.f = new lc4(7, fc4Var);
        u75 u75VarA = x65Var.a();
        this.o = u75VarA;
        u75VarA.x0.a(this);
        i74 i74Var = u75VarA.D0;
        i74Var.getClass();
        i74Var.Y.a(this);
    }

    @Override // defpackage.gd
    public final void F(fd fdVar, int i) {
        hm9.n(this.c, zr6.h(i, "Player. Video frames dropped: "));
    }

    public final long F0() {
        gef gefVar = this.Z;
        if (gefVar != null) {
            return this.o.k() - gefVar.m();
        }
        return 0L;
    }

    public final long G0() {
        gef gefVar = this.Z;
        if (gefVar == null) {
            return 0L;
        }
        if (gefVar.k() > 0) {
            return gefVar.k() - gefVar.m();
        }
        u75 u75Var = this.o;
        if (u75Var.c() > 0) {
            return u75Var.c();
        }
        return 0L;
    }

    public final boolean H0() {
        u75 u75Var = this.o;
        return u75Var.getPlaybackState() == 3 && !u75Var.u();
    }

    public final void I0(gef gefVar) {
        tr4 tr4VarS;
        Object aobVar;
        tr4 tr4VarS2;
        ckf ckfVar;
        gef gefVar2 = this.Z;
        if (gefVar2 != null && gefVar2.equals(gefVar) && this.o.getPlaybackState() != 1) {
            String str = this.c;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, str, "Player. Restart same content: " + this.Z, null);
            }
            if (this.o.getPlaybackState() == 4) {
                hm9.n(this.c, "Player. Video ended. Seek to start");
                K0();
            }
            if (this.o.getPlaybackState() == 3 && (ckfVar = this.Y) != null) {
                ckfVar.y(true);
            }
            this.o.Y(true);
            ckf ckfVar2 = this.Y;
            if (ckfVar2 != null) {
                ckfVar2.i();
            }
            this.X.m(3);
            return;
        }
        String str2 = this.c;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str2, "Player. Prepare new video content: " + gefVar, null);
        }
        ckf ckfVar3 = this.Y;
        if (ckfVar3 != null) {
            ckfVar3.y0();
        }
        boolean zF = tpa.f(this.Z, gefVar);
        this.Z = gefVar;
        this.o.Y(true);
        String str3 = this.c;
        ir6 ir6Var3 = hm9.m;
        if (ir6Var3 != null && ir6Var3.c()) {
            ir6Var3.d(us7.X, str3, "Player. Prepare mediaSource by content:" + gefVar, null);
        }
        Uri uriL = gefVar.l();
        n65 n65Var = this.b;
        q24 q24Var = gefVar.c0() ^ true ? (q24) n65Var.b.getValue() : (q24) n65Var.a.getValue();
        if (gefVar instanceof c24) {
            aobVar = new wj8(q24Var) { // from class: androidx.media3.exoplayer.dash.DashMediaSource$Factory
                public final jn a;
                public final q24 b;
                public final pl8 c;
                public final oq9 d;
                public final huc e;
                public final long f;
                public final long g;

                {
                    jn jnVar = new jn(q24Var);
                    this.a = jnVar;
                    this.b = q24Var;
                    this.c = new pl8();
                    this.e = new huc();
                    this.f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
                    this.g = 5000000L;
                    this.d = new oq9(9);
                    ((cb4) jnVar.o).c = true;
                }

                @Override // defpackage.wj8
                public final wj8 a() {
                    fm9.i(null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
                    throw null;
                }

                @Override // defpackage.wj8
                public final void b(boolean z) {
                    ((cb4) this.a.o).c = z;
                }

                @Override // defpackage.wj8
                public final wj8 c() {
                    fm9.i(null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                    throw null;
                }

                @Override // defpackage.wj8
                public final void d(b46 b46Var) {
                    b46Var.getClass();
                    cb4 cb4Var = (cb4) this.a.o;
                    cb4Var.getClass();
                    cb4Var.b = b46Var;
                }

                @Override // defpackage.wj8
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public final y14 e(tb8 tb8Var) {
                    tb8Var.b.getClass();
                    zpa m14Var = new m14();
                    List list = tb8Var.b.e;
                    return new y14(tb8Var, this.b, !list.isEmpty() ? new qz7(m14Var, 19, list) : m14Var, this.a, this.d, this.c.x(tb8Var), this.e, this.f, this.g);
                }
            }.e(tb8.c(uriL));
        } else if (gefVar instanceof zn6) {
            aobVar = new wj8(q24Var) { // from class: androidx.media3.exoplayer.hls.HlsMediaSource$Factory
                public final w4d a;
                public final cb4 b;
                public final oq9 e;
                public final huc g;
                public final boolean h;
                public final int i;
                public final long j;
                public final pl8 f = new pl8();
                public final hx9 c = new hx9();
                public final av1 d = hb4.B0;

                {
                    this.a = new w4d(12, q24Var);
                    cb4 cb4Var = am6.a;
                    this.b = cb4Var;
                    this.g = new huc();
                    this.e = new oq9(9);
                    this.i = 1;
                    this.j = -9223372036854775807L;
                    this.h = true;
                    cb4Var.c = true;
                }

                @Override // defpackage.wj8
                public final wj8 a() {
                    fm9.i(null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
                    throw null;
                }

                @Override // defpackage.wj8
                public final void b(boolean z) {
                    this.b.c = z;
                }

                @Override // defpackage.wj8
                public final wj8 c() {
                    fm9.i(null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                    throw null;
                }

                @Override // defpackage.wj8
                public final void d(b46 b46Var) {
                    cb4 cb4Var = this.b;
                    b46Var.getClass();
                    cb4Var.b = b46Var;
                }

                @Override // defpackage.wj8
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public final sm6 e(tb8 tb8Var) {
                    tb8Var.b.getClass();
                    en6 y7gVar = this.c;
                    List list = tb8Var.b.e;
                    if (!list.isEmpty()) {
                        y7gVar = new y7g(y7gVar, 17, list);
                    }
                    cb4 cb4Var = this.b;
                    tr4 tr4VarX = this.f.x(tb8Var);
                    huc hucVar = this.g;
                    getClass();
                    hb4 hb4Var = new hb4(this.a, hucVar, y7gVar);
                    return new sm6(tb8Var, this.a, cb4Var, this.e, tr4VarX, hucVar, hb4Var, this.j, this.h, this.i);
                }
            }.e(tb8.c(uriL));
        } else if (gefVar instanceof fe9) {
            List list = ((fe9) gefVar).a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                de9 de9Var = (de9) list.get(i);
                yt8 yt8Var = new yt8(24, new va4());
                Object obj = new Object();
                huc hucVar = new huc();
                tb8 tb8VarC = tb8.c(de9Var.e);
                tb8VarC.b.getClass();
                tb8VarC.b.getClass();
                eb8 eb8Var = tb8VarC.b.c;
                if (eb8Var == null) {
                    tr4VarS2 = tr4.a;
                } else {
                    synchronized (obj) {
                        try {
                            tr4VarS2 = !eb8Var.equals(null) ? pl8.s(eb8Var) : null;
                            tr4VarS2.getClass();
                        } finally {
                        }
                    }
                }
                arrayList.add(new aob(tb8VarC, q24Var, yt8Var, tr4VarS2, hucVar, 1048576));
            }
            ej0[] ej0VarArr = (ej0[]) arrayList.toArray(new ej0[0]);
            aobVar = new cs8((ej0[]) Arrays.copyOf(ej0VarArr, ej0VarArr.length));
        } else if (gefVar instanceof x2f) {
            u75 u75Var = this.o;
            u75Var.w2();
            long micros = u75Var.R0 == 2 ? TimeUnit.MILLISECONDS.toMicros(((x2f) gefVar).b) : 0L;
            yt8 yt8Var2 = new yt8(24, new va4());
            Object obj2 = new Object();
            huc hucVar2 = new huc();
            tb8 tb8VarC2 = tb8.c(uriL);
            tb8VarC2.b.getClass();
            tb8VarC2.b.getClass();
            eb8 eb8Var2 = tb8VarC2.b.c;
            if (eb8Var2 == null) {
                tr4VarS = tr4.a;
            } else {
                synchronized (obj2) {
                    try {
                        tr4VarS = eb8Var2.equals(null) ? null : pl8.s(eb8Var2);
                        tr4VarS.getClass();
                    } finally {
                    }
                }
            }
            aobVar = new e43(new aob(tb8VarC2, q24Var, yt8Var2, tr4VarS, hucVar2, 1048576), micros, TimeUnit.MILLISECONDS.toMicros(((x2f) gefVar).c), true, false, false);
        } else {
            yt8 yt8Var3 = new yt8(24, new va4());
            Object obj3 = new Object();
            huc hucVar3 = new huc();
            tb8 tb8VarC3 = tb8.c(uriL);
            tb8VarC3.b.getClass();
            tb8VarC3.b.getClass();
            eb8 eb8Var3 = tb8VarC3.b.c;
            if (eb8Var3 == null) {
                tr4VarS = tr4.a;
            } else {
                synchronized (obj3) {
                    try {
                        tr4VarS = eb8Var3.equals(null) ? null : pl8.s(eb8Var3);
                        tr4VarS.getClass();
                    } finally {
                    }
                }
            }
            aobVar = new aob(tb8VarC3, q24Var, yt8Var3, tr4VarS, hucVar3, 1048576);
        }
        long jK = zF ? this.o.k() : Math.max(gefVar.d(), gefVar.m());
        if (gefVar.c0() || jK == 0) {
            u75 u75Var2 = this.o;
            u75Var2.w2();
            List listSingletonList = Collections.singletonList(aobVar);
            u75Var2.w2();
            u75Var2.w2();
            u75Var2.o2(listSingletonList, -1, -9223372036854775807L, true);
        } else {
            u75 u75Var3 = this.o;
            u75Var3.w2();
            List listSingletonList2 = Collections.singletonList(aobVar);
            u75Var3.w2();
            u75Var3.o2(listSingletonList2, 0, jK, false);
        }
        this.o.prepare();
        ckf ckfVar4 = this.Y;
        if (ckfVar4 != null) {
            ckfVar4.i();
        }
        this.X.m(3);
    }

    @Override // defpackage.gd
    public final void J(fd fdVar, n54 n54Var) {
        hm9.n(this.c, "Player. Video renderer is disabled");
    }

    public final void J0(long j) {
        String strH = ey8.h(j, "Player. Seek to: ");
        String str = this.c;
        hm9.n(str, strH);
        gef gefVar = this.Z;
        if (gefVar == null) {
            return;
        }
        u75 u75Var = this.o;
        if (u75Var.c() == 0 || j <= u75Var.c() - gefVar.m()) {
            u75Var.W1(5, gefVar.m() + j);
            return;
        }
        hm9.n(str, "Player. Can't seek to: " + j + ", position greater than duration. Seek to end.");
        u75Var.W1(5, u75Var.c() - gefVar.m());
    }

    public final void K0() {
        gef gefVar = this.Z;
        u75 u75Var = this.o;
        String str = this.c;
        if (gefVar == null || gefVar.m() <= 0 || gefVar.c0()) {
            hm9.n(str, "Player. Seek to start: 0");
            u75Var.W1(5, 0L);
        } else {
            hm9.m(str, "Player. Seek to start from content: %d", Long.valueOf(gefVar.m()));
            u75Var.W1(5, gefVar.m());
        }
    }

    public final void L0(boolean z) {
        this.o.setRepeatMode(z ? 2 : 0);
    }

    public final void M0(Surface surface) {
        String str = this.c;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Player. Set surface " + surface, null);
        }
        if (surface != null) {
            this.o.m(surface);
            return;
        }
        u75 u75Var = this.o;
        u75Var.w2();
        u75Var.p2(null);
        u75Var.k2(0, 0);
    }

    public final void N0() {
        u75 u75Var = this.o;
        u75Var.w2();
        if (u75Var.n1) {
            return;
        }
        hm9.n(this.c, "Player. Stop");
        u75Var.stop();
        ckf ckfVar = this.Y;
        if (ckfVar != null) {
            ckfVar.x();
        }
    }

    @Override // defpackage.gd
    public final void R(fd fdVar, pc8 pc8Var, IOException iOException, boolean z) {
        hm9.p(this.c, "Player. Load error, wasCanceled " + z + ", videoContent: " + this.Z, iOException);
    }

    @Override // defpackage.p40
    public final boolean b() {
        u75 u75Var = this.o;
        int playbackState = u75Var.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && u75Var.u() && u75Var.v0() == 0;
    }

    @Override // defpackage.p40
    public final float e() {
        u75 u75Var = this.o;
        u75Var.w2();
        return u75Var.h1;
    }

    @Override // defpackage.gd
    public final void e0(fd fdVar, Object obj, long j) {
        String str = this.c;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Player. First frame rendered: output=" + obj + " renderTimeMs=" + j, null);
        }
    }

    @Override // defpackage.n3b
    public final void f(float f) {
        ckf ckfVar = this.Y;
        if (ckfVar != null) {
            ckfVar.u(f);
        }
    }

    @Override // defpackage.n3b
    public final void f0(mue mueVar, int i) {
        hm9.m(this.c, "Player. onTimelineChanged %d", Integer.valueOf(i));
    }

    @Override // defpackage.p40
    public final void g(float f) {
        u75 u75Var = this.o;
        u75Var.w2();
        float f2 = u75Var.h1;
        String str = this.c;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Player. New volume: " + f + ", prev: " + f2, null);
        }
        this.o.g(f);
        if (f2 <= 0.0f && f > 0.0f) {
            this.X.m(3);
        } else if (f2 != f && f <= 0.0f) {
            this.X.k();
        }
    }

    @Override // defpackage.n3b
    public final void h(int i) {
        String str = this.c;
        if (i == 1) {
            hm9.n(str, "Player. State changed: ExoPlayer.STATE_IDLE");
            return;
        }
        if (i == 2) {
            hm9.n(str, "Player. State changed: ExoPlayer.STATE_BUFFERING");
            ckf ckfVar = this.Y;
            if (ckfVar != null) {
                ckfVar.y0();
                return;
            }
            return;
        }
        u75 u75Var = this.o;
        if (i == 3) {
            hm9.n(str, "Player. State changed: ExoPlayer.STATE_READY");
            ckf ckfVar2 = this.Y;
            if (ckfVar2 != null) {
                ckfVar2.y(u75Var.u());
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        hm9.n(str, "Player. State changed: ExoPlayer.STATE_ENDED");
        u75Var.w2();
        if (u75Var.R0 == 1) {
            hm9.n(str, "Player. State ended, but video is looping. Restart");
            play();
        } else {
            ckf ckfVar3 = this.Y;
            if (ckfVar3 != null) {
                ckfVar3.o();
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String str = this.c;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, zr6.h(i, "Player. On audio focus change: "), null);
        }
        this.X.j(i);
    }

    @Override // defpackage.p40
    public final void pause() {
        u75 u75Var = this.o;
        u75Var.w2();
        if (u75Var.n1) {
            return;
        }
        hm9.n(this.c, "Player. Pause");
        u75Var.Y(false);
        ckf ckfVar = this.Y;
        if (ckfVar != null) {
            ckfVar.h();
        }
    }

    @Override // defpackage.p40
    public final void play() {
        hm9.n(this.c, "Player. Play");
        u75 u75Var = this.o;
        if (u75Var.getPlaybackState() == 4) {
            K0();
        }
        u75Var.Y(true);
        ckf ckfVar = this.Y;
        if (ckfVar != null) {
            ckfVar.i();
        }
        this.X.m(3);
    }

    @Override // defpackage.n3b
    public final void x0(PlaybackException playbackException) {
        hm9.p(this.c, "Player. Error", playbackException);
        ((cba) this.a).c(new HandledException(playbackException), false);
        ckf ckfVar = this.Y;
        if (ckfVar != null) {
            ckfVar.e();
        }
    }
}
