package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import defpackage.acg;
import defpackage.bp1;
import defpackage.c0;
import defpackage.cp1;
import defpackage.ey3;
import defpackage.hcg;
import defpackage.k56;
import defpackage.l7;
import defpackage.oe1;
import defpackage.qqf;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "", "name", "<init>", "(Ljava/lang/String;)V", "Loe1;", "renderer", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "Le5f;", "init", "(Loe1;Lorg/webrtc/RendererCommon$GlDrawer;)V", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "listener", "addFrameSizeListener", "(Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;)V", "removeFrameSizeListener", "", "mirror", "setMirror", "(Z)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "()V", "pauseVideo", "clearImage", "Lorg/webrtc/VideoFrame;", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "layoutAspectRatio", "setLayoutAspectRatio", "Landroid/view/Surface;", "surface", "createEglSurface", "(Landroid/view/Surface;)V", "Lkotlin/Function0;", "onDone", "releaseEglSurface", "(Lk56;)V", "release", "Lcp1;", "callVideoDrawer", "Lcp1;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lbp1;", "drawerListener", "Lbp1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VoipVideoRenderer implements VideoRendererInterface {
    private final cp1 callVideoDrawer;
    private final CopyOnWriteArrayList<VideoRendererInterface.FrameSizeListener> listeners = new CopyOnWriteArrayList<>();
    private final bp1 drawerListener = new qqf(this);

    public VoipVideoRenderer(String str) {
        this.callVideoDrawer = new cp1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawerListener$lambda$1(VoipVideoRenderer voipVideoRenderer, int i, int i2) {
        Iterator<T> it = voipVideoRenderer.listeners.iterator();
        while (it.hasNext()) {
            ((VideoRendererInterface.FrameSizeListener) it.next()).onFrame(i, i2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void addFrameSizeListener(VideoRendererInterface.FrameSizeListener listener) {
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void clearImage() {
        cp1 cp1Var = this.callVideoDrawer;
        synchronized (cp1Var.h) {
            oe1 oe1Var = cp1Var.g;
            if (oe1Var != null) {
                oe1Var.e.d(new c0(10, cp1Var));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void createEglSurface(Surface surface) {
        cp1 cp1Var = this.callVideoDrawer;
        synchronized (cp1Var.h) {
            try {
                oe1 oe1Var = cp1Var.g;
                if (oe1Var != null) {
                    oe1Var.a.log(cp1Var.j, "External request for surface creation");
                    oe1Var.e.d(new ey3(cp1Var, 3, surface));
                } else {
                    cp1Var.i = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void init(oe1 renderer, RendererCommon.GlDrawer drawer) {
        cp1 cp1Var = this.callVideoDrawer;
        synchronized (cp1Var.h) {
            try {
                if (cp1Var.g == null) {
                    cp1Var.g = renderer;
                    renderer.getClass();
                    renderer.e.d(new acg(cp1Var, drawer, renderer));
                    Surface surface = cp1Var.i;
                    if (surface != null) {
                        renderer.a.log(cp1Var.j, "Got postponed surface request, process and reset reference");
                        renderer.e.d(new ey3(cp1Var, 3, surface));
                    }
                    cp1Var.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        cp1 cp1Var2 = this.callVideoDrawer;
        cp1Var2.c.add(this.drawerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void onFrame(VideoFrame frame) {
        cp1 cp1Var = this.callVideoDrawer;
        cp1Var.l.c.incrementAndGet();
        synchronized (cp1Var.h) {
            oe1 oe1Var = cp1Var.g;
            if (oe1Var == null) {
                return;
            }
            AtomicReference atomicReference = cp1Var.d;
            frame.retain();
            Object andSet = atomicReference.getAndSet(frame);
            if (andSet == null) {
                oe1Var.e.c(new hcg(cp1Var, oe1Var));
            }
            VideoFrame videoFrame = (VideoFrame) andSet;
            if (videoFrame != null) {
                videoFrame.release();
                cp1Var.l.d.incrementAndGet();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void release() {
        cp1 cp1Var = this.callVideoDrawer;
        cp1Var.c.remove(this.drawerListener);
        cp1 cp1Var2 = this.callVideoDrawer;
        synchronized (cp1Var2.h) {
            oe1 oe1Var = cp1Var2.g;
            if (oe1Var == null) {
                return;
            }
            oe1Var.e.d(new hcg(oe1Var, cp1Var2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void releaseEglSurface(k56 onDone) {
        cp1 cp1Var = this.callVideoDrawer;
        synchronized (cp1Var.h) {
            cp1Var.i = null;
            oe1 oe1Var = cp1Var.g;
            if (oe1Var == null) {
                onDone.invoke();
                return;
            }
            oe1Var.a.log(cp1Var.j, "External request for surface release");
            if (!oe1Var.e.d(new acg(oe1Var, cp1Var, onDone))) {
                onDone.invoke();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void removeFrameSizeListener(VideoRendererInterface.FrameSizeListener listener) {
        this.listeners.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setFpsReduction(float fps) {
        l7 l7Var = this.callVideoDrawer.e;
        synchronized (l7Var) {
            try {
                long j = l7Var.c;
                if (fps <= 0.0f) {
                    l7Var.c = Long.MAX_VALUE;
                } else {
                    l7Var.c = (long) (TimeUnit.SECONDS.toNanos(1L) / fps);
                }
                if (l7Var.c != j) {
                    l7Var.b = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setLayoutAspectRatio(float layoutAspectRatio) {
        ((AtomicReference) this.callVideoDrawer.f.b).set(Float.valueOf(layoutAspectRatio));
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setMirror(boolean mirror) {
        ((AtomicBoolean) this.callVideoDrawer.f.c).set(mirror);
    }
}
