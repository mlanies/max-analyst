package defpackage;

import java.util.Set;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class v79 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ v79(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new y79(4, false, false, false, this.b, 0L, 46);
            case 1:
                return new y79(3, false, false, true, this.b, 0L, 38);
            case 2:
                return new y79(2, false, true, false, 0L, this.b, 26);
            default:
                Set setG0 = x53.G0((Set) obj);
                setG0.removeIf(new au5(3, new jh2(this.b, 6)));
                return setG0;
        }
    }
}
