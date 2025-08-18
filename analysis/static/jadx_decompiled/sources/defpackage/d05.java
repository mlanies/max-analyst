package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface d05 extends AutoCloseable {
    MediaCodec.BufferInfo F();

    boolean I();

    long Y();

    ByteBuffer r();

    long size();
}
