package one.me.sdk.gl.effects.objects;

import android.opengl.GLES20;
import androidx.annotation.Keep;
import defpackage.jcg;
import defpackage.nd7;
import defpackage.zr6;

@Keep
/* loaded from: classes2.dex */
public class FrameBuffer {
    private int[] fboIds;
    private int height;
    private int[] rbIds;
    private int[] texIds;
    private int width;

    public FrameBuffer(int i, int i2) {
        this(createTexture(i, i2), i, i2);
    }

    private void checkFramebufferStatus() {
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        release();
        throw new RuntimeException(zr6.h(iGlCheckFramebufferStatus, "Framebuffer incomplete: error="));
    }

    private static int createTexture(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        int i3 = iArr[0];
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        nd7.b("glTexImage2D");
        GLES20.glBindTexture(3553, 0);
        nd7.b("glBindTexture");
        return i3;
    }

    private void init(int i, int i2) {
        this.width = i;
        this.height = i2;
        GLES20.glGenFramebuffers(1, this.fboIds, 0);
        nd7.b("glGenFramebuffers");
        GLES20.glBindFramebuffer(36160, this.fboIds[0]);
        nd7.b("glBindFramebuffer");
        GLES20.glGenRenderbuffers(1, this.rbIds, 0);
        nd7.b("glGenRenderbuffers");
        GLES20.glBindRenderbuffer(36161, this.rbIds[0]);
        nd7.b("glBindRenderbuffer");
        GLES20.glRenderbufferStorage(36161, 33189, i, i2);
        nd7.b("glRenderbufferStorage");
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.rbIds[0]);
        nd7.b("glFramebufferRenderbuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texIds[0], 0);
        nd7.b("glFramebufferTexture2D");
        checkFramebufferStatus();
        GLES20.glBindFramebuffer(36160, 0);
        nd7.b("glBindFramebuffer");
    }

    public void attachTexture() {
        if (this.texIds[0] == 0) {
            return;
        }
        bind();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texIds[0], 0);
        unbind();
    }

    public void bind(boolean z) {
        GLES20.glBindFramebuffer(36160, this.fboIds[0]);
        nd7.b("glBindFramebuffer");
        if (z) {
            GLES20.glViewport(0, 0, this.width, this.height);
        }
    }

    public void detachTexture() {
        if (this.texIds[0] == 0) {
            return;
        }
        bind();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        unbind();
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.texIds[0];
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        GLES20.glDeleteFramebuffers(1, this.fboIds, 0);
        GLES20.glDeleteTextures(1, this.texIds, 0);
        GLES20.glDeleteRenderbuffers(1, this.rbIds, 0);
    }

    public void render(jcg jcgVar, Runnable runnable) {
        bind(true);
        runnable.run();
        jcgVar.render();
        unbind();
    }

    public void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
        nd7.b("glUnBindFramebuffer");
    }

    public FrameBuffer(int i, int i2, int i3) {
        this.fboIds = new int[1];
        this.texIds = new int[]{i};
        this.rbIds = new int[1];
        init(i2, i3);
    }

    public void bind() {
        bind(false);
    }
}
