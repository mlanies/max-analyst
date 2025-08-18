package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s35 implements gld {
    public final /* synthetic */ int a;
    public final si9 b;

    public s35(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = lld.b(1, 0, 0, 6);
                break;
            default:
                this.b = lld.b(0, Integer.MAX_VALUE, 0, 4);
                break;
        }
    }

    @Override // defpackage.gld
    public final List b() {
        switch (this.a) {
        }
        return this.b.b();
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        switch (this.a) {
        }
        return this.b.d(on5Var, continuation);
    }
}
