package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface ksd extends Closeable, Flushable {
    void N(bt0 bt0Var, long j);

    void close();

    @Override // java.io.Flushable
    void flush();

    oue p();
}
