package defpackage;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes.dex */
public final class hd6 {
    public static final hd6 e = new hd6(-1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public hd6(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final void a() throws GlUtil$GlException {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            mr0.f();
        }
        int i2 = this.b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            mr0.f();
        }
    }
}
