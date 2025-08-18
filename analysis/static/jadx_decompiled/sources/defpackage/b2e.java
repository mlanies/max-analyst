package defpackage;

import android.util.Size;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;

/* loaded from: classes2.dex */
public final class b2e {
    public final Size a;
    public final int b;
    public final int c;
    public final String d;
    public final VideoMessageStencilHolder e;
    public final FrameBuffer f;

    public b2e(Size size) {
        this.a = size;
        this.b = size.getWidth();
        this.c = size.getHeight();
        String name = b2e.class.getName();
        this.d = name;
        VideoMessageStencilHolder videoMessageStencilHolder = new VideoMessageStencilHolder(size.getWidth(), size.getHeight());
        this.e = videoMessageStencilHolder;
        this.f = new FrameBuffer(size.getWidth(), size.getHeight());
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "init, previewSize=" + size, null);
        }
        videoMessageStencilHolder.notifyRecording(true);
    }
}
