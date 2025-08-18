package defpackage;

import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class r33 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ r33(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                if (str.startsWith("app.pin") && (obj2 instanceof String)) {
                    this.b.put(str, (String) obj2);
                    break;
                }
                break;
            default:
                pp3 pp3Var = (pp3) obj2;
                pp3Var.getClass();
                ky7 ky7Var = new ky7();
                ky7Var.put("firstName", pp3Var.a);
                String str2 = pp3Var.b;
                if (str2 != null && str2.length() != 0) {
                    ky7Var.put("lastName", str2);
                }
                this.b.put(str, ky7Var.b());
                break;
        }
    }
}
