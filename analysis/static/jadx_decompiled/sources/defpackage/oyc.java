package defpackage;

import android.content.Context;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public abstract class oyc extends e3 {
    public final qyc h;

    public oyc(Context context, mi5 mi5Var, qyc qycVar) {
        super(context, "features_prefs", mi5Var);
        this.h = qycVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [e3] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    public final boolean n(PmsKey pmsKey, boolean z) {
        Boolean boolValueOf;
        Object objValueOf = Boolean.valueOf(z);
        boolean zContains = this.g.contains(pmsKey.name());
        ?? r4 = this;
        if (!zContains) {
            r4 = this.h;
        }
        h23 h23VarA = nec.a(Boolean.class);
        if (h23VarA.equals(nec.a(Boolean.TYPE))) {
            boolValueOf = Boolean.valueOf(r4.d(pmsKey.name(), z));
        } else if (h23VarA.equals(nec.a(Long.TYPE))) {
            boolValueOf = (Boolean) Long.valueOf(r4.g.getLong(pmsKey.name(), ((Long) objValueOf).longValue()));
        } else {
            if (!h23VarA.equals(nec.a(String.class))) {
                throw new IllegalArgumentException("Unsupported type: " + nec.a(Boolean.class));
            }
            Object string = r4.g.getString(pmsKey.name(), (String) objValueOf);
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            boolValueOf = (Boolean) string;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [e3] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    public final long o(PmsKey pmsKey, long j) {
        Long lValueOf;
        Object objValueOf = Long.valueOf(j);
        boolean zContains = this.g.contains(pmsKey.name());
        ?? r4 = this;
        if (!zContains) {
            r4 = this.h;
        }
        h23 h23VarA = nec.a(Long.class);
        if (h23VarA.equals(nec.a(Boolean.TYPE))) {
            lValueOf = (Long) Boolean.valueOf(r4.d(pmsKey.name(), ((Boolean) objValueOf).booleanValue()));
        } else if (h23VarA.equals(nec.a(Long.TYPE))) {
            lValueOf = Long.valueOf(r4.g.getLong(pmsKey.name(), j));
        } else {
            if (!h23VarA.equals(nec.a(String.class))) {
                throw new IllegalArgumentException("Unsupported type: " + nec.a(Long.class));
            }
            Object string = r4.g.getString(pmsKey.name(), (String) objValueOf);
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) string;
        }
        return lValueOf.longValue();
    }
}
