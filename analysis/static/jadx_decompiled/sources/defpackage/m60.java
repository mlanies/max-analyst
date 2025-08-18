package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface m60 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    j60 e(j60 j60Var);

    default long f(long j) {
        return j;
    }

    void flush();

    boolean isActive();

    void reset();
}
