package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nja extends hu3 {
    public int A0;
    public File X;
    public File Y;
    public File Z;
    public sja o;
    public Closeable s0;
    public InputStream t0;
    public Closeable u0;
    public OutputStream v0;
    public byte[] w0;
    public long x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ sja z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.z0 = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.y0 = obj;
        this.A0 |= Integer.MIN_VALUE;
        return this.z0.d(null, null, null, this);
    }
}
