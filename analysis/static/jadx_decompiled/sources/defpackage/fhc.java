package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class fhc implements roc {
    public final Integer a;

    public fhc(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fhc.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((fhc) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "ReportPerfStatResponse{estimatedPerformanceIndex=" + this.a + '}';
    }
}
