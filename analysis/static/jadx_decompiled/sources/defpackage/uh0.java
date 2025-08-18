package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class uh0 implements k60 {
    public i60 b;
    public i60 c;
    public i60 d;
    public i60 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public uh0() {
        ByteBuffer byteBuffer = k60.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        i60 i60Var = i60.e;
        this.d = i60Var;
        this.e = i60Var;
        this.b = i60Var;
        this.c = i60Var;
    }

    @Override // defpackage.k60
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = k60.a;
        return byteBuffer;
    }

    @Override // defpackage.k60
    public final void c() {
        this.h = true;
        h();
    }

    @Override // defpackage.k60
    public boolean d() {
        return this.h && this.g == k60.a;
    }

    @Override // defpackage.k60
    public final i60 e(i60 i60Var) {
        this.d = i60Var;
        this.e = f(i60Var);
        return isActive() ? this.e : i60.e;
    }

    public abstract i60 f(i60 i60Var);

    @Override // defpackage.k60
    public final void flush() {
        this.g = k60.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // defpackage.k60
    public boolean isActive() {
        return this.e != i60.e;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.k60
    public final void reset() {
        flush();
        this.f = k60.a;
        i60 i60Var = i60.e;
        this.d = i60Var;
        this.e = i60Var;
        this.b = i60Var;
        this.c = i60Var;
        i();
    }
}
