package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

/* loaded from: classes2.dex */
public final class ymc implements VideoFrame.TextureBuffer {
    public final VideoFrame.TextureBuffer a;
    public final int b;
    public final Handler c;
    public final YuvConverter d;

    public ymc(VideoFrame.TextureBuffer textureBuffer, int i, Handler handler, YuvConverter yuvConverter) {
        this.a = textureBuffer;
        this.b = i;
        this.c = handler;
        this.d = yuvConverter;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        VideoFrame.TextureBuffer textureBuffer = this.a;
        Matrix matrix = new Matrix(textureBuffer.getTransformMatrix());
        int i7 = this.b;
        if (i7 != 0) {
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(i7);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        matrix.preTranslate(i / getWidth(), i2 / getHeight());
        matrix.preScale(i3 / getWidth(), i4 / getHeight());
        textureBuffer.retain();
        return new TextureBufferImpl(i5, i6, textureBuffer.getType(), textureBuffer.getTextureId(), matrix, this.c, this.d, new u3c(6, this));
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getHeight() {
        int i = this.b % 180;
        VideoFrame.TextureBuffer textureBuffer = this.a;
        return i == 0 ? textureBuffer.getHeight() : textureBuffer.getWidth();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public final int getTextureId() {
        return this.a.getTextureId();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public final Matrix getTransformMatrix() {
        return this.a.getTransformMatrix();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public final VideoFrame.TextureBuffer.Type getType() {
        return this.a.getType();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final int getWidth() {
        int i = this.b % 180;
        VideoFrame.TextureBuffer textureBuffer = this.a;
        return i == 0 ? textureBuffer.getWidth() : textureBuffer.getHeight();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void release() {
        this.a.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public final void retain() {
        this.a.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        return this.a.toI420();
    }
}
