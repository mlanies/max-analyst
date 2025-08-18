package defpackage;

/* loaded from: classes.dex */
public class cg4 extends vk0 {
    public final f2a a;
    public Object b;

    public cg4(f2a f2aVar) {
        this.a = f2aVar;
    }

    public void a(Object obj) {
        f(obj);
    }

    @Override // defpackage.dqd
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void f(Object obj) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        f2a f2aVar = this.a;
        if (i == 8) {
            this.b = obj;
            lazySet(16);
            f2aVar.e(null);
        } else {
            lazySet(2);
            f2aVar.e(obj);
        }
        if (get() != 4) {
            f2aVar.b();
        }
    }

    @Override // defpackage.zl4
    public void g() {
        set(4);
        this.b = null;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == 4;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        lazySet(8);
        return 2;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}
