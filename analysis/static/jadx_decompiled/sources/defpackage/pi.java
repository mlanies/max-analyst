package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class pi {
    public final bi a;
    public final HandlerThread b;
    public final Handler c;
    public final HandlerThread d;
    public final HashMap e;
    public final ConcurrentHashMap f;
    public final LinkedHashSet g;
    public final oe1 h;
    public volatile boolean i;

    public pi(bg4 bg4Var, qq9 qq9Var, bi biVar, EglBase eglBase, kad kadVar) {
        this.a = biVar;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.b = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.d = handlerThread2;
        this.e = new HashMap();
        this.f = new ConcurrentHashMap();
        new HashMap();
        this.g = new LinkedHashSet();
        new Point();
        this.h = new oe1((a4c) bg4Var.b, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, "CallOpenGLAnimoji");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        new Handler(handlerThread2.getLooper());
    }
}
