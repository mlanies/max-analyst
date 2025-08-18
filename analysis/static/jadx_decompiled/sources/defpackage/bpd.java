package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bpd {
    public static final mq9 b;
    public static final /* synthetic */ bpd[] c;
    public static final /* synthetic */ v25 o;
    public final String a;

    static {
        bpd[] bpdVarArr = {new bpd("CANCELED", 0, "CANCELED"), new bpd("REJECTED", 1, "REJECTED"), new bpd("HUNGUP", 2, "HUNGUP"), new bpd("MISSED", 3, "MISSED"), new bpd("TIMEOUT", 4, "TIMEOUT"), new bpd("BUSY", 5, "BUSY"), new bpd("FAILED", 6, "FAILED"), new bpd("REMOVED", 7, "REMOVED"), new bpd("ANOTHER_DEVICE", 8, "ANOTHER_DEVICE"), new bpd("KILLED", 9, "KILLED"), new bpd("CALL_TIMEOUT", 10, "CALL_TIMEOUT")};
        c = bpdVarArr;
        o = new v25(bpdVarArr);
        b = new mq9(16);
    }

    public bpd(String str, int i, String str2) {
        this.a = str2;
    }

    public static final bpd a(String str) {
        Object next;
        b.getClass();
        v25 v25Var = o;
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (true) {
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (tpa.f(((bpd) next).a, str)) {
                break;
            }
        }
        return (bpd) next;
    }

    public static bpd valueOf(String str) {
        return (bpd) Enum.valueOf(bpd.class, str);
    }

    public static bpd[] values() {
        return (bpd[]) c.clone();
    }
}
