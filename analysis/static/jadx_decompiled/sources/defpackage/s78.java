package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface s78 {
    void a(long j, int i, int i2, int i3);

    void d(int i, long j);

    int e();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void h(int i);

    void i(int i, rz3 rz3Var, long j, int i2);

    void j(Surface surface);

    default boolean k(d88 d88Var) {
        return false;
    }

    void o(r88 r88Var, Handler handler);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);
}
