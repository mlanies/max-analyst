package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface fu0 extends yud, ReadableByteChannel {
    boolean B();

    String G(long j);

    long K(ux uxVar);

    String O(Charset charset);

    void Q(bt0 bt0Var, long j);

    void R(long j);

    String X();

    int d0(vma vmaVar);

    aw0 e(long j);

    bt0 getBuffer();

    void h0(long j);

    long j0();

    InputStream l0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();
}
