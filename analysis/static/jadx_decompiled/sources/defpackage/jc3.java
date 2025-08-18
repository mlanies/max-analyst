package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class jc3 extends kp {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ jc3(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.kp
    public final kp d(Object obj) {
        switch (this.e) {
            case 0:
                ((PrintStream) this.f).print(obj);
                break;
            default:
                ((PrintWriter) this.f).print(obj);
                break;
        }
        return this;
    }
}
