package defpackage;

import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class ord implements go7 {
    public final long a = yn7.b.getAndIncrement();
    public final a34 b;
    public final u1e c;
    public byte[] o;

    public ord(t24 t24Var, a34 a34Var) {
        this.b = a34Var;
        this.c = new u1e(t24Var);
    }

    @Override // defpackage.go7
    public final void a() {
    }

    @Override // defpackage.go7
    public final void load() {
        u1e u1eVar = this.c;
        u1eVar.b = 0L;
        try {
            u1eVar.G(this.b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) u1eVar.b;
                byte[] bArr = this.o;
                if (bArr == null) {
                    this.o = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                } else if (i2 == bArr.length) {
                    this.o = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.o;
                i = u1eVar.read(bArr2, i2, bArr2.length - i2);
            }
            mr0.i(u1eVar);
        } catch (Throwable th) {
            mr0.i(u1eVar);
            throw th;
        }
    }
}
