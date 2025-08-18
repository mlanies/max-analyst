package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class it0 {
    public static final khe h = new khe(new m(23));
    public final String a;
    public final boolean b;
    public final ct0 c;
    public final String e;
    public ByteBuffer f;
    public final int d = 17408;
    public int g = 4096;

    public it0(String str, boolean z, ct0 ct0Var) {
        this.a = str;
        this.b = z;
        this.c = ct0Var;
        this.e = rh4.j(it0.class.getName(), "/", str);
    }

    public final boolean a() {
        if (this.f == null) {
            return false;
        }
        this.c.b(e());
        this.f = null;
        return true;
    }

    public final void b() {
        if (this.f == null) {
            return;
        }
        ByteBuffer byteBufferE = e();
        int iCapacity = byteBufferE.capacity();
        String str = this.a;
        int i = this.d;
        if (iCapacity >= i) {
            throw new IllegalStateException((str + " buffer insufficient despite having capacity of " + byteBufferE.capacity()).toString());
        }
        int iMin = Math.min(byteBufferE.capacity() * 2, i);
        hm9.n(this.e, "enlarging buffer " + str + ", increasing from " + byteBufferE.capacity() + " to " + iMin);
        ct0 ct0Var = this.c;
        ByteBuffer byteBufferA = ct0Var.a(iMin);
        ByteBuffer byteBufferE2 = e();
        byteBufferE2.flip();
        byteBufferA.put(byteBufferE2);
        if (this.b) {
            f(0);
        }
        ct0Var.b(byteBufferE2);
        this.f = byteBufferA;
        this.g = iMin;
    }

    public final void c() {
        if (this.f == null) {
            this.f = this.c.a(this.g);
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer == null || byteBuffer.position() != 0) {
            return false;
        }
        return a();
    }

    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void f(int i) {
        if (this.f == null) {
            return;
        }
        ByteBuffer byteBufferE = e();
        byteBufferE.mark();
        byteBufferE.position(i);
        int iRemaining = byteBufferE.remaining();
        khe kheVar = h;
        int iMin = Math.min(iRemaining, ((byte[]) kheVar.getValue()).length);
        int i2 = 0;
        while (iMin > 0) {
            byteBufferE.put((byte[]) kheVar.getValue(), 0, iMin);
            i2 += iMin;
            iMin = Math.min(iRemaining - i2, ((byte[]) kheVar.getValue()).length);
        }
        byteBufferE.reset();
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.f;
        int i = this.g;
        StringBuilder sb = new StringBuilder("BufferHolder{name='");
        sb.append(this.a);
        sb.append("', allocator=");
        sb.append(this.c);
        sb.append(", plainData=");
        sb.append(this.b);
        sb.append(", maxSize=");
        sb.append(this.d);
        sb.append(", buffer=");
        sb.append(byteBuffer);
        sb.append(", lastSize=");
        return zr6.j(sb, i, "}");
    }
}
