package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g0a extends yk0 {
    public volatile boolean X;
    public final f2a a;
    public final Object[] b;
    public int c;
    public boolean o;

    public g0a(f2a f2aVar, Object[] objArr) {
        this.a = f2aVar;
        this.b = objArr;
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.c = this.b.length;
    }

    @Override // defpackage.zl4
    public final void g() {
        this.X = true;
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.X;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.c == this.b.length;
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        this.o = true;
        return 1;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }
}
