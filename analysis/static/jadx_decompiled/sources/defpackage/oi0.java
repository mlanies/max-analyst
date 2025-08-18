package defpackage;

/* loaded from: classes2.dex */
public class oi0 extends pi0 {
    public final pke b;

    public oi0(pke pkeVar) {
        this(Long.MIN_VALUE, pkeVar);
    }

    @Override // defpackage.pi0
    public String toString() {
        StringBuilder sb = new StringBuilder("BaseErrorEvent{error=");
        sb.append(this.b);
        sb.append(", requestId=");
        return z7b.i(sb, this.a, '}');
    }

    public oi0(long j, pke pkeVar) {
        super(j);
        this.b = pkeVar;
    }
}
