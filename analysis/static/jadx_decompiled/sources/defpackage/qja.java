package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qja extends hu3 {
    public OutputStream A0;
    public byte[] B0;
    public Iterator C0;
    public boolean D0;
    public long E0;
    public int F0;
    public /* synthetic */ Object G0;
    public final /* synthetic */ sja H0;
    public int I0;
    public yic X;
    public kja Y;
    public File Z;
    public sja o;
    public Serializable s0;
    public Object t0;
    public lec u0;
    public lec v0;
    public File w0;
    public Closeable x0;
    public InputStream y0;
    public Closeable z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qja(sja sjaVar, Continuation continuation) {
        super(continuation);
        this.H0 = sjaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.G0 = obj;
        this.I0 |= Integer.MIN_VALUE;
        return this.H0.i(null, null, null, null, false, this);
    }
}
