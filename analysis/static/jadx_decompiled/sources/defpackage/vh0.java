package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class vh0 implements m60 {
    public j60 b;
    public j60 c;
    public j60 d;
    public j60 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public vh0() {
        ByteBuffer byteBuffer = m60.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        j60 j60Var = j60.e;
        this.d = j60Var;
        this.e = j60Var;
        this.b = j60Var;
        this.c = j60Var;
    }

    @Override // defpackage.m60
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = m60.a;
        return byteBuffer;
    }

    @Override // defpackage.m60
    public final void c() {
        this.h = true;
        i();
    }

    @Override // defpackage.m60
    public boolean d() {
        return this.h && this.g == m60.a;
    }

    @Override // defpackage.m60
    public final j60 e(j60 j60Var) {
        this.d = j60Var;
        this.e = g(j60Var);
        return isActive() ? this.e : j60.e;
    }

    @Override // defpackage.m60
    public final void flush() {
        this.g = m60.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    public abstract j60 g(j60 j60Var);

    public void h() {
    }

    public void i() {
    }

    @Override // defpackage.m60
    public boolean isActive() {
        return this.e != j60.e;
    }

    public void j() {
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.m60
    public final void reset() {
        flush();
        this.f = m60.a;
        j60 j60Var = j60.e;
        this.d = j60Var;
        this.e = j60Var;
        this.b = j60Var;
        this.c = j60Var;
        j();
    }
}
