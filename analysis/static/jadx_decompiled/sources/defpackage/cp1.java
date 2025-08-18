package defpackage;

import android.opengl.EGL14;
import android.view.Surface;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.internal.VoipVideoRenderer;

/* loaded from: classes2.dex */
public final class cp1 extends ne1 {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final String b;
    public final CopyOnWriteArrayList c;
    public final AtomicReference d;
    public final l7 e;
    public final y7g f;
    public oe1 g;
    public final Object h;
    public Surface i;
    public final String j;
    public RendererCommon.GlDrawer k;
    public final dp1 l;

    public cp1(String str) {
        this.a = EGL14.EGL_NO_SURFACE;
        this.b = str;
        this.c = new CopyOnWriteArrayList();
        this.d = new AtomicReference(null);
        this.e = new l7(2, false);
        this.f = new y7g(6);
        this.h = new Object();
        this.j = "CallOpenGL_drawer_".concat(str);
        this.l = new dp1(str, new ie(15, this));
    }

    @Override // defpackage.ne1
    public final void a() {
        a4c a4cVar;
        synchronized (this.h) {
            this.i = null;
            oe1 oe1Var = this.g;
            if (oe1Var != null && (a4cVar = oe1Var.a) != null) {
                this.g = null;
                VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
                if (videoFrame != null) {
                    videoFrame.release();
                }
                RendererCommon.GlDrawer glDrawer = this.k;
                if (glDrawer != null) {
                    glDrawer.release();
                }
                this.k = null;
                int iDecrementAndGet = m.decrementAndGet();
                a4cVar.log(this.j, "Instance " + this.b + " released. Remaining count is " + iDecrementAndGet);
            }
        }
    }

    @Override // defpackage.ne1
    public final void b(oe1 oe1Var, me1 me1Var) {
        boolean z;
        boolean z2;
        float fFloatValue;
        VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
        if (videoFrame == null) {
            return;
        }
        l7 l7Var = this.e;
        synchronized (l7Var) {
            long j = l7Var.c;
            z = false;
            if (j > 0) {
                if (j != Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    long j2 = l7Var.b;
                    if (jNanoTime >= j2) {
                        long j3 = j2 + l7Var.c;
                        l7Var.b = j3;
                        l7Var.b = Math.max(j3, jNanoTime);
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            try {
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                float f = rotatedWidth / rotatedHeight;
                y7g y7gVar = this.f;
                Float fValueOf = (Float) ((AtomicReference) y7gVar.b).get();
                if (fValueOf != null && fValueOf.floatValue() == 0.0f) {
                    z = true;
                }
                if (z) {
                    fValueOf = Float.valueOf(f);
                }
                float f2 = 1.0f;
                if (f > fValueOf.floatValue()) {
                    float fFloatValue2 = fValueOf.floatValue() / f;
                    fFloatValue = 1.0f;
                    f2 = fFloatValue2;
                } else {
                    fFloatValue = f / fValueOf.floatValue();
                }
                oe1Var.b(me1Var, this, videoFrame, new sh1(f2, fFloatValue, ((AtomicBoolean) y7gVar.c).get()));
                this.l.f++;
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    VoipVideoRenderer.drawerListener$lambda$1(((qqf) ((bp1) it.next())).a, rotatedWidth, rotatedHeight);
                }
            } finally {
                videoFrame.release();
            }
        }
    }
}
