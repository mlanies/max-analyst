package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface k60 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    boolean d();

    i60 e(i60 i60Var);

    void flush();

    boolean isActive();

    void reset();
}
