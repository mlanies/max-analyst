package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes2.dex */
public final class djd extends GLSurfaceView {
    public final cjd a;

    public djd(Context context) {
        super(context, null);
        setEGLContextClientVersion(2);
        cjd cjdVar = new cjd();
        cjdVar.Y = System.currentTimeMillis();
        this.a = cjdVar;
        setRenderer(cjdVar);
    }

    public final cjd getRenderer() {
        return this.a;
    }
}
