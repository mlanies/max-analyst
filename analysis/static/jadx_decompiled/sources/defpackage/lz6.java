package defpackage;

import java.util.Map;
import java.util.function.ToLongFunction;
import one.me.android.OneMeApplication;

/* loaded from: classes2.dex */
public final /* synthetic */ class lz6 implements ToLongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ lz6(int i) {
        this.a = i;
        switch (i) {
            case 1:
                d5a d5aVar = d5a.a;
                break;
        }
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.a) {
            case 0:
                return ((kr9) ((Map.Entry) obj).getValue()).a;
            default:
                int i = OneMeApplication.s0;
                return ((Number) d5a.a.get(obj)).longValue();
        }
    }
}
