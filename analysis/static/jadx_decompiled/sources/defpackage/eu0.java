package defpackage;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface eu0 extends ksd, WritableByteChannel {
    eu0 A(int i);

    eu0 C(int i);

    eu0 E();

    eu0 L(String str);

    eu0 M(aw0 aw0Var);

    eu0 P(long j);

    eu0 b0(int i, byte[] bArr, int i2);

    @Override // defpackage.ksd, java.io.Flushable
    void flush();

    bt0 getBuffer();

    eu0 i0(long j);

    eu0 write(byte[] bArr);

    eu0 x();

    eu0 y(int i);
}
