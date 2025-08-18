package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lz9 extends uk0 {
    public final b66 Y;
    public Object Z;
    public boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz9(f2a f2aVar) {
        super(f2aVar);
        qx7 qx7Var = ft.b;
        this.Y = qx7Var;
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        if (this.o) {
            return;
        }
        int i = this.X;
        f2a f2aVar = this.a;
        if (i != 0) {
            f2aVar.e(obj);
            return;
        }
        try {
            Object objMo131apply = this.Y.mo131apply(obj);
            if (this.s0) {
                boolean zEquals = Objects.equals(this.Z, objMo131apply);
                this.Z = objMo131apply;
                if (zEquals) {
                    return;
                }
            } else {
                this.s0 = true;
                this.Z = objMo131apply;
            }
            f2aVar.e(obj);
        } catch (Throwable th) {
            c37.B(th);
            this.b.g();
            onError(th);
        }
    }

    @Override // defpackage.dqd
    public final Object poll() {
        while (true) {
            Object objPoll = this.c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objMo131apply = this.Y.mo131apply(objPoll);
            if (!this.s0) {
                this.s0 = true;
                this.Z = objMo131apply;
                return objPoll;
            }
            if (!Objects.equals(this.Z, objMo131apply)) {
                this.Z = objMo131apply;
                return objPoll;
            }
            this.Z = objMo131apply;
        }
    }
}
