package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e92 implements Serializable {
    public final /* synthetic */ int a = 0;
    public final Serializable b;
    public final ArrayList c;

    public e92(qz7 qz7Var) {
        this.b = (String) qz7Var.b;
        this.c = (wz) qz7Var.c;
    }

    public static void e(mg4 mg4Var) {
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        throw new IllegalStateException("Unexpected value: " + mg4Var);
    }

    public void a(d92 d92Var, mg4 mg4Var) {
        d(mg4Var).add(d92Var);
        e(mg4Var);
    }

    public e92 b(boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        List listUnmodifiableList = z ? Collections.unmodifiableList(arrayList) : new ArrayList(arrayList);
        ArrayList arrayList2 = this.c;
        return new e92(listUnmodifiableList, z ? Collections.unmodifiableList(arrayList2) : new ArrayList(arrayList2));
    }

    public int c(mg4 mg4Var) {
        return d(mg4Var).size();
    }

    public ArrayList d(mg4 mg4Var) {
        int iOrdinal = mg4Var.ordinal();
        if (iOrdinal == 0) {
            return (ArrayList) this.b;
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unexpected value: " + mg4Var);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Message{text='" + ((String) this.b) + "', attaches=" + ((wz) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public e92() {
        this(new ArrayList(), new ArrayList());
    }

    public e92(List list, List list2) {
        this.b = new ArrayList(list);
        this.c = new ArrayList(list2);
    }
}
