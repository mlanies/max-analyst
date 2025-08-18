package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.camerax.vms.processor.VideoMessageProcessorException;

/* loaded from: classes2.dex */
public final class sif implements lee {
    public final zh6 X;
    public final CopyOnWriteArraySet Y;
    public final LinkedHashMap Z;
    public final String a;
    public final AtomicBoolean b;
    public final pif c;
    public final Handler o;
    public final float[] s0;
    public final float[] t0;
    public fjf u0;
    public boolean v0;
    public int w0;
    public boolean x0;

    public sif(Size size) {
        eu4 eu4Var = eu4.d;
        String name = sif.class.getName();
        this.a = name;
        this.b = new AtomicBoolean();
        this.Y = new CopyOnWriteArraySet();
        this.Z = new LinkedHashMap();
        this.s0 = new float[16];
        this.t0 = new float[16];
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "init, preview=" + size + ", dr=" + eu4Var + ", stencil=" + ((String) null) + ", isStencilRecyclable=true", null);
        }
        c54.s(eu4Var);
        pif pifVar = new pif(this, size, eu4Var);
        this.c = pifVar;
        pifVar.start();
        Handler handler = new Handler(pifVar.getLooper());
        this.o = handler;
        Throwable th = (Throwable) pifVar.o.get();
        if (th == null) {
            this.X = new zh6(handler);
            return;
        }
        release();
        if (!(th instanceof VideoMessageProcessorException)) {
            throw new VideoMessageProcessorException("Failed to create video message processor", th);
        }
    }

    public static final void d(sif sifVar, Size size, eu4 eu4Var) {
        String str = sifVar.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "initRendererOnGl, previewSize=" + size + ", dynamicRange=" + eu4Var, null);
        }
        sifVar.e();
        if (!(!sifVar.v0)) {
            throw new IllegalStateException("GL is already RELEASED!".toString());
        }
        fjf fjfVar = sifVar.u0;
        if (fjfVar == null) {
            sifVar.u0 = new fjf(size, eu4Var);
        } else {
            throw new IllegalStateException(("Renderer already created, " + fjfVar).toString());
        }
    }

    public static void g(sif sifVar, k56 k56Var, k56 k56Var2, int i) {
        String str;
        if ((i & 4) != 0) {
            k56Var2 = null;
        }
        sifVar.getClass();
        if (sifVar.o.post(new fre(sifVar, 10, k56Var))) {
            return;
        }
        if (k56Var2 == null || (str = (String) k56Var2.invoke()) == null) {
            str = "";
        }
        hm9.p(sifVar.a, zr6.i("postToGl, failed to post '", str, "' to the GL thread!"), null);
    }

    @Override // defpackage.lee
    public final void a(see seeVar) {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "onInputSurface, request=" + seeVar, null);
        }
        if (this.b.get()) {
            seeVar.d();
            return;
        }
        eu4 eu4Var = seeVar.c;
        c54.s(eu4Var);
        if (this.o.post(new fre(this, 10, new a81(seeVar, this, eu4Var, 15)))) {
            return;
        }
        hm9.p(this.a, "postToGl, failed to post 'onInputSurface' to the GL thread!", null);
        seeVar.d();
    }

    @Override // defpackage.lee
    public final void c(kee keeVar) {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "onOutputSurface, surfaceOutput=" + keeVar + ", size=" + keeVar.o, null);
        }
        if (this.b.get()) {
            keeVar.close();
            return;
        }
        khf khfVar = new khf(keeVar, 3, this);
        e09 e09Var = new e09(0, keeVar, kee.class, "close", "close()V", 0, 13);
        if (this.o.post(new fre(this, 10, khfVar))) {
            return;
        }
        hm9.p(this.a, "postToGl, failed to post 'onOutputSurface' to the GL thread!", null);
        e09Var.invoke();
    }

    public final void e() {
        Thread threadCurrentThread = Thread.currentThread();
        pif pifVar = this.c;
        if (tpa.f(threadCurrentThread, pifVar)) {
            return;
        }
        throw new IllegalStateException(("Illegal thread=" + threadCurrentThread + ", expected=" + pifVar).toString());
    }

    public final void f() {
        String str = this.a;
        hm9.m0(str, "maybeReleaseGl", new Object[0]);
        e();
        if (this.v0 && this.w0 == 0) {
            LinkedHashMap linkedHashMap = this.Z;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                kee keeVar = (kee) entry.getKey();
                hm9.m0(str, "close surface output=" + keeVar + ", surface=" + ((Surface) entry.getValue()), new Object[0]);
                keeVar.close();
            }
            linkedHashMap.clear();
            fjf fjfVar = this.u0;
            if (fjfVar != null) {
                fjfVar.q();
            }
            this.u0 = null;
            this.c.quitSafely();
        }
    }

    public final void h(Bitmap bitmap, boolean z) {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "setStencil, " + ay7.J(bitmap) + ", recycle_after_consume=" + z, null);
        }
        g(this, new h39(this, bitmap, z), new bse(13), 2);
    }

    @Override // defpackage.lee
    public final void release() {
        hm9.m0(this.a, "release", new Object[0]);
        this.Y.clear();
        if (this.b.getAndSet(true)) {
            return;
        }
        g(this, new rzd(12, this), null, 6);
    }
}
