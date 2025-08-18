package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xab {
    public static final xab X;
    public static final xab Y;
    public static final xab Z;
    public static final xab o;
    public static final /* synthetic */ xab[] s0;
    public static final /* synthetic */ v25 t0;
    public final jqe a;
    public final jqe b;
    public final jqe c;

    static {
        xab xabVar = new xab("SAVE", 0, new eqe(jpc.s2), new eqe(jpc.w2), new eqe(jpc.v2));
        o = xabVar;
        xab xabVar2 = new xab("SHARE", 1, new eqe(jpc.U2), null, new eqe(jpc.W2));
        X = xabVar2;
        xab xabVar3 = new xab("SET_MAIN", 2, new eqe(jpc.x1), new eqe(jpc.j2), null);
        Y = xabVar3;
        xab xabVar4 = new xab(HttpDelete.METHOD_NAME, 3, new eqe(jpc.y1), new eqe(jpc.r2), null);
        Z = xabVar4;
        xab[] xabVarArr = {xabVar, xabVar2, xabVar3, xabVar4};
        s0 = xabVarArr;
        t0 = new v25(xabVarArr);
    }

    public xab(String str, int i, eqe eqeVar, eqe eqeVar2, eqe eqeVar3) {
        this.a = eqeVar;
        this.b = eqeVar2;
        this.c = eqeVar3;
    }

    public static xab valueOf(String str) {
        return (xab) Enum.valueOf(xab.class, str);
    }

    public static xab[] values() {
        return (xab[]) s0.clone();
    }
}
